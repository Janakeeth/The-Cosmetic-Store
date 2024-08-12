/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.io.Serializable;

/**
 *
 * @author waksh
 */
public class Product implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String ID;
    private String Name;
    private String Category;
    private int Price;
    private String Manufacturer;
    private int Stock;
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }
    
    public int getStock(){
        return Stock;
    }
    
    public void setStock(int Stock){
        this.Stock = Stock;
    }
}
