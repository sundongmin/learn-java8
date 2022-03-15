package com.github.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UseStreamToTree {
    public static class Menu {
        /**
         * id
         */
        public Integer id;
        /**
         * 名称
         */
        public String name;
        /**
         * 父id ，根节点为0
         */
        public Integer parentId;
        /**
         * 子节点信息
         */
        public List<Menu> childList;


        public Menu(Integer id, String name, Integer parentId) {
            this.id = id;
            this.name = name;
            this.parentId = parentId;
        }

        public Menu(Integer id, String name, Integer parentId, List<Menu> childList) {
            this.id = id;
            this.name = name;
            this.parentId = parentId;
            this.childList = childList;
        }

        public Integer getParentId() {
            return parentId;
        }

        public Integer getId() {
            return id;
        }

        public void setChildList(List<Menu> list) {
            this.childList = list;
        }
    }

    public static void main(String[] args) {
        List<Menu> menus = Arrays.asList(
                new Menu(1,"根节点",0),
                new Menu(2,"子节点1",1),
                new Menu(3,"子节点1.1",2),
                new Menu(4,"子节点1.2",2),
                new Menu(5,"根节点1.3",2),
                new Menu(6,"根节点2",1),
                new Menu(7,"根节点2.1",6),
                new Menu(8,"根节点2.2",6),
                new Menu(9,"根节点2.2.1",7),
                new Menu(10,"根节点2.2.2",7),
                new Menu(11,"根节点3",1),
                new Menu(12,"根节点3.1",11)
        );

        //获取父节点
        List<Menu> collect = menus.stream()
                .filter(m -> m.getParentId() == 0)
                .peek(m -> m.setChildList(getChildrens(m, menus)))
                .collect(Collectors.toList());
        System.out.println("-------转json输出结果-------");
        System.out.println(collect);
    }

    private static List<Menu> getChildrens(Menu root, List<Menu> all) {
        return all.stream()
                .filter(m -> Objects.equals(m.getParentId(), root.getId()))
                .peek(m -> m.setChildList(getChildrens(m, all)))
                .collect(Collectors.toList());
    }
}

