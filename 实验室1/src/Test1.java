package com.test;

public class Test1 {
	public boolean test1(int x){
		int[] array1= { 50, 20, 10, 5, 5, 1, 1, 1 } ;
		int t = x ;
		for(int i = 0; i < array1.length; i++) {
			t = t - array1[i];
			if(t < 0)
			{
				t = t + array1[i];
			}
			if(t == 0) {
				return true;
			}
		}
		return false;
	}
}
