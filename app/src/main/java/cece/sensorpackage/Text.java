/*
package cece.sensorpackage;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.yzq.zxinglibrary.android.CaptureActivity;
import com.yzq.zxinglibrary.common.Constant;


public class Text extends Activity implements OnClickListener{

	private Button startBtn;
	private Button stopBtn;
	private TextView result;
	private Button saoyisao;
	private RecordingThread recordingThread;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		startBtn = (Button) findViewById(R.id.start_btn);
		startBtn.setOnClickListener(this);

		stopBtn = (Button) findViewById(R.id.stop_btn);
		stopBtn.setOnClickListener(this);

		saoyisao = findViewById(R.id.saoyisao);
		saoyisao.setOnClickListener(this);

		result = findViewById(R.id.jieguo);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		case R.id.start_btn:
			
			startBtn.setVisibility(View.INVISIBLE);
			stopBtn.setVisibility(View.VISIBLE);

			recordingThread = new RecordingThread();
			recordingThread.start();
			
			break;

		case R.id.stop_btn:
			
			startBtn.setVisibility(View.VISIBLE);
			stopBtn.setVisibility(View.INVISIBLE);
			
			recordingThread.stopRecording();
			
			break;
			case R.id.saoyisao:

				Intent intent = new Intent(Text.this, CaptureActivity.class);
				*/
/*ZxingConfig：a configuration class, setting: show bottom layout(include flash light，album)，alarm sound, shaking				 * 也可以不传这个参数
				 * default: non shaking, other default value = true
				 * *//*


				//ZxingConfig config = new ZxingConfig();
				//config.setShowbottomLayout(true);			//show bottom layout(include flash light，album)
				//config.setPlayBeep(true);					//alarm sound
				//config.setShake(true);					//shake
				//config.setShowAlbum(true);				//show album
				//config.setShowFlashLight(true);			//flash light
				//intent.putExtra(Constant.INTENT_ZXING_CONFIG, config);
				startActivityForResult(intent, 0);
				break;
		}
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == RESULT_OK) {
			if (data != null) {
				String content = data.getStringExtra(Constant.CODED_CONTENT);
				result.setText("Scanning result：" + content);
			}
		}
	}


}
*/
