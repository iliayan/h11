// Інтерфейс Playable
interface Playable {
    void play();
    void pause();
    void stop();
}

// Інтерфейс Recodable
interface Recodable {
    void record();
    void pause();
    void stop();
}

// Похідний клас Player
class Player implements Playable, Recodable {

    @Override
    public void play() {
        System.out.println("Програвання...");
    }

    @Override
    public void pause() {
        System.out.println("Пауза...");
    }

    @Override
    public void stop() {
        System.out.println("Зупинка...");
    }

    @Override
    public void record() {
        System.out.println("Запис...");
    }
}

// Головний клас
public class Main {
    public static void main(String[] args) {
        // Створюємо екземпляр класу Player
        Player player = new Player();

        // Викликаємо методи для програвання та запису
        player.play();
        player.pause();
        player.stop();

        player.record();
        player.pause();
        player.stop();
    }
}