package com.ammach.transitions;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//                Slide slide=new Slide();
//                slide.setDuration(2000);
//
//                Fade fade=new Fade();
//                fade.setDuration(2000);
//                getWindow().setExitTransition(slide);
//                getWindow().setReenterTransition(fade);
                TransitionInflater transitionInflater=TransitionInflater.from(this);
                Transition transition=transitionInflater.inflateTransition(R.transition.shared);

                getWindow().setSharedElementExitTransition(transition);
            }


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.img);
    }

    public void makeTrans(View view) {
        ActivityOptionsCompat activityOptionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this,null);
        Intent intent=new Intent(this,SecondActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            startActivity(intent,activityOptionsCompat.toBundle());
        }
        else{
            startActivity(intent);
        }
    }

    public void shared(View view) {
        ActivityOptionsCompat activityOptionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this, imageView,"elementShared");
        Intent intent=new Intent(this,SecondActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            startActivity(intent,activityOptionsCompat.toBundle());
        }
        else{
            startActivity(intent);
        }
    }
}
