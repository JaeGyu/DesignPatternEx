package command;

public interface ReversibleCommand {
	
	void redo();
	void undo();
}
