package JavaCoreLesson1;

//главный класс, в котором создается команда, наполненная массивом игроков. Создается полоса препятствий, наполненная массивом
//из препятствий. Запускается вывод информации об игроках, прохождение препятствий и вывой результатов.
public class Main {
    public static void main(String[] args){
        Team team = new Team("Stars",new Player[]{new Player("Joe", 1, 200, true), new Player("Bill", 2, 250, true)
        , new Player("Jack", 1, 350, true), new Player("Mary", 2, 150, true)});
        Course course = new Course(new Barrier[]{new Barrier("wall", 1, 0), new Barrier("run", 0, 100),
        new Barrier("wall", 2, 0), new Barrier("run", 0, 200)});
        team.ShowTeamInfo(team);
        course.run(team, course);
        team.ShowSuccessResults(team);
    }
}
