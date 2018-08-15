package com.hsbc.minitest.mathgame.service.Impl;


import com.hsbc.minitest.mathgame.service.NumberGameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * Created by liuyidong on 2018/8/15.
 */


@Service
public class NumberGameServiceImpl implements NumberGameService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NumberGameServiceImpl.class);

    public final String DIVIDE_BY_THREE = "Fizee";
    public final String DIVIDE_BY_FIVE = "Buzz";


    @Override
    public void numberGameStageOne(int minNumber, int maxNumber){
        if (minNumber > maxNumber){
            System.out.println("Noting can show");
        }

        for (int i = minNumber; i <= maxNumber; i++){
            String showStr = "";
            if(i % 3 == 0 && i % 5 == 0){
                showStr = DIVIDE_BY_THREE + DIVIDE_BY_FIVE;
            }else if(i % 3 == 0) {
                showStr = DIVIDE_BY_THREE;
            }else if(i % 5 == 0){
                showStr = DIVIDE_BY_FIVE;
            }else {
                showStr = String.valueOf(i);
            }

            System.out.println(showStr);
        }
    }


    @Override
    public void numberGameStageTwo(int minNumber, int maxNumber){
        if (minNumber > maxNumber){
            System.out.println("Noting can show");
        }

        for (int i = minNumber; i <= maxNumber; i++){
            String showStr = "";
            if(i % 3 == 0 || String.valueOf(i).contains("3")){
                showStr = DIVIDE_BY_THREE;
            }else if(i % 5 == 0 || String.valueOf(i).contains("5")){
                showStr = DIVIDE_BY_FIVE;
            }else {
                showStr = String.valueOf(i);
            }

            System.out.println(showStr);
        }
    }
}
