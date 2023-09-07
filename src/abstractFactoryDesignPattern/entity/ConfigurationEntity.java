package abstractFactoryDesignPattern.entity;

public class ConfigurationEntity {

	private String cpu = "cpu";
	private String gpu = "gpu";
	private String ram = "ram";
	
	public ConfigurationEntity() {
		//initializes properties from database values
	}
	
	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the gpu
	 */
	public String getGpu() {
		return gpu;
	}

	/**
	 * @param gpu the gpu to set
	 */
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	/**
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(String ram) {
		this.ram = ram;
	}

}
