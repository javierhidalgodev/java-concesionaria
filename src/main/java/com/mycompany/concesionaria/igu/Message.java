package com.mycompany.concesionaria.igu;

/**
 *
 * @author Javi
 */
public enum Message {
    
    COCHE_CREADO("Coche añadido correctamente", "Operación exitosa"),
    COCHE_EDITADO("Coche editado correctamente", "Operación exitosa"),
    COCHE_REPETIDO("Ya se ha registrado un auto con esa placa.\nSi cree que se trata de un error, póngase en contacto con nosotros.", "Error"),
    FALTAN_DATOS("Todos los campos marcados con * son obligatorios", "Faltan datos"),
    MISMOS_DATOS("No ha realizado ningún cambio. Modifique alguno de los campos para proceder con la operación", "Error al actualizar"),
    CONFIRMAR_EDITAR("¿Seguro que desea editar este registro?", "Confirme edición"),
    CONFIRMAR_ELIMINAR("¿Estás seguro que deseas eliminar este elemento? La operación es irreversible", "Confirmación de borrado"),
    SELECCIONE_REGISTRO("Seleccione un registro para realizar la operación", "Falta registro"),
    ERROR_CONEXION("\"No se puedo conectar con el sistema de datos.\\nInténtelo de nuevo más tarde", "Error de conexión");
    
    private String message;
    private String title;
    
    private Message (String message, String title) {
        this.message = message;
        this.title = title;
    }
    
    public String getMessage() {
        return message;
    }
    
    public String getTitle() {
        return title;
    }
}
