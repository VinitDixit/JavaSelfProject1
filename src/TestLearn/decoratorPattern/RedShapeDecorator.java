package TestLearn.decoratorPattern;

public class RedShapeDecorator extends AbsDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        System.out.println("Coloring the shape red");
    }
}
