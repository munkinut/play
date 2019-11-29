/*
 * Created on 19-May-2005
 *
 */
package net.munki.play.patterns.bridge;

/**
 * @author milbuw
 *
 */
public class ConcreteImplementationB implements Implementation {

	public ConcreteImplementationB() {
		super();
	}

	public Object operationImpl(Object o) {
		return o;
	}

	public Object operationImpl() {
		return null;
	}

}
