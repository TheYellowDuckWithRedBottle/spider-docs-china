package spiderdocschina.utils;



import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonResult {
    public static final int NO_LOGIN =400;

    public static final int LOGIN_FAILED =401;

    public static  final int TOKEN_EXPIRED = 402;
    public static  final int NO_PERMISSION = 403;

    private  Boolean success;
    private Integer code;
    private String msg;
    private  Object data;

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public JsonResult(Boolean success) {
        this.success = success;
    }
    public JsonResult(Boolean success,String msg){
        this.success = success;
        this.msg = msg;
    }
    public JsonResult(Integer code ,Boolean success,String msg){
        this.code = code ;
        this.success= success;
        this.msg=msg;
    }
    public JsonResult(Boolean success,Object data){
        this.success = success;
        this.data = data;
    }
    public JsonResult(Boolean success,Integer code,String msg,Object data){
        this.success  = success;
        this.code = code;
        this.msg= msg;
        this.data=data;
    }
    public void put(String key,Object value){
        if(data==null){
            data = new HashMap<>();
        }
        ((Map) data).putAll((Map) value);
    }
    public void putAll(Map<String,Object> map){
        if(data==null){
            data = new HashMap<>();
        }
        ((Map) data).putAll(map);
    }
    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
