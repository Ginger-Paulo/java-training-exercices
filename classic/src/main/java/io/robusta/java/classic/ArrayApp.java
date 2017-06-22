package io.robusta.java.classic;

import java.util.Arrays;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {

    @SuppressWarnings("null")
	int[] buildArray(int a, int b, int c){
    	
    	int tabTest [] = {a,b,c};
        return tabTest;
    }


    boolean equality(int[] array1, int[] array2){

    	
    	if(array1.length!=array2.length) 
    		   return false;

    		for(int index=0;index<array1.length;index++)
    		{
    		    if (array1[index]!=array2[index])
    		         return false;

    		}
    		return true;
    }

    String asString (int [] numbers){
    	
    	String result =  "";
    	
    	for (int i = 0; i< numbers.length;i++){
    		
    		result  = result + numbers [i] +":";
    	}
    	
    	
        return result;
    }

    String asStringJoin (int [] numbers){
        return null;
    }

    String asString (String [] strings){
        return null;
    }

    String asString (Card [] cards){
        return null;
    }

}
