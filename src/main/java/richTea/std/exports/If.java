package richTea.std.exports;

import richTea.runtime.execution.AbstractFunction;

public class If extends AbstractFunction {

	@Override
	protected void run() {
		boolean expressionValue = getExpressionValue();
		
		context.executeBranch(expressionValue ? "then" : "else");
	}
	
	protected boolean getExpressionValue() {
		return context.getBoolean("expression");
	}
}