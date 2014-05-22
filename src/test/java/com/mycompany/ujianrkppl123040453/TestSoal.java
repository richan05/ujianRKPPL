/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ujianrkppl123040453;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author 604-05
 */
public class TestSoal {
    	Soal p;
	
	@Before
	public void awal(){
		System.out.println("Mulai Test");
		p = new Soal();
	}		
	
	  @Test
	  public void test1() {
		    assertEquals(42, 6*7);
		  }
	  
	  @Test
	  public void test2() {
		    assertEquals(21, 3*7);
		  }

	@After
	public void akhir(){
		System.out.println("Akhir Test");
	}
}
