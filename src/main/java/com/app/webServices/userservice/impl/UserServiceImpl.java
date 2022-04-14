package com.app.webServices.userservice.impl;

import com.app.webServices.shared.Utils;
import com.app.webServices.ui.model.request.UserDetailsRequestModel;
import com.app.webServices.ui.model.response.UserRest;
import com.app.webServices.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
    public class UserServiceImpl implements UserService {

        Map<String, UserRest> users;
        Utils utils;

        public UserServiceImpl() {
        }

        @Autowired
        public UserServiceImpl(Utils utils) {
            this.utils = utils;
        }

        @Override
        public UserRest createUser(UserDetailsRequestModel userDetails) {

            UserRest returnValue = new UserRest();
            returnValue.setEmail(userDetails.getEmail());
            returnValue.setFirstName(userDetails.getFirstName());
            returnValue.setLastName(userDetails.getLastName());

            String userId = utils.generateUserId();
            returnValue.setUserId(userId);

            if (users == null) users = new HashMap<>();
            users.put(userId, returnValue);

            return returnValue;

        }
    }
