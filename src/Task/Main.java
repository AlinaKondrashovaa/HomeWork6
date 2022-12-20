package Task;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(
                new Course.Obstacle[]{
                    new Course.Obstacle("first obstacle", 2),
                    new Course.Obstacle("second obstacle", 2),
        });
        Team team = new Team("first team",
                new Team.Teammate[]{
                        new Team.Teammate("first teammate", 4),
                        new Team.Teammate("second teammate", 6),
                        new Team.Teammate("third teammate", 10),
                        new Team.Teammate("fourth teammate", 3)});
        course.doIt(team);
        team.showResults();
    }

}
