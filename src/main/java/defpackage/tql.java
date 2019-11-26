package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: tql */
public final class tql extends tqj {
    public final tqm n;
    public final String o;
    public final tpu p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    private final tqp u;
    private final OnAttachStateChangeListener v = new tqk(this);
    private boolean w;

    public tql(View view, tqm tqm, String str, tpu tpu, tpr tpr) {
        tqp tqp = new tqp(false, tpr);
        tqu tqu = new tqu();
        tqa tqa = new tqa();
        super(tqu, tpu.a.b());
        this.n = tqm;
        this.o = str;
        this.p = tpu;
        this.u = tqp;
        a(view);
    }

    public final void a(View view) {
        this.a = new WeakReference(view);
        if (view != null) {
            if (!this.l) {
                view.addOnLayoutChangeListener(new tqn(this));
            }
            view.addOnAttachStateChangeListener(this.v);
        }
    }

    public final boolean e() {
        return this.q || this.r || this.s;
    }

    public final void f() {
        if (this.t && !this.w) {
            this.n.b(a("lidartos", "u"), a());
            this.w = true;
            if (a() != null) {
                a().removeOnAttachStateChangeListener(this.v);
            }
        }
    }

    public final void a(long j) {
        if (this.c == -1) {
            this.c = j;
        }
        long j2 = this.b;
        if (j2 == 0) {
            this.b = j;
            j2 = j;
        }
        long j3 = j - j2;
        View a = a();
        if (this.l) {
            tqi a2 = this.u.a((tqj) this, a);
            this.f.a(j3, a2.a, a2.b);
            this.m = a2;
        } else {
            double a3 = (this.q || this.r || this.s) ? 0.0d : this.u.a(a);
            double b = (this.q || this.r || this.s) ? 0.0d : this.u.b(a);
            this.f.a(j3, a3, b);
            this.d = a3;
            this.e = b;
        }
        this.b = j;
    }

    public final tps a(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(b());
        linkedHashMap.put(tpz.ID, str);
        linkedHashMap.put(tpz.DONE_REASON, str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", tqy.a(tpz.ID));
        linkedHashMap2.put("r", tqy.a(tpz.DONE_REASON));
        linkedHashMap2.put("c", tqy.a(tpz.COVERAGE, tpt.a));
        linkedHashMap2.put("nc", tqy.a(tpz.MIN_COVERAGE, tpt.a));
        linkedHashMap2.put("mc", tqy.a(tpz.MAX_COVERAGE, tpt.a));
        linkedHashMap2.put("tos", tqy.b(tpz.TOS));
        linkedHashMap2.put("mtos", tqy.b(tpz.MAX_CONSECUTIVE_TOS));
        linkedHashMap2.put("p", tqy.b(tpz.POSITION));
        linkedHashMap2.put("cp", tqy.b(tpz.CONTAINER_POSITION));
        linkedHashMap2.put("bs", tqy.b(tpz.VIEWPORT_SIZE));
        linkedHashMap2.put("ps", tqy.b(tpz.APP_SIZE));
        linkedHashMap2.put("scs", tqy.b(tpz.SCREEN_SIZE));
        linkedHashMap2.put("lte", tqy.a("1"));
        linkedHashMap2.put("avms", tqy.a("nl"));
        linkedHashMap2.put("sv", tqy.a("41"));
        linkedHashMap2.put("cb", tqy.a("a"));
        str = tpy.a(linkedHashMap, Collections.unmodifiableMap(linkedHashMap2), null, null);
        tpv a = tps.a();
        a.a = str;
        return a.a();
    }

    public static int a(int i, float f) {
        return (int) Math.ceil((double) (((float) i) / f));
    }
}
