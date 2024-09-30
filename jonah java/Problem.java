import java.util.ArrayList;
import java.util.List;

enum problemType {
    FINANCIAL, SPIRITUAL, EDUCATIONAL, BUSINESS, TECHNICAL, SAPA, HANGOVER, WOMANIZER
}

class Problem {

    private String name;
    private problemType type;
    private boolean isSolved;

    public Problem(String name, problemType type) {
        this.name = name;
        this.type = Type;
        this.isSolved = false;
    }
    public void markAsSolved() {
        this.isSolved = true;
    }
    public String getName() {
        return name;
    }
    public problemType getType() {
        return type;
    }
    public boolean isSolved() {
        return isSolved;
    }
}