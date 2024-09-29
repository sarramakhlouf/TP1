public class Point
{
    private int ab;
    private int or;
    private String nom;
    public Point (int a,int o,String n)
    {
        this.ab=a;
        this.or=o;
        this.nom=n;
    }
    public Point (int s,int x)
    {
        this.ab=s;
        this.or=x;
    }
    public Point (String m)
    {
        this.nom=m;
    }
    void Affiche()
    {
        System.out.println('('+ nom +'('+ ab + ',' + or+ ')'+')');
    }
    void TranslHoriz (int a) 
    {
        this.ab += a;
    }
    void TranslVert (int a)
    {
        this.or += a;
    }
    void Translation (int a, int b) 
    {
        this.ab += a;
        this.or += b;
    }
    String getNom() 
    {
        return nom;
    }
    int getAbscisse()
    {
        return ab;
    }
    int getOrdonnée()
    {
        return or;
    }
    void setNom(String ch) 
    {
        this.nom=ch;
    }
    void setAbscisse(int a) 
    {
        this.ab=a;
    }
    void setOrdonnée(int a)
    {
        this.or=a;
    }

}

