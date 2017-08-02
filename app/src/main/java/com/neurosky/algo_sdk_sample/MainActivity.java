package com.neurosky.algo_sdk_sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
//TODO add logging
public class MainActivity extends Activity {

    private TextView txtSignalQuality;
    private TextView txtState;
    private TextView txtAttention;
    private ProgressBar attentionProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtSignalQuality = (TextView) findViewById(R.id.txtSignalQuality);
        this.txtState = (TextView) findViewById(R.id.txtState);
        this.txtAttention = (TextView) findViewById(R.id.txtAttention);
        this.attentionProgressBar = (ProgressBar) findViewById(R.id.attentionProgressBar);

        MindwaveConnect mindwaveConnect = new MindwaveConnect(this);
        mindwaveConnect.connect();
    }

    public void setTxtSignalQuality(String s){
        this.txtSignalQuality.setText(s);
    }

    public void setTxtState(String s){
        this.txtState.setText(s);
    }

    public void setTxtAttention(String s){
        this.txtAttention.setText(s);
    }

    public void setAttentionProgressBar(int n){
        this.attentionProgressBar.setProgress(n);
    }
}
