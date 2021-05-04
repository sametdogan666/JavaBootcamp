package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
			System.out.println("Merhaba " + gamer.getFirstName() + ". " + game.getGameName() + " adlı oyunu " 
								+ game.getPrice() + " Tl'ye satın aldnız. İyi eğlenceler dileriz.");
	}

	@Override
	public void campaignSale(Campaign campaign, Game game, Gamer gamer) {
		System.out.println("Merhaba " + gamer.getNickName() + " " + campaign.getCampaignName() + " kapsamında "
				+ game.getGameName() + " adlı oyunu " + "%" + campaign.getDiscountRate() + " indirimle "
				+ campaign.getUnitPriceAfterDiscount() + " Tl'ye satın aldınız. İyi eğlenceler dileriz.");

	}

}
