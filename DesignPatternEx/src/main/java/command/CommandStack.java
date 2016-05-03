package command;

import java.util.ArrayList;
import java.util.List;

public class CommandStack {

	private int current = -1;
	private List<ReversibleCommand> commands = new ArrayList<>();

	public void execute(ReversibleCommand command) {
		for (int i = commands.size() - 1; i > current; i--) {
			commands.remove(i);
		}
		commands.add(command);
		redo();
	}

	public void redo() {
		commands.get(++current).redo();
	}

	public void undo() {
		commands.get(current--).undo();
	}
}
