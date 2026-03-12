package org.testleaf.week1.week1homeassignment;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=8;
    int fn=0;
    int sn=1;
    int nextnum;
    for(int i=1;i<=n;i++){
        System.out.println(fn);
        
        nextnum=fn+sn;                 // fn=0 , sn =1 , for i=2 : prints the nn =1
        fn=sn;                         // i =3 , 
        sn=nextnum;
    }

    }

}
