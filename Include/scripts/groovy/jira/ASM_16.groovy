package jira
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ASM_16 {
	@Given("Que yo ingreso al aplicación web")
	public void que_yo_ingreso_al_aplicación_web() {
		WebUI.openBrowser('')

		WebUI.closeBrowser()

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://gamechangers.com.co/streaming/event-1/')
	}

	@When("yo me logue al portal del sistema")
	public void yo_me_logue_al_portal_del_sistema() {
		WebUI.setText(findTestObject('Object Repository/ASM-16/Page_Fest 2021  Login  Game Changers/input_CORREO ELECTRNICO_item_meta188'),
				'jhonjaderrojas1998@gmail.com')

		WebUI.setText(findTestObject('Object Repository/ASM-16/Page_Fest 2021  Login  Game Changers/input_NMERO DE TICKET_item_meta189'),
				'555444545')
	}

	@When("visualice un formulario de registro de usuarios")
	public void visualice_un_formulario_de_registro_de_usuarios() {
		WebUI.click(findTestObject('Object Repository/ASM-16/Page_Fest 2021  Login  Game Changers/button_Enviar'))

		WebUI.closeBrowser()
	}

	@When("y ingrese los datos a cada campo de manera correcta")
	public void y_ingrese_los_datos_a_cada_campo_de_manera_correcta() {
	}

	@When("haga clic en el boton de registrar usuario")
	public void haga_clic_en_el_boton_de_registrar_usuario() {
	}

	@Then("debo poder visulizar un mensaje modal en donde indique que el usuario fue    registrado de manera correcta")
	public void debo_poder_visulizar_un_mensaje_modal_en_donde_indique_que_el_usuario_fue_registrado_de_manera_correcta() {
	}
}