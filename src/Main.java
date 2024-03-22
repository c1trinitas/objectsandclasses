public class Main {
    public static void main(String[] args) {
        author ghegel = new author("Георг Вильгельм Фридрих", "Гегель");
        author edurkheim = new author("Эмиль", "Дюркгейм");
        author gdebord = new author("Ги", "Дебор");
        author dgraeber = new author("Дэвид", "Грэбер");

        books phenomenologyOfSpirit = new books("Феноменология духа" , 1807, ghegel);
        books rulesOfSociologicalMethod = new books("Правила социологического метода" , 1895, edurkheim);
        books societyOfTheSpectacle = new books("Общество спектакля" , 1967, gdebord);
        books bullshitJobs = new books("Бредовя работа" , 2018, dgraeber);
        System.out.println(
                "Автор:" + phenomenologyOfSpirit.getAuthor().getName() + " " + phenomenologyOfSpirit.getAuthor().getSurname()+
                        " Название: " + phenomenologyOfSpirit.getTitle()+ " Год выхода: " + phenomenologyOfSpirit.getYear()
        );

        System.out.println(
                "Автор:" + rulesOfSociologicalMethod.getAuthor().getName() + " " + rulesOfSociologicalMethod.getAuthor().getSurname()+
                        " Название: " + rulesOfSociologicalMethod.getTitle()+ " Год выхода: " + rulesOfSociologicalMethod.getYear()
        );

        System.out.println(
                "Автор:" + societyOfTheSpectacle.getAuthor().getName() + " " + societyOfTheSpectacle.getAuthor().getSurname()+
                        " Название: " + societyOfTheSpectacle.getTitle()+ " Год выхода: " + societyOfTheSpectacle.getYear()
        );

        System.out.println(
                "Автор:" + bullshitJobs.getAuthor().getName() + " " + bullshitJobs.getAuthor().getSurname()+
                        " Название: " + bullshitJobs.getTitle()+ " Год выхода: " + bullshitJobs.getYear()
        );
    }
}