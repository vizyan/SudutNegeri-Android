package com.qiscus.internship.sudutnegeri.ui.Register;

import android.util.Log;

import com.qiscus.internship.sudutnegeri.data.model.ResultUser;
import com.qiscus.internship.sudutnegeri.data.remote.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Vizyan on 1/10/2018.
 */

public class RegisterPresenter {

    private RegisterView registerView;

    public RegisterPresenter(RegisterView registerView){
        this.registerView = registerView;
    }

    public void saveUser(){
        String name = registerView.getName();
        String email = registerView.getEmail();
        String password = registerView.getPassword();
        final String retypepasswd = registerView.getRetypePasswd();
        String noIdentity = registerView.getNoIdentity();
        String address = registerView.getAddress();
        String phone = registerView.getPhone();


        RetrofitClient.getInstance()
                .getApi()
                .newUser(name, email, password, retypepasswd, noIdentity, address, phone, "no")
                .enqueue(new Callback<ResultUser>() {
                    @Override
                    public void onResponse(Call<ResultUser> call, Response<ResultUser> response) {
                        ResultUser resultUser = response.body();
                        String message = resultUser.getMessage();

                        if(message.equals("success")){
                            registerView.success(message);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResultUser> call, Throwable t) {
                        registerView.cantConnect();
                        Log.e(null, ""+t.getMessage());
                    }
                });
    }
}
