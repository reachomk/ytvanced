package defpackage;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;

@qlp
/* renamed from: rle */
public final class rle {
    public final rkw a;
    public final rkt b;
    public final qle c;

    public rle(rkw rkw, rkt rkt, qle qle) {
        this.a = rkw;
        this.b = rkt;
        this.c = qle;
    }

    public static void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        rlj.a();
        qmk qmk = new qmk();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", VERSION.RELEASE);
        bundle.putString("api", String.valueOf(VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        int a = psh.d.a(context);
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(a);
        stringBuilder.append(".13280000");
        bundle.putString("js", stringBuilder.toString());
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        new qmj(appendQueryParameter.toString()).start();
    }
}
