package command;

import geometry.Shape;
import mvc.DrawingModel;

public class CmdShapeAdd implements Command {
	private Shape shape;
	private DrawingModel model;
	
	public CmdShapeAdd(DrawingModel model, Shape shape) {
		this.model = model;
		this.shape = shape;
	}

	@Override
	public void execute() {
		model.add(shape);
	}

	@Override
	public void unexecute() {
		model.remove(shape);
	}

	@Override
	public String toString() {
		return "Added - " + shape +  "\n";
	}
}
