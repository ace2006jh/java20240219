package ch06.exercise;

public class MemberService {
    public static void main(String[] args) {
        member mem = new member();
        boolean result = mem.login("hong", "12345");
        if (result) {
            System.out.println("로그인되었습니다");
            mem.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}

class member {

    boolean login(String id, String password) {
        boolean isHong = id.equals("hong");
        boolean is12345 = password.equals("12345");

        boolean result = isHong && is12345;
        
        return result;
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");

    }
}
