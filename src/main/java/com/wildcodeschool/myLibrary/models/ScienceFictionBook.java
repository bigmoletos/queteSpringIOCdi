/**
 * 
 *
 */
package com.wildcodeschool.myLibrary.models;

/**
 * @author franck Desmedt github/bigmoletos
 *
 */
public class ScienceFictionBook implements Book {
//inutile car on va passer par l'interface DrinkAdviceInterface
	// private CosyDrinkAdvice cosyDrinkAdvice;
	private DrinkAdviceInterface drinkAdvice;

	// Constructor with the cosyDrinkAdvice object passed as an argument
	public ScienceFictionBook(CosyDrinkAdvice theCosyDrinkAdvice) {
//		cosyDrinkAdvice = theCosyDrinkAdvice;
		drinkAdvice = theCosyDrinkAdvice;
	}

	@Override
	public String displayDrinkAdvice() {
//		return this.cosyDrinkAdvice.sendDrinkAdvice();
		return this.drinkAdvice.sendDrinkAdvice();
	}

	@Override
	public String readExtract() {
		return "His name was Gaal Dornick...";
	}
}
