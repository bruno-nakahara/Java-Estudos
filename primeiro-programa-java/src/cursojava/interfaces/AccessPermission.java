package cursojava.interfaces;

public interface AccessPermission {
	
	public boolean authentic(String login, String password);
	public boolean authentic();
}
