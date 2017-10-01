package ninja.sakib.androidmvpexample.asynctasks;

import android.os.AsyncTask;
import android.util.Log;

import ninja.sakib.androidmvpexample.models.network.LoginRequest;
import ninja.sakib.androidmvpexample.models.network.LoginResponse;

/**
 * := Coded with love by Sakib Sami on 1/10/17.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class LoginAsyncTask extends AsyncTask<LoginRequest, Integer, LoginResponse> {

    @Override
    protected LoginResponse doInBackground(LoginRequest... loginRequests) {
        for (int i = 1; i <= 15; i++) {
            Log.d("Where", "Timer " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {

            }
        }
        return new LoginResponse();
    }
}
