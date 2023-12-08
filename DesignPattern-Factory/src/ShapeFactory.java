public class ShapeFactory {
    public static Shape getShape(ShapeType type){
        Shape shape = null;
        if (type.equals(ShapeType.RECTANGLE)) {
            shape = new Rectangle();
        } else if (type.equals(ShapeType.CIRCLE)){
            shape = new Circle();
        };
        return shape;
    }
}
