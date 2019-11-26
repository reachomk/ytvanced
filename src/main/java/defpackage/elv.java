package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView.ScaleType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: elv */
public final class elv {
    public final xci a;
    public final Map b;
    public final LruCache c;

    public elv(xci xci) {
        HashMap hashMap = new HashMap();
        LruCache lruCache = new LruCache(5);
        this.a = (xci) amqw.a((Object) xci);
        this.b = hashMap;
        this.c = lruCache;
    }

    public final void a(String str, long j) {
        a(str, j, null, ScaleType.FIT_CENTER);
    }

    public final void a(String str, long j, Bitmap bitmap, ScaleType scaleType) {
        this.b.put(str, new ely(j, bitmap, scaleType));
        if (bitmap != null) {
            this.c.put(str, bitmap);
        } else {
            this.c.remove(str);
        }
        this.a.c(new elx(str));
    }

    public final ely a(String str) {
        return (ely) this.b.get(str);
    }
}
