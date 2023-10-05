package program;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PRIMEIRO TESTEE_FINDSELLER");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("SEGUNDO TESTE_FINDEPARTMENT!!");
		Department depart = new Department(2,null);
		List<Seller> sellers = sellerDao.findByDepartment(depart);
		for(Seller obj : sellers) {
			System.out.println(obj.getName());
		}
		
		
		System.out.println("TERCEIRO TESTE_FINDaLL!!");
		sellers = sellerDao.findAll();
		for(Seller obj : sellers) {
			System.out.println(obj.getName());
		}
		
		System.out.println("QUARTO TESTE_INSERT!!");
		Seller newseller = new Seller(null,"testadorr","testando@gmail.com", new Date(), 4000.0, depart);
		sellerDao.insert(newseller);
		System.out.println("Finish! New Id inserted: "+newseller.getId());
		
		System.out.println("QUINTO TESTE_UPDATE!!");
		seller = sellerDao.findById(1);
		seller.setBaseSalary(1000.0);
		sellerDao.update(seller);
		
		System.out.println("SEXTO TESTE_DELETE!!");
		System.out.println("Insira o ID do seller a ser removido: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete executado, seller removido!");
		
		sc.close();

	}

}
