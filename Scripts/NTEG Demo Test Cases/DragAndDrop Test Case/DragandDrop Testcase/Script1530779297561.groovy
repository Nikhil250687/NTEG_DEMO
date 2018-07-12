import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jqueryui.com/droppable/#default')

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_Droppable  jQuery UI (2)/div_Drag me to my target'), findTestObject(
        'DragandDrop/Page_Droppable  jQuery UI (2)/div_Drop here'))

'Dropped!'
droppable_text = WebUI.getText(findTestObject('DragandDrop/Page_Droppable  jQuery UI (2)/div_Dropped'))

'Verify if it is actually changed to "Dropped!" because of the drag and drop action.'
WebUI.verifyEqual(droppable_text, 'Dropped!')

WebUI.closeBrowser()

