package net.immortalcraft.factions.cmd;

import net.immortalcraft.factions.Perm;
import net.immortalcraft.factions.cmd.req.ReqFactionsEnabled;
import com.massivecraft.mcore.cmd.HelpCommand;
import com.massivecraft.mcore.cmd.req.ReqHasPerm;
import com.massivecraft.mcore.cmd.req.ReqIsPlayer;


public class CmdFactionsAccess extends FCommand
{
	public CmdFactionsAccessView cmdFactionsAccessView = new CmdFactionsAccessView();
	public CmdFactionsAccessPlayer cmdFactionsAccessPlayer = new CmdFactionsAccessPlayer();
	public CmdFactionsAccessFaction cmdFactionsAccessFaction = new CmdFactionsAccessFaction();
	
	public CmdFactionsAccess()
	{
		this.addAliases("access");
		
		this.addRequirements(ReqFactionsEnabled.get());
		this.addRequirements(ReqIsPlayer.get());
		this.addRequirements(ReqHasPerm.get(Perm.ACCESS.node));
		
		this.addSubCommand(this.cmdFactionsAccessView);
		this.addSubCommand(this.cmdFactionsAccessPlayer);
		this.addSubCommand(this.cmdFactionsAccessFaction);
	}
	
	@Override
	public void perform()
	{
		this.getCommandChain().add(this);
		HelpCommand.get().execute(this.sender, this.args, this.commandChain);
	}
	
}
