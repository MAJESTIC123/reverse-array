package logics;

import java.util.Scanner;

public class ArrayReverse {
public static void main(String[] args) {
	
	System.out.println("Enter the array size of array");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	int[] r=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}		
	System.out.println("The reversed array is ");
	for(int i=n-1;i>=0;i--) {
		int x=n-(i+1);
		r[x]=a[i];
		System.out.println(r[x]);
	}
	}
}
