import jade.core.Agent;
import jade.core.behaviours.*;

public class Simple1 extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new SimpleBehaviour(this) {
            int n = 0;
            @Override
            public void action() {
                System.out.println("Hello. My name is "+getLocalName()+".");
                n++;
            }

            @Override
            public boolean done() {
                return n>=3;
            }
        });
    }
}



