package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity;

/* renamed from: lch */
public final class lch extends ekk implements ahxl, ajan, xcp {
    private final Context a;
    private final xci b;
    private final SharedPreferences c;
    private final bcaa d;
    private final ahxc e;
    private final ajam f;
    private final zyw g;
    private final bdfu h = new bdfu();
    private volatile boolean i;
    private boolean j;

    public lch(Context context, xci xci, SharedPreferences sharedPreferences, elm elm, bcaa bcaa, ahxc ahxc, ajam ajam, zyw zyw) {
        super(elm);
        this.a = (Context) amqw.a((Object) context);
        this.b = (xci) amqw.a((Object) xci);
        this.c = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.d = (bcaa) amqw.a((Object) bcaa);
        this.e = (ahxc) amqw.a((Object) ahxc);
        this.f = ajam;
        this.g = zyw;
    }

    public final long e() {
        return 1;
    }

    public final void A_() {
        if (foh.w(this.g)) {
            this.h.a(a(this.f));
        } else {
            this.b.a((Object) this);
        }
        this.e.h = this;
        if (this.j && !this.c.getBoolean("com.google.android.libraries.youtube.player.pref.vr_mode_first_time_use", true)) {
            this.j = false;
            ((aizy) this.d.get()).a();
            this.e.c();
        }
    }

    public final void ar_() {
        this.h.a();
        if (!foh.w(this.g)) {
            this.b.b(this);
        }
        this.e.h = null;
    }

    public final boolean c() {
        if (!this.i || !this.c.getBoolean("com.google.android.libraries.youtube.player.pref.vr_mode_first_time_use", true)) {
            return false;
        }
        ((aizy) this.d.get()).b();
        this.j = true;
        Context context = this.a;
        context.startActivity(new Intent(context, VrWelcomeActivity.class));
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        if (ahkn.a == airi.VIDEO_PLAYING) {
            aakj aakj = ahkn.b;
            if (aakj != null) {
                aajj n = aakj.n();
                if (n != null) {
                    this.i = n.aB();
                }
            }
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.g, 128)).a(new lcg(this), lcj.a)};
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
