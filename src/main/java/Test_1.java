import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_1 {
    @Test
    public void Test1_1()
    {
        RestTemplate restTeplate = new RestTemplate();
        CUser user = restTeplate.getForObject("http://kn-ktapp.herokuapp.com/apitest/accounts/12345678", CUser.class);
        assertTrue(user.getAccount_id() != 0);
    }

    @Test
    public void Test1_2()
    {
        RestTemplate restTeplate = new RestTemplate();
        CUser[] user = restTeplate.getForObject("http://kn-ktapp.herokuapp.com/apitest/accounts", CUser[].class);

        for(int i = 0; i < user.length; i++)
        {
            if(user[i].getAccount_id() == 0)
            {
                System.out.println("Пустое значение Account_id");
            }
        }
    }
}
