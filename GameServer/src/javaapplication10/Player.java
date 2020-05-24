/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author me
 */
public class Player {
    public String string;
    public int pos;
    public boolean number;
    
    public Player(String string)
    {
    this.number=true;
    this.pos=1;
    this.string=string;
    
    
    }
    public boolean getPos(){
    return pos;
    
    }
    public String getString(){
    return string;
    
    }
    public int getNumber(){
    return number;}
    
    public void setString(String string){
    this.string=string;
    
    }
    public void setPos(int pos){
    this.pos=pos;}
    public void setNumber(int number)
    {this.number=number;}


}
