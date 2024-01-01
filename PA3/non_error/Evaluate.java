import java.util.ArrayList;
import java.util.HashMap;

public class Evaluate {
    HashMap<String, Double> variables;
    
    class triple<T, U, V> {
        public T first;
        public U second;
        public V third;
    };

    HashMap<String, triple<ArrayList<String>, ExprTree, HashMap<String, Double>>> functions;
    Evaluate() {
        variables = new HashMap<>();
        functions = new HashMap<>();
        ;
    }

    Double evaluate(ExprTree node) {
        Double result = 0.0;
        Double left = 0.0;
        Double right = 0.0;
        triple<ArrayList<String>, ExprTree, HashMap<String, Double>> decl = new triple<>();
        int n_params = 0;
        String f_id = "";
        switch(node.current.type) {
        case DECL:
            f_id = node.children.get(0).current.str;

            n_params = node.children.size() - 2;
            ArrayList<String> params = new ArrayList<>();
            for(int i = 0; i < n_params; i++) {
                params.add(node.children.get(1+i).current.str);
            }
            ExprTree body = node.children.get(node.children.size()-1);
            HashMap<String, Double> copyed_variables = new HashMap<>(variables);
            
            decl.first = params;
            decl.second = body;
            decl.third = copyed_variables;
            
            functions.put(f_id, decl);
            break;
        
        case LETIN:
            String id = node.children.get(0).current.str;
            Double value = evaluate(node.children.get(1));
            variables.put(id, value);
            result = evaluate(node.children.get(2));
            break;
        
        case CALL:
            HashMap<String, Double> current_variables = new HashMap<>(variables);
        
            f_id = node.children.get(0).current.str;
            decl = functions.get(f_id);

            if(node.children.size() > 1) { // have parameters
                ArrayList<Double> evaluated = new ArrayList<>();
                for(int i = 1; i < node.children.size(); i++) {
                    evaluated.add(evaluate(node.children.get(i)));
                }

                variables = decl.third;
                for(int i = 0; i < decl.first.size(); i++) {
                    String param_name = decl.first.get(i);
                    variables.put(param_name, evaluated.get(i));
                }
            }
            // TODO: parameter count error process
            result = evaluate(decl.second);
            
            variables = current_variables;
            break;
        
        case NEG:
            result = -1 * evaluate(node.children.get(0));
            break;
        
        case INFIX:
            left = evaluate(node.children.get(0));
            right = evaluate(node.children.get(1));
            switch(node.current.str) {
            case "ADD":
                result = left + right;
                break;
            case "SUB":
                result = left - right;
                break;
            }
            break;
        
        case NUM:
            result = node.current.value;
            break;
        
        case VAR:
            result = variables.get(node.current.str);
            break;
        }
        return result;
    }
}