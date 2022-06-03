

/**
 * Class InstalIment
 */
public class InstalIment {

  //
  // Fields
  //

  private Date dueDate;
  private Double amount;
  
  //
  // Constructors
  //
  public InstalIment () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of dueDate
   * @param newVar the new value of dueDate
   */
  public void setDueDate (Date newVar) {
    dueDate = newVar;
  }

  /**
   * Get the value of dueDate
   * @return the value of dueDate
   */
  public Date getDueDate () {
    return dueDate;
  }

  /**
   * Set the value of amount
   * @param newVar the new value of amount
   */
  public void setAmount (Double newVar) {
    amount = newVar;
  }

  /**
   * Get the value of amount
   * @return the value of amount
   */
  public Double getAmount () {
    return amount;
  }

  //
  // Other methods
  //

}
