package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;

	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Hoşgeldin " + gamer.getNickName() + ". Kimlik doğrulama işlemin başarıyla gerçekleşti.");
		}else {
			System.out.println("Sisteme kayıt olunamadı. Kimlik doğrulama başarısız");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Hoşgeldin " + gamer.getNickName() + ". Bilgilerini güncelledik.");
		}else {
			System.out.println("Güncelleme işlemi başarısız!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gittiğine üzüldük " + gamer.getNickName() + ". Yine bekleriz.");
		
	}
	
}
