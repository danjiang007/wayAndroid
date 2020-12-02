package com.jiang.scheme;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SchemeActivity extends Activity {

    private static final String TAG = "SchemeActivity";

    private TextView schemeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme);
        schemeTv =  findViewById(R.id.scheme_tv);
        Uri data = getIntent().getData();
        Log.i(TAG, "host = " + data.getHost() + " path = " + data.getPath() + " query = " + data.getQuery());
        String param = data.getQueryParameter("goodsId");
        schemeTv.setText("获取的参数为：" + param);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri uri = intent.getData();
        if (uri != null) {
            // 完整的url信息
            String url = uri.toString();
            Log.e(TAG, "url: $uri");

            // scheme部分
            String scheme = uri.getScheme();
            Log.e(TAG, "scheme: $scheme");

            // host部分
            String host = uri.getHost();
            Log.e(TAG, "host: $host");

            //port部分
            int port = uri.getPort();
            Log.e(TAG, "port: $port");

            // 访问路劲
            String path = uri.getPath();
            Log.e(TAG, "path: $path");

            // Query部分
            String query = uri.getQuery();
            Log.e(TAG, "query: $query");

            //获取指定参数值
            String type = uri.getQueryParameter("type");
            Log.e(TAG, "type: $type");
            String buffer = uri.getQueryParameter("buffer");
            Log.e(TAG, "buffer: $buffer");
        }
    }
}
