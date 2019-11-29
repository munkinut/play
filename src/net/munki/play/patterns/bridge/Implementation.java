/*
 * Created on 19-May-2005
 *
 */
package net.munki.play.patterns.bridge;

/**
 * @author milbuw
 *
 */
public interface Implementation {
	
	public Object operationImpl();

	public Object operationImpl(Object o);

}
