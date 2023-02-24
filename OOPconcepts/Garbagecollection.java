package OOPconcepts;
import java.util.*;
import java.io.*;
public class Garbagecollection{
    public static void main(String args[]) throws Exception{
        Runtime r =Runtime.getRuntime();
        long m1,m2,m3;
        Integer someints[] = new Integer[1000];
        m3 = r.totalMemory();
        System.out.println("TOTAL MEMORY IS "+m3);
        m1 = r.freeMemory();
        System.out.println("FREE MEMORY IS : "+m1);
        r.gc();
        System.out.println("FREE MEMEORY AFTER GARBAGE COLLECTION IS : "+m1);
        for(int i=0;i<1000;i++){
            someints[i]=i;
        }
        m1 = r.freeMemory();
        System.out.println("FREE MEMORY AFTER ALLOCATION : "+m1);
        System.out.println("MEMORY USED : "+(m3-m1));
        for(int i=0;i<1000;i++){
            someints[i]=null;

        }
        r.gc();
        m2=r.freeMemory();
        System.out.println("FREE MEMORY AFTER COLLECTING DISCARDED INTEGERS "+m2);

    }
}
