/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10106270_part1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    
    public Login(String username, String password, String firstName, String lastName){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
public Login(){
    
}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public boolean checkUserName(String username){
        return username.contains("_") && username.length()<= 5;
             
    }
    
   public boolean checkPasswordComplexity(String password){
       boolean Uppercase = false;
       boolean Number = false;
       boolean SpecialChar = false;
       
       for(char pass:password.toCharArray())
       {
           if(Character.isUpperCase(pass))
               Uppercase = true;
           if(Character.isDigit(pass))
               Number = true;
           if(!Character.isLetterOrDigit(pass))
               SpecialChar = true;
 
       }
       return password.length() >= 8 && Uppercase && Number && SpecialChar;
       
   }
   public String registerUser()
   {
       StringBuilder sb = new StringBuilder();
       while (true){
           username = JOptionPane.showInputDialog(null, "Enter username:");
           sb = new StringBuilder();
           if (checkUserName (username))
           {
               sb.append("Successful Login"); //holding the message
               JOptionPane.showMessageDialog(null, sb);
               break;
           }
           else {
               sb = new StringBuilder(); //clearing the old sb
               sb.append("Unsuccessful Login");
               JOptionPane.showMessageDialog(null, sb);
               
           }
       }
           while (true){
           password = JOptionPane.showInputDialog(null, "Enter password:");
           sb = new StringBuilder();
           if (checkPasswordComplexity (password))
           {
               sb.append("Password successful"); //holding the message
               JOptionPane.showMessageDialog(null, sb);
               break;
           }
           else {
               sb = new StringBuilder(); //clearing the old sb
               sb.append("Password unsuccessful");
               JOptionPane.showMessageDialog(null, sb);
           }
       }
           firstName = JOptionPane.showInputDialog(null, "Enter first name:");
           lastName = JOptionPane.showInputDialog(null, "Enter last name:");
       
   return sb.toString();
   }
  
}


        
    
    
    
    

