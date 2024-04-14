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
               sb.append("Username successfully captured"); //holding the message
               JOptionPane.showMessageDialog(null, sb);
               break;
           }
           else {
               sb = new StringBuilder(); //clearing the old sb
               sb.append("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
               JOptionPane.showMessageDialog(null, sb);
               
           }
       }
           while (true){
           password = JOptionPane.showInputDialog(null, "Enter password:");
           sb = new StringBuilder();
           if (checkPasswordComplexity (password))
           {
               sb.append("Password successfully captured"); //holding the message
               JOptionPane.showMessageDialog(null, sb);
               break;
           }
           else {
               sb = new StringBuilder(); //clearing the old sb
               sb.append("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
               JOptionPane.showMessageDialog(null, sb);
           }
       }
           firstName = JOptionPane.showInputDialog(null, "Enter first name:");
           lastName = JOptionPane.showInputDialog(null, "Enter last name:");
       
   return sb.toString();
   }
   
   //login user with provided credentials
   public boolean loginUser(String enteredUsername, String enteredPassword) {
       return enteredUsername.equals(username)&& enteredPassword.equals(password);
   }
  //Return login status message
   public String returnLoginStatus(boolean loggedIn) {
       if (loggedIn) {
           return "Welcome " + firstName + ", " + lastName + ". It is great to see you again. ";
       }
       else {
           return "Username or password incorrect, please try again.";
       }
   }
  //method to perform login
   public boolean performLogin() {
       String enteredUsername = JOptionPane.showInputDialog(null, "Enter username:");
       String enteredPassword = JOptionPane.showInputDialog(null, "Enter password:");
       
       if (loginUser(enteredUsername, enteredPassword)){
           JOptionPane.showMessageDialog(null, returnLoginStatus(true));
           return true;
       }
       else {
           JOptionPane.showMessageDialog(null, returnLoginStatus(false));
           return false;
       }
   }
}
     

        
    
    
    
    

