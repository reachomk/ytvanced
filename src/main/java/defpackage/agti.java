package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: agti */
public final class agti extends ajps {
    private final agtm a;
    private final agtf b;
    private final zyw c;
    private agtj d;
    private agtg e;
    private String f;
    private long g;

    public agti(agtm agtm, agtf agtf, zyw zyw) {
        this.a = agtm;
        this.b = agtf;
        this.c = zyw;
    }

    public final Parcelable d() {
        return new agth(this.f);
    }

    public final void a(Parcelable parcelable, ajpr ajpr) {
        amqw.a(parcelable instanceof agth);
        if (!ajpr.a) {
            this.f = ((agth) parcelable).a;
        }
    }

    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        if (airi == airi.VIDEO_REQUESTED || airi == airi.VIDEO_PLAYING) {
            String b = ahkn.b.b();
            String str = this.f;
            if (str == null || !str.equals(b)) {
                this.f = b;
                agtm agtm = this.a;
                this.d = new agtj(agtm.a, (xsc) agtm.a((xsc) agtm.b.get(), 2), (String) agtm.a(this.f, 3));
                agtf agtf = this.b;
                this.e = new agtg((agvs) agtf.a((agvs) agtf.a.get(), 1), agtf.b, (String) agtf.a(this.f, 3));
            }
        }
    }

    public final void a(ahkm ahkm) {
        agtj agtj = this.d;
        if (agtj != null && ahkm.g) {
            if (!TextUtils.isEmpty(agtj.c)) {
                agvz b = agtj.a.b();
                if (agtj.a.e() && b.k().a(agtj.c) != null) {
                    long a = agtj.b.a();
                    String.valueOf(agtj.c).length();
                    b.k().a(agtj.c, a);
                }
            }
            this.d = null;
        }
        if (ahda.c(this.c) && ahkm.g) {
            this.g = ahkm.a;
        }
    }

    public final void c() {
        if (ahda.c(this.c)) {
            agtg agtg = this.e;
            if (agtg != null) {
                if (this.g >= 0) {
                    long toSeconds = TimeUnit.MILLISECONDS.toSeconds(this.g);
                    if (!TextUtils.isEmpty(agtg.c)) {
                        agwc agwc = (agwc) agtg.b.get();
                        agvz b = agwc.b();
                        String c = agwc.c();
                        if (!(!agwc.e() || agtg.a.e(c) || b.k().a(agtg.c) == null)) {
                            b.k().b(agtg.c, toSeconds);
                        }
                    }
                }
                this.g = -1;
            }
        }
    }
}
