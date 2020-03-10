import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class Waker1 extends Agent {
    long t0 ;
    long time() {
        return System.currentTimeMillis()-t0;
    }
    @Override
    protected void setup(){
        super.setup();

        addBehaviour(new WakerBehaviour(this, 250) {
            @Override
            protected void handleElapsedTimeout() {
                System.out.println(
                        time() + ": " + "Message1 - "+getLocalName()+", Waker.");
                addBehaviour( new WakerBehaviour( myAgent, 500 )
                {
                    protected void handleElapsedTimeout() {
                        System.out.println(
                                time() + ": " + "  ...and then Message2 - "+getLocalName()+", Waker.");
                    }
                });
            }
        });
        t0 = System.currentTimeMillis();
    }
}
