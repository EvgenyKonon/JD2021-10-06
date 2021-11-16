package by.it._classwork_.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private final VarRepository varRepository;

    private final VarCreator varCreator;

    public Parser(VarRepository varRepository, VarCreator varCreator) {
        this.varRepository = varRepository;
        this.varCreator=varCreator;
    }

    public Var evaluate(String expression) {
        //2+2 {1,3}*5
        expression = expression
                .replace(" ", "")
                .trim();
        String[] parts = expression.split(Patterns.OPERATION, 2);
        String stingLeftVar = parts[0];
        if (parts.length == 1) {
            return varCreator.create(stingLeftVar);
        }
        String stingRightVar = parts[1];
        Var right = varCreator.create(stingRightVar);
        if (expression.contains("=")) {
            varRepository.save(stingLeftVar, right);
            return right;
        }

        Var left = varCreator.create(stingLeftVar);
        if (left != null && right != null) {
            Pattern pattern = Pattern.compile(Patterns.OPERATION);
            Matcher matcher = pattern.matcher(expression);
            if (matcher.find()) {
                String operation = matcher.group();
                switch (operation) {
                    case "+":
                        return left.add(right);
                    case "-":
                        return left.sub(right);
                    case "*":
                        return left.mul(right);
                    case "/":
                        return left.div(right);
                }
            }
        }
        System.err.println("Something stupid");
        return null;
    }
}
