package com.example.awesomesauce;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
	Button btPlay;
	MediaPlayer mpPlay;
	int playing;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btPlay=(Button)findViewById(R.id.btnPlay);
		btPlay.getBackground().setAlpha(160);
		btPlay.setOnClickListener(bPlay);
		mpPlay=new MediaPlayer();
		mpPlay=MediaPlayer.create(this,R.raw.brown_eyed);
		mpPlay.start();
		playing=0;
	}
	Button.OnClickListener bPlay = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(playing){
			case 0:
				mpPlay.pause();
				playing=1;
				btPlay.setText(R.string.play);
				break;
			case 1:
				mpPlay.start();
				playing=0;
				btPlay.setText(R.string.pause);
				break;
			}
		}
		
	};

}
