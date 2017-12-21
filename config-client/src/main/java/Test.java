import org.springframework.transaction.annotation.Transactional;

public class Test {

    @Transactional
    public void test(){
        //业务处理
        call();
        //发生异常，call不能回滚
    }

    public void call(){
        //业务处理
    }
}
