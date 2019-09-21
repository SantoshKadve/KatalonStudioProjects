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

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('HomePage/link_a_Make Appointment'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/link_a_Make Appointment'))

WebUI.verifyElementPresent(findTestObject('LoginPage/button_Login'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('LoginPage/input_Username_username'), UserName)

WebUI.setText(findTestObject('LoginPage/input_Password_password'), Password)

WebUI.click(findTestObject('LoginPage/button_Login'))

WebUI.selectOptionByValue(findTestObject('MakeAnAppointmentPage/DropDown_Facility'), 'Hongkong CURA Healthcare Center', 
    false)

WebUI.check(findTestObject('MakeAnAppointmentPage/checkBox_ApplyForHospitalReAdmission'))

WebUI.click(findTestObject('MakeAnAppointmentPage/Radio_Medicaid'))

Date date = new Date()

String datePart = date.format('dd/MM/yyyy')

WebUI.setText(findTestObject('MakeAnAppointmentPage/Date_visit'), datePart)

WebUI.setText(findTestObject('MakeAnAppointmentPage/commentsBox'), 'comments')

WebUI.click(findTestObject('MakeAnAppointmentPage/button_bookAppointment'))

WebUI.click(findTestObject('MakeAnAppointmentPage/a_CURA Healthcare_menu-toggle'))

WebUI.verifyElementPresent(findTestObject('MakeAnAppointmentPage/a_Logout'), 1, FailureHandling.STOP_ON_FAILURE)

//Assert.assertTrue('Page not loaded ...', findTestObject('MakeAnAppointmentPage/a_Logout'), 0)
//assert WebUI.findTestObject('MakeAnAppointmentPage/a_Logout').equals(findTestObject('MakeAnAppointmentPage/a_Logout'))
WebUI.click(findTestObject('MakeAnAppointmentPage/a_Logout'))

WebUI.closeBrowser()

