package sneps.setClasses;

import java.util.Iterator;
import java.util.Vector;

import sneps.network.classes.term.Variable;

public class VariableSet implements Iterable<Variable> {
	protected Vector<Variable> variables;

	public VariableSet() {
	}

	@Override
	public Iterator<Variable> iterator() {
		return variables.iterator();
	}
	
	public Variable getVariable(int index){
		return variables.get(index);
	}

	public void addVariable(Variable n) {
		variables.add(n);
	}

	public void addAll(VariableSet allVariables) {
		for (int i = 0; i < variables.size(); i++) {
			this.addVariable(allVariables.getVariable(i));
		}		
	}

	public int size() {
		return variables.size();
	}

	public boolean contains(Variable v){
		return variables.contains(v);
	}

	public boolean isEmpty() {
		return variables.isEmpty();
	}

	public void remove(Variable variable) {
		variables.remove(variable);
	}

}
