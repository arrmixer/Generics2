package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaidCrows = new Team<>("Adelaide Crows");
        adelaidCrows.addPlayer(joe);
        //adelaidCrows.addPlayer(pat);
        //adelaidCrows.addPlayer(beckham);

        System.out.println(adelaidCrows.numPlayers());

        Team<BaseballPlayer> miamiMarlins = new Team<>("Miami Marlins");

        miamiMarlins.addPlayer(pat);
        //since we extend player [<T extends Player) vs jut <T> ] now we can make it exclusively only Players are added
//        Team<String> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer("no-one");

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
         brokenTeam.addPlayer(beckham);

         Team<FootballPlayer> melbourne = new Team<>("Melbourne");
         FootballPlayer banks = new FootballPlayer("Gordon");
         melbourne.addPlayer(banks);

         Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
         Team<FootballPlayer> fremantle = new Team<>("Fremantle");

         hawthorn.matchResult(fremantle, 0, 1);
         hawthorn.matchResult(adelaidCrows, 3, 8);


         adelaidCrows.matchResult(fremantle,2,1);
         //adelaidCrows.matchResult(miamiMarlins, 2,1);

        System.out.println("Rankings");
        System.out.println(adelaidCrows.getName() + ": " + adelaidCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaidCrows.compareTo(melbourne));
        System.out.println(adelaidCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaidCrows));
        System.out.println(melbourne.compareTo(fremantle));



        melbourne.matchResult(adelaidCrows,0,1);

        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());



    }
}
