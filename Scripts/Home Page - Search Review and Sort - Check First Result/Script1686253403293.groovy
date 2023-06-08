import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.royalcaribbean.com/')

WebUI.click(findTestObject('Object Repository/Page_Cruises  Amazing Cruises and Cruise De_95ece5/div_cruise rooms_notification-banner__secti_617cae'))

WebUI.click(findTestObject('Object Repository/Page_Cruises  Amazing Cruises and Cruise De_95ece5/div_Cruising to Any Destination'))

WebUI.click(findTestObject('Object Repository/Page_Cruises  Amazing Cruises and Cruise De_95ece5/label_Mexico'))

WebUI.click(findTestObject('Object Repository/Page_Cruises  Amazing Cruises and Cruise De_95ece5/div_Departing from Any Departure Port'))

WebUI.click(findTestObject('Object Repository/Page_Cruises  Amazing Cruises and Cruise De_95ece5/label_Los Angeles, California'))

WebUI.click(findTestObject('Object Repository/Page_Cruises  Amazing Cruises and Cruise De_95ece5/div_Leaving Any Date'))

WebUI.click(findTestObject('Object Repository/Page_Cruises  Amazing Cruises and Cruise De_95ece5/label_Dec'))

WebUI.click(findTestObject('Object Repository/Page_Cruises  Amazing Cruises and Cruise De_95ece5/span_Search Cruises'))

WebUI.click(findTestObject('Object Repository/Page_Find Mexico Cruises from Los Angeles  _3e07dc/p_Recommended'))

WebUI.click(findTestObject('Object Repository/Page_Find Mexico Cruises from Los Angeles  _3e07dc/p_Price lowest to highest'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Find Mexico Cruises from Los Angeles  _3e07dc/h3_Ensenada Cruise'), 
    'Ensenada Cruise')

WebUI.closeBrowser()

