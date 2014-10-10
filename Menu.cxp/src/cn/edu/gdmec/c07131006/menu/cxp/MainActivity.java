package cn.edu.gdmec.c07131006.menu.cxp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tv;
	TextView tv1;
    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub

    	
    	switch(item.getItemId()){
    	case R.id.item1:
        	tv.setText("help");
    	case R.id.item2:
    		tv1.setText("work");
    	}
		return super.onMenuItemSelected(featureId, item);
	}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	tv = (TextView) findViewById(R.id.textView1);
    	tv1 = (TextView) findViewById(R.id.textView2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
