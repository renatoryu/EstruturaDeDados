import problems.ParenthesisBalancement;

public class TesteParenthesis {
    public static void main(String[] args) {
        
        System.out.println(ParenthesisBalancement.solve("2*(3+4+5*[2+3)]"));
        System.out.println(ParenthesisBalancement.solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]"));
    }
}

