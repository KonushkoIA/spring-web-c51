package by.tms.services;

import by.tms.entities.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    public static Double getResult(Operation operation) {
        double resultValue = 0;

        switch (operation.getOperation()) {
            case "SUM":
                resultValue = operation.getValue1() + operation.getValue2();
                break;
            case "SUBTRACT":
                resultValue = operation.getValue1() - operation.getValue2();
                break;
            case "DIVIDE":
                resultValue = operation.getValue1() / operation.getValue2();
                break;
            case "MULTIPLY":
                resultValue = operation.getValue1() * operation.getValue2();
                break;
        }
        return resultValue;
    }
}
