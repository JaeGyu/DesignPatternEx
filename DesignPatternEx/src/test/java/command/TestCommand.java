package command;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCommand {

	@Test
	public void test() throws Exception {
		Panel panel = new Panel();
		CommandStack cs = new CommandStack();

		cs.execute(new PanelChangeCommand(panel, "주황"));
		cs.execute(new PanelChangeCommand(panel, "노랑"));
		cs.execute(new PanelChangeCommand(panel, "초록"));

		System.out.println("--  undo 2번  --");
		cs.undo();
		cs.undo();

		System.out.println("--  undo 1번  --");
		cs.redo();
		cs.execute(new PanelChangeCommand(panel, "파랑"));
	}
}
