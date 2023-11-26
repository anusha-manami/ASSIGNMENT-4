/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Singleton Pattern Demo
 * @author Anusha
 * @version 1.0
 */
public class SingletonPatternDemo {
    
    /**
     * Main method to test the singleton design pattern.
     *
     * @param args command line arguments
     */
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
