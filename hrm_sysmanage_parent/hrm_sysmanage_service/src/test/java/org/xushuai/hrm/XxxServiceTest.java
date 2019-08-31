package org.xushuai.hrm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xushuai.SysManage9001Application;
import org.xushuai.hrm.domain.Systemdictionary;
import org.xushuai.hrm.service.ISystemdictionaryService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SysManage9001Application.class)
public class XxxServiceTest {
    @Autowired
    private ISystemdictionaryService systemdictionaryService;

    @Test
    public void test()throws Exception{
        for (Systemdictionary systemdictionary : systemdictionaryService.selectList(null)) {
            System.out.println(systemdictionary);
        }
    }
}
