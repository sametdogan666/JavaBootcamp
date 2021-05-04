package Abstract;

import Entities.Gamer;
import Entities.Campaign;
import Entities.Game;

public interface SaleService {

	void sale(Gamer gamer, Game game);
	void campaignSale(Campaign campaign, Game game, Gamer gamer);
	
}
