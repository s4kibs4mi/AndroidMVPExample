package ninja.sakib.androidmvpexample.ui.views;

import com.arellomobile.mvp.MvpView;

import ninja.sakib.androidmvpexample.models.network.LoginResponse;

/**
 * := Coded with love by Sakib Sami on 1/10/17.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public interface LoginView extends MvpView {
    void onLoginResponse(LoginResponse loginResponse);
}
