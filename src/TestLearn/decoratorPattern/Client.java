package TestLearn.decoratorPattern;

public class Client {
    public static void main(String[] args) {
        Shape circleShape= new Circle();
        circleShape.draw();
        RedShapeDecorator redShapeDecorator= new RedShapeDecorator(circleShape);
        redShapeDecorator.draw();
    }
}
