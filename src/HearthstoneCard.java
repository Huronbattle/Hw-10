public class HearthstoneCard 
{
	private int cost;
	private int attack;
	private int defense;
	private String name;
	
	public HearthstoneCard(String name, int cost, int attack, int defense)
	{
		this.cost = cost;
		this.attack = attack;
		this.defense = defense;
		this.name = name;
	}
	
	public HearthstoneCard(String cardString)
	{
		String[] parts = cardString.split(",");
		this.name = parts[0];
		this.cost = Integer.parseInt(parts[1]);
		this.attack = Integer.parseInt(parts[2]);
		this.defense = Integer.parseInt(parts[3]);
	}
	
	public String toCardString()
	{
		return "" + this.name + "," + this.cost + "," + this.attack + "," + this.defense;
	}
	
	public int getCost()
	{
		return this.cost;
	}
	
	public int getAttack()
	{
		return this.attack;
	}
	

	public void setName(String name)
	{
		if(name.length() >= 5)
		{
			this.name = name;
		}
	}
	
	void display()
	{
	
		System.out.format("Name: %s \nCost: %d \nAttack: %d Defense: %d\n", this.name, this.cost, this.attack,this.defense);
	}
}