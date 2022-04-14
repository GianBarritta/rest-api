package com.app.webServices.userservice;

import com.app.webServices.ui.model.request.UserDetailsRequestModel;
import com.app.webServices.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
