package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: ahvr */
public final class ahvr implements ahoj, aifi {
    private final ViewGroup a;
    private final Context b;
    private ahuq c;

    public ahvr(ViewGroup viewGroup, Context context) {
        this.a = viewGroup;
        this.b = context;
    }

    public final void a(List list) {
        ahuq ahuq = this.c;
        if (ahuq != null) {
            ahuq.i.post(new ahus(ahuq, list));
            ahuq.o = true;
            ahuq.h();
        }
    }

    public final void c() {
        ahuq ahuq = this.c;
        if (ahuq != null) {
            ahuq.i.post(new ahuv(ahuq));
            ahuq.o = false;
            ahuq.h();
        }
    }

    public final void d() {
        ahuq ahuq = this.c;
        if (ahuq != null) {
            ahuq.i();
        }
    }

    public final void a(float f) {
        ahuq ahuq = this.c;
        if (ahuq != null) {
            ahuq.i.post(new ahux(ahuq, f));
        }
    }

    public final void a(ajji ajji) {
        ahuq ahuq = this.c;
        if (ahuq != null) {
            ahuq.i.post(new ahuw(ahuq, ajji));
        }
    }

    public final void a(int i, int i2) {
        ahuq ahuq = this.c;
        if (ahuq != null) {
            ahuq.i.post(new ahuz(ahuq, i, i2));
        }
    }

    public final void a(ahry ahry, ahrt ahrt) {
        this.c = new ahuq(this.a, this.b, new Handler(Looper.getMainLooper()), (ahpn) ahrt.d().clone(), ahry.j, ahry.k, ahry, ahrt);
        ahrt.a(this.c);
    }

    public final void bz_() {
        this.c = null;
    }
}
