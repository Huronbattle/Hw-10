public class Driver 
{

	public static void main(String[] args)
	{ 
		CardParser cp = new CardParser("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
		//cp.showMinions();
		HearthstoneCard attcrd = cp.AttackSearch(7);
		attcrd.display();
	}
}