package com.bardia.phonecallregister.pojo;

public class CallLogModel {

    public String str_number, str_contact_name, str_call_type, str_call_date, str_call_time, str_call_duration;

    public CallLogModel(String str_number, String str_contact_name, String str_call_type, String str_call_date, String str_call_time, String str_call_duration) {
        this.str_number = str_number;
        this.str_contact_name = str_contact_name;
        this.str_call_type = str_call_type;
        this.str_call_date = str_call_date;
        this.str_call_time = str_call_time;
        this.str_call_duration = str_call_duration;
    }

    public String getStr_number() {
        return str_number;
    }

    public void setStr_number(String str_number) {
        this.str_number = str_number;
    }

    public String getStr_contact_name() {
        return str_contact_name;
    }

    public void setStr_contact_name(String str_contact_name) {
        this.str_contact_name = str_contact_name;
    }

    public String getStr_call_type() {
        return str_call_type;
    }

    public void setStr_call_type(String str_call_type) {
        this.str_call_type = str_call_type;
    }

    public String getStr_call_date() {
        return str_call_date;
    }

    public void setStr_call_date(String str_call_date) {
        this.str_call_date = str_call_date;
    }

    public String getStr_call_time() {
        return str_call_time;
    }

    public void setStr_call_time(String str_call_time) {
        this.str_call_time = str_call_time;
    }

    public String getStr_call_duration() {
        return str_call_duration;
    }

    public void setStr_call_duration(String str_call_duration) {
        this.str_call_duration = str_call_duration;
    }

    @Override
    public String toString() {
        return "CallLogModel{" +
                "str_number='" + str_number + '\'' +
                ", str_contact_name='" + str_contact_name + '\'' +
                ", str_call_type='" + str_call_type + '\'' +
                ", str_call_date='" + str_call_date + '\'' +
                ", str_call_time='" + str_call_time + '\'' +
                ", str_call_duration='" + str_call_duration + '\'' +
                '}';
    }
}
