package defpackage;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: ons */
public abstract class ons extends ono {
    private final HashMap b = new HashMap();
    private Handler c;
    private owt d;

    protected ons() {
    }

    /* Access modifiers changed, original: protected */
    public int a(Object obj, int i) {
        return i;
    }

    /* Access modifiers changed, original: protected */
    public ook a(Object obj, ook ook) {
        throw null;
    }

    public abstract void a(Object obj, oau oau, Object obj2);

    public void a(owt owt) {
        this.d = owt;
        this.c = new Handler();
    }

    public final void b() {
        for (onx onx : this.b.values()) {
            onx.a.b();
        }
    }

    public void a() {
        for (onx onx : this.b.values()) {
            onx.a.a(onx.b);
            onx.a.a(onx.c);
        }
        this.b.clear();
    }

    public final void a(Object obj, ool ool) {
        oxz.a(this.b.containsKey(obj) ^ 1);
        oon onv = new onv(this, obj);
        oom onu = new onu(this, obj);
        this.b.put(obj, new onx(ool, onv, onu));
        ool.a((Handler) oxz.a(this.c), onu);
        ool.a(onv, this.d);
    }

    public final void a(Object obj) {
        onx onx = (onx) oxz.a((onx) this.b.remove(obj));
        onx.a.a(onx.b);
        onx.a.a(onx.c);
    }
}
