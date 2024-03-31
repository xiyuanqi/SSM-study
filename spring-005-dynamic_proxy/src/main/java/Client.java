import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        User user = new UserImpl();
        User userproxy = (User) Proxy.newProxyInstance(user.getClass().getClassLoader(),
                                                       user.getClass().getInterfaces(),
                                                        new UserHandler(user));
        userproxy.login();
        userproxy.logout();
        userproxy.recharge();
    }
}
