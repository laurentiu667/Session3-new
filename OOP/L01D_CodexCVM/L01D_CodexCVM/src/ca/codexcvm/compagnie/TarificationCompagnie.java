package ca.codexcvm.compagnie;

public class TarificationCompagnie {
    public double calculerPrixSuccursale(double prixCoutant){
        Compagnie compagnie = new Compagnie();
        return prixCoutant * ( 1 + compagnie.getMargeProfit());
    }
}
