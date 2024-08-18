package com.app.constant;

import com.app.service.ConfigurationService;

import java.util.AbstractMap;
import java.util.Map;

public interface AppConstant {
    String APP_CONTROLLER_PACKAGE = "com.app.controller";
    String APP_ID_GENERATOR_STRATEGY = "com.app.service.id.IdGenerator";
    String APP_ID_GENERATOR_NAME = "idGenerator";
    String APP_THREAD_POOL_EXECUTOR = "threadPoolExecutor";
    String APP_USER_SERVICE = "userService";

    Integer MAX_ATTEMPT_FORGET_PASSWORD = 5;
    Integer MAX_TIME_FORGET_PASSWORD = 5 * 60 * 1000;
    Integer MAX_ATTEMPT_LOGIN = 5;

    Boolean AES_ZIP_ENABLE = false;
    String LOGIN_TYPE_INTERNAL = "LOGIN_TYPE_INTERNAL";
    String ROOT_DIRECTORY = ConfigurationService.getInstance().getString("file.upload-dir", "/tmp/upload");

    String BACKEND_POST_NOTIFICATION_COMMAND = "BACKEND_POST_NOTIFICATION";
    String BACKEND_APP = "BACKEND_APP";

    String GRANT_TYPE_PASSWORD = "password";
    String GRANT_TYPE_USER = "user";

    String DATE_FORMAT = "dd/MM/yyyy";
    String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";

    String PHONE_PATTERN = "^0[35789][0-9]{8}$";
    String USERNAME_PATTERN = "^(?=.{3,20}$)(?!.*[_.]{2})[a-zA-Z][a-zA-Z0-9_]*[a-zA-Z0-9]$";
    String EMAIL_PATTERN = "^(?!.*[.]{2,})[a-zA-Z0-9.%]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
}
