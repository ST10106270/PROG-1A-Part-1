/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10106270_part1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ST10106270_PART1 {

    public static void main(String[] args) {
        Login user = new Login();
        String registerStatus = user.registerUser();
        JOptionPane.showMessageDialog(null, registerStatus);
        
        //Perform Login
        user.performLogin();
    }
    
}
