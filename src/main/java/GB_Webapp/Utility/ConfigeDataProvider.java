package GB_Webapp.Utility;



public class ConfigeDataProvider {

	public static String UserDirectoryPath = System.getProperty("user.dir");
	public static String browser = Library.getStringConfigData("browser");
	
	public static String MobileNumber = Library.getStringConfigData("MobileNumber");
	public static String Username = Library.getStringConfigData("Username");
	public static String Otp = Library.getStringConfigData("Otp");
	
	
	////////////////////////Web Admin Data   ////////////////////////
	public static String hero_Gb_Bangladesh_ProdUrl = Library.getStringConfigData("BangladeshUrl");
	public static String hero_Gb_Zambia_ProdUrl = Library.getStringConfigData("ZambiaUrl");
	public static String hero_Gb_Philippines_ProdUrl = Library.getStringConfigData("PhilippinesUrl");
	public static String hero_hub_url = Library.getStringConfigData("UatUrl");

//===============================  Zambia country data =================	
	public static String ZambiaCustomerName = Library.getStringConfigData("CustomerName");
	public static String ZambiaCustomerMiddleName = Library.getStringConfigData("MiddleName");
	public static String ZambiaCustomerLastName = Library.getStringConfigData("LastName");
	public static String ZambiaMobileNumber = Library.getStringConfigData("MobileNumber1");
	public static String ZambiaEmail = Library.getStringConfigData("Email");
	public static String ZambiaCity = Library.getStringConfigData("city");
	public static String ZambiaDOB = Library.getStringConfigData("DOB");
	public static String Address1 = Library.getStringConfigData("Address1");
	public static String Address2 = Library.getStringConfigData("Address2");
	public static String Pincode = Library.getStringConfigData("Pincode");
	
//================================= Shareholder details =================================	
	public static String Company_name = Library.getStringConfigData("Company_name");
	public static String Discription = Library.getStringConfigData("Discription");
	public static String Total_Manpower = Library.getStringConfigData("Total_Manpower");
	public static String Total_manager = Library.getStringConfigData("Total_manager");
	public static String Partners = Library.getStringConfigData("Partners");
	public static String Relation = Library.getStringConfigData("Relation");
	public static String Responsibility = Library.getStringConfigData("Responsibility");
	public static String Total_shares = Library.getStringConfigData("Total_shares");
	public static String Age = Library.getStringConfigData("Age");
	public static String Designation = Library.getStringConfigData("Designation");
	public static String Country = Library.getStringConfigData("Country");
	public static String Philippines_name = Library.getStringConfigData("Philippines_name");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
