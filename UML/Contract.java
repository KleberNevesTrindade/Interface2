
import java.util.*;


/**
 * Class Contract
 */
public class Contract {

  //
  // Fields
  //

  private Integer number;
  private Date date;
  private Double totalValue;

  public Vector instalimentVector = new Vector();
  
  //
  // Constructors
  //
  public Contract () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of number
   * @param newVar the new value of number
   */
  public void setNumber (Integer newVar) {
    number = newVar;
  }

  /**
   * Get the value of number
   * @return the value of number
   */
  public Integer getNumber () {
    return number;
  }

  /**
   * Set the value of date
   * @param newVar the new value of date
   */
  public void setDate (Date newVar) {
    date = newVar;
  }

  /**
   * Get the value of date
   * @return the value of date
   */
  public Date getDate () {
    return date;
  }

  /**
   * Set the value of totalValue
   * @param newVar the new value of totalValue
   */
  public void setTotalValue (Double newVar) {
    totalValue = newVar;
  }

  /**
   * Get the value of totalValue
   * @return the value of totalValue
   */
  public Double getTotalValue () {
    return totalValue;
  }

  /**
   * Add a Instaliment object to the instalimentVector List
   */
  public void addInstaliment (InstalIment new_object) {
    instalimentVector.add(new_object);
  }

  /**
   * Remove a Instaliment object from instalimentVector List
   */
  public void removeInstaliment (InstalIment new_object)
  {
    instalimentVector.remove(new_object);
  }

  /**
   * Get the List of Instaliment objects held by instalimentVector
   * @return List of Instaliment objects held by instalimentVector
   */
  public List getInstalimentList () {
    return (List) instalimentVector;
  }


  //
  // Other methods
  //

}
