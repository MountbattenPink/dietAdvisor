package com.olsh.soundsystem;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pc on 24.04.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisk disk;

    @Test
    public void cdNotNull(){
        assertNotNull(disk);
    }
}
