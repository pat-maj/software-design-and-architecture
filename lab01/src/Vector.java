public class Vector {

  protected double x;
  protected double y;
  protected double z;
	
  public Vector(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public Vector add(Vector other) {
    return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
  }

  public Vector subtract(Vector other) {
    return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
  }

  public Vector multiply(double scalar) {
    return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);
  }

  public double magnitude() {
    return Math.sqrt(x * x + y * y + z * z);
  }

  public Vector normalize() {
    double magnitude = magnitude();
    return new Vector(this.x / magnitude, this.y / magnitude, this.z / magnitude);
  }

  public double dot(Vector other) {
    return this.x * other.x + this.y * other.y + this.z * other.z;
  }
}
