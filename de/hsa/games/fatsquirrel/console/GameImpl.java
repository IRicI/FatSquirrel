package de.hsa.games.fatsquirrel.console;

import de.hsa.games.fatsquirrel.Game;
import de.hsa.games.fatsquirrel.core.PlayerEntity;
import de.hsa.games.fatsquirrel.core.State;

public class GameImpl extends Game {
	
	private ConsoleUI ui;

	
	public GameImpl(State state) {
		super(state);
		ui = new ConsoleUI();
		super.run(); //TODO
	}

	@Override
	protected void render() {
		
		ui.render(state.getFlattenedBoard());
	}

	@Override
	protected void processInput() {
		for (PlayerEntity e : state.getMovablePlayerEntities()) {
			e.setNextCommand(ui.getCommand());
		}
	}

}
