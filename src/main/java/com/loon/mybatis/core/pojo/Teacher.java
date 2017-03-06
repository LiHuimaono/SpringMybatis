package com.loon.mybatis.core.pojo;

import java.io.Serializable;

public class Teacher implements Serializable {
    private static final long serialVersionUID = -2657317305252054920L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_id
     *
     * @mbggenerated
     */
    private Integer tId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_name
     *
     * @mbggenerated
     */
    private String tName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_id
     *
     * @return the value of teacher.t_id
     *
     * @mbggenerated
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_id
     *
     * @param tId the value for teacher.t_id
     *
     * @mbggenerated
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_name
     *
     * @return the value of teacher.t_name
     *
     * @mbggenerated
     */
    public String gettName() {
        return tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_name
     *
     * @param tName the value for teacher.t_name
     *
     * @mbggenerated
     */
    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                '}';
    }
}