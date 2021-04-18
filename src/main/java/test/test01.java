package test;

import java.util.ArrayList;

import java.util.Date;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.concurrent.TimeUnit;

/**
 * @author JYG
 * @description
 * @create 2021−04-13 9:32 上午
 */


    //这样真的好吗？ 如果有上万，甚至十几万的数据，那么这个执行效率问题，我就不多说了。 非常非常的慢。

    //下边来看使用map代替的执行方式，以及两种方式的效率对比：


    class Member {
//        private Integer id;
//
//        private String name;
//
//        private Integer age;
//
//        private Date addDate;
//
//        public Member() {
//        }
//
//        public Member(Integer id, String name, Integer age, Date addDate) {
//            super();
//
//            this.id = id;
//
//            this.name = name;
//
//            this.age = age;
//
//            this.addDate = addDate;
//
//        }
//
//        public Integer getId() {
//            return id;
//
//        }
//
//        public void setId(Integer id) {
//            this.id = id;
//
//        }
//
//        public String getName() {
//            return name;
//
//        }
//
//        public void setName(String name) {
//            this.name = name;
//
//        }
//
//        public Integer getAge() {
//            return age;
//
//        }
//
//        public void setAge(Integer age) {
//            this.age = age;
//
//        }
//
//        public Date getAddDate() {
//            return addDate;
//
//        }
//
//        public void setAddDate(Date addDate) {
//            this.addDate = addDate;
//
//        }
//
//    }
//
//    public class For2 {
//        public static void main(String[] args) throws InterruptedException {
//            List list1 = new ArrayList<>();
//
//            List list2 = new ArrayList<>();
//
//            for(int i=0;i<30000;i++){
//                Date date = new Date();
//
//                list1.add(new Member((i+1),"技术客",(i+1), date));
//
//                if(i%2==0){
//                    list2.add(new Member((i+1),null,(i+1), date));
//
//                }
//
//            }
//
////双for循环嵌套测试
//
//            long s1 = System.currentTimeMillis();
//
//            int forNumber = 0;
//
//            for(Member m2:list2){
//                if(m2.getName()==null){
//                    for(Member m1:list1){
//                        if(m1.getId().intValue()==m2.getId().intValue()){
//// System.out.println(m2.getId()+" Name 值为空!!!");
//
//                            forNumber++;
//
//                        }
//
//                    }
//
//                }
//
//            }
//
//            long s2 = System.currentTimeMillis();
//
//            System.out.println("双for循环查询时间为："+(s2-s1)+"(毫秒)，一共查询出"+forNumber+"条数据 \n\n\n");
//
//            TimeUnit.SECONDS.sleep(3);
//
////map查询测试
//
//            long s3 = System.currentTimeMillis();
//
//            int mapNumber = 0;
//
//            Map map = new HashMap<>();
//
//            for(Member m1:list1){
//                map.put(m1.getId(), m1);
//
//            }
//
//            for(Member m2:list2){
//                if(m2.getName()==null){
//                    Member m = map.get(m2.getId());
//
//                    if(m!=null){
//// System.out.println(m2.getId()+" Name 值为空!!!");
//
//                        mapNumber++;
//
//                    }
//
//                }
//
//            }
//
//            long s4 = System.currentTimeMillis();
//
//            System.out.println("使用map结构查询时间为："+(s4-s3)+"(毫秒)，一共查询出"+mapNumber+"条数据 \n\n\n");
//
//        }

    }

