package Task;

public class Course {
    protected Obstacle[] obstacles;
    static class Obstacle{
        protected String name;
        protected int enduranceReq;

        public Obstacle(String name, int enduranceReq) {
            this.name = name;
            this.enduranceReq = enduranceReq;
        }

        public int getEnduranceReq() {
            return enduranceReq;
        }
    }

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team t){
        for(Team.Teammate teammate: t.teammates) {
            int RemainingEndurance = teammate.getEndurance();
            for(Obstacle obstacle : obstacles){
                RemainingEndurance-=obstacle.getEnduranceReq();
            }
            if(RemainingEndurance >= 0 ){
                teammate.isFinish = true;
            }
        }
    }
}
