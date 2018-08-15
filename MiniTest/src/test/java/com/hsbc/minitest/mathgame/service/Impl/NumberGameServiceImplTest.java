package com.hsbc.minitest.mathgame.service.Impl;

import com.hsbc.minitest.mathgame.service.NumberGameService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NumberGameServiceImplTest {

    @Autowired
    private NumberGameService numberGameService;

    @Test
    public void numberGameStageOne() {
        numberGameService.numberGameStageOne(1, 100);
    }

    @Test
    public void numberGameStageTwo() {
        numberGameService.numberGameStageTwo(1, 100);
    }
}