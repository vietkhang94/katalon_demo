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

WebUI.navigateToUrl('https://khangoi.com/blog/wp-admin')

WebUI.setText(findTestObject('Page_Account/input_Username or Email Address_log'), 'ks2041')

WebUI.setText(findTestObject('Page_Account/input_Password_pwd'), 'ks2041')

WebUI.click(findTestObject('Page_Account/input_Remember Me_wp-submit'))

WebUI.setText(findTestObject('Page_Profile/input_First Name_first_name'), 'DANG')

WebUI.setText(findTestObject('Page_Profile/input_Last Name_last_name'), 'Khang')

WebUI.setText(findTestObject('Page_Profile/textarea_Biographical Info_description'), 'Hello World')

WebUI.click(findTestObject('Page_Profile/input_Revoke all application passwords_submit'))

WebUI.verifyTextPresent('Profile updated.', false)

