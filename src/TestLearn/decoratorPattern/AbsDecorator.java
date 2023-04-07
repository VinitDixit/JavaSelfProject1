package TestLearn.decoratorPattern;

public class AbsDecorator implements Shape{
    Shape decoratedShape;

    public AbsDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
    }
}
