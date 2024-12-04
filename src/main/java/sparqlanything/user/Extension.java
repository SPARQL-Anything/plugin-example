package sparqlanything.user;

import io.github.sparqlanything.model.PluginInitializer;
import io.github.sparqlanything.model.TriplifierRegister;
import io.github.sparqlanything.model.TriplifierRegisterException;
import org.apache.jena.sparql.function.FunctionRegistry;
import org.apache.jena.sparql.pfunction.PropertyFunctionRegistry;

public class Extension implements PluginInitializer {

    @Override
    public void run() {
        try {
            // Register the new Triplifier
            TriplifierRegister.getInstance().registerTriplifier(MyTriplifier.class.getCanonicalName(), new String[]{"myext"}, new String[]{"my-mime-type"});
        } catch (TriplifierRegisterException e) {
            throw new RuntimeException(e);
        }

        // Register function and magic properties as in Apache Jena

        // Register the new function
        FunctionRegistry.get().put("http://example.org/theAnswer", TheAnswer.class);

        // Register the new magic property
        PropertyFunctionRegistry.get().put("http://example.org/assign42", Assign42.class);
    }
}
