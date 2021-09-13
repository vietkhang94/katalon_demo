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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cpqtest-autotestuinewux.endeavorcpq.com/home')

//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_VENDAVO iCPQ AutoTest New UX - Welcome/a_Login'), 10)
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_VENDAVO iCPQ AutoTest New UX - Welcome/a_Login'),30)
WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))


//WebUI.click(findTestObject('Object Repository/Page_VENDAVO iCPQ AutoTest New UX - Welcome/a_Login'))
WebUI.setText(findTestObject('Object Repository/Page_VENDAVO iCPQ AutoTest New UX - Login/input_UserName'), 'New_member1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_VENDAVO iCPQ AutoTest New UX - Login/input_Password'), 'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.closeBrowser()

