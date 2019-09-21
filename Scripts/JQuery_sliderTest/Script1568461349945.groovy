import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://jqueryui.com/slider/')

WebUI.switchToFrame(findTestObject('Page_JqueryHome/Page_jQuery UI/Page_Slider  jQuery UI/iframe_Vertical slider_demo-frame'), 
    1)

WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_JqueryHome/Page_jQuery UI/Page_Slider  jQuery UI/slider'), 
    0, 200)

int width = WebUI.getElementWidth(findTestObject('Object Repository/Page_JqueryHome/Page_jQuery UI/Page_Slider  jQuery UI/slidebar'))

WebUI.dragAndDropByOffset(findTestObject('Page_JqueryHome/Page_jQuery UI/Page_Slider  jQuery UI/slidebar'), width, 0)

println(WebUI.takeScreenshot())

WebUI.closeBrowser()

