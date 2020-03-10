import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class Ticker1 extends Agent {
    @Override
    protected void setup(){
        super.setup();

        addBehaviour(new TickerBehaviour(this, 2000) {
            @Override
            protected void onTick() {
                System.out.println(
                        "tick"+getTickCount()+": I am here every 2 seconds - "+getLocalName()+", Ticker.");
            }
        });
    }
}