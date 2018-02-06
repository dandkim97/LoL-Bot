package discordbot;

import com.google.common.util.concurrent.FutureCallback;
import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;
import de.btobastian.sdcf4j.CommandHandler;
import de.btobastian.sdcf4j.handler.JavacordHandler;

public class MyLoLBot {

    public MyLoLBot(String token){
        final DiscordAPI api = Javacord.getApi(token, true);
        api.connect(new FutureCallback<DiscordAPI>() {
            public void onSuccess(DiscordAPI discordAPI) {
                CommandHandler cmdHandler = new JavacordHandler(api);
//                cmdHandler.registerCommand();
            }

            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
