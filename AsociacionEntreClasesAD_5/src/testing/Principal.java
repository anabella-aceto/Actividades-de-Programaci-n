package testing;

import javabean.Departamento;
import javabean.Empleado;
import javabean.Localidad;
import javabean.Trabajo;
import modelo.dao.EmpresaDaoImplList;

public class Principal {

	public static void main(String[] args) {
		
		EmpresaDaoImplList empresa = new EmpresaDaoImplList("EMPRESA");
		
		//Probamos el método altaEmpleado
		
		Empleado e4 = new Empleado(4,"Fabián", "Loth Han", 'H', "flothhan@gmail.com", 1200,
				200, null , null);
		
		System.out.println("ALTA EMPLEADO: " );
		System.out.println(empresa.altaEmpleado(e4));
		System.out.println();
		
				
		//Probamos el método eliminarUno
		
		System.out.println("ELIMINAR UN EMPLEADO POR OBJETO");
		System.out.println("Eliminar empleado e4 = true: " +empresa.eliminarUno(e4));
		System.out.println();
		
		//Probamos el método buscarUno
		
		System.out.println("BUSCAR UN EMPLEADO");
		System.out.println(empresa.buscarUno(2));
		System.out.println();
		
		//Probamos el método modificarUno
		Localidad loc1 = new Localidad(43003,"Descalzos 3", "Tarragona", "España" );
		Trabajo t2 = new Trabajo("2", "programador", 2100.0, 1500);
		Departamento d2 = new Departamento(2, "IT", loc1);
		Empleado e5 = new Empleado(2, "Ana", "Pérez Vargas", 'M', "aperezvargas@gmail.com", 1800, 100, t2, d2); 
		
		System.out.println("MODIFICAR UN EMPLEADO");
		System.out.println(empresa.modificarUno(e5));
		System.out.println();
		
		
		//Probamos el método buscar un empleado según su género
		System.out.println("BUSCAR EMPLEADOS SEGÚN GÉNERO: "+empresa.buscarPorSexo('M'));
		System.out.println();
		
		
		//Probamos el método buscar un empleado según su idEmpleado
		int id = 1; 
		
		System.out.println("BUSCAR POR ID EMPLEADO: "+empresa.buscarUno(3));
		System.out.println();
		
				
		//Probamos el método buscar a todos los empleados
		
		System.out.println("BUSCAR TODOS: "+empresa.buscarTodos());
		System.out.println();
				
		
		//Probamos el método pa obtener la masa salarial
		System.out.println("LA MASA SALARIAL ES: " +empresa.masaSalarial());
		System.out.println();
		
		
		// Probamos el método para buscar el departamento de un empleado según su idDepartamento
		int idDepartamento = 2;
		
		System.out.println("EMPLEADO PO ID DEPARTAMENTO");
		
		for (Empleado ele : empresa.buscarPorDepartamento(idDepartamento))
		System.out.println(ele);
		System.out.println();
		
		
		//Probamos el método  para buscar el trabajo que realiza un empleado según su idTrabajo
		String idTrabajo = "1";
		
		System.out.println("EMPLEADO PO ID TRABAJO");
		
		for (Empleado ele : empresa.buscarTrabajo(idTrabajo))
		System.out.println(ele);
		System.out.println();
		
		
		//Probamos el método buscar un empleado según el país
		String pais = "ESPAÑA";
		
		System.out.println("BUSCAR POR PAÍS: ");
		
		for (Empleado ele: empresa.buscarPorPais(pais)) {
		System.out.println(ele);
		}
	
	}

}
