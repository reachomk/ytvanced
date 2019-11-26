package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.youtube.R;

/* renamed from: lcs */
public final class lcs implements lcq, xcp {
    public final Context b;
    public final Handler c;
    public final zyw d;
    public final xci e;
    public final ajam f;
    private final SharedPreferences g;
    private final exu h;
    private final bapu i;
    private final bapu j;
    private final bapu k;
    private boolean l;
    private fde m;
    private lcu n;
    private int o;

    public lcs(Context context, Handler handler, zyw zyw, SharedPreferences sharedPreferences, xci xci, ajam ajam, exu exu, bapu bapu, bapu bapu2, bapu bapu3) {
        this.b = context;
        this.c = handler;
        this.d = zyw;
        this.g = sharedPreferences;
        this.e = xci;
        this.f = ajam;
        this.h = exu;
        this.i = bapu;
        this.j = bapu2;
        this.k = bapu3;
    }

    public final void a() {
        if (this.n == null) {
            this.n = new lcu(this);
        }
        this.h.a(this.n);
    }

    public final void b() {
        exv exv = this.n;
        if (exv != null) {
            this.h.b(exv);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahke ahke) {
        if (g() == 2 && !amqq.a(ahke.a, ((ajgn) this.i.get()).c())) {
            a(3);
            if (this.m != null) {
                ((albi) this.j.get()).a(this.m);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkh ahkh) {
        if (ahkh.a) {
            e();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        if (ahkn.a.a(airi.NEW, airi.ENDED)) {
            this.l = false;
            d();
            a(1);
            return;
        }
        if (ahkn.a.a(airi.VIDEO_PLAYING)) {
            this.l = true;
            e();
        }
    }

    public final boolean c() {
        boolean z = false;
        if (this.l && g() != 3 && f()) {
            if (((ajgn) this.i.get()).g == null) {
                z = true;
            } else if (((ajgn) this.i.get()).g.k) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    public final void d() {
        if (g() == 2) {
            ((ajgn) this.i.get()).a(ajis.a(this.b.getString(R.string.turn_off_subtitles)));
        }
    }

    public final void e() {
        if (c()) {
            ajis c = ((ajgn) this.i.get()).c();
            if (c == null) {
                return;
            }
            if (foh.v(this.d)) {
                ((ajgn) this.i.get()).a(c);
                a(2);
                this.m = (fde) ((fdd) ((fdd) ((fdd) ((fdd) fde.h().b(true)).c(-1)).b(this.b.getString(R.string.autocaptions_snackbar_text))).a(this.b.getString(R.string.autocaptions_snackbar_disable_text), new lcv(this))).d();
                ((albi) this.j.get()).b(this.m);
                a(true);
                return;
            }
            a(false);
        }
    }

    private final void a(boolean z) {
        aoyv aoyv = (aoyv) aoys.c.createBuilder();
        aoyv.copyOnWrite();
        aoys aoys = (aoys) aoyv.instance;
        aoys.a |= 2;
        aoys.b = z;
        aoys aoys2 = (aoys) ((anxl) aoyv.build());
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (aoys2 != null) {
            asmw.c = aoys2;
            asmw.b = 99;
            ((acum) this.k.get()).a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }

    public final boolean f() {
        return ((AudioManager) this.b.getSystemService("audio")).getStreamVolume(3) <= 0;
    }

    public final int g() {
        int i = this.o;
        if (i != 0) {
            return i;
        }
        i = this.g.getInt("com.google.android.apps.youtube.app.watch.autocaptions.DefaultAutoCaptionsController.state_key", 1);
        this.o = i;
        return i;
    }

    public final void a(int i) {
        if (this.o != i) {
            this.o = i;
            this.g.edit().putInt("com.google.android.apps.youtube.app.watch.autocaptions.DefaultAutoCaptionsController.state_key", i).apply();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahke.class, ahkh.class, ahkn.class};
        } else if (i == 0) {
            a((ahke) obj);
            return null;
        } else if (i == 1) {
            a((ahkh) obj);
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
