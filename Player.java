public class Player {
    private String name;
    private String team;
    public void setName(String n) {
        name = n;
    }
    public void setTeam(String t) {
        team = t;
    }
    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public boolean isSameTeam(Player p) {
        if (this.getTeam().equals(p.getTeam())) {
            return true;
        }else {
            return false;
        }
    }
}
