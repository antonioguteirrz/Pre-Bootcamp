package Phone;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    protected String getVersionNumber() {
		return versionNumber;
	}

	protected void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	protected int getBatteryPercentage() {
		return batteryPercentage;
	}

	protected void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	protected String getCarrier() {
		return carrier;
	}

	protected void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	protected String getRingTone() {
		return ringTone;
	}

	protected void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}

	// abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
}

