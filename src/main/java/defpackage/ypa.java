package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

/* renamed from: ypa */
public abstract class ypa extends yig {
    public String h;

    ypa(Context context, Handler handler, ywk ywk) {
        this(context, handler, ywk, null);
    }

    ypa(Context context, Handler handler, ywk ywk, yil yil) {
        super(context, handler, ywk.i, ywk, yil);
    }

    public String a(String str) {
        if (TextUtils.equals(this.h, str)) {
            return null;
        }
        String str2 = this.h;
        this.h = xvd.a(str);
        return str2;
    }
}
