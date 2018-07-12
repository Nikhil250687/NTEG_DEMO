import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.elated.com/articles/javascript-tabs/')

WebUI.click(findTestObject('Windowspopup/elated.com/twitter button'))

WebUI.switchToWindowTitle('Share a link on Twitter')

WebUI.setText(findTestObject('Windowspopup/elated.com/Username'), 'testq1725@gmail.com')

WebUI.setText(findTestObject('Windowspopup/elated.com/Password'), 'Admin@123')

WebUI.click(findTestObject('Windowspopup/elated.com/Login button'))

WebUI.closeBrowser()

