//IPL Team -> CSK, RCB, KLP  have ‘tournamentWonBy()’ method overridden

public class Iplteam {
    public void tournamentWonBy()
    {
        System.out.println("Super class is getting called");

    }
}

class Csk extends Iplteam{

    @Override
    public void tournamentWonBy() {

        System.out.println("Called csk");
    }
}

class Rcb extends Iplteam{
    @Override
    public void tournamentWonBy() {

        System.out.println("Called Rcb");
    }
}

class Klp extends Iplteam{
    @Override
    public void tournamentWonBy() {

        System.out.println("Called klp");
    }
}
