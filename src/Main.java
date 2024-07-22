public class Main {
    public static void main(String[] args) {
        // Задача № 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача №2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача № 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача № 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача №5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача № 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        var difference = secondBoxer - firstBoxer;
        System.out.println(totalWeight);
        System.out.println(difference);

        // Задача № 7
        var remainder = secondBoxer % firstBoxer;
        System.out.println(remainder);

        // Задача № 8
        var totalTime = 640;
        var laborDay = 8;
        var totalWorkers = totalTime / laborDay;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек.");
        var replenishment = 94;
        var becameWorkers = totalWorkers + replenishment;
        var needTime = becameWorkers * laborDay;
        System.out.println("Если в компании работает " + becameWorkers + " человек, то всего " + needTime + " часов работы может быть поделено между сотрудниками.");

    }
}