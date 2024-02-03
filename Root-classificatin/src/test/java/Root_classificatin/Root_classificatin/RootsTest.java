package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;
	//all test in the table 
	@Test
	public void testPartion_A_Min() 
	{
		
		Roots.calculate_roots(0, 5, 20);
		
		String  root_expected = Root_Types.Not_quadratic.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void testPartion_A_Min_plus_1() 
	{
		
		Roots.calculate_roots(1,5,2);
		
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion_A_Max_minus1() 
	{
		
		Roots.calculate_roots(49,25,50);
		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion_A_Max() 
	{
		
		Roots.calculate_roots(50,25,50);
		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	
	}
	@Test
	public void testPartion_B_Min() 
	{
		
		Roots.calculate_roots(25,0,50);
		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	
	}

	@Test
	public void testPartion_B_Min_plus_1() 
	{
		
		Roots.calculate_roots(25,1,50);
		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion_B_Max_minus1() 
	{
		
		Roots.calculate_roots(25,49,50);
		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion_B_Max() 
	{
		
		Roots.calculate_roots(25,50,50);
		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	
	}
	@Test
	public void testPartion_C_Min() 
	{
		
		Roots.calculate_roots(25, 25, 0);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void testPartion_C_Min_plus_1() 
	{
		
		Roots.calculate_roots(25,25,1);
		
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion_C_Max_minus1() 
	{
		
		Roots.calculate_roots(25,25,99);
		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion_C_Max() 
	{
		
		Roots.calculate_roots(25,25,100);
		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	
	}
	@Test
	public void testPartion_A_B_C_Nominal() 
	{
		
		Roots.calculate_roots(25,25,50);
		
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	}
