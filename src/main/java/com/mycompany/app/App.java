package com.mycompany.app;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Cugarra bundi!" );
    }
	public static boolean alex(ArrayList<Integer> array1,ArrayList<Integer> array2,int a, int b) {
		boolean gol=false;
		if(array1==null || array2==null) return false;
		if(array1.size()!=array2.size() || array1.size()==0 ) return false;
		for(int i=0;i<array1.size();i++){
			if(array1.get(i).equals(array2.get(i)) && a<array2.get(i) && b>array2.get(i)){
				System.out.println("numbers are equal and between " + a + " and " + b);
				gol=true;
			}
		}
        return gol;
    }

}
