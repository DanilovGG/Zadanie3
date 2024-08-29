public class BonusMilesService {
    public int calculate(int ticketPrice) {
        // Рассчитываем количество миль, начисляемых за билет
        int miles = ticketPrice / 20;
        // Округляем до ближайшего целого числа
        return (int) miles;
    }
}