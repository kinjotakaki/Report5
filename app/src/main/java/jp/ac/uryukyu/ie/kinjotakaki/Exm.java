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
    Exm b = new Exm();
    b.count();
}
}

