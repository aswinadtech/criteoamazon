package twc.Regression.TestCases;

import java.io.File;

import org.openqa.selenium.internal.Killable;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import twc.Regression.HandleWithCharles.CharlesProxy;
//import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Regression.CustomParamValidation.CustomParamFunctions;
import twc.Regression.CustomParamValidation.validate_CustomParameter;
import twc.Regression.Driver.Drivers;
import twc.Regression.General.Functions;
import twc.Regression.General.TwcAndroidBaseTest;
import twc.Regression.HandleWithAppium.AppiumFunctions;
import twc.Regression.HandleWithCharles.CharlesFunctions;
import twc.Regression.ReadDataFromFile.read_excel_data;
import twc.Regression.utils.DeleteFiles;

public class Criteo_Amazon_Testcases extends TwcAndroidBaseTest{
	
	public static String CurrentWifiName=null;
	
	private static final String CONFIG_FILE_PATH = "charles_common.config";

	private static final String BN_SEVERE1_CONFIG_FILE_PATH = "BNSevere1charles_common.config";
	private static final String BN_SEVERE2_CONFIG_FILE_PATH = "BNSevere2charles_common.config";
	private static final String CRITEO_CONFIG_FILE_PATH = "Criteocharles_common.config";
	private static final String CRITEO_NONUS_CONFIG_FILE_PATH = "CriteoNonUScharles_common.config";
	// public static CharlesProxy proxy;
	public File configFile;
	private CharlesProxy proxy;


	/*@BeforeClass(alwaysRun = true)
    public void beforeClass() throws Exception {	
	this.configFile = this.charlesGeneralConfigFile(CONFIG_FILE_PATH);
	proxy = new CharlesProxy("localhost", 8333, CONFIG_FILE_PATH);
	proxy.startCharlesProxyWithUI();
	proxy.disableRewriting();
    proxy.stopRecording();
	proxy.disableMapLocal();
	proxy.startRecording();
	proxy.clearCharlesSession();
	AppiumFunctions.LaunchAppWithFullReset();
	Thread.sleep(90000);
	AppiumFunctions.gettingApkVersion() ;
}*/
	
	
	/*
	 * This method validates Amazon SDK version
	 */
	@Test(priority = 0, enabled = true)
	@Description("Validating 'adsdk' parameter of Amazon aax call ")
	public void Validate_Amazon_SDK_adsdk_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Amazon SDK version i.e. 'adsdk' parameter of Amazon aax call");
		logStep("****** Validating Amazon SDK version i.e. 'adsdk' parameter of Amazon aax call");
		CharlesFunctions.createXMLFileForCharlesSessionFile();
		//Functions.validate_Amazon_aax_call_parameter("Amazon", "adsdk","aps-android-9.1.0");

	}
	
	 @Test(priority = 2, enabled = true)
		@Description("Verifying amazon slot Id for alerts center Page")
		public void Verifying_amazon_slotId_for_AlertsCenter() throws Exception {
			System.out.println("==============================================");
			System.out.println("===========================Aleret Center page Adcal iu====================");
			System.out.println("****** Alert Center ad test case Started");
			logStep("****** Alert Center ad test case Started");
			Functions.verifyAAX_SlotId("Smoke", "MyAlerts");
		}
	
	 @Test(priority = 4, enabled = true)
		@Description("Verifying amazon Slot Id for feed1 prerol ad call")
		public void Verify_amazon_aaxSlot_feed1_adCall() throws Exception {
			System.out.println(
					"================= Verify amazon aax slot  Id for feed1 adcall  testcase Started =========================");
			System.out.println("****** amazon aax feed1 preload ad call validation Started");
			logStep("****** amazon aax feed1 preload ad call validation Started");
			Functions.verifyAAX_SlotId("Smoke", "Feed1");
			System.out.println(
					"================= Verify amazon aax slot Id for feed1  adcall testcase End =========================");

		}
	 
	
			
			
			
			 @Test(priority = 14, enabled = true)
				@Description("Verifying amazon Slot Id for maps details preroll ad cal")
				public void Verify_amazon_aax_mapsdetails_adcall() throws Exception {
					System.out.println("================= Verify amazon aax maps detais adcall Started =========================");
					logStep(" Verifying preload amazon aax for  map details");
					Functions.verifyAAX_SlotId("Smoke", "Map");
					System.out.println("================= Verify amazon aax maps card preroll adcall End =========================");
				}
	 
			 	@Test(priority = 15, enabled = true)
	@Description("Verify amazon aax Covid details preload ad call")
	public void Verify_amazon_aax_preload_Covid_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out
				.println("=========================== amazon aax Covid details preload ad call ====================");
		System.out.println("****** amazon aax Covid details preload ad call validation Started");
		logStep("****** amazon aax Covid details preload ad call validation Started");
		//Utils.verifyAAX_SlotId("Smoke", "Covid");
	}
		
	
		@Test(priority = 16, enabled = true)
	@Description("Validating Google Mobile Ads SDK version of gampad call ")
	public void Validate_GMA_SDK_version() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Google Mobile Ads SDK Version i.e. 'js' parameter of gampad call");
		logStep("Validating Google Mobile Ads SDK Version i.e. 'js' parameter of gampad call");
		//Utils.validate_Noncustom_param_val_of_gampad("Smoke", "Marquee", "js", properties.getProperty("GMASDKVersion"));

	}
			 
			 
			 @Test(priority = 18, enabled = true)
				@Description("Verifying amazon aax for AQ details page")
				public void Smoke_Test_amazon_aax_Airquality_deatailcard() throws Exception {
					System.out.println(
							"================= Verify amazon aax for Air Quality details page Started =========================");
					Functions.verifyAAX_SlotId("Smoke", "Air Quality(Content)");
					System.out.println("================= Verify amazon aax for Air Quality detail Page  End=========================");
				}
			
	 
	
		@Test(priority = 250, enabled = true)
	@Description("Verify amazon video bid id's")
	public void Verify_amazon_video_adcall_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon video ad call bid id's ====================");
		System.out.println("****** amazon video ad call bid id validation Started");
		logStep("****** amazon video ad call bid id validation Started");
		
		Functions.validate_aax_bid_value_with_gampad_bid_value("Smoke", "PreRollVideo", false);
	}

	@Test(priority = 251, enabled = true)
	@Description("Validating Google Interactive Media Ads SDK version of Preroll video call ")
	public void Validate_IMA_SDK_version() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"****** Validating Google Interactive Media Ads SDK version i.e. 'js' parameter of Preroll video call");
		logStep("Validating Google Interactive Media Ads SDK version i.e. 'js' parameter of Preroll video call");
		

	}
			
			 

			 
			 
		
			 
			 
	
	
	@Test(priority = 26, enabled = true)
	@Description("Verify amazon aax Hourly Details preload ad call")
	public void Verify_amazon_aax_preload_Hourly_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out
				.println("=========================== amazon aax Hourly Details preload ad call ====================");
		System.out.println("****** amazon aax Hourly Details preload ad call validation Started");
		logStep("****** amazon aax Hourly Details preload ad call validation Started");
	Functions.verifyAAX_SlotId("Smoke", "Hourly");
	}
	
	@Test(priority = 28, enabled = true)
	@Description("Verify amazon aax Hourly1 Details preload ad call")
	public void Verify_amazon_aax_preload_Hourly1_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out
				.println("=========================== amazon aax Hourly1 Details preload ad call ====================");
		System.out.println("****** amazon aax Hourly1 Details preload ad call validation Started");
		logStep("****** amazon aax Hourly1 Details preload ad call validation Started");
	Functions.verifyAAX_SlotId("Smoke", "Hourly1");
	}
	
	@Test(priority = 30, enabled = true)
	@Description("Verify amazon aax Hourly2 Details preload ad call")
	public void Verify_amazon_aax_preload_Hourly2_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out
				.println("=========================== amazon aax Hourly2 Details preload ad call ====================");
		System.out.println("****** amazon aax Hourly2 Details preload ad call validation Started");
		logStep("****** amazon aax Hourly2 Details preload ad call validation Started");
	Functions.verifyAAX_SlotId("Smoke", "Hourly2");
	}
	
	@Test(priority = 32, enabled = true)
	@Description("Verify amazon aax Hourly3 Details preload ad call")
	public void Verify_amazon_aax_preload_Hourly3_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out
				.println("=========================== amazon aax Hourly3 Details preload ad call ====================");
		System.out.println("****** amazon aax Hourly3 Details preload ad call validation Started");
		logStep("****** amazon aax Hourly3 Details preload ad call validation Started");
	Functions.verifyAAX_SlotId("Smoke", "Hourly3");
	}
		

	 @Test(priority = 50, enabled = true)
	@Description("Verify AlertCenter ad call amazon bid id")
	public void Verify_AlertCenter_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== AlertCenter ad call amazon bid id ====================");

		System.out.println("****** AlertCenter ad call amazon bid id validation Started");
		logStep("****** AlertCenter ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("MyAlerts", true);

	}
	
	
	 @Test(priority = 52, enabled = true)
		@Title("Verifying amazon Slot Id for daily details day1 ad calll")
		public void Smoke_Test_amazon_aax_Daily_details_Day1_adcall() throws Exception {
			System.out
					.println("================= Verifying amazon slot id for  daily details day1 adcall test case Started =========================");
			Functions.verifyAAX_SlotId("Smoke", "Daily(10day)");
			System.out.println("================= Verifying amazon slot id for  daily details day 1 adcall test case End =========================");
		}
	 
	     @Test(priority = 54, enabled = true)
		@Description("Verify Feed1 ad call amazon bid id")
		public void Verify_Feed1_ad_call_amazon_bid_id() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Feed1 ad call amazon bid id ====================");
			System.out.println("****** Feed1 ad call amazon bid id validation Started");
			logStep("****** Feed1 ad call amazon bid id validation Started");
		  Functions.validate_aax_bid_value_with_gampad_bid_value("Feed1", true);
			
		}
	    
	 	
	 	@Test(priority = 64, enabled = true)
		@Description("Verify Map Details ad call amazon bid id")
		public void Verify_Map_Details_ad_call_amazon_bid_id() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Map Details ad call amazon bid id ====================");

			System.out.println("****** Map Details ad call amazon bid id validation Started");
			logStep("****** Map Details ad call amazon bid id validation Started");
			Functions.validate_aax_bid_value_with_gampad_bid_value("Map", true);
		}
		
	
		@Test(priority = 68, enabled = true)
		@Description("Verify AQ Details ad call amazon bid id")
		public void Verify_AQ_Details_ad_call_amazon_bid_id() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== AQ Details ad call amazon bid id ====================");

			System.out.println("****** AQ Details ad call amazon bid id validation Started");
			logStep("****** AQ Details ad call amazon bid id validation Started");
			Functions.validate_aax_bid_value_with_gampad_bid_value("Air Quality(Content)", true);
		}
		
		
		@Test(priority = 76, enabled = true)
		@Description("Verify Hourly1 Details ad call amazon bid id")
		public void Verify_Hourly1_Details_ad_call_amazon_bid_id() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Hourly1 Details ad call amazon bid id ====================");

			System.out.println("****** Hourly1 Details ad call amazon bid id validation Started");
			logStep("****** Hourly1 Details ad call amazon bid id validation Started");
			Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly1", true);
		}
		
		
		@Test(priority =78, enabled = true)
		@Description("Verify Hourly2 Details ad call amazon bid id")
		public void Verify_Hourly2_Details_ad_call_amazon_bid_id() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Hourly2 Details ad call amazon bid id ====================");

			System.out.println("****** Hourly2 Details ad call amazon bid id validation Started");
			logStep("****** Hourly2 Details ad call amazon bid id validation Started");
			Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly2", true);
		}
		
		@Test(priority = 80, enabled = true)
		@Description("Verify Hourly3 Details ad call amazon bid id")
		public void Verify_Hourly3_Details_ad_call_amazon_bid_id() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Hourly3 Details ad call amazon bid id ====================");

			System.out.println("****** Hourly1 Details ad call amazon bid id validation Started");
			logStep("****** Hourly3 Details ad call amazon bid id validation Started");
			Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly3", true);
		}
		
		
		@Test(priority = 82, enabled = true)
		@Description("Verify Daily Details ad call amazon bid id")
		public void Verify_Daily_Details_ad_call_amazon_bid_id() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Daily Details ad call amazon bid id ====================");

			System.out.println("****** Daily Details ad call amazon bid id validation Started");
			logStep("****** Daily Details ad call amazon bid id validation Started");
	     Functions.validate_aax_bid_value_with_gampad_bid_value("Daily(10day)", true);
		}
		
		
		
		
		
		
		@Test(priority = 162, enabled = true)
		@Description("Verify Criteo SDK config app call")
		public void Verify_Criteo_SDK_config_app_Call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK config/app call ====================");

			System.out.println("****** Criteo SDK config/app call validation Started");
			logStep("****** Criteo SDK config/app call validation Started");

		Functions.verifyCriteo_config_app_Call("Criteo");

		}
				
			
		@Test(priority = 164, enabled = true)
		@Description("Verify Criteo SDK inapp v2 call")
		public void Verify_Criteo_SDK_inapp_v2_Call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK inapp/v2 call ====================");
			System.out.println("****** Criteo SDK inapp/v2 call validation Started");
			logStep("****** Criteo SDK inapp/v2 call validation Started");
		Functions.verifyCriteo_inapp_v2_Call("Criteo");
		}
		
		@Test(priority = 166, enabled = true)
		@Description("Validating 'cpId' parameter of Criteo SDK config app call")
		public void Validate_Criteo_SDK_config_app_Call_cpId_parameter() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating 'cpId' parameter of Criteo SDK config app call");
			logStep("****** Validating 'cpId' parameter of Criteo SDK config app call");
			Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "cpId", "B-051673");

		}
		@Test(priority = 168, enabled = true)
		@Description("Validating 'bundleId' parameter of Criteo SDK config app call ")
		public void Validate_Criteo_SDK_config_app_Call_bundleId_parameter() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating 'bundleId' parameter of Criteo SDK config app call");
			logStep("****** Validating 'bundleId' parameter of Criteo SDK config app call");
			Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "bundleId", "com.weather.Weather");

		}
		
		@Test(priority = 170, enabled = true)
		@Description("Validating 'sdkVersion' parameter of Criteo SDK config app call ")
		public void Validate_Criteo_SDK_config_app_Call_sdkVersion_parameter() throws Exception {
			System.out.println("==============================================");
			System.out.println("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
			logStep("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
			Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "sdkVersion", "4.6.1");

		}
	
		@Test(priority = 172, enabled = true)
		@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed1 call")
		public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed1_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed1 call====================");
			System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed1 validation Started");
			logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed1 call validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "cpm", true);
		}

		@Test(priority = 174, enabled = true)
		@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed1 call")
		public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed1_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call size parameter with Feed1 call====================");
			System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed1 call validation Started");
			logStep("****** Criteo SDK invapp v2 call size parameter with Feed1 call validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "size", true);
		}

		@Test(priority = 176, enabled = true)
		@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed1 call")
		public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed1_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed1 call====================");
			System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed1 call validation Started");
			logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed1 call validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "displayUrl",true);
		}
		
		
		
		@Test(priority = 202, enabled = true)
		@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Map Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_map_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call cpm parameter ====================");
			System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Map Details validation Started");
			logStep("****** Criteo SDK invapp v2 call cpm parameter of Map Details validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Map", "cpm", true);
		}


		@Test(priority = 204, enabled = true)
		@Description("Verify size parameter of Criteo SDK inapp v2 call with Map Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_map_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");
			System.out.println("****** Criteo SDK invapp v2 call size parameter of Map Details validation Started");
			logStep("****** Criteo SDK invapp v2 call size parameter of Map Details validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Map", "size", true);
		}


		@Test(priority = 206, enabled = true)
		@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Map Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_map_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
			System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Map Details validation Started");
			logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Map Details validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Map", "displayUrl", true);
		}

	@Test(priority = 208, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with AlertCenter call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_AlertCenter_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with AlertCenter call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with AlertCenter call validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with AlertCenter call validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("MyAlerts", "cpm", true);
	}

	@Test(priority = 210, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with AlertCenter call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_AlertCenter_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with AlertCenter call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with AlertCenter call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with AlertCenter call validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("MyAlerts", "size", true);
	}

	@Test(priority = 212, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with AlertCenter call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_AlertCenter_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with AlertCenter call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with AlertCenter call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with AlertCenter call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("MyAlerts", "displayUrl",
				true);
	}
		
		
		@Test(priority = 214, enabled = true)
		@Description("Verify cpm parameter of Criteo SDK inapp v2 call with AQ Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_aq_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call cpm parameter with aq details call====================");

			System.out.println("****** Criteo SDK invapp v2 call cpm parameter with aq details call validation Started");
			logStep("****** Criteo SDK invapp v2 call cpm parameter with aq details call validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Air Quality(Content)","cpm", true);
		}

		@Test(priority = 216, enabled = true)
		@Description("Verify size parameter of Criteo SDK inapp v2 call with AQ Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_aq_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call size parameter with aq details call====================");

			System.out.println("****** Criteo SDK invapp v2 call size parameter with aq details call validation Started");
			logStep("****** Criteo SDK invapp v2 call size parameter with aq details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Air Quality(Content)", "size", true);
		}

		@Test(priority = 218, enabled = true)
		@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with AQ Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_aq_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call displayUrl parameter with aq details call====================");

			System.out.println(
					"****** Criteo SDK invapp v2 call displayUrl parameter with aq details call validation Started");
			logStep("****** Criteo SDK invapp v2 call displayUrl parameter with aq details call validation Started");
				
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Air Quality(Content)","displayUrl", true);
		}

		
		

		@Test(priority = 238, enabled = true)
		@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Daily Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_daily_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call cpm parameter with Daily details call====================");

			System.out.println("****** Criteo SDK invapp v2 call cpm parameter with Daily Details call validation Started");
			logStep("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Daily(10day)", "cpm",true);
		}

		@Test(priority = 240, enabled = true)
		@Description("Verify size parameter of Criteo SDK inapp v2 call with daily Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_daily_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call size parameter with Daily details call====================");

			System.out
					.println("****** Criteo SDK invapp v2 call size parameter with Daily details call validation Started");
			logStep("****** Criteo SDK invapp v2 call size parameter with Daily details call validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Daily(10day)", "size",true);
		}

		@Test(priority = 242, enabled = true)
		@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Daily Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_daily_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println(
					"=========================== Criteo SDK invapp v2 call displayUrl parameter with Daily details call====================");

			System.out.println(
					"****** Criteo SDK invapp v2 call displayUrl parameter with Daily details call validation Started");
			logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Daily details call validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Daily(10day)","displayUrl", true);
		}
		
		@Test(priority = 246, enabled = true)
		@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly_details_gampad_call() throws Exception {

			System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly Details validation Started");
			logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly Details validation Started");
		    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "cpm", true);
		}

		@Test(priority = 248, enabled = true)
		@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

			System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly Details validation Started");
			logStep("****** Criteo SDK invapp v2 call size parameter of Hourly Details validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "size", true);
		}
		@Test(priority = 250, enabled = true)
		@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly_details_gampad_call()
				throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
			System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly Details validation Started");
			logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly Details validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "displayUrl",true);
		}


				@Test(priority = 252, enabled = true)
		@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly1 Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly1_details_gampad_call() throws Exception {

			System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly1 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly1 Details validation Started");
		    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly1", "cpm", true);
		}

		@Test(priority = 254, enabled = true)
		@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly1 Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly1_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

			System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly1 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call size parameter of Hourly1 Details validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly1", "size", true);
		}
		@Test(priority = 256, enabled = true)
		@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly1 Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly1_details_gampad_call()
				throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
			System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly1 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly1 Details validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly1", "displayUrl",true);
		}

												
												
				@Test(priority = 258, enabled = true)
		@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly2 Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly2_details_gampad_call() throws Exception {

			System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly2 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly2 Details validation Started");
		   Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly2", "cpm", true);
		}

		@Test(priority = 260, enabled = true)
		@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly2 Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly2_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

			System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly2 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call size parameter of Hourly2 Details validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly2", "size", true);
		}
		@Test(priority = 262, enabled = true)
		@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly2 Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly2_details_gampad_call()
				throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
			System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly2 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly2 Details validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly2", "displayUrl",true);
		}
												
												
																						
				@Test(priority = 264, enabled = true)
		@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly3 Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly3_details_gampad_call() throws Exception {

			System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly3 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly3 Details validation Started");
		    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly3", "cpm", true);
		}

		@Test(priority = 266, enabled = true)
		@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly3 Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly3_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

			System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly3 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call size parameter of Hourly3 Details validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly3", "size", true);
		}
		@Test(priority = 268, enabled = true)
		@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly3 Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Hourly3_details_gampad_call()
				throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
			System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly3 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly3 Details validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly3", "displayUrl",true);
		}
	
		@Test(priority = 280, enabled = true)
		@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Covid Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Covid_details_gampad_call() throws Exception {

			System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly3 Details validation Started");
			logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly3 Details validation Started");
		    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Covid", "cpm", true);
		}

		@Test(priority = 282, enabled = true)
		@Description("Verify size parameter of Criteo SDK inapp v2 call with Covid Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Covid_details_gampad_call() throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

			System.out.println("****** Criteo SDK invapp v2 call size parameter of CovidDetails validation Started");
			logStep("****** Criteo SDK invapp v2 call size parameter of Covid Details validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Covid", "size", true);
		}
		@Test(priority = 284, enabled = true)
		@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Covid Details call")
		public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Covid_details_gampad_call()
				throws Exception {
			System.out.println("==============================================");
			System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
			System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Covid Details validation Started");
			logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Covid Details validation Started");
			Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Covid", "displayUrl",true);
		}
		
		



	
	

}
