package ninja.sakib.androidmvpexample.networkio.restapi;

import java.util.concurrent.ExecutionException;

import ninja.sakib.androidmvpexample.asynctasks.LoginAsyncTask;
import ninja.sakib.androidmvpexample.models.network.LoginRequest;
import ninja.sakib.androidmvpexample.models.network.LoginResponse;

/**
 * := Coded with love by Sakib Sami on 1/10/17.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class UserApi {

    public LoginResponse onUserLogin(LoginRequest loginRequest) throws ExecutionException, InterruptedException {
        // LoginTask will be called here
        LoginAsyncTask loginAsyncTask = new LoginAsyncTask();
        return loginAsyncTask.execute(loginRequest).get();
    }
}
