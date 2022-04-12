package cloud.folium.patterns.behavioral.State;

public class Developer {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeActivity() {
        if(state instanceof SleepingState) {
            setState(new FreshState());
        } else if(state instanceof FreshState) {
            setState(new TiredState());
        } else if(state instanceof TiredState) {
            setState(new SleepingState());
        }
    }

    public void doSomething() {
        state.doSomething();
        changeActivity();
    }
}
