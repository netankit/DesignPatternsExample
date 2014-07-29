package tum.ankitbahuguna.singleton;

import java.io.Serializable;

//Final Template to implement the singleton class. Works for boh Serialization and Synchronization.

public class DemoSingletonTemplate implements Serializable {

	private static final long serialVersionUID = 1L;

	private DemoSingletonTemplate() {
		// private constructor
	}

	private static class DemoSingletonHolder {
		public static final DemoSingletonTemplate INSTANCE = new DemoSingletonTemplate();
	}

	public static DemoSingletonTemplate getInstance() {
		return DemoSingletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}

}
