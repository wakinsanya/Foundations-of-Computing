import java.util.stream.IntStream;

public class DeterministicFiniteAutomata {
    /**
     * @param string w
     * @return true iff DFA accepts the provided string
     */
    public boolean isAccepted(String string) {
        State currentState = State.Q0;
        IntStream intStream = string.chars();
        intStream.forEach((x) -> currentState.transition((char) x));
        return currentState.isFinalState;
    }

    private enum State {
        Q0(false),
        Q1(true);

        static {
        }

        final boolean isFinalState;

        State(boolean isFinalState) {
            this.isFinalState = isFinalState;
        }


        /**
         * Transition fn delta
         *
         * @param character element from the alphabet sigma
         * @return state x s.t x is an element of Q
         */
        State transition(char character) {
            switch (character) {

            }
        }

    }
}
