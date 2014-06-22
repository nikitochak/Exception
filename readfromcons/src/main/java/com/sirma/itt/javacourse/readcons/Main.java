package com.sirma.itt.javacourse.readcons;

/**
 * @author Nikolay Ch
 *
 */
public class Main {
	/**
	 * Fills an array with numbers between  0 and 100.
	 * @param args
	 */
	public static void main(String[] args){
		int[] array=new int[10];
		
		for(int i=0;i<10;i++){
			array[i]=Read.insert();
		}
		
		for(int i=0;i<10;i++){
			System.out.print(array[i]+" ");
		}
	}
}
