package tum.ankitbahuguna.singleton;

// ENUM : provide implicit support for thread safety and only one instance is guaranteed. 

public enum EnumSingleton {
	INSTANCE;
	public void someMethod(String param) {
		// some class member
	}
}