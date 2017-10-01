package ninja.sakib.androidmvpexample.ui.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.arellomobile.mvp.MvpActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import ninja.sakib.androidmvpexample.R;
import ninja.sakib.androidmvpexample.models.network.LoginRequest;
import ninja.sakib.androidmvpexample.models.network.LoginResponse;
import ninja.sakib.androidmvpexample.presenters.LoginPresenter;
import ninja.sakib.androidmvpexample.ui.views.LoginView;

public class LoginActivity extends MvpActivity implements LoginView {
    @InjectPresenter
    public LoginPresenter loginPresenter;

    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.d("Where", "ViewCreated");

        loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Where", "LoginRequested");
                loginPresenter.onLoginRequest(new LoginRequest());
            }
        });
    }

    @Override
    public void onLoginResponse(LoginResponse loginResponse) {
        Log.d("Where", "LoginResponse");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Where", "ViewDestroyed");
    }
}
