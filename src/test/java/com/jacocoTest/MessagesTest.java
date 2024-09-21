package com.jacocoTest;

import com.jacoco.Messages;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MessagesTest {
    @Test
    public void name(){
        Messages obj = new Messages();
        Assertions.assertEquals("Manha", obj.getMessage("Manha"));


    }
    @Test
    public void nameProvided(){
        Messages obj = new Messages();
        Assertions.assertEquals("name is provided", obj.getMessage("name is provided"));
    }

}
