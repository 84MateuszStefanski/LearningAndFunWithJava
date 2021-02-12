package powtorkasda.obiektowe.klasywewnetrzne;

public class KlasaZewnetrzna {
    public int a = 1;
    public int b = 2;

    public int metodaKlasyZewnetrznej(int a, int b){
        return a+b;
    }

    public class KlasaWewnetrzna{
        public int c = metodaKlasyZewnetrznej(a, b);

        public int metodaKlasyWewnetrznej(int d){
            return c + d;
        }
    }
}


