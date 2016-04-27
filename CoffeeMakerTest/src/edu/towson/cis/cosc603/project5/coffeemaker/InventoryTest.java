package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 4/25/16 8:53 PM
 * @author Sigrid
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testInventory_1(){
		

		Inventory result = new Inventory();
		int a = 0+1;

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15%nMilk: 15%nSugar: 15%nChocolate: 15%n", result.toString());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
		
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		Recipe r = RecipeFactory.createRecipe2();
		r.setAmtChocolate(50);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testEnoughIngredients_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		Recipe r = RecipeFactory.createRecipe2();
		r.setAmtMilk(50);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testEnoughIngredients_4()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		Recipe r = RecipeFactory.createRecipe2();
		r.setAmtSugar(50);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testEnoughIngredients_5()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		Recipe r = RecipeFactory.createRecipe2();
		r.setAmtCoffee(15);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}
	
	@Test
	public void testEnoughIngredients_6()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		Recipe r = RecipeFactory.createRecipe2();
		r.setAmtMilk(15);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	@Test
	public void testEnoughIngredients_7()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		Recipe r = RecipeFactory.createRecipe2();
		r.setAmtSugar(15);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}
	
	@Test
	public void testEnoughIngredients_8()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		Recipe r = RecipeFactory.createRecipe2();
		r.setAmtChocolate(15);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getChocolate();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		int chocolate = -1;

		fixture.setChocolate(chocolate);

		// add additional test code here
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int chocolate = 1;

		fixture.setChocolate(chocolate);
		assertEquals(1, fixture.getChocolate());

		// add additional test code here
	}
	
	@Test
	public void testSetChocolate_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int chocolate = 0;

		fixture.setChocolate(chocolate);
		
		assertEquals(0, fixture.getChocolate());

		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		int coffee = -1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int coffee = 1;

		fixture.setCoffee(coffee);
		assertEquals(1, fixture.getCoffee());

		// add additional test code here
	}
	
	@Test
	public void testSetCoffee_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int coffee = 0;

		fixture.setCoffee(coffee);
		
		assertEquals(0, fixture.getCoffee());
		
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		int milk = -1;

		fixture.setMilk(milk);
		assertEquals(15, fixture.getMilk());

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int milk = 1;

		fixture.setMilk(milk);
		assertEquals(1, fixture.getMilk());

		// add additional test code here
	}
	
	@Test
	public void testSetMilk_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int milk = 0;

		fixture.setMilk(milk);
		
		assertEquals(0, fixture.getMilk());
		
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		int sugar = -1;

		fixture.setSugar(sugar);

		assertEquals(15, fixture.getSugar());
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int sugar = 1;

		fixture.setSugar(sugar);
		assertEquals(1, fixture.getSugar());

		// add additional test code here
	}
	
	@Test
	public void testSetSugar_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int sugar = 0;

		fixture.setSugar(sugar);
		
		assertEquals(0, fixture.getSugar());
		
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15%nMilk: 15%nSugar: 15%nChocolate: 15%n", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}