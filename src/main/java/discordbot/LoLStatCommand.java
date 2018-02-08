package discordbot;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class LoLStatCommand implements CommandExecutor{

    @Command(aliases ={"!me"}, description = "LoL Rank for Alfah")
    public String onCommand() throws RiotApiException {
        TokenHolder tkn = new TokenHolder();
        ApiConfig config = new ApiConfig().setKey(tkn.getRiotToken());
        RiotApi api = new RiotApi(config);

        Summoner summoner = api.getSummonerByName(Platform.NA, "Alfah");

        return summoner.getName() + " is Lvl " + summoner.getSummonerLevel();
    }
}
