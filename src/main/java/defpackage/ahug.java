package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ahug */
public final class ahug implements ahuh, ajan, xcp {
    private final ahue a;
    private final ahnq b;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());
    private boolean d;
    private boolean e;
    private boolean f;

    public ahug(ahue ahue, ahnq ahnq) {
        this.a = (ahue) amqw.a((Object) ahue);
        this.b = (ahnq) amqw.a((Object) ahnq);
    }

    public final long e() {
        return 64;
    }

    public final void a(ahun ahun) {
        this.c.add(ahun);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 64)).a(ajcg.a(ajam.O(), 64, 1)).a(new ahuj(this), ahui.a), ajam.P().b.a(ajcg.b(ajam.O(), 64)).a(ajcg.a(ajam.O(), 64, 0)).a(new ahul(this), ahuk.a)};
    }

    /* Access modifiers changed, original: final */
    public final void a(ahjn ahjn) {
        this.d = ahjn.e;
        a();
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        boolean z;
        aakj aakj = ahkn.b;
        boolean z2 = false;
        if (aakj != null) {
            aajs aajs = aakj.c;
            if (aajs != null && aajs.p()) {
                z = true;
                this.e = z;
                aakj = ahkn.b;
                if (!(aakj == null || aakj.n().aC() || !ahkn.b.n().aD())) {
                    z2 = true;
                }
                this.f = z2;
                a();
            }
        }
        z = false;
        this.e = z;
        aakj = ahkn.b;
        z2 = true;
        this.f = z2;
        a();
    }

    private final void a() {
        boolean z = false;
        if (this.d && this.e && !this.f) {
            z = true;
        }
        if (z) {
            this.a.b();
        } else {
            this.a.c();
        }
        for (ahun a : this.c) {
            a.a(z);
        }
    }

    public final void a(int i, int i2) {
        ahmz ahmz = this.b.j;
        if (ahmz != null) {
            ahmz.b.a(i, i2);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        ahmz ahmz = this.b.j;
        if (ahmz != null) {
            ahqe ahqe = ahmz.b;
            if (!ahqe.b) {
                ahqe.a(i, i2);
            }
            ahqe.a(i, i2, i3, i4);
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        ahmz ahmz = this.b.j;
        if (ahmz != null) {
            ahqe ahqe = ahmz.b;
            ahqe.a(i, i2, i3, i4);
            if (ahqe.r > 0) {
                float f = 0.0f;
                float f2 = 0.0f;
                for (i = 0; i < 5; i++) {
                    f += ahqe.p[i];
                    f2 += ahqe.q[i];
                }
                float f3 = (float) ahqe.r;
                ahqe.l = f / f3;
                ahqe.m = f2 / f3;
            }
            long a = ahqe.a.a();
            ahqe.o = a;
            ahqe.n = a;
            ahqe.b = false;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkn.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else if (i == 1) {
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
