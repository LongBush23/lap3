package Lap3;

import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class LibraryCard {
    Scanner scan=new Scanner(System.in);
    public long LbCode;
    public String owner;
    public int borrowCount;
    public LibraryCard(){
    }
    public LibraryCard(long LbCode,String owner,int borrowCount){
        this.LbCode=LbCode;
        this.owner=owner;
        this.borrowCount=borrowCount;
    }
    public long getLbCode(){
        return LbCode;
    }
    public String getOwner(){
        return owner;
    }
    public int getBorrowCount(){
        return borrowCount;
    }
    public void setLbCode(long code){
        this.LbCode=code;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }
    public void checkOut(int num){
        this.borrowCount=num;
    }
    public String toString(){
        return "Ten:"+owner+" Ma:"+LbCode+" So lan muon:"+borrowCount;
    }
}
