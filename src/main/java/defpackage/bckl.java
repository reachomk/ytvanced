package defpackage;

import android.content.Intent;
import android.net.ProxyInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.net.ProxyChangeListener;
import org.chromium.net.ProxyChangeListener.ProxyReceiver;

/* renamed from: bckl */
public final /* synthetic */ class bckl implements Runnable {
    private final ProxyReceiver a;
    private final Intent b;

    public bckl(ProxyReceiver proxyReceiver, Intent intent) {
        this.a = proxyReceiver;
        this.b = intent;
    }

    public final void run() {
        ProxyReceiver proxyReceiver = this.a;
        Intent intent = this.b;
        ProxyChangeListener proxyChangeListener = ProxyChangeListener.this;
        Bundle extras = intent.getExtras();
        bckj bckj = null;
        if (extras != null) {
            if (VERSION.SDK_INT >= 21) {
                bckj = bckj.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
            } else {
                try {
                    Object obj = extras.get("proxy");
                    if (obj != null) {
                        Class cls = Class.forName("android.net.ProxyProperties");
                        Method declaredMethod = cls.getDeclaredMethod("getHost", new Class[0]);
                        Method declaredMethod2 = cls.getDeclaredMethod("getPort", new Class[0]);
                        Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new Class[0]);
                        String str = (String) declaredMethod.invoke(obj, new Object[0]);
                        int intValue = ((Integer) declaredMethod2.invoke(obj, new Object[0])).intValue();
                        String[] split = ((String) declaredMethod3.invoke(obj, new Object[0])).split(",");
                        String str2 = (String) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj, new Object[0]);
                        bckj = !TextUtils.isEmpty(str2) ? new bckj(str, intValue, str2, split) : new bckj(str, intValue, null, split);
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Using no proxy configuration due to exception:");
                    stringBuilder.append(e);
                    Log.e("ProxyChangeListener", stringBuilder.toString());
                }
            }
        }
        proxyChangeListener.a(bckj);
    }
}
