import com.wang.Starapplication;

import com.wang.serivces.UserServicesImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value= Starapplication.class)
public class DangdangTest {
     @Autowired
      private UserServicesImpl  userServicesImpl;
    @Test
      public void  one(){
       int s= userServicesImpl.check("张三","123");
        System.out.println(s);

      }
}
