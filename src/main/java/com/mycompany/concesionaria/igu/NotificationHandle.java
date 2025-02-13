package com.mycompany.concesionaria.igu;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Javi
 */
public class NotificationHandle {

    public static void showInfoDialog(JPanel parentPanel, Message message) {
        JOptionPane.showMessageDialog(parentPanel, message.getMessage(), message.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showErrorDialog(JPanel parentPanel, Message message) {
        JOptionPane.showMessageDialog(parentPanel, message.getMessage(), message.getTitle(), JOptionPane.ERROR_MESSAGE);

    }

    public static void showWarningDialog(JPanel parentPanel, Message message) {
        JOptionPane.showMessageDialog(parentPanel, message.getMessage(), message.getTitle(), JOptionPane.WARNING_MESSAGE);

    }

    public static int showConfirmationDialog(JPanel parentPanel, Message message) {
        int confirmation = JOptionPane.showConfirmDialog(parentPanel, message.getMessage(), message.getTitle(), JOptionPane.YES_NO_OPTION);

        return confirmation;
    }
}
