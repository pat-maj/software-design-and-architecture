public class Simulation {

  private static final double GRAV_CONST = 0.001;
  private static final double TEMPERATURE_DROP_FACTOR = 0.99999;
  private static final double K_CONST = 0.00001;
  private Particle[] particles;
  private double totalMass;
  private double systemEnergy;
  private int numberOfParticles; // a
  private int numberOfTimeSteps; // ts
  private final double temperature = 300; // Temperature, which affects phase change (b)

  private static final double K = 0.00001;

  public Simulation(int numberOfParticles, int timeSteps) {
    this.numberOfParticles = numberOfParticles;
    this.numberOfTimeSteps = timeSteps;
    this.particles = new Particle[numberOfParticles];
    double rc = initialiseParticles();
    if(rc != 0) {
   	  System.out.println("Error in init");
      System.exit(1);
    } else {
      System.out.println("INIT COMPLETE");
    }
  }

  public void run() {
    System.out.printf("Initializing for %d particles in x,y,z space...%n", numberOfParticles);

    calculateTotalMass();
    systemEnergy = calculateSystemEnergy();
    System.out.printf("Time 0. System energy=%g%n", systemEnergy);
    
    System.out.printf("Now to integrate for %d timesteps%n", numberOfTimeSteps);
    for (int k1 = 1; k1 <= numberOfTimeSteps; k1++) {
        
        
        
        
        System.out.printf("At end of timestep %d with temp %)");
    }
  }
  
  private int initialiseParticles() {
	  double minPos = -50.0, mult = +100.0, maxVel = +10.0;
	  double comp;
	  int i = 0;
	  
	  for(Particle p: particles) {
		  //A really terrible random number generator, but one that gives consistent results
		  double nextDouble = Math.round((double) i * 100 / (double) numberOfParticles) / (double) 100.0;
		  
		  p.getPosition().x = minPos + mult * nextDouble;
		  p.getPosition().y = minPos + mult * nextDouble;
		  p.getPosition().z = 0.0 + mult * nextDouble;
		  
		  p.getVelocity().x = -maxVel + 2.0 * maxVel * mult * nextDouble;
		  p.getVelocity().y = -maxVel + 2.0 * maxVel * mult * nextDouble;
		  p.getVelocity().z = -maxVel + 2.0 * maxVel * mult * nextDouble;
		  
		  // proportion of aerosol that evaporates
		  comp = 0.5 + nextDouble/2.0;
		  p.setLossRate(1.0 - nextDouble/25.0);
		  
		  // aerosol is component of gas and (1-comp) of liquid
		  p.setGas(comp);
		  p.setLiquid(1.0-comp);
		  p.setTotalMass();
		  
		  i++;
	  }
	  return 0;
  }
  
  private double[] calculateCentreMass() {
	  double[] com = new double[3];
	  for(Particle p: particles) {
		  com[0] += p.getMass() * p.getPosition().x;
		  com[1] += p.getMass() * p.getPosition().y;
		  com[2] += p.getMass() * p.getPosition().z;
	  }
	  com[0] /= totalMass;
	  com[1] /= totalMass;
	  com[2] /= totalMass;
	  
	  return com;
  }
  
  private double calculateTotalMass() {
	  double total = 0.0;
	  for(Particle p: particles) {
		  total += p.getMass();
	  }
	  return total;
  }
  
  private double calculateSystemEnergy() {
	  double totalEnergy = 0.0;
	  for(Particle p: particles) {
		  totalEnergy += p.getVelocity().x * p.getVelocity().x + 
				  		 p.getVelocity().y * p.getVelocity().y +
				  		 p.getVelocity().z * p.getVelocity().z;
	  }
	  totalEnergy = 0.5 * totalMass * totalEnergy;
	  return totalEnergy / (double) numberOfParticles;
  }
}
