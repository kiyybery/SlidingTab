package com.example.zihua.slidingtab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button workbtn, topicbtn, classbtn, collectionbtn;
    private View pinnedIndicator;
    private float slidwork, slidtopic, slidclass, slidcollection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
        setListener();
    }

    public void initview() {
        workbtn = (Button) findViewById(R.id.work_btn);
        topicbtn = (Button) findViewById(R.id.topic_btn);
        classbtn = (Button) findViewById(R.id.calss_btn);
        collectionbtn = (Button) findViewById(R.id.collection_btn);
        pinnedIndicator = findViewById(R.id.pinnedIndicator);
    }

    public void setListener() {

        workbtn.setOnClickListener(this);
        topicbtn.setOnClickListener(this);
        classbtn.setOnClickListener(this);
        collectionbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        initIndexOffset();
        switch (v.getId()) {

            case R.id.work_btn:
                if (isCollection) {

                    return;
                }
                pinnedIndicator.animate().x(slidwork);
                pinnedIndicator.setX(slidwork);
                isCollection = false;
                break;

            case R.id.calss_btn:
                if (isCollection) {

                    return;
                }
                pinnedIndicator.animate().x(slidclass);
                pinnedIndicator.setX(slidclass);
                isCollection = false;
                break;

            case R.id.collection_btn:
                if (isCollection) {

                    return;
                }
                pinnedIndicator.animate().x(slidcollection);
                pinnedIndicator.setX(slidcollection);
                isCollection = false;
                break;

            case R.id.topic_btn:
                if (isCollection) {

                    return;
                }
                pinnedIndicator.animate().x(slidtopic);
                pinnedIndicator.setX(slidtopic);
                isCollection = false;
                break;
            default:
                break;
        }

    }

    private boolean isCollection;

    private void initIndexOffset() {

        slidwork = workbtn.getX();
        slidtopic = topicbtn.getX();
        slidclass = classbtn.getX();
        slidcollection = collectionbtn.getX();
    }
}
