package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AsyncTask는 다른 Thread를 만들어서 작동함
        Log.d("test1", "PRE !!");

        BackgroundTask backgroundTask = new BackgroundTask();
        //asyncTask 시작
        backgroundTask.execute();
        Log.d("test1", "POST !!");
    }

    class BackgroundTask extends AsyncTask<Integer, Integer, Integer> {

        @Override
        protected void onPreExecute() {
            Log.d("test", "onPreExecute");
            super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            // AsyncTask를 사용하려면 doInBackground를 사용해야 함.
            int result = 0;
            for (int i = 0; i < 100; i++) {
                result++;
                if (i % 10 == 0) {
                    publishProgress(i);
                }
            }
            return result;
        }

        // ... = 가변 변수 Integer가 몇개 들어올지 모른다!! 이런 뜻
        // 하나씩 보내기때문에 0번째에 값이 들어있음
        @Override
        protected void onProgressUpdate(Integer... values) {
            // 로딩중 퍼센테이지 확인 가능
            Log.d("test", "Process : " + values[0] + "%");
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Integer integer) {
            //  integer는 doinBackground 에서 return 해준 result이다.
            Log.d("test", "Result : " + integer);
            super.onPostExecute(integer);
        }
    }

}
