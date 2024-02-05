
public class Particle {

  private Vector position;
  private Vector velocity;
  private Object snapshot;
  private double mass;
  private double gas;
  private double liquid;
  private double lossRate;

  // Static variables from the original code
  private static final double GAS_MASS = 0.3;
  private static final double LIQUID_MASS = 2.0;
	    
  public Particle(double x, double y, double z, double vx, double vy, double vz, double gas, double liquid, double lossRate) {
    this.position = new Vector(x, y, z);
    this.velocity = new Vector(vx, vy, vz);
    this.gas = gas;
    this.liquid = liquid;
    this.lossRate = lossRate;
    this.mass = this.gas * GAS_MASS + this.liquid * LIQUID_MASS;
  }
  
  public void updatePosition() {
    this.position = this.position.add(this.velocity);
  }

  public void updateVelocity(Vector acceleration) {
    this.velocity = this.velocity.add(acceleration);
  }

  public void phaseChange(double k, double b) {
    this.gas *= this.lossRate * Math.exp(-k * b);
    this.liquid = 1.0 - this.gas;
    this.mass = this.gas * GAS_MASS + this.liquid * LIQUID_MASS;
  }

  public Vector getPosition() {
    return position;
  }

  public Vector getVelocity() {
    return velocity;
  }

  public double getMass() {
    return mass;
  }
  
  public void setTotalMass() {
	  this.mass = this.gas * GAS_MASS + this.liquid * LIQUID_MASS;
  }
  
  public void setLossRate(double lossRate) {
	  this.lossRate = lossRate;
  }
  
  public void setGas(double gas) {
	  this.gas = gas;
  }
  
  public void setLiquid(double liquid) {
	  this.liquid = liquid;
  }
  
  public void setSnapshot() {
//	  snapshot = {
//			  
//	  };
//	  snapshot.x = position.x;
//	  snapshot.y = position.y;
//	  snapshot.z = position.z;
  }

  public void conserveEnergy(double oldMass) {
    double vSquared = this.velocity.dot(this.velocity);
    double factor = Math.sqrt(oldMass * vSquared / this.mass) / Math.sqrt(vSquared);
    this.velocity = this.velocity.multiply(factor);
  }
}
