package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: hub */
public final class hub implements hvf, t, xcp {
    private final Set a = new HashSet();
    private ahkn b;
    private final xci c;
    private final ajam d;
    private final zyw e;
    private final bdfu f = new bdfu();

    public hub(xci xci, ajam ajam, zyw zyw) {
        this.c = xci;
        this.d = ajam;
        this.e = zyw;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void B_() {
        if (foh.x(this.e)) {
            this.f.a();
            this.f.a(this.d.Q().a.f().a(emg.a(this.e, 8388608, 1)).a(new hue(this), hud.a));
            return;
        }
        this.c.a((Object) this);
    }

    public final void C_() {
        if (foh.x(this.e)) {
            this.f.a();
        } else {
            this.c.b(this);
        }
    }

    /* JADX WARNING: Missing block: B:3:0x000f, code skipped:
            if (r0 != null) goto L_0x0022;
     */
    public final java.lang.String f() {
        /*
        r2 = this;
        r0 = r2.b;
        r0 = r0.a;
        r0 = r0.a();
        r1 = 0;
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r0 = r2.b;
        r0 = r0.c;
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0022;
    L_0x0012:
        r0 = r2.b;
        r0 = r0.a;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0021;
    L_0x001c:
        r0 = r2.b;
        r0 = r0.b;
        goto L_0x0022;
    L_0x0021:
        r0 = r1;
    L_0x0022:
        if (r0 == 0) goto L_0x0029;
    L_0x0024:
        r0 = r0.b();
        return r0;
    L_0x0029:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hub.f():java.lang.String");
    }

    public final void a(ahkn ahkn) {
        this.b = ahkn;
        if (!this.a.isEmpty()) {
            for (hve a : this.a) {
                a.a();
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
