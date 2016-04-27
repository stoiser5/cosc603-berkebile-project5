package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 4/25/16 8:53 PM
 * @author Sigrid
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testAddInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testAddInventory_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
        
		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testAddInventory_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testAddInventory_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testAddInventory_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here

		
		assertEquals(true, result);
		assertEquals(16, fixture.checkInventory().getCoffee());
		assertEquals(16, fixture.checkInventory().getMilk());
		assertEquals(16, fixture.checkInventory().getSugar());
		assertEquals(16, fixture.checkInventory().getChocolate());
	}

	@Test
	public void testAddInventory_6()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = -1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testAddInventory_7()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}
	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testAddRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		
		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testAddRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		Recipe r = RecipeFactory.createRecipe3();

		boolean result = fixture.addRecipe(r);

		
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testAddRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	@Test
	public void testAddRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();
		
		Recipe r = RecipeFactory.createRecipe();
		r.setName("Coffee");
		r.setAmtChocolate(1);
		r.setAmtCoffee(1);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		
		fixture.addRecipe(r);

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testAddRecipe_5()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		
		Recipe r1 = RecipeFactory.createRecipe();
		r1.setName("Coffee");
		r1.setAmtChocolate(1);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		
		boolean a = fixture.addRecipe(r1);
		assertEquals(true, a);
		
		Recipe r2 = new Recipe();
		r2.setName("Moccha");
		r2.setAmtChocolate(1);
		r2.setAmtCoffee(1);
		r2.setAmtMilk(2);
		r2.setAmtSugar(1);
		
		a = fixture.addRecipe(r2);
		assertEquals(true, a);
		
		Recipe r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate(1);
		r3.setAmtCoffee(1);
		r3.setAmtMilk(1);
		r3.setAmtSugar(2);
		
		a = fixture.addRecipe(r3);
		assertEquals(true, a);
		
		Recipe r4 = new Recipe();
		r4.setName("Cocoa");
		r4.setAmtChocolate(1);
		r4.setAmtCoffee(3);
		r4.setAmtMilk(1);
		r4.setAmtSugar(1);
		
		a = fixture.addRecipe(r4);
		assertEquals(true, a);
		
		Recipe r5 = new Recipe();
		assertEquals(false, fixture.addRecipe(r5));
		
	}
	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testCheckInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15%nMilk: 15%nSugar: 15%nChocolate: 15%n", result.toString());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testDeleteRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		Recipe r = RecipeFactory.createRecipe2();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testDeleteRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		Recipe r1 = new Recipe();
		r1.setName("Coffee");
		fixture.addRecipe(r1);

		boolean result = fixture.deleteRecipe(r1);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testDeleteRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testDeleteRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		Recipe r = null;

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testEditRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();
		Recipe oldRecipe = RecipeFactory.createRecipe2();
		Recipe newRecipe = RecipeFactory.createRecipe3();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testEditRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe2();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testEditRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		Recipe oldRecipe = RecipeFactory.createRecipe3();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testEditRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe2();
		Recipe newRecipe = RecipeFactory.createRecipe3();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testEditRecipe_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		oldRecipe.setName("Coffee");
		fixture.addRecipe(oldRecipe);
		
		Recipe newRecipe = RecipeFactory.createRecipe();
		newRecipe.setName("Coffee");
		newRecipe.setAmtCoffee(3);

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
	}
	
	@Test
	public void testGetRecipeForName_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		
		String name = "Coffee";
		
		Recipe r = new Recipe();
		r.setName(name);

		fixture.addRecipe(r);
		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertEquals(r,result);
		
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getAmtCoffee());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getAmtMilk());
		assertEquals(0, result[0].getAmtChocolate());
		assertEquals(0, result[0].getPrice());
		assertNotNull(result[1]);
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getAmtCoffee());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getAmtMilk());
		assertEquals(0, result[1].getAmtChocolate());
		assertEquals(0, result[1].getPrice());
		assertNotNull(result[2]);
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getAmtCoffee());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getAmtMilk());
		assertEquals(0, result[2].getAmtChocolate());
		assertEquals(0, result[2].getPrice());
		assertNotNull(result[3]);
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getAmtCoffee());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getAmtMilk());
		assertEquals(0, result[3].getAmtChocolate());
		assertEquals(0, result[3].getPrice());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testMakeCoffee_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		Recipe r = RecipeFactory.createRecipe3();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	@Test
	public void testMakeCoffee_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		Recipe r = RecipeFactory.createRecipe();
		r.setPrice(5);
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}
	
	@Test
	public void testMakeCoffee_3(){
			
			CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
			Recipe r = RecipeFactory.createRecipe();
			r.setAmtCoffee(50);
			r.setPrice(1);
			fixture.addRecipe(r);
			int amtPaid = 2;

			int result = fixture.makeCoffee(r, amtPaid);

			// add additional test code here
			assertEquals(2, result);
}	

	@Test
	public void testMakeCoffee_4(){
			
			CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
			Recipe r = RecipeFactory.createRecipe();
			r.setPrice(1);
			r.setAmtChocolate(1);
			r.setAmtCoffee(5);
			r.setAmtMilk(1);
			r.setAmtSugar(3);
			
			fixture.addRecipe(r);
			
			int amtPaid = 2;

			int result = fixture.makeCoffee(r, amtPaid);

			// add additional test code here
			assertEquals(1, result);
			assertEquals(14, fixture.checkInventory().getChocolate());
			assertEquals(10, fixture.checkInventory().getCoffee());
			assertEquals(14, fixture.checkInventory().getMilk());
			assertEquals(12, fixture.checkInventory().getSugar());
}	

	@Test
	public void testMakeCoffee_5(){
			
			CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
			Recipe r = RecipeFactory.createRecipe();
			r.setAmtCoffee(50);
			r.setPrice(1);
			fixture.addRecipe(r);
			int amtPaid = 1;

			int result = fixture.makeCoffee(r, amtPaid);

			// add additional test code here
			assertEquals(1, result);
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
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
}