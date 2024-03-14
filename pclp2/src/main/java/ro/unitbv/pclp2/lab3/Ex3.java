package ro.unitbv.pclp2.lab3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        boolean prim;
        for(int i=2;i<100;i++)
        {
            prim=true;
            for(int j=2;j<=i/2;j++)
                if(i%j==0)
                    prim=false;
            if(prim)
                System.out.print(i+" ");
        }
    }
}