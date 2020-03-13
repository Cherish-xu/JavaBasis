package 渡一教育.Java的IO.atmproject;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
    //把每一次调用登录都需要创建流管道

    //方案：创建一个map集合充当缓存  将文件中的数据一次性读出来
    private HashMap<String,User> userBox = new HashMap<>();
    //程序块的目的是在对象创建之前    给集合赋值
    {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File("src/渡一教育/Java的IO/atmproject/User.txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String value = bufferedReader.readLine();
            while (value != null){
                //value的信息拆成三个段     构建一个User对象  三个属性分别赋值
                //将对象存入集合
                String[] userValue = value.split("-");
                User user = new User(userValue[0],userValue[1],Float.parseFloat(userValue[2]));
                userBox.put(user.getAname(),user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //设计一个方法，目的是将所有业务的查询一行提取出来
    public User selectOne(String aname){
        //map.get方法，通过键来取值
        return userBox.get(aname);
    }
    //设计一个方法，目的是将某一个修改完的对象重新存入集合
    public void update(User user){
        userBox.put(user.getAname(), user);//键不变得情况下，重新存入的值会覆盖掉原来的值
        //调用写文件方法，将更新完的数据写入文件
        this.commit();
    }
    //设计一个方法，目的是将修改过数据的集合写入文件，更新文件的数据
    public void commit(){
        //创建一个字符型文件输出流
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File("src/渡一教育/Java的IO/atmproject/User.txt");
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set set = userBox.keySet();//遍历所有的键
            Iterator<String> names = set.iterator();
            while (names.hasNext()){
                String name = names.next();//获取一个键的值，也就是姓名
                User user = userBox.get(name);//通过键来取值（值：一个user对象）
                // 将user对象中的数据拼成一个字符串
                StringBuilder builder = new StringBuilder(user.getAname());
                builder.append("-");
                builder.append(user.getApassword());
                builder.append("-");
                builder.append(user.getAbalance());
                //字符型的文件输出流将拼接好的builder写入文件
                bufferedWriter.write(builder.toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //网络银行业务
    //这几一个用于登录的方法
    //设计一个登录的方法
    public String login(String aname,String apassword) {
        User user = this.selectOne(aname);
        if (user != null && user.getApassword().equals(apassword)){
            return "登录成功";
        }
        return "用户名或密码错误";
    }

    //设计一个查询余额的方法
    public Float queryBalance(String aname){
        User user = this.selectOne(aname);
        return user.getAbalance();
    }

    //设计一个存款的方法
    public void deposit(String aname,Float money){
        //先将集合内对象的数据做修改
        User user = this.selectOne(aname);
        user.setAbalance(user.getAbalance() + money);
        //将修改后的对象重新存入集合
        this.update(user);
    }

    //设计一个取款方法
    public void withdrawal(String aname,Float money){
        //先将集合内对象的数据做修改
        User user = this.selectOne(aname);
        if (user.getAbalance() >= money){
            user.setAbalance(user.getAbalance() - money);
            //将修改后的对象重新存入集合
            this.update(user);
        }else {
            System.out.println("您的账户余额不足");
        }
    }

    //设计一个方法用于转账
    public void transfer(String outName,String inName,Float money){
        User outUser = this.selectOne(outName);
        if (outUser.getAbalance() >= money){
            User inUser = this.selectOne(inName);
            if (inUser != null) {
                outUser.setAbalance(outUser.getAbalance() - money);
                inUser.setAbalance(inUser.getAbalance() + money);
                this.update(inUser);
                this.update(outUser);
            }else {
                System.out.println("转入账户不存在");
            }
        }else {
            System.out.println("您的账户余额不足");
        }
    }
}
