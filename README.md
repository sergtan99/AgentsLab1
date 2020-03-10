# AgentsLab1
This project uses JADE to create 3 Agents: Simple, Waker, and Ticker.
## Functionality
#### Agent Mihal - Simple
Prints a message 3 times.
```
Hello. My name is Mihal.
Hello. My name is Mihal.
Hello. My name is Mihal.
```
Using SimpleBehaviour by methods action() and done().
#### Agent Harry - Waker
Waits 250 ms, prints message1, waits 500 ms, prints message2.
```
254: Message1 - Harry, Waker.
755:   ...and then Message2 - Harry, Waker.
```
Using WakerBehaviour by method handleElapsedTimeout().
#### Agent Fred - Ticker
Prints a message every 2 seconds.
```
...
tick9: I am here every 2 seconds - Fred, Ticker.
tick10: I am here every 2 seconds - Fred, Ticker.
tick11: I am here every 2 seconds - Fred, Ticker.
...
```
Using TickerBehaviour by method onTick().
