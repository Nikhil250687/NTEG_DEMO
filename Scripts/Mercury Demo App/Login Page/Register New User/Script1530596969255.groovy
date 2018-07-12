import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://newtours.demoaut.com/')

WebUI.click(findTestObject('Mercury Demo App OR/Page_Welcome Mercury Tours/a_Register'))

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_firstName'), 'firstname')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_lastName'), 'lastname')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_phone'), 'phone')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_userName'), 'email')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_address1'), '123, b block')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_city'), 'Sacramento')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_state'), 'California')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_postalCode'), '20123')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_email'), 'username')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_password'), 'password')

WebUI.setText(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_confirmPassword'), 'confirmpassword')

WebUI.click(findTestObject('Mercury Demo App OR/Page_Register Mercury Tours/input_register'))

WebUI.closeBrowser()

