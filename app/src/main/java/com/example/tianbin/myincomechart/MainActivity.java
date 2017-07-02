package com.example.tianbin.myincomechart;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

import com.example.tianbin.myincomechart.Model;
import com.example.tianbin.myincomechart.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Chart chart= (Chart) findViewById(R.id.chart);
        final List<Model> list=new ArrayList<>();
        Model model1=new Model();
        model1.percent=2.78f;
        model1.date="05.24";
        list.add(model1);

        Model model2=new Model();
        model2.percent=3.78f;
        model2.date="05.25";
        list.add(model2);

        Model model3=new Model();
        model3.percent=3.21f;
        model3.date="05.26";
        list.add(model3);

        Model model4=new Model();
        model4.percent=5.63f;
        model4.date="05.27";
        list.add(model4);

        Model model5=new Model();
        model5.percent=3.33f;
        model5.date="05.28";
        list.add(model5);

        Model model6=new Model();
        model6.percent=-4.36f;
        model6.date="05.29";
        list.add(model6);

        Model model7=new Model();
        model7.percent=-0.38f;
        model7.date="05.30";
        list.add(model7);

        chart.setDrawPoints(true).setFillArea(true).setPlayAnim(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                chart.setDatas(list);
            }
        },1000);
    }
}
