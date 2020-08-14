package com.aaa.entity;

public class stu {
      private int sid;
      private int bid;
      private String sname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    @Override
    public String toString() {
        return "stu{" +
                "sid=" + sid +
                ", bid=" + bid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
