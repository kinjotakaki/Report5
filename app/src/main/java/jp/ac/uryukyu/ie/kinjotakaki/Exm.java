package jp.ac.uryukyu.ie.kinjotakaki;

public class Exm{
    String str = "百二十三";
    int value;
    public void count(){
        this.value = Integer.parseInt(str);
    }
}

class Main{
public static void main(String[] args){
    Exm a = new Exm();
    a.count();
}
}

