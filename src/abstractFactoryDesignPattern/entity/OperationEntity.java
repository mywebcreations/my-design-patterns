package abstractFactoryDesignPattern.entity;

public class OperationEntity {
	private String readOperation = "readOperation";
	private String writeOperation = "writeOperation";
    private String updateOperation = "updateOperation";
    private String deleteOperation = "deleteOperation";
    
    public OperationEntity() {
    	//properties to be initialized from database
    }
		
	/**
	 * @return the readOperation
	 */
	public String getReadOperation() {
		return readOperation;
	}

	/**
	 * @param readOperation the readOperation to set
	 */
	public void setReadOperation(String readOperation) {
		this.readOperation = readOperation;
	}

	/**
	 * @return the writeOperation
	 */
	public String getWriteOperation() {
		return writeOperation;
	}

	/**
	 * @param writeOperation the writeOperation to set
	 */
	public void setWriteOperation(String writeOperation) {
		this.writeOperation = writeOperation;
	}

	/**
	 * @return the updateOperation
	 */
	public String getUpdateOperation() {
		return updateOperation;
	}

	/**
	 * @param updateOperation the updateOperation to set
	 */
	public void setUpdateOperation(String updateOperation) {
		this.updateOperation = updateOperation;
	}

	/**
	 * @return the deleteOperation
	 */
	public String getDeleteOperation() {
		return deleteOperation;
	}

	/**
	 * @param deleteOperation the deleteOperation to set
	 */
	public void setDeleteOperation(String deleteOperation) {
		this.deleteOperation = deleteOperation;
	}    
}
