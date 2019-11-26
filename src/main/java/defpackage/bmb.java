package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmb */
public final class bmb {
    private static final Object e = new Object();
    public final Context a;
    public String b;
    public bje c;
    public final Map d;

    public bmb(Callback callback, String str, Map map) {
        this.b = str;
        if (!TextUtils.isEmpty(str)) {
            str = this.b;
            if (str.charAt(str.length() - 1) != '/') {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.b);
                stringBuilder.append('/');
                this.b = stringBuilder.toString();
            }
        }
        if (callback instanceof View) {
            this.a = ((View) callback).getContext();
            this.d = map;
            this.c = null;
            return;
        }
        bpb.a("LottieDrawable must be inside of a view for images to work.");
        this.d = new HashMap();
        this.a = null;
    }

    public final Bitmap a(String str, Bitmap bitmap) {
        synchronized (e) {
            ((bkc) this.d.get(str)).c = bitmap;
        }
        return bitmap;
    }
}
