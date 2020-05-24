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
public class Tabel {
    public int number;
    public String move;
   public String turn;
    public Tabel(int number,String move){
    this.number=number;
    this.move=move;
    this.turn=" ";
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
    this.number=number;
    }
    public String getMove(){
    return move;
    }
    public void setMove(String move){
    this.move=move;
    
    }
    public String getTurn(){
    return turn;
    }
public void setTurn(String turn)
{
if(this.turn.substring(0,1).equals(" ")){
this.turn=turn+" ";
}

}
    @Override
    public String toString(){
    return number+" "+move;
    }




}
