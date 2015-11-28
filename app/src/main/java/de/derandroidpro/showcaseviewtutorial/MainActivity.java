package de.derandroidpro.showcaseviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.amlcurran.showcaseview.OnShowcaseEventListener;
import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

public class MainActivity extends AppCompatActivity {

    Button btn;

    ShowcaseView.Builder showCaseView;

    final int SHOWCASEVIEW_ID = 28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button", Toast.LENGTH_SHORT).show();
            }
        });

        showShowCaseView();
    }

   public void showShowCaseView(){
        showCaseView = new ShowcaseView.Builder(this)
            .withMaterialShowcase()
                .setTarget(new ViewTarget(R.id.button, this))
                .setContentTitle("Cooles Feature")
                .setContentText("Klicke auf diesen Button, um das coolste Feature dieser App zu erleben.")
                .setStyle(R.style.ShowCaseViewStyle)
                .singleShot(SHOWCASEVIEW_ID)
                .setShowcaseEventListener(new OnShowcaseEventListener() {
                    @Override
                    public void onShowcaseViewHide(ShowcaseView showcaseView) {

                    }

                    @Override
                    public void onShowcaseViewDidHide(ShowcaseView showcaseView) {

                    }

                    @Override
                    public void onShowcaseViewShow(ShowcaseView showcaseView) {

                    }
                });
       showCaseView.build();
    }
}
