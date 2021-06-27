package JavaCoreLesson1;

public class Team {
    public String teamName;
    public Player[] teammates = new Player[4];

    public Team(String teamName, Player[] teammates) {
        this.teamName = teamName;
        this.teammates = teammates;
    }

    public void ShowSuccessResults(Team team){
        String s = "";
        for (int i = 0; i < team.teammates.length; i++) {
            if (team.teammates[i].isPassed == true){
                s += team.teammates[i].name + " ";
            }
        }
        System.out.println("Course was passed by: " + s);
    }

    public void ShowTeamInfo(Team team){
        System.out.println("Team name is " + team.teamName);
        System.out.println("Teammates names are: " + team.teammates[0].name + " " +teammates[1].name + " " +teammates[2].name + " " +teammates[3].name);
    }
}
