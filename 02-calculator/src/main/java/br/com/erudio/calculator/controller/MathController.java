package br.com.erudio.calculator.controller;

import br.com.erudio.calculator.exception.UnsuportedMathOperationException;
import br.com.erudio.calculator.math.SimpleMath;
import br.com.erudio.calculator.utils.NumberConverter;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    SimpleMath math = new SimpleMath();

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        return math.sum(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));

    }

    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sub(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        return math.sub(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));

    }

    @RequestMapping(value="/mult/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double mult(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        return math.mult(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));

    }

    @RequestMapping(value="/div/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double div(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        return math.div(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));

    }

    @RequestMapping(value="/med/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double med(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        return math.med(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));

    }

    @RequestMapping(value="/raiz/{numberOne}", method= RequestMethod.GET)
    public Double raiz(@PathVariable("numberOne") String numberOne) throws Exception {

        if(!NumberConverter.isNumeric(numberOne)){
            throw new UnsuportedMathOperationException("Por Favor defina um valor numérico.");
        }

        return math.raiz(NumberConverter.convertToDouble(numberOne));

    }





}
