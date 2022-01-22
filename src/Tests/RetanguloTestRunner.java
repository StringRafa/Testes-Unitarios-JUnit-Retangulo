package Tests;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import services.RetanguloTest;
import services.RetanguloTest2;

public class RetanguloTestRunner {

	public static void main(String[] args) {
		Result resultadoRetanguloTest = JUnitCore.runClasses(RetanguloTest.class);	
		Result resultadoRetanguloTestJUnit = JUnitCore.runClasses(RetanguloTestJUnit.class);
		Result resultadoRetanguloTest2 = JUnitCore.runClasses(RetanguloTest2.class);
		
		List<Failure> falha = resultadoRetanguloTest.getFailures();
		
		for (Failure failure : falha) {
			System.out.println("falha: " + failure.getMessage());
		}
		
		List<Failure> falha2 = resultadoRetanguloTest2.getFailures();
		
		for (Failure failure : falha2) {
			System.out.println("falha2" + failure.getMessage());
		}

		System.out.println("Resultado do teste RetanguloTest: " + resultadoRetanguloTest.wasSuccessful());
		System.out.println("Resultado do teste RetanguloTestJUnit: " + resultadoRetanguloTestJUnit.wasSuccessful());
		System.out.println("Resultado do teste RetanguloTest2: " + resultadoRetanguloTest2.wasSuccessful());
	}

}
