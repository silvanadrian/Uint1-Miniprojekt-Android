package hsr.uint1.uint1_miniprojekt_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import library.LibraryService;

public class RegisterActivity extends Activity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
	}
	
	
	
	public void registeruser(View view) {
		final EditText name = (EditText) findViewById(R.id.name2);
		final EditText email = (EditText)findViewById(R.id.email2);
		final EditText studentennumber = (EditText) findViewById(R.id.matrikelnummer);
		final EditText password = (EditText) findViewById(R.id.password2);
		final EditText repeatpassword = (EditText) findViewById(R.id.passwordrepeat);
		LibraryService.register(name.getText().toString(), password.getText().toString(), name.getText().toString(), studentennumber.getText().toString(), null  );
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		
	}
	
}
