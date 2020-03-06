package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Testtest1 {
	
	private int x;
	private boolean re;
	private Test1 test1 = null ;
	
	public Testtest1(int x, boolean re){
		this.x = x ;
		this.re = re ;
	}
	
	@Parameters
	public static Collection getData(){
		return Arrays.asList(new Object[][]{
						  {50,true},
						  {53,true},
						  {28,true},
						  {16,true},
						  {72,true},
						  {66,true},
						  {101,false},
						  {54,false},
						  {29,false},
						  {0,true}});
		
	}
	
	@Before
	public void setUp(){
		test1 = new Test1();
	}

	@Test
	public void testtest1() {
		
		assertEquals(this.re,test1.test1(x));
		
		
		
	}
	
	@AfterClass
	public static void testResult(){
		
		System.out.println();
	}


}
