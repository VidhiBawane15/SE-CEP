class Shape {
  void area() { System.out.println("Finding area..."); }
  void area(int r) { System.out.println("Circle area: " + (3.14 * r * r)); }
  void area(int l, int b) { System.out.println("Rectangle area: " + (l * b)); }
}
class Circle extends Shape {
  void area() { System.out.println("Area of Circle"); }
}
class Rectangle extends Shape {
  void area() { System.out.println("Area of Rectangle"); }
}

class PolymorphismDemo {
  public static void main(String[] args) {
    Shape s = new Shape();
    s.area(5);
    s.area(4, 6);
    Shape c = new Circle();
    c.area();
  }
}
