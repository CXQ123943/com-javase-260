package com.cxq.jpa;

import javax.sound.sampled.Line;
import java.io.File;
import java.lang.reflect.Field;

/**
 * @author CXQ
 * @version 1.0
 */
public class CreateTableTool {
    private Class<?> instance;

    public CreateTableTool(Class<?> instance) {
        this.instance = instance;
    }

    public void build() {
        String sql = this.getCreateTableSql();
        System.out.println(sql);
        //TODO 调用JDBC的executeUpdate方法发送这个SQL即可完成造表
    }

    private String getCreateTableSql() {
        String tableName = this.getTableName();
        String columnsFormatString = this.getColumnsFormatString();
        String idName = this.getIdName();
        String sqlFormat =
                "CREATE TABLE `%s` ( \n"
                        + "   " + "`%s` INTEGER(11) AUTO_INCREMENT NOT NULL,\n"
                        + "%s"
                        + "    " + "PRIMARY KEY(`%s`) \n"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8";
        return String.format(sqlFormat, tableName, idName, columnsFormatString, idName);
    }

    private String getTableName() {
        return instance.getDeclaredAnnotation(Table.class).value();
    }

    private String getColumnsFormatString() {
        StringBuilder stringBuilder = new StringBuilder();
        Field[] declaredFields = instance.getDeclaredFields();
        for (Field e: declaredFields){
            Column annotation = e.getAnnotation(Column.class);
            if (annotation != null) {
                String name = annotation.name();
                String type = annotation.type();
                int length = annotation.length();
                String line = String.format("   `%s` %s(%d),\n", name, type, length);
                stringBuilder.append(line);
            }
        }
        return stringBuilder.toString();
    }

    private String getIdName() {
        String str = "";
        Field[] declaredFields = instance.getDeclaredFields();
        for (Field e: declaredFields) {
            Id declaredAnnotation = e.getDeclaredAnnotation(Id.class);
            if (declaredAnnotation != null) {
                str = e.getName();
                break;
            }
        }
        return str;
    }
}