public class SpaService 
{
	private String serviceDescription;
	private double price;

	/**
	* Sets value of service description (service)
	* @param service The name of the service
	* @return void
	*/
	public void setServiceDescription(String service)
	{
		serviceDescription = service;
	}

	/**
	* Sets value of the price for the service (servicePrce)
	* @param servicePrice The price of the service
	* @return void
	*/
	public void setPrice(double servicePrice)
	{
		price = servicePrice;
	}

	/**
	* Gets the value of service description
	* @return service description
	*/
	public String getServiceDescription()
	{
		return serviceDescription;
	}

	/**
	* Gets the value of price
	* @return price
	*/	
	public double getPrice()
	{
		return price;
	}
}