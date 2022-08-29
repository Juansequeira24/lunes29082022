package ejercicio;

import java.util.Scanner;

public class SalarioNeto {
	
	final static double TASA_ANTIGUEDAD = 15.0;
	final static double TASA_INSS=7.0;
	final static double TASA_INSS_PATRONAL = 22.5;
	final static double TASA_IR = 15.6;
	final static double TASA_SINDICATO= 1.0;
	
	
	
	
			
	public static void main(String[] args) { 
	
	Scanner lector = new Scanner(System.in);
	System.out.println("INGRESE SALARIO BRUTO:$");
	double salariobruto=lector.nextDouble();
	System.out.println("ingrese los años de antiguedad");
	int antiguedad =lector.nextInt();
	
	double montoAntiguedad=salariobruto *(TASA_ANTIGUEDAD/100);
	double ingresosTotales=salariobruto + montoAntiguedad;
	double montoINSS= ingresosTotales *(TASA_INSS/100);
	double montoIR= ingresosTotales *(TASA_IR/100);
	double montoSindicato= salariobruto *(TASA_SINDICATO/100);
	double deduccionestotales=montoINSS+montoIR+montoSindicato;
	double ingresoneto=ingresosTotales-deduccionestotales;
	double montoINSSPatronal=ingresosTotales*(TASA_INSS_PATRONAL);
	
	System.out.println( "----Tasas----" );
	System.out.println( "inss = " + TASA_INSS + "%" );
	System.out.println ( "ir = " + TASA_IR + "%" );
	System.out.println( "sindicato = " + TASA_SINDICATO + "%" );
	System.out.println ( "antiguedad = " + antiguedad + "%" );
	System.out.println ( "inss patronal = " + TASA_INSS_PATRONAL + "%" );
	System.out.println ( "----Ingresos del empleado----" );
	System.out.println ( "Ingreso bruto (básico) = C$" + ingresoneto );
	System.out.println ( "Monto por antigüedad = C$" + montoAntiguedad );
	System.out.println( "Monto del ingreso total = C$" + ingresosTotales );
	System.out.println ( "----Deducciones del empleado----" );
	System.out.println( "--Deducciones sobre el ingreso bruto--" );
	System.out.println( "Monto por afiliacion al sindicato = C$" + montoSindicato );
	System.out.println ( "--Deducciones sobre el ingreso total--" );
	System.out.println ( "Monto del INSS = C$" + montoINSS );
	System.out.println ( "Monto del IR = C$" + montoIR );
	System.out.println( "Monto del total de deducciones = C$" + deduccionestotales);
	System.out.println ( "----Deducciones del empleado----" );
	System.out.println( "Monto del INSS Patronal = C$" + montoINSSPatronal );
	System.out.println ( "----Total a pagar----" );
	System.out.println ( "Monto del ingreso neto = C$" + ingresoneto);

	}
}
