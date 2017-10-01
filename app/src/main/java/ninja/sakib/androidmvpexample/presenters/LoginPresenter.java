package ninja.sakib.androidmvpexample.presenters;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import java.util.concurrent.ExecutionException;

import ninja.sakib.androidmvpexample.models.network.LoginRequest;
import ninja.sakib.androidmvpexample.models.network.LoginResponse;
import ninja.sakib.androidmvpexample.networkio.restapi.UserApi;
import ninja.sakib.androidmvpexample.ui.views.LoginView;

/**
 * := Coded with love by Sakib Sami on 1/10/17.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

@InjectViewState
public class LoginPresenter extends MvpPresenter<LoginView> {
    private UserApi userApi = new UserApi();

    public void onLoginRequest(LoginRequest loginRequest) {
        Log.d("Where", "LoginRequestedOnPresenter");
        try {
            LoginResponse loginResponse = userApi.onUserLogin(loginRequest);
            Log.d("Where", "LoginResponseOnPresenter");
            getViewState().onLoginResponse(loginResponse);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
