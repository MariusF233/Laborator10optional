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
public class Board {
    public 
    public int number;
    public int count=1;
    public int i=0;
    public int j=0;
    public Tabel[][] tabel=new Tabel[6][6];
    public Board(){
    
        for(i=0;i<=5;i++)
            for(j=0;j<=5;j++)
            {
            tabel[i][j]=new Tabel();
            tabel[i][j].setPlayer();
            count=count+1;
            
            
            }
    
    
    
    }
    public int getNumber(){
    return number;
    
    }
public void setNumber(int number){
this.number=number;
}
public String show(){
String tabel;
for(i=0;i<=5;i++)
    for(j=0;j<=5;j++)
    {
    if(tabel[i][j].getNumber()<10){
    tabel=tabel+"|"+tabel[i][j].toString();
    
    
    }else {tabel=tabel+"|"+tabel[i][j].toString();}
    
    }
tabel=tabel+"\n";

}
return tabel;

}
