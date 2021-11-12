package spiderdocschina;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import spiderdocschina.entity.TechCate;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class monogodbConnectTest {
    @Autowired
    private MongoTemplate mongoTemplate;

//    @Test
//    public void test1(){
//        List<TechCate> techCateList = mongoTemplate.findAll();
//        if(techCateList!=null && techCateList.size()>0)
//        {
//            techCateList.forEach(TechCate->{
//                System.out.println(TechCate);
//            });
//        }
//    }
}
