package hsr.uint1.uint1_miniprojekt_android;

import java.util.ArrayList;
import java.util.List;

import hsr.uint1.uint1_miniprojekt_android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import library.Callback;
import library.LibraryService;
import library.testCallback;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	
	
	public void registeractivity(View view) {
		Intent intent = new Intent(this, RegisterActivity.class);
		startActivity(intent);
	}
	
	
	public void loginactivity(View view ) {
		final EditText email = (EditText)findViewById(R.id.email);
		final EditText password = (EditText) findViewById(R.id.password);
		testCallback c = new testCallback();
		LibraryService.login(email.getText().toString(), password.getText().toString(), c  );
		if(LibraryService.IsLoggedIn()) {
			Intent intent = new Intent(this, MainViewActivity.class);
			startActivity(intent);
		}
	}
	

}
