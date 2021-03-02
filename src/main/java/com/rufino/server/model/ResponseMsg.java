package com.rufino.server.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseMsg {
    String error = "error message";
    String message = "main message";
    Long id;

    public ResponseMsg() {
        setId((long) Math.floor(100E3 * Math.random() * 900E3));
    }
    public ResponseMsg(String message) {
        setMessage(message);
        setId((long) Math.floor(100E3 * Math.random() * 900E3));
    }

}
