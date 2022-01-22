package Tests;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import services.RetanguloTest;

public class RetanguloTestRunner {

	public static void main(String[] args) {
		Result resultadoRetanguloTest = JUnitCore.runClasses(RetanguloTest.class);	
		Result resultadoRetanguloTestJUnit = JUnitCore.runClasses(RetanguloTestJUnit.class);
		
		List<Failure> falha = resultadoRetanguloTest.getFailures();
		
		for (Failure failure : falha) {
			System.out.println(failure.getMessage());
		}

		System.out.println("Resultado do teste RetanguloTest: " + resultadoRetanguloTest.wasSuccessful());
		System.out.println("Resultado do teste RetanguloTestJUnit: " + resultadoRetanguloTestJUnit.wasSuccessful());
	}

}
