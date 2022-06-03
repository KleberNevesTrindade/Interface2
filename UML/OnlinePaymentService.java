

/**
 * Interface OnlinePaymentService
 */
public interface OnlinePaymentService {

  //
  // Fields
  //

  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   * @return       Double
   * @param        amount
   */
  public Double paymentFree(Double amount);


  /**
   * @return       Double
   * @param        amount
   * @param        months
   */
  public Double interest(Double amount, Integer months);


}
