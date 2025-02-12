package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Javi
 */
public class AutomovilJpaController implements Serializable {

    public AutomovilJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public AutomovilJpaController() {
        emf = Persistence.createEntityManagerFactory("concesionariaJPU");
    }

    public void create(Automovil automovil) throws SQLIntegrityConstraintViolationException {
//        if (findByPlate(automovil.getPlate()) == null) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(automovil);
            em.getTransaction().commit();

//                return true;
        } finally {
            if (em != null) {
                em.close();
            }
        }
//        } else {
//            System.err.println("Esa placa ya ha sido registrada");
//            return false;
//        }
    }

    // Con función intermedia
//    public boolean create(Automovil automovil) {
//        if (findByPlate(automovil.getPlate()) == null) {
//            EntityManager em = null;
//            try {
//                em = getEntityManager();
//                em.getTransaction().begin();
//                em.persist(automovil);
//                em.getTransaction().commit();
//
//                return true;
//            } finally {
//                if (em != null) {
//                    em.close();
//                }
//            }
//        } else {
//            System.err.println("Esa placa ya ha sido registrada");
//            return false;
//        }
//    }
    public void edit(Automovil automovil) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            automovil = em.merge(automovil);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = automovil.getId();
                if (findAutomovil(id) == null) {
                    throw new NonexistentEntityException("The automovil with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Automovil automovil;
            try {
                automovil = em.getReference(Automovil.class, id);
                automovil.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The automovil with id " + id + " no longer exists.", enfe);
            }
            em.remove(automovil);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Automovil> findAutomovilEntities() {
        return findAutomovilEntities(true, -1, -1);
    }

    public List<Automovil> findAutomovilEntities(int maxResults, int firstResult) {
        return findAutomovilEntities(false, maxResults, firstResult);
    }

    private List<Automovil> findAutomovilEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Automovil.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Automovil findAutomovil(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Automovil.class, id);
        } finally {
            em.close();
        }
    }

    public int getAutomovilCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Automovil> rt = cq.from(Automovil.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public Automovil findByPlate(String plate) {
        EntityManager em = getEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Automovil.class);
        Root<Automovil> root = cq.from(Automovil.class);

        cq.select(root).where(cb.like(root.get("plate"), plate));

        List<Automovil> autos = em.createQuery(cq).getResultList();
        return autos.isEmpty() ? null : autos.get(0);
    }

    public void destroyByPlate(String plate) throws NonexistentEntityException {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();

            // Buscar el automóvil por su placa
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Automovil> cq = cb.createQuery(Automovil.class);
            Root<Automovil> root = cq.from(Automovil.class);
            cq.select(root).where(cb.equal(root.get("plate"), plate));

            List<Automovil> autos = em.createQuery(cq).getResultList();

            if (!autos.isEmpty()) {
                Automovil automovil = autos.get(0); // Tomamos el primer resultado

                // Asegurar que la entidad esté administrada antes de eliminarla
                if (!em.contains(automovil)) {
                    automovil = em.merge(automovil);
                }

                em.remove(automovil);
                em.getTransaction().commit();
            } else {
                throw new NonexistentEntityException("No se encontró un automóvil con la placa: " + plate);
            }
        } catch (Exception e) {
            em.getTransaction().rollback(); // En caso de error, deshacer cambios
            throw e;
        } finally {
            em.close(); // Cerrar EntityManager para evitar fugas de memoria
        }
    }

}
