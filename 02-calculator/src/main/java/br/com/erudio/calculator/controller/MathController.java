package br.com.erudio.calculator.controller;

import br.com.erudio.calculator.exception.UnsuportedMathOperationException;
import br.com.erudio.calculator.utils.NumberConverter;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

    Double sum = NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);
    return sum;

    }



}
