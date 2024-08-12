/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author waksh
 */
public class User implements Serializable{
    private String username;
    private String password;
    
    public String getUsername(){
        return username;
    };
    
    public String getPassword(){
        return password;
    };
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        String passwordPattern = "^(?=.*[0-9])(?=.*[!@#$%^&*(),.?:{}|<>]).{8,}$";
        Pattern pattern = Pattern.compile(passwordPattern);

        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            this.password = password;
        } else {
            this.password = "Error";
        }
    }
}
