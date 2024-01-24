package h12.parse;

import h12.template.errors.KissParserException;
import h12.template.errors.ParameterAlreadySpecifiedException;
import h12.template.errors.ParameterNotSpecifiedException;
import h12.template.errors.SizeMismatchException;
import h12.template.fsm.*;

/**
 * Implementation of {@link FsmBuilder}
 */
public class FsmBuilderImpl implements FsmBuilder{

    private int headerInputSize = -1;
    private int headerOutputSize = -1;
    private int headerNumberOfTerms = -1;
    private int headerNumberOfStates = -1;
    private int numberOfTermsCounter = 0;

    private final StateFactory stateFactory = new StateFactory();
    private final Fsm fsm = new Fsm();

    private boolean buildFinished = false;

    @Override
    public void setInputSize(int inputSize) throws KissParserException {
        if(this.headerInputSize != -1){
            throw new ParameterAlreadySpecifiedException(HeaderParameter.INPUT_SIZE);
        }

        this.headerInputSize = inputSize;
    }

    @Override
    public void setOutputSize(int outputSize) throws KissParserException {
       // TODO
    }

    @Override
    public void setNumberOfTerms(int numberOfTerms) throws KissParserException {
        // TODO
    }

    @Override
    public void setNumberOfStates(int numberOfStates) throws KissParserException {
        // TODO
    }

    @Override
    public void setInitialState(String initialStateIdentifier) throws KissParserException {
        // TODO
    }

    @Override
    public void finishHeader() throws KissParserException { // TODO: in bestehende exceptions auslagern, auch oben bei set MEthoden
        if(headerInputSize == -1){
            throw new ParameterNotSpecifiedException(HeaderParameter.INPUT_SIZE);
        }

        // TODO
    }

    @Override
    public void addTerm(BitField inputField, String inputStateIdentifier, String nextStateIdentifier, BitField outputField) throws KissParserException { // TODO: keine Parser Exception, sondern Builder
        // TODO
    }

    @Override
    public void finishFSM() throws KissParserException {
        // TODO
    }

    /**
     *
     * @return the created {@link Fsm}
     * @throws KissParserException
     */
    public Fsm getFsm() throws KissParserException {
        // TODO
        throw new UnsupportedOperationException();
    }
}
