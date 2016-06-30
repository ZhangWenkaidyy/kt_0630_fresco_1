package com.kevin.zwk.kt_0630_fresco_1;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {
    private String img_url = "http://www.people.com.cn/mediafile/pic/20141104/38/3147049602913722802.jpg";
    private String img_gif = "http://23ps.com/Files/UpLoadFile/201206/201206030011426829.gif";
    private SimpleDraweeView simpleDraweeView;
    private SimpleDraweeView simpleDraweeView_gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleDraweeView = (SimpleDraweeView) findViewById(R.id.simpleDraweeView);
        simpleDraweeView_gif = (SimpleDraweeView) findViewById(R.id.simpleDraweeView_gif);
        Uri uri = Uri.parse(img_url);
        simpleDraweeView.setImageURI(uri);
        DraweeController controller = Fresco.newDraweeControllerBuilder().setAutoPlayAnimations(true)
                .setUri(Uri.parse(img_gif))

                .build();
        simpleDraweeView_gif.setController(controller);



    }
}
