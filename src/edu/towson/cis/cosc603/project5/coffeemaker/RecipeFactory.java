package edu.towson.cis.cosc603.project5.coffeemaker;



/**
 * The class <code>RecipeFactory</code> implements static methods that return instances of the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 4/25/16 8:41 PM
 * @author Sigrid
 * @version $Revision: 1.0 $
 */
public class RecipeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 4/25/16 8:41 PM
	 */
	private RecipeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Recipe}</code>.
	 *
	 * @generatedBy CodePro at 4/25/16 8:41 PM
	 */
	public static Recipe createRecipe() {
		
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate(4);
		recipe.setAmtCoffee(4);
		recipe.setAmtMilk(4);
		recipe.setAmtSugar(4);
		
		return recipe;
	}


	/**
	 * Create an instance of the class <code>{@link Recipe}</code>.
	 *
	 * @generatedBy CodePro at 4/25/16 8:50 PM
	 */
	public static Recipe createRecipe2() {
		return new Recipe();
	}


	/**
	 * Create an instance of the class <code>{@link Recipe}</code>.
	 *
	 * @generatedBy CodePro at 4/25/16 8:53 PM
	 */
	public static Recipe createRecipe3() {
		return new Recipe();
	}
	
	public static Recipe createRecipe4() {
		
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate(0);
		recipe.setAmtCoffee(4);
		recipe.setAmtMilk(4);
		recipe.setAmtSugar(4);
		
		return recipe;
	}
}