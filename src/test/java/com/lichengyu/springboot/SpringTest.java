package com.lichengyu.springboot;

import com.lichengyu.springboot.constant.GsonSingletonBuilder;
import com.lichengyu.springboot.constant.Sex;
import com.lichengyu.springboot.controller.MyController;
import com.lichengyu.springboot.entity.Person;
import com.lichengyu.springboot.service.MyService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApp.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringTest {
    
    @InjectMocks
    private MyController controller;

    @Autowired
    private MyService myService;

    @Autowired
    private TestRestTemplate testRestTemplate;

    private MockMvc mockMvc;

    private Logger logger;

    @Before
    public void setUpLogger(){
        logger = Logger.getLogger(this.getClass());
    }

    @Before
    public void setUp() throws Exception {
        // initialize mock object
        MockitoAnnotations.initMocks(this);

        // Setup Spring test in standalone mode
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void test(){
        java.lang.String returnStr = myService.returnStr();
        logger.info(returnStr);
        Person lcy = new Person.Builder()
                .setSex(Sex.MAIL.sexType)
                .build("Lcy");
        logger.info(lcy);
    }

    @Test
    public void testController() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        System.out.println(mvcResult.getResponse());
    }

    @Test
    public void testSingletonGson(){
        logger.info(GsonSingletonBuilder.getGson().hashCode());
        logger.info(GsonSingletonBuilder.getGson().hashCode());
        logger.info(GsonSingletonBuilder.getGson().hashCode());
        logger.info(GsonSingletonBuilder.getGson().hashCode());
    }

}
