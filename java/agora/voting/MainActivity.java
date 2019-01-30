package agora.voting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;


public class MainActivity extends Activity {

  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    FragmentManager fragmentManager = getFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    Configuration configInfo = getResources().getConfiguration();

    if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE){
      FragmentLandscape fragmentLandscape = new FragmentLandscape();
      fragmentTransaction.replace(android.R.id.content, fragmentLandscape);
    } else {
      FragmentPortrait fragmentPortrait = new FragmentPortrait();
      fragmentTransaction.replace(android.R.id.content, fragmentPortrait);
    }
    fragmentTransaction.commit();
  }
}
