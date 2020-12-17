package jp.ac.uryukyu.ie.kinjotakaki;

public class Exm{
    String str = null;
    int a;
    public void count(){
        this.a = str.length();
        System.out.println(a);
    }
}

class Main{
public static void main(String[] args){
    try{
        Exm b = new Exm();
        b.count();
    }
    catch(NullPointerException e){
        System.out.println("Nullが含まれている！");
        System.out.println(e.getMessage());

    }
}
}

