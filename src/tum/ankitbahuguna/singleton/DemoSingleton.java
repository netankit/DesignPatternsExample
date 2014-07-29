package tum.ankitbahuguna.singleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8382057441445772710L;
	private volatile static DemoSingleton instance = null;

	public static DemoSingleton getInstance() {
		if (instance == null) {
			instance = new DemoSingleton();
		}
		return instance;
	}

	// Added readResolve Method : This method will be invoked when we will
	// de-serialize the object. Inside this method, we must return the existing
	// instance to ensure single instance application wide.
	protected Object readResolve() {
		return instance;
	}

	private int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}