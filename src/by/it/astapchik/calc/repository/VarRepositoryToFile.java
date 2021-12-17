package by.it.astapchik.calc.repository;

import by.it.astapchik.calc.exception.CalcException;
import by.it.astapchik.calc.model.Var;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VarRepositoryToFile implements Repository<String, Var> {
    //TODO in progress...
    private final Map<String, Var> map = new HashMap<>();

    public void save(String name, Var value)  throws CalcException {
        map.put(name, value);
        
    }

    public Var find(String name) throws CalcException {
        Var resultVar = map.get(name);
        if (Objects.isNull(resultVar)){
            throw new CalcException("not found var: "+name);
        }
        return map.get(name);
    }
}
