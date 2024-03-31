public class UserImpl implements User{
    @Override
    public void login() {
        System.out.println("用户正在登录");
    }

    @Override
    public void logout() {
        System.out.println("用户正在退出");
    }

    @Override
    public void recharge() {
        System.out.println("用户正在充值");
    }
}
