import java.util.Scanner;
public class Q1{
public static void main(String args[]){
	Scanner abc=new Scanner(System.in);
	System.out.println("enter the n");
	int n=abc.nextInt();
	int []a=new int[n];
	System.out.println("enter the"+n+"marks");
	int t=0;
	for(int i=0;i<a.length;i++){
		a[i]=abc.nextInt();
		t=t+a[i];
	}
	double d=t/n;
	System.out.println("total"+t);
	System.out.println("average"+d);
	
