package com.qiscus.internship.sudutnegeri.ui.AddUser;

import com.qiscus.internship.sudutnegeri.data.model.Car;

/**
 * Created by Vizyan on 1/10/2018.
 */

interface AddUserView {

    void success();

    void failedParse();

    void cantConnect();

    String getName();

    String getEmail();

    String getPassword();

    String getNoIdentity();

    String getAddress();

    String getPhone();

    String getRetypePasswd();
}
