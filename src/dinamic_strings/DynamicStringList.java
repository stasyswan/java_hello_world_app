/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamic_strings;

/**
 *
 * @author stasy
 */
public class DynamicStringList implements SimpleList{
    private String[] array;
    
    public DynamicStringList(){
        this(5);
    }
    
    public DynamicStringList(int size){
        array =  new String[size];
    }
    
    public void add(String s){
        for(int i = 0; i < array.length; i++){
            if( i == array.length -1 &&  array[i] != null){
                System.out.println("Array is full");
            }
            else if(array[i] == null){
                array[i]  = s;
                break;
            }
            
        }
    }
    
    public String get(){
      return array[array.length -1];
    }
    
    public String get(int id){
        return array[id];
    }
    
    public String remove(){
        return array[array.length -1] = null;
    }
    
    public String remove(int id){
         return array[id] = null;
    }
    
    public boolean delete(){
        for (String el : array) {
            if(el != null)
                el = null;
        }
        return true;
    }
    
    public String toString(){
        String resultString = "";
        for (String el : array) {
            resultString += el + " ";
        }
        return resultString;
    }
}
