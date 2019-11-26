package defpackage;

import android.app.Activity;
import android.os.Build.VERSION;

/* renamed from: lvs */
public final class lvs extends ekk implements ajan, xcp {
    private static final boolean a = (VERSION.SDK_INT >= 26);
    private final Activity b;
    private final xci c;
    private final ajam d;
    private final bcaa e;
    private final zyw f;
    private final bdfu g = new bdfu();

    public lvs(Activity activity, xci xci, ajam ajam, elm elm, bcaa bcaa, zyw zyw) {
        super(elm);
        this.b = activity;
        this.c = xci;
        this.d = ajam;
        this.e = bcaa;
        this.f = zyw;
    }

    public final long e() {
        return 1;
    }

    public final void A_() {
        if (foh.x(this.f)) {
            this.g.a(a(this.d));
        } else {
            this.c.a((Object) this);
        }
    }

    public final void ar_() {
        if (foh.x(this.f)) {
            this.g.a();
        } else {
            this.c.b(this);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahjn ahjn) {
        if (!a || !this.b.isInPictureInPictureMode()) {
            ((lcl) this.e.get()).b(ahjn.b == airc.FULLSCREEN);
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.P().b.f().a(emg.a(this.f, 68719476736L, 0)).a(new lvr(this), lvu.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
