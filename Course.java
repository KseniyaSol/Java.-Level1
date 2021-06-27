package JavaCoreLesson1;

public class Course {
    public Barrier[] course = new Barrier[4];

    public Course(Barrier[] course) {
        this.course = course;
    }

    public void run(Team team, Course course){
        for (int i = 0; i < team.teammates.length; i++) {
            for (int j = 0; j < course.course.length; j++) {
                if (team.teammates[i].maxHeight >= course.course[j].height){
                    if (team.teammates[i].isPassed == false){
                        break;
                    }
                    team.teammates[i].isPassed = true;
                }else{
                    team.teammates[i].isPassed = false;
                }
                if (team.teammates[i].maxLenght >= course.course[j].lenght){
                    if (team.teammates[i].isPassed == false){
                        break;
                    }
                    team.teammates[i].isPassed = true;
                }else{
                    team.teammates[i].isPassed = false;
                }
            }
        }
    }
}
