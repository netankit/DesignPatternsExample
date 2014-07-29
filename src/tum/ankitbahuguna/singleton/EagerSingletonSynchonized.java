//Correct implementation of singleton pattern.

package tum.ankitbahuguna.singleton;

public class EagerSingletonSynchonized {

	// ENSURE: Using “volatile” keyword with instance variable otherwise you can
	// run into out of order write error scenario, where reference of instance
	// is returned before actually the object is constructed i.e. JVM has only
	// allocated the memory and constructor code is still not executed. In this
	// case, your other thread, which refer to uninitialized object may throw
	// null pointer exception and can even crash the whole application.
	private static volatile EagerSingletonSynchonized instance = null;

	// private constructor
	private EagerSingletonSynchonized() {
	}

	public static EagerSingletonSynchonized getInstance() {
		if (instance == null) {
			synchronized (EagerSingletonSynchonized.class) {
				// Double check
				if (instance == null) {
					instance = new EagerSingletonSynchonized();
				}
			}
		}
		return instance;
	}
}
