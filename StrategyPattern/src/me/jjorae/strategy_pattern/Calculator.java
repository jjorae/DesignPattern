package me.jjorae.strategy_pattern;

public class Calculator {
	
	private Strategy strategy;
	
	public Calculator(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int calculate(int num1, int num2) {
		return strategy.operation(num1, num2);
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
