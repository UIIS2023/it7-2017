package command;

import adapter.HexagonAdapter;

public class CmdUpdateHexagon implements Command {

	private HexagonAdapter oldState;
	private HexagonAdapter newState;
	private HexagonAdapter original;	
	
	public CmdUpdateHexagon(HexagonAdapter oldState, HexagonAdapter newState) {
		this.oldState = oldState;
		this.newState = newState;
		original = (HexagonAdapter) oldState.clone();
	}

	@Override
	public void execute() {
		oldState.getHexagon().setX(newState.getHexagon().getX());
		oldState.getHexagon().setY(newState.getHexagon().getY());
		oldState.getHexagon().setR(newState.getHexagon().getR());
		oldState.setEdgeColor(newState.getEdgeColor());
		oldState.setInnerColor(newState.getInnerColor());
		//oldState.setSelected(newState.isSelected());
		
	}

	@Override
	public void unexecute() {
		oldState.getHexagon().setX(original.getHexagon().getX());
		oldState.getHexagon().setY(original.getHexagon().getY());
		oldState.getHexagon().setR(original.getHexagon().getR());
		oldState.setEdgeColor(original.getEdgeColor());
		oldState.setInnerColor(original.getInnerColor());
		//oldState.setSelected(original.isSelected());
		
	}
	
	@Override
	public String log() {
		return "Edited: " + newState.toString();
	}


}
