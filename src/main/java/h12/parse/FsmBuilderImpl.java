package h12.parse;

import h12.template.errors.KissParserException;
import h12.template.errors.ParameterAlreadySpecifiedException;
import h12.template.errors.ParameterNotSpecifiedException;
import h12.template.errors.SizeMismatchException;
import h12.template.fsm.*;

/**
 * Implementation of {@link FsmBuilder}
 */
public class FsmBuilderImpl implements FsmBuilder {

    private int headerInputSize = -1;
    private int headerOutputSize = -1;
    private int headerNumberOfTerms = -1;
    private int headerNumberOfStates = -1;
    private int numberOfTermsCounter = 0;

    private final StateFactory stateFactory = new StateFactory();
    private final Fsm fsm = new Fsm();

    private boolean buildFinished = false;

    @Override
    public void setInputSize(final int inputSize) throws KissParserException {
        if (this.headerInputSize != -1) {
            throw new ParameterAlreadySpecifiedException(HeaderParameter.INPUT_SIZE);
        }

        this.headerInputSize = inputSize;
    }

    @Override
    public void setOutputSize(final int outputSize) throws KissParserException {
        // TODO
    }

    @Override
    public void setNumberOfTerms(final int numberOfTerms) throws KissParserException {
        // TODO
    }

    @Override
    public void setNumberOfStates(final int numberOfStates) throws KissParserException {
        // TODO
    }

    @Override
    public void setInitialState(final String initialStateIdentifier) throws KissParserException {
        // TODO
    }

    @Override
    public void finishHeader() throws KissParserException {
        if (headerInputSize == -1) {
            throw new ParameterNotSpecifiedException(HeaderParameter.INPUT_SIZE);
        }

        // TODO
    }

    @Override
    public void addTerm(final BitField inputField, final String inputStateIdentifier, final String nextStateIdentifier, final BitField outputField) throws KissParserException {
        // TODO
    }

    @Override
    public void finishFSM() throws KissParserException {
        // TODO
    }

    /**
     * Returns the parsed FSM
     *
     * @return the created {@link Fsm}
     * @throws KissParserException if the fsm could not be parsed
     */
    public Fsm getFsm() throws KissParserException {
        // TODO
        throw new UnsupportedOperationException();
    }
}
