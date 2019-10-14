/**
 * 
 *
 */
package com.wildcodeschool.myLibrary.models;

/**
 * @author franck Desmedt github/bigmoletos
 *
 */
public class FantasyBook implements Book {
	private ServiceWhatever myServiceWhatever;
	private CosyDrinkAdvice cosyDrinkAdvice;

	@Override
	public String readExtract() {
		return "When Mr. Bilbo Baggins of Bag End announced that...";
	}

	// Constructor with the cosyDrinkAdvice object passed as an argument
	public FantasyBook(CosyDrinkAdvice theCosyDrinkAdvice) {
		cosyDrinkAdvice = theCosyDrinkAdvice;
	}

//constructeur
	public void setServiceWhatever(ServiceWhatever theServiceWhatever) {
		myServiceWhatever = theServiceWhatever;
	}

	public String sayWhatever() {
		return myServiceWhatever.speak();
	}

	@Override
	public String displayDrinkAdvice() {
		return this.cosyDrinkAdvice.sendDrinkAdvice();
	}
}
