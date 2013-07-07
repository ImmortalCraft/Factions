package net.immortalcraft.factions.event;

import org.bukkit.command.CommandSender;
import org.bukkit.event.HandlerList;

import net.immortalcraft.factions.entity.Faction;

public class FactionsEventDescriptionChange extends FactionsEventAbstractSender
{	
	// -------------------------------------------- //
	// REQUIRED EVENT CODE
	// -------------------------------------------- //
	
	private static final HandlerList handlers = new HandlerList();
	@Override public HandlerList getHandlers() { return handlers; }
	public static HandlerList getHandlerList() { return handlers; }
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	private final Faction faction;
	public Faction getFaction() { return this.faction; }
	
	private String newDescription;
	public String getNewDescription() { return this.newDescription; }
	public void setNewDescription(String newDescription) { this.newDescription = newDescription; }
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public FactionsEventDescriptionChange(CommandSender sender, Faction faction, String newDescription)
	{
		super(sender);
		this.faction = faction;
		this.newDescription = newDescription;
	}
	
}
