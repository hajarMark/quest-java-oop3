
public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude== 0) {
            this.flying = true;
            System.out.printf("%s Cherry takes off in the sky.%n", this.getName());
        }
    }
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude= Math.max(this.altitude + meters,120);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude > 10) {
            System.out.printf("%s is too high, it can't lands.%n", this.getName());
        }
        else{
            System.out.printf("%s lands on the ground.%n", this.getName());
            this.altitude-=9;
        }
    }

    @Override
    public void glide() {
        if (!this.flying && this.altitude==30) {
            this.flying = true;
            System.out.printf("%s It glides into the air..%n", this.getName());
        }
    }

    @Override
    public int descend(int meters) {

        if (this.flying) {
            this.altitude= Math.min(this.altitude + meters,10);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
}
