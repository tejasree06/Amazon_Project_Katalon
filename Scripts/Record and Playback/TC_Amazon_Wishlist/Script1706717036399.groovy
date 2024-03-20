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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Wishlist_OR/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Wishlist_OR/input_email'), 'tejasreesanapathi06@gmail.com')

WebUI.click(findTestObject('Object Repository/Wishlist_OR/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Wishlist_OR/input_password'), 'TrInCDu1Asc=')

WebUI.click(findTestObject('Object Repository/Wishlist_OR/inputsignInSubmit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Wishlist_OR/select_All Departments        Alexa Skills _5dcdff'), 
    'search-alias=stripbooks', true)

WebUI.setText(findTestObject('Object Repository/Wishlist_OR/input_field-keywords (1)'), 'believe in yourself')

WebUI.click(findTestObject('Object Repository/Wishlist_OR/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Wishlist_OR/div_a-section aok-relative s-image-fixed-height'))

WebUI.click(findTestObject('Object Repository/Wishlist_OR/button_a-button-close a-declarative'))

WebUI.closeBrowser()

