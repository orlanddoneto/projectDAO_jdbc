package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PRIMEIRO TESTEE_FINDSELLER");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("SEGUNDO TESTE_FINDaLL!!");
		List<Department> listDepResult = new ArrayList<>();
		listDepResult = departmentDao.findAll();
		for(Department obj : listDepResult) {
			System.out.println(obj.getName());
		}
		
		System.out.println("TERCEIRO TESTE_DELETE!!");
		System.out.println("Insira o ID do department a ser removido: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete executado, department removido!");
		
		
		System.out.println("QUARTO TESTE_UPDATE!!");
		dep.setId(5);
		departmentDao.update(dep);
		
		System.out.println("QUINTO TESTE_INSERT!");
		Department newDep = new Department(10,"Controle");
		departmentDao.insert(newDep);
		System.out.println("Finish! New Id inserted: "+newDep.getId());
	}

}
