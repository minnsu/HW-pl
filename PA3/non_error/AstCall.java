public class AstCall {
    AstCall() {
        ;
    }

    public void Call(ExprTree node, int depth) {
        for(int i = 0; i < depth; i++)
            System.out.printf("\t");
        
        switch(node.current.type) {
        case LETIN:
        case DECL:
        case CALL:
        case INFIX:
        case VAR:
            System.out.println(node.current.str);
            break;
        case NUM:
            System.out.println(node.current.value);
            break;
        default:
            System.out.println("*** TODO DEBUG: " + node.current.str + " ***");
        }

        node.children.forEach(child_node -> new AstCall().Call(child_node, depth + 1));
    }
}