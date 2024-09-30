package bank;

public enum GeoPoliticalZone {
    NORTH_CENTRAL(new String[]{"Benue", "Kogi", "Kwara", "Nasarawa", "Niger", "Platue", "FCT"}),
    NORTH_EAST(new String[]{"Borno", "Yobe", "Bauchi", "Gombe", "Adamawa", "Taraba"}),
    NORTH_WEST (new String[]{"Sokoto", "Kebbi", "Zamfara", "Kano", "Kaduna"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Enugu", "Imo", "Ebonyi"}),
    SOUTH_SOUTH(new String[]{"Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo"});

    private final String[] states;

    GeoPoliticalZone(String[] states) {

        this.states = states;
    }

    public String[] getStates() {

        return states;
    }
}

