package Lap3;

/**
 *
 * @author VQ
 */
public class Vector {
    private double x;
   private double y;
   private double z;

   public Vector(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public double getX() {
      return x;
   }

   public void setX(double x) {
      this.x = x;
   }

   public double getY() {
      return y;
   }

   public void setY(double y) {
      this.y = y;
   }

   public double getZ() {
      return z;
   }

   public void setZ(double z) {
      this.z = z;
   }

   // Phương thức cộng vector
   public Vector add(Vector v) {
      double newX = x + v.getX();
      double newY = y + v.getY();
      double newZ = z + v.getZ();
      return new Vector(newX, newY, newZ);
   }

   // Phương thức trừ vector
   public Vector subtract(Vector v) {
      double newX = x - v.getX();
      double newY = y - v.getY();
      double newZ = z - v.getZ();
      return new Vector(newX, newY, newZ);
   }

   // Phương thức nhân vector với hằng số
   public Vector multiply(double scalar) {
      double newX = x * scalar;
      double newY = y * scalar;
      double newZ = z * scalar;
      return new Vector(newX, newY, newZ);
   }

   // Phương thức tính tích vô hướng 2 vector
   public double dotProduct(Vector v) {
      double productX = x * v.getX();
      double productY = y * v.getY();
      double productZ = z * v.getZ();
      return productX + productY + productZ;
   }
}
