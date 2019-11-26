package defpackage;

import android.content.Context;

/* renamed from: ahvi */
public final class ahvi implements ahvp, ahxn, ajan, xcp {
    public final ahvm a;
    public final ahvm b;
    public final bcaa c;
    private final boolean d = false;
    private boolean e = false;
    private ahkn f;

    public ahvi(bcaa bcaa, ahvm ahvm, ahvm ahvm2, Context context) {
        this.c = (bcaa) amqw.a((Object) bcaa);
        this.a = (ahvm) amqw.a((Object) ahvm);
        this.b = (ahvm) amqw.a((Object) ahvm2);
        amqw.a((Object) context);
    }

    public final long e() {
        return 128;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 128)).a(ajcg.a(ajam.O(), 128, 1)).a(new ahvl(this), ahvk.a)};
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        aakj aakj;
        boolean b;
        this.f = ahkn;
        aajs aajs = null;
        boolean z = false;
        if (ahkn.a == airi.VIDEO_PLAYING || ahkn.a == airi.INTERSTITIAL_PLAYING) {
            aakj = ahkn.b;
            b = ((ahxc) this.c.get()).b();
            this.e = aakj.n().aA();
        } else {
            aakj = null;
            b = false;
        }
        ahvm ahvm = this.b;
        boolean z2 = this.e && b;
        ahvm.a(z2);
        boolean b2 = ahkn.a.b();
        if (b && !b2) {
            if (aakj != null) {
                aajs aajs2 = aakj.c;
                if (aajs2 != null) {
                    aajs = aajs2;
                }
            }
            Object obj = (aajs == null || !aajs.p()) ? null : 1;
            Object obj2 = (aajs == null || !aajs.q()) ? null : 1;
            ahvm ahvm2 = this.a;
            if (this.e && !(obj == null && obj2 == null)) {
                z = true;
            }
            ahvm2.a(z);
            return;
        }
        this.a.a(false);
    }

    public final void a(boolean z) {
        if (z) {
            ahkn ahkn = this.f;
            if (ahkn != null) {
                a(ahkn);
                return;
            }
            return;
        }
        this.b.a(false);
        this.a.a(false);
    }

    public final void a() {
        ((ahxc) this.c.get()).c();
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
