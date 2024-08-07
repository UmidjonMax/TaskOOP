public class Main {
    public static void main(String[] args) {
        Car byd = new Car();
        byd.rang = "Qora";
        byd.narxi = 35000;
        byd.modeli = "Chazor";
        byd.isAutomat = true;
        System.out.println("Rangi: "+byd.rang+" Narxi: $"+byd.narxi+" Modeli: "+byd.modeli+" Turi: "+byd.isAutomat());

        Triangle uchburchak = new Triangle();
        uchburchak.a = 3;
        uchburchak.b = 4;
        uchburchak.gipotenuza = 5;
        System.out.println("A tomon = "+uchburchak.a+" B tomon = "+uchburchak.b+" Gipotenuza = "+uchburchak.gipotenuza);

        Person odam = new Person();
        odam.name = "Umidjon";
        odam.surname = "Makhmudov";
        odam.age = 20;
        odam.height = 1.82;
        odam.weight = 81.8;
        System.out.println("F.I.O.: "+odam.name+" "+odam.surname+" Yoshi: "+odam.age+" Bo'yi: "+odam.height+"m"+" Vazni: "+odam.weight+"kg");
    }
}