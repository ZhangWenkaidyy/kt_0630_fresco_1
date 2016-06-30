package com.kevin.zwk.kt_0630_fresco_1;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * ----------BigGod be here!----------/
 * ***┏┓******┏┓*********
 * *┏━┛┻━━━━━━┛┻━━┓*******
 * *┃             ┃*******
 * *┃     ━━━     ┃*******
 * *┃             ┃*******
 * *┃  ━┳┛   ┗┳━  ┃*******
 * *┃             ┃*******
 * *┃     ━┻━     ┃*******
 * *┃             ┃*******
 * *┗━━━┓     ┏━━━┛*******
 * *****┃     ┃神兽保佑*****
 * *****┃     ┃代码无BUG！***
 * *****┃     ┗━━━━━━━━┓*****
 * *****┃              ┣┓****
 * *****┃              ┏┛****
 * *****┗━┓┓┏━━━━┳┓┏━━━┛*****
 * *******┃┫┫****┃┫┫********
 * *******┗┻┛****┗┻┛*********
 * ━━━━━━神兽出没━━━━━━
 * <p/>
 * 项目名称：kt_0630_fresco_1
 * 包名称：com.kevin.zwk.kt_0630_fresco_1
 * 类描述：MyApplication重写
 * 创建人：Zhang Wenkai
 * 创建时间：2016/6/30 14:35
 * 修改人：Zhang Wenkai
 * 修改时间：
 * 修改备注：
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

    }
}
