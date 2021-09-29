package cursojava.classesAuxiliary;

import cursojava.interfaces.AccessPermission;

public class AccessFunction {
	
	private AccessPermission accessPermission;
	
	public boolean authentic() {
		return accessPermission.authentic();
	}
	
	public AccessFunction(AccessPermission access) {
		this.accessPermission = access;
	}
}
