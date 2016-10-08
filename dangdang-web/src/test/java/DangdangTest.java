import com.fc.platform.commons.page.Page;
import com.wang.Starapplication;

import com.wang.entity.Book;
import com.wang.entity.User;
import com.wang.serivces.Bookinterfacce;
import com.wang.serivces.UserService;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value=Starapplication.class)
public class DangdangTest {
     @Autowired
      private UserService userService;
     @Autowired
       private Bookinterfacce bookinterfacce;
      @Test
      public void  one(){
       User s= userService.find("jack", "123");
        System.out.println(s);
      }

     @Test
     public  void testfenye(){
             Page<Book> pages=bookinterfacce.findpageall(2, 3);
      System.out.println(pages.getTotalPages());
     }
}
