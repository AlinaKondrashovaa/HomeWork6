package Task;

public class Team {
    protected String name;
    protected Teammate[] teammates;

    static class Teammate{
        protected String name;
        protected boolean isFinish;
        protected int endurance;

        public Teammate(String name, int endurance) {
            this.name = name;
            this.endurance = endurance;
            this.isFinish = false;
        }

        public String getName() {
            return name;
        }

        public int getEndurance() {
            return endurance;
        }

        public void setFinish(boolean finish) {
            isFinish = finish;
        }
    }

    public Team(String name, Teammate[] teammates) {
        this.name = name;
        if(teammates.length == 4 ){
            this.teammates = teammates;
        } else {
            System.out.println("Incorrect number of team member(must be 4)");
        }
    }

    public String getName() {
        return name;
    }

    public Teammate[] getTeammates() {
        return teammates;
    }

    public void printAllTeammatesNames(){
        for(Teammate teammate: teammates) {
            System.out.println(teammate.getName());
        }
    }
    public void showResults(){
        for(Teammate teammate: teammates) {
            System.out.println(teammate.getName() + " Завершил: " + teammate.isFinish);
        }
    }

}
