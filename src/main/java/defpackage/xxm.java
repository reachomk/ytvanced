package defpackage;

import android.text.TextUtils;
import android.util.LruCache;

/* renamed from: xxm */
public final class xxm {
    public final LruCache a;
    private final afpu b;
    private String c;

    public xxm(afpu afpu) {
        Object lruCache = new LruCache(5);
        this.b = (afpu) uhy.a((Object) afpu);
        this.a = (LruCache) uhy.a(lruCache);
    }

    public final void a(String str) {
        this.a.remove(str);
    }

    public final void a() {
        String a = this.b.c().a();
        if (!TextUtils.equals(this.c, a)) {
            this.a.evictAll();
        }
        this.c = a;
    }

    public static long a(ajvp ajvp) {
        if (ajvp != null) {
            ajvs ajvs = ajvp.b;
            if (ajvs != null) {
                akal akal = ajvs.a;
                if (akal != null) {
                    ajtr ajtr = akal.a;
                    if (ajtr != null) {
                        ajts ajts = ajtr.a;
                        if (ajts != null) {
                            return ajts.m;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
