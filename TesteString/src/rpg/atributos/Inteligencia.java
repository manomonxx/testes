package rpg.atributos;

import rpg.AtributosBehavior;

public class Inteligencia<E> implements AtributosBehavior<E>{

	private E inteligencia;

	@Override
	public E getAttr() {
		return inteligencia;
	}

	@Override
	public void setAttr(E value) {
		this.inteligencia = value;
	}

}
