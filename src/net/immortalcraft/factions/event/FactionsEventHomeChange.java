package net.immortalcraft.factions.event;

import org.bukkit.command.CommandSender;
import org.bukkit.event.HandlerList;

import net.immortalcraft.factions.entity.Faction;
import com.massivecraft.mcore.ps.PS;

public class FactionsEventHomeChange extends FactionsEventAbstractSender
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
	
	private PS newHome;
	public PS getNewHome() { return this.newHome; }
	public void setNewHome(PS newHome) { this.newHome = newHome; }
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public FactionsEventHomeChange(CommandSender sender, Faction faction, PS newHome)
	{
		super(sender);
		this.faction = faction;
		this.newHome = newHome;
	}
	
}
