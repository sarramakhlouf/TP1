public class Test_Point
{
    public static void main (String [] args)
    {
        Point p1;
        Point p2;
        Point p3;
        p1 = new Point (3 , 5);
        p2 = new Point ("a");
        p3 = new Point ( 3,5, "b");
        System.out.println("\n ---------------------------\n");
        System.out.println("les points créés sont :");
        p1.Affiche ();
        p2.Affiche ();
        p3.Affiche ();
        System.out.println("\n ---------------------------\n");
        System.out.println("translation des point ");
        p1.TranslHoriz (4);
        p2.TranslVert (3);
        p3.Translation (5,2);
        p1.Affiche ();
        p2.Affiche ();
        p3.Affiche ();
        System.out.println("\n ---------------------------\n");
        System.out.println("modification des attributs des points") ;
        p1.setNom("SRI21");
        p2.setAbscisse(25);
        p3.setOrdonnée(50);
        p1.Affiche ();
        p2.Affiche ();
        p3.Affiche ();
        System.out.println("\n ---------------------------\n");
        System.out.println("utilisation des méthodes get");
        String x;
        int y,z;
        x=p1.getNom();
        y=p1.getAbscisse();
        z=p1.getOrdonnée();
        System.out.println(" le nom du point p1 est : " + x);
        System.out.println(" son abscisse est : " + y);
        System.out.println(" son ordonnée est : " + z);
    }
}