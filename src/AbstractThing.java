/**
 * Models an abstraction of a Thing.
 * @author Alexander Farlinger
 * @version 2022.02.08
 */
abstract public class AbstractThing {

    private String name;

    /**
     * Constructs an abstract Thing.
     * @param name (Type: String)
     */
    public AbstractThing(String name) {
        setName(name);
    }

    /**
     * Sets the name of the Thing.
     * @param name (Type: String)
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the Thing.
     * @return this.name
     */
    protected String getName() {
        return this.name;
    }
}
