1 package edu.ecu.cs.sle.imp.interpreter; 
2 
 
3 import static org.junit.Assert.*; 
4 
 
5 import org.junit.After; 
6 import org.junit.BeforeClass; 
7 import org.junit.Test; 
8 import org.junit.runner.RunWith; 
9 
 
10 import edu.ecu.cs.sle.imp.value.IntegerValue; 
11 
 
12 
 
13 public class InterpreterTest { 
14 
 
15 	private static Interpreter interpreter; 
16 	 
17 
 
18 	 
19 	@BeforeClass 
20 	public static void setUpClass() { 
21 		interpreter = new Interpreter(); 
22 	} 
23 	 
24 	@Test 
25 	public void testMultiply() { 
26 		IntegerValue iv = interpreter.interpret("1*2"); 
27 		assertEquals("1*2", 2, iv.getIntValue().intValue()); 
28 	}	 
29 	 
30 	 
31 	@Test 
32 	public void testDivide() { 
33 		IntegerValue iv = interpreter.interpret("-8 / 4"); 
34 		assertEquals("-8 / 4", -2, iv.getIntValue().intValue()); 
35 	 
36 	} 
37 
 
38 	@Test 
39 	public void testMinus() { 
40 		IntegerValue iv = interpreter.interpret("5 - 2"); 
41 		assertEquals("5 - 2", 3, iv.getIntValue().intValue()); 
42 	 
43 		 
44 	} 
45 
 
46 
 
47 	@Test 
48 	public void testAddition() { 
49 		IntegerValue iv = interpreter.interpret("6 + 12"); 
50 		assertEquals("6 + 12", 18, iv.getIntValue().intValue()); 
51 	} 
52 	 
53 
 
54 	 
55 } 
