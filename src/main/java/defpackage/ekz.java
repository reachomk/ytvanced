package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ekz */
public final class ekz implements t, xcp {
    public boolean a;
    public boolean b;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());
    private final xci d;
    private final ajam e;
    private final zyw f;
    private bcuo g;

    public ekz(xci xci, ajam ajam, zyw zyw) {
        this.d = xci;
        this.e = ajam;
        this.f = zyw;
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void aw_() {
        if (foh.x(this.f)) {
            this.g = this.e.p().f().a(emg.a(this.f, 2199023255552L, 1)).a(new elc(this), elb.a);
        } else {
            this.d.a((Object) this);
        }
    }

    public final void a(af afVar) {
        if (foh.x(this.f)) {
            this.g.b();
            this.g = null;
            return;
        }
        this.d.b(this);
    }

    public final void a(ele ele) {
        this.c.add(ele);
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkc ahkc) {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = ahkc.c;
        this.a = z3;
        boolean z4 = ahkc.d;
        this.b = z4;
        if (z != z3 || z2 != z4) {
            for (ele a : this.c) {
                a.a(this.a, this.b);
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkc.class};
        } else if (i == 0) {
            a((ahkc) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
