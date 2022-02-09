/**
 * Models a Thing.
 * @author Alexander Farlinger
 * @version 2022.02.08
 */
public class Thing extends AbstractThing {

    /**
     * Constructs a Thing with a name.
     * @param name (Type: String)
     */
    public Thing(final String name) {
        super(name);
    }

    /**
     * Returns the name of the Thing.
     * @return String super.getName()
     */
    public String getName() {
        return super.getName();
    }

    /**
     * Returns a description of the Thing.
     * @return String string
     */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Thing { ");

        string.append("name: ");
        string.append(getName());

        string.append(" }");
        return string.toString();
    }
}
