package discordbot;

public class botRunner {

    public static void main(String[] args){
        TokenHolder token = new TokenHolder();
        MyLoLBot lolBot = new MyLoLBot(token.getDiscordToken());

    }
}
