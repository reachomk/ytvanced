package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: mmv */
public final class mmv {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final mmy b;
    public final abjm c;
    public final akkq d;
    public mmx e;
    private final xhv f;

    public mmv(mmy mmy, abjm abjm, akkq akkq, xhv xhv) {
        this.b = (mmy) amqw.a((Object) mmy);
        this.c = abjm;
        this.d = akkq;
        this.f = xhv;
    }

    public final void a() {
        mmx mmx = this.e;
        if (mmx != null) {
            mmx.a();
        }
        this.e = null;
    }

    public final boolean b() {
        mmx mmx = this.e;
        return mmx != null && mmx.b();
    }

    public final boolean c() {
        mmx mmx = this.e;
        return mmx != null && mmx.c();
    }

    public final void d() {
        a(!this.f.c() ? 2 : 1);
    }

    public static aygk a(atjy atjy) {
        atju atju = atjy.c;
        if (atju == null) {
            atju = atju.c;
        }
        if (atju.a != 87079103) {
            return null;
        }
        atkc atkc;
        atju atju2 = atjy.c;
        if (atju2 == null) {
            atju2 = atju.c;
        }
        if (atju2.a == 87079103) {
            atkc = (atkc) atju2.b;
        } else {
            atkc = atkc.d;
        }
        aygk aygk = atkc.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        return aygk;
    }

    public final void a(int i) {
        a();
        mmy mmy = this.b;
        String str = i != 1 ? i != 2 ? "UNKNOWN" : "INTERNAL_ERROR" : "NETWORK_ERROR";
        mmy.a(str, c(), b());
    }
}
