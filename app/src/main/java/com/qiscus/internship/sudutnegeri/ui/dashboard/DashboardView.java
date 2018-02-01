package com.qiscus.internship.sudutnegeri.ui.dashboard;

import com.qiscus.internship.sudutnegeri.data.model.DataProject;
import com.qiscus.sdk.data.model.QiscusChatRoom;

import java.util.List;

/**
 * Created by Vizyan on 1/15/2018.
 */

interface DashboardView {
    String getEmail();

    String getPassword();

    void successLogout();

    void successShowProjectVerify(List<DataProject> dataProject);

    void successShowProjectByUser(List<DataProject> dataProjectList);

    void failedShowProjectByVerify(String s);

    void failedShowProjectByUser();
}
