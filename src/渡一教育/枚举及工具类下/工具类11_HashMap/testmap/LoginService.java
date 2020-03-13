package src.渡一教育.枚举及工具类下.工具类11_HashMap.testmap;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class LoginService {

    //设计一个方法  用来登录认证
//    private String[] userBox = new String[]{"郑中拓","渡一教育","java"};
//    private int[] passwordBox = new int[]{123,666,888};
//    public String loginForArray(String name,String password){
//
//        for(int i = 0;i < userBox.length;i++){
//            if (userBox[i].equals(name)){
//                if (passwordBox[i] == Integer.parseInt(password)){
//                    return  "登录成功";
//                }
//            }
//        }
//        return "用户名或密码错误";
//    }

    //设计一个方法        用来登录认证
//    private ArrayList<String> useBox = new ArrayList<>();
//    {
//        useBox.add("郑中拓-123");
//        useBox.add("渡一教育-666");
//        useBox.add("Java-888");
//    }
//
//    public String loginForList(String name,String password){
//        for (int i = 0;i < useBox.size();i++){
//            String[] values = useBox.get(i).split("-");
//            if (values[0].equals(name)){
//                if (values[1].equals(password)){
//                    return "登录成功";
//                }
//                break;
//            }
//        }
//        return "用户名或密码错误";
//    }


//    private HashSet<String> useBox = new HashSet<>();
//
//    {
//        useBox.add("郑中拓-123");
//        useBox.add("渡一教育-666");
//        useBox.add("Java-888");
//    }
//    public String loginForSet(String name,String password){
//        Iterator<String> it = useBox.iterator();
//        while (it.hasNext()){
//            String[] values = it.next().split("-");
//            if (values[0].equals(name)){
//                if (values[1].equals(password)){
//                    return "登录成功";
//                }
//            }
//        }
//        return "用户名或密码错误";
//    }




    private HashMap<String,Integer> userBox = new HashMap<>();
    {
        userBox.put("郑中拓",123);
        userBox.put("渡一教育",666);
        userBox.put("Java",888);
    }
    public String loginForMap(String name,String password){
        Integer realPassword = userBox.get(name);
        if (realPassword != null){
            if (realPassword.equals(Integer.parseInt(password))){
                return "登录成功";
            }
        }
        return "用户名或密码错误";
    }

}
