public class Main {
    public static void main(String[] args) {
        Author ghegel = new Author("Георг Вильгельм Фридрих", "Гегель");
        Author edurkheim = new Author("Эмиль", "Дюркгейм");
        Author gdebord = new Author("Ги", "Дебор");
        Author dgraeber = new Author("Дэвид", "Грэбер");

        Book phenomenologyOfSpirit = new Book("Феноменология духа" , 1807, ghegel);
        Book rulesOfSociologicalMethod = new Book("Правила социологического метода" , 1895, edurkheim);
        Book societyOfTheSpectacle = new Book("Общество спектакля" , 1967, gdebord);
        Book bullshitJobs = new Book("Бредовя работа" , 2018, dgraeber);
        System.out.println();
        System.out.println(phenomenologyOfSpirit.getAuthor().toString());
        System.out.println(Integer.toHexString(phenomenologyOfSpirit.getAuthor().hashCode()));
        System.out.println(rulesOfSociologicalMethod);
        System.out.println(societyOfTheSpectacle);
        System.out.println(bullshitJobs);
    }
}