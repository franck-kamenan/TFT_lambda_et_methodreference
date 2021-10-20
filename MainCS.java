package be.technofuturtic.programmation_en_java.lambda_et_methodreference;

public class MainCS {

    public static void main(String[] args) {

        String d = "question?";

        LambdaInterface hello = (s) -> "Hello World!";
        System.out.println(hello.salut("???"));

        LambdaInterface lettre = (s) -> "String obligatoire.";
        System.out.println(lettre.salut("x"));

        IntIF numero = () -> 24;
        System.out.println(numero.nombre());

        VoidIF texte = () -> System.out.println("Du texte " + d);
        texte.ecrit();

        SingleIF unique = (s) -> "Il est " + s;
        System.out.println(unique.param("Superman!"));

        SingleIntIF seul = (s) -> 5 + s;
        System.out.println(seul.intP(5));

        SingleVoidIF alone = (s) -> System.out.println("Within you, is " + s);
        alone.voidP("the Force!");

        MultipleIF deux = (s, z) -> s + z;
        System.out.println(deux.multipleP(2, 3));

        MultipleStringIF suns = (b, x) -> b + " and " + x + " joined!";
        System.out.println(suns.heroesP("Blade", "Wolverine"));

        MultipleVoidIF match = (a, b) -> System.out.println(a + " couldn't beat " + b);
        match.twoP("PSG", "Bruges.");

        VoidMRIF ref = MainCS::staticMethod;
        ref.danse();

        HelloIF bonjour = MainCS::staticHello;
        bonjour.helloMR();

        StringTestIF testMarche = MainCS::staticTest;
        System.out.println("C'est un " + testMarche.test());

        MainCS instance = new MainCS();
        HelloIF salutation = instance::instanceMethod;
        salutation.helloMR();

        MonObjetIF construction = MonObjetCS::new;
        construction.unObjet("Hello World!");
    }

    public static void staticMethod() {

        System.out.println("This method is static");
    }

    public static void staticHello() {

        System.out.println("Hello World!");
    }

    public static String staticTest() {

        return "test";
    }

    public void instanceMethod() {

        System.out.println("This is an instance method!");
    }
}
