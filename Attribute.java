
/**
 * This class implements a simple attribute of a card.
 * @author Andrei-Ionut Enache
 *
 */
public class Attribute {

	/** name of the attribute */
	public String name;
	/** value of the attribute */
	public double value;
	/** number of the attribute */
	public int numberAttribute;
	
	/**
	 * This constructs a card attribute with the number of the attribute, name and value.
	 * @param numberAttribute the number of the attribute
	 * @param name the name of the attribute
	 * @param value the value of the attribute
	 */
	public Attribute (int numberAttribute,String name, double value)
	{   
		this.numberAttribute = numberAttribute;
		this.name = name;
		this.value = value;
	}
	
	/**
	 * This returns the current number of the attribute.
	 * @return the number of the attribute
	 */
	public int getAttributeNumber()
	{
		return numberAttribute;
	}
	
	/**
	 * This returns the current value of the attribute.
	 * @return the value of the attribute
	 */
	public double getAttributeValue()
	{    
		return value;
	}
	
	/**
	 * This method prints the attribute in a special layout,
	 * it makes a line between each attribute and name of attribute
	 * and prints the value of the attribute in a formated fashion, 
	 * only with two decimals.
	 */
	public void print() {
	    {
	    System.out.println("------------------------------");	
		System.out.print(  numberAttribute+ "." + name  );
		System.out.print( " | value = ");
		System.out.format("%.2f", value);
		System.out.print(" |");
		System.out.println();
	}
}}