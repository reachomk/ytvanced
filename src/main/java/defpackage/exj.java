package defpackage;

import android.widget.TextView.BufferType;

/* renamed from: exj */
public final class exj implements ajan, xcp {
    private final /* synthetic */ exh a;

    exj(exh exh) {
        this.a = exh;
    }

    public final long e() {
        return 1;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.a.i.c();
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        if (ahkn.a == airi.NEW) {
            this.a.i.c();
        }
    }

    public final void a(ahkj ahkj) {
        exs exs = this.a.i;
        exs.a.setText(ahkj.a, BufferType.SPANNABLE);
        exs.d();
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.n().f().a(emg.a(this.a.d, 549755813888L, 0)).a(new exm(this), exl.a), ajam.u().f().a(emg.a(this.a.d, 549755813888L, 1)).a(new exo(this), exn.a), ajam.Q().a.f().a(emg.a(this.a.d, 549755813888L, 1)).a(new exq(this), exp.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkd.class, ahkj.class, ahkn.class};
        } else if (i == 0) {
            a();
            return null;
        } else if (i == 1) {
            a((ahkj) obj);
            return null;
        } else if (i == 2) {
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
