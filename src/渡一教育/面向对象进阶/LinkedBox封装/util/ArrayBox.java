package 渡一教育.面向对象进阶.LinkedBox封装.util;

public class ArrayBox implements Box{

    //设计一个静态长亮  用来存储数组的默认长度
    private static final int DEFAULT_CAPACITY = 10;
    //设计一个自己的属性 用来存放真实数据
    private int[] elementDate;
    //设计一个自己的属性 用来记录数组内存储的有效元素的个数
    private int size = 0;

    //构造方法重载
    public ArrayBox(){
        elementDate = new int[DEFAULT_CAPACITY];
    }
    public ArrayBox(int capacity){
        elementDate = new int[capacity];
    }

    //小A同学  负责确保数组内部的容量
    private void ensureCapacituInternal(int minCapacity){
        //如果需要的最小容量比原数组的长度还大
        if (minCapacity - elementDate.length >= 0){
            //需要进行数组的扩容     找别人计算扩容的大小
            this.grow(minCapacity);
        }
    }
    //小B同学  负责计算扩容的大小
    private void grow(int minCapacity){
        //获取原数组的长度
        int oldCapacity = elementDate.length;
        //小B同学帮我做了一个计算      在原数组上增加了1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        //比较计算后的长度与的长度
        if (newCapacity - minCapacity < 0){//如果计算后的数组比原数组的还小
            //那么直接按照所需的长度作为新数组的长度
            newCapacity = minCapacity;
        }
        //调用小C同学    让他创建新数组     将原数组中的所有元素移入新数组中
        elementDate = this.copyOf(elementDate,newCapacity);
    }

    //小C同学  负责将原数组中的元素移入新数组中
    private int[] copyOf(int[] oldArray,int newCapacity){
        //按照提供的长度创建一个数组
        int[] newArray = new int[newCapacity];
        //将原数组中的元素按照位置移入新数组
        for (int i =0;i < oldArray.length;i++){
            newArray[i] = oldArray[i];
        }
        //将新数组返回
        return newArray;
    }

    //小D同学  检测给定index是否合法
    private void rangCheck(int index){
        if (index < 0 || index >= size){
            //自定义一个异常
            new BoxIndexOutOfBoundsException("index:"+index+",Size"+size);
        }
    }

    //---------------------------------------------------------------------------
    //将用户给定的element存起来  参数是需要存起来的元素  返回值表示是否存储成功
    public boolean add(int element){
        //找一个别人做事   确保数组的内部容量够用
        this.ensureCapacituInternal(size+1);
        //上述一行可以执行完毕，elementDate的数组肯定够用
        //直接将新来的elementDate元素存入数组中  并且让size多记录一个
        elementDate[size++] = element;
        //返回一个true甘肃用户存储元素成功
        return true;
    }

    //用来获取给定位置的元素       参数是索引位置     返回值是取得的元素
    public int get(int index){
        //找一个小弟     检测给定的index是否合法
        this.rangCheck(index);
        //如果上述代码可以执行    证明index是合法的
        //则找到index对应位置的元素   将其返回
        return elementDate[index];
    }

    //用来删除给定位置的元素   参数表示索引的位置   返回值是删除了的元素
    public int remove(int index){
        //调用小D同学    检测index是否合法
        //找到index位置的元素  保留起来    留给用户

        int oldVale = elementDate[index];
        for (int i = index;i < size-1;i++){//从index位置开始至size-1结束    后面元素依次前移覆盖
            elementDate[i] = elementDate[i+1];
        }
        //手动将最后一个元素删除   让size减少一个记录
        elementDate[--size] = 0;
        //最后将原数据返回
        return oldVale;
    }

    //设计一个方法    用来获取size有效的个数
    public int size(){
        return size;
    }
}
