package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: tqj */
public class tqj {
    public WeakReference a;
    public long b;
    public long c = -1;
    @Deprecated
    public double d;
    @Deprecated
    public double e;
    public final tqu f;
    @Deprecated
    public Rect g;
    @Deprecated
    public int h;
    @Deprecated
    public int i;
    @Deprecated
    public int j;
    @Deprecated
    public int k;
    public final boolean l;
    public tqi m;
    private final long n;

    public tqj(tqu tqu, boolean z) {
        this.f = tqu;
        this.l = z;
        this.n = System.currentTimeMillis();
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public final View a() {
        return (View) this.a.get();
    }

    public final Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(tpz.SDK, "a");
        tpz tpz = tpz.SCREEN_SHARE_BUCKETS;
        trn trn = this.f.d;
        Integer valueOf = Integer.valueOf(0);
        linkedHashMap.put(tpz, trn.a(1, false));
        linkedHashMap.put(tpz.TIMESTAMP, Long.valueOf(this.n));
        if (this.l) {
            tpz = tpz.COVERAGE;
            tqi tqi = this.m;
            double d = 0.0d;
            linkedHashMap.put(tpz, Double.valueOf(tqi != null ? tqi.a : 0.0d));
            tpz = tpz.SCREEN_SHARE;
            tqi = this.m;
            if (tqi != null) {
                d = tqi.b;
            }
            linkedHashMap.put(tpz, Double.valueOf(d));
            tpz = tpz.POSITION;
            tqi = this.m;
            Object obj = (tqi == null || tqi.c == null) ? new Integer[]{valueOf, valueOf, valueOf, valueOf} : new Integer[]{Integer.valueOf(tqi.c.top), Integer.valueOf(this.m.c.left), Integer.valueOf(this.m.c.bottom), Integer.valueOf(this.m.c.right)};
            linkedHashMap.put(tpz, obj);
            tqi tqi2 = this.m;
            if (tqi2 != null) {
                Rect rect = tqi2.d;
                if (!(rect == null || rect.equals(tqi2.c))) {
                    linkedHashMap.put(tpz.CONTAINER_POSITION, new Integer[]{Integer.valueOf(this.m.d.top), Integer.valueOf(this.m.d.left), Integer.valueOf(this.m.d.bottom), Integer.valueOf(this.m.d.right)});
                }
            }
            tpz = tpz.VIEWPORT_SIZE;
            tqi tqi3 = this.m;
            Object obj2 = (tqi3 == null || tqi3.e == null) ? new Integer[]{valueOf, valueOf} : new Integer[]{Integer.valueOf(tqi3.e.width()), Integer.valueOf(this.m.e.height())};
            linkedHashMap.put(tpz, obj2);
            tpz = tpz.SCREEN_SIZE;
            tqi3 = this.m;
            Object obj3 = (tqi3 == null || tqi3.f == null) ? new Integer[]{valueOf, valueOf} : new Integer[]{Integer.valueOf(tqi3.f.width()), Integer.valueOf(this.m.f.height())};
            linkedHashMap.put(tpz, obj3);
        } else {
            linkedHashMap.put(tpz.COVERAGE, Double.valueOf(this.d));
            linkedHashMap.put(tpz.SCREEN_SHARE, Double.valueOf(this.e));
            if (this.g != null) {
                linkedHashMap.put(tpz.POSITION, new Integer[]{Integer.valueOf(this.g.top), Integer.valueOf(this.g.left), Integer.valueOf(this.g.bottom), Integer.valueOf(this.g.right)});
                linkedHashMap.put(tpz.APP_SIZE, new Integer[]{Integer.valueOf(this.i), Integer.valueOf(this.h)});
                linkedHashMap.put(tpz.SCREEN_SIZE, new Integer[]{Integer.valueOf(this.k), Integer.valueOf(this.j)});
            }
        }
        linkedHashMap.put(tpz.MIN_COVERAGE, Double.valueOf(this.f.a));
        linkedHashMap.put(tpz.MAX_COVERAGE, Double.valueOf(this.f.b));
        linkedHashMap.put(tpz.TOS, this.f.c.a(1, false));
        linkedHashMap.put(tpz.MAX_CONSECUTIVE_TOS, this.f.b());
        return linkedHashMap;
    }

    public final boolean c() {
        return this.f.a();
    }
}
