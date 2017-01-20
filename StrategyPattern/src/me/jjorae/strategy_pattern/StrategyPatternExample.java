package me.jjorae.strategy_pattern;

public class StrategyPatternExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(new AddOperation());
		
		System.out.println("1 + 2 = " + calculator.calculate(1, 2));
		
		calculator.setStrategy(new SubstractOperation());
		
		System.out.println("5 - 1 = " + calculator.calculate(5, 1));

	}

}
