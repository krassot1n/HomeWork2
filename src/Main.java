public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача №2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача №3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача №4");

        var friend = 19;
        System.out.println(friend);
        friend = (friend +2)/7;
        System.out.println(friend);

        System.out.println("Задача №5");

        var frog = 3.5;// ((frog +10) / 3.5) + 4 так можно написать? Java прочтет так как я задумываю или что то неправит=льно может вычислится
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача №6");


        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.9;
        var sumWeight = boxerWeight2 + boxerWeight1;
        System.out.println("Оба боксера весят " + sumWeight + " кг");
        var weigtDefference = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе " + weigtDefference + " кг" );
        var weihtDefference1 = boxerWeight2 - boxerWeight1;
        System.out.println("вычитание из большего веса меньшего дает результат " + weihtDefference1 + " кг" );

        System.out.println("Задача №8");

        var num = 640/8;
        System.out.println("Всего работников в компании - " + num + " человек");
        var num1 = num + 94;
        var hours = num1 * 8;
        System.out.println("Если в компании работает " + num1 + " человек, то всего " + hours + " часов может быть поделено между сотрудниками");


    }
}