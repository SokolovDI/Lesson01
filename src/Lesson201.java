import java.util.Random;

/**
 * 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
 * классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
 * консоль).
 * 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
 * должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
 * печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
 * 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
 * этот набор препятствий.
 * 4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
 * на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
 * препятствий не идет.
 */
public class Lesson201 {
    public static void main(String[] args) {
        Random rand = new Random();
        Units[] units = new Units[3];

        int dist = rand.nextInt(10);
        int height = rand.nextInt(10);
        units[0] = new Human("Люк", dist, height);

        dist = rand.nextInt(15);
        height = rand.nextInt(15);
        units[1] = new Robot("R2D2", dist, height);

        dist = rand.nextInt(20);
        height = rand.nextInt(20);
        units[2] = new Cat("Чуви", dist, height);

        Interference[] interferences = new Interference[5];

        boolean isTrack;
        for (int i = 0; i < interferences.length; i++) {
            dist = rand.nextInt(10);
            isTrack = rand.nextBoolean();
            if (isTrack) {
                interferences[i] = new Track("Препятсвие №" + (i + 1) + ". Беговая дорожка. ", dist);
            } else {
                interferences[i] = new Wall("Препятствие №" + (i + 1) + ". Стена. ", dist);
            }
        }
        for (Units unit : units) {
            boolean res = true;
            for (Interference interference : interferences) {
                res = interference.moving(unit);
                if (!res) break;
            }
            if (res) System.out.println("Победил\n");
            else System.out.println("Проиграл\n");
        }
    }
}
