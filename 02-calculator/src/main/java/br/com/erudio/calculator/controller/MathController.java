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

    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sub(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        Double sub = NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo);
        return sub;

    }

    @RequestMapping(value="/mult/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double mult(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        Double mult = NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);
        return mult;

    }

    @RequestMapping(value="/div/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double div(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        Double div = NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
        return div;

    }

    @RequestMapping(value="/med/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double med(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        Double med = (NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo)) / 2;
        return med;

    }

    @RequestMapping(value="/raiz/{numberOne}", method= RequestMethod.GET)
    public Double raiz(@PathVariable("numberOne") String numberOne) throws Exception {

        if(!NumberConverter.isNumeric(numberOne)){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        Double raiz = Math.sqrt(NumberConverter.convertToDouble(numberOne));
        return raiz;

    }





}
