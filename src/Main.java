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
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

       System.out.println("Задача №3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        System.out.println("Задача №6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("Разница в весе составляет: " + (weightSecondBoxer - weightFirstBoxer) + "кг");

        System.out.println("Задача №7");
        var theFirstWay = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Первый способ: " + theFirstWay);
        var theSecondWay = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Второй способ: " + theSecondWay);

        System.out.println("Задача №8");
        var totalHours = 640;
        var openingHours = 8;
        var totalPerson = totalHours / openingHours;
        System.out.println("Всего работников в компании - " + totalPerson + " человек.");
        var newTotalPerson = totalPerson + 94;
        var newTotalHours = newTotalPerson * openingHours;
        System.out.println("Если в компании работает " + newTotalPerson + " человека, то всего " + newTotalHours +
                " часа работы может быть поделено между сотрудниками.");
    }
}
