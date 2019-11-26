package defpackage;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: gql */
final class gql implements afsw {
    private static final long b = TimeUnit.MILLISECONDS.convert(10, TimeUnit.SECONDS);
    public boolean a;
    private final gqx c;
    private final ArrayList d = new ArrayList();
    private final String e;
    private final long f;
    private final LruCache g;
    private final xsc h;
    private final aajx i;

    gql(gqx gqx, String str, long j, LruCache lruCache, xsc xsc, aajx aajx) {
        this.c = gqx;
        this.e = str;
        this.f = j;
        this.g = lruCache;
        this.h = xsc;
        this.i = aajx;
    }

    public final void a(afsw afsw) {
        this.d.add(afsw);
    }

    public final void a(bqn bqn) {
        a();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((afsw) arrayList.get(i)).a(bqn);
        }
    }

    private final aajs a(ajxu ajxu) {
        return ajxu != null ? aakj.a(this.i, ajxu, this.f, this.e) : null;
    }

    private final void a() {
        synchronized (this.g) {
            if (!this.a) {
                this.g.remove(this.c.a());
            }
        }
    }
}
