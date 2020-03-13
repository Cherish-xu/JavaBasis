package 渡一教育.面向对象进阶.LinkedBox封装.util;

public class Node {
    public Node prev;//上一个node对象
    public int item;//当前的数据
    public Node next;//下一个node对象

    public Node(Node prev,int item,Node next){
        this.prev =prev;
        this.item = item;
        this.next = next;
    }
}
