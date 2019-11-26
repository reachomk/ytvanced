package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: adej */
public final class adej implements adgm, xcp {
    private static final String c = xtl.b("MDX.AutoCast");
    private static final long d = TimeUnit.SECONDS.toMillis(3);
    private static final long e = TimeUnit.HOURS.toMillis(12);
    private static final long f = TimeUnit.DAYS.toMillis(30);
    public final SharedPreferences a;
    public adem b = null;
    private final adqc g;
    private final adey h;
    private final adqf i;
    private final Handler j;
    private final xci k;
    private final xsc l;
    private final afpu m;

    public adej(adqc adqc, adey adey, adqf adqf, xci xci, SharedPreferences sharedPreferences, xsc xsc, afpu afpu) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.g = (adqc) amqw.a((Object) adqc);
        this.h = (adey) amqw.a((Object) adey);
        this.i = (adqf) amqw.a((Object) adqf);
        this.j = handler;
        this.k = (xci) amqw.a((Object) xci);
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.l = (xsc) amqw.a((Object) xsc);
        this.m = (afpu) amqw.a((Object) afpu);
        this.k.a((Object) this);
    }

    private final boolean b() {
        if (!this.m.g() && this.m.a()) {
            if (this.l.a() > this.a.getLong("MdxAutoCastCancelCoolDown", 0)) {
                xtl.c(c, "Auto casting not cooling down.");
                if (this.i.d() == 2) {
                    List a = this.h.a();
                    List a2 = this.g.a();
                    if (a.size() == 1 && a2.size() <= 1) {
                        bbs bbs = (bbs) a.get(0);
                        if (a2.size() == 1) {
                            adis adis = (adiq) a2.get(0);
                            if (adhn.c(bbs)) {
                                if (!adhn.a(bbs.c, adfv.a(adis))) {
                                    return false;
                                }
                            } else if (!adfs.c(bbs).equals(adfs.a((adiq) adis))) {
                                return false;
                            }
                        }
                        xtl.c(c, "Auto Casting.");
                        this.k.d(new adfa(bbs.d));
                        c();
                        this.b = new adem(this, bbs);
                        this.j.postDelayed(this.b, d);
                        return true;
                    }
                }
            }
            xtl.c(c, "Auto casting cooling down.");
            xtl.c(c, "Not auto Casting.");
        }
        return false;
    }

    private final void c() {
        adem adem = this.b;
        if (adem != null) {
            this.j.removeCallbacks(adem);
            this.b = null;
        }
    }

    public final boolean a(Context context) {
        return b();
    }

    public final boolean b(Context context) {
        return b();
    }

    public final acwc a() {
        return acwc.MEDIA_ROUTE_BUTTON_AUTO_CAST;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adex.class};
        } else if (i == 0) {
            long j;
            xtl.c(c, "Auto casting cancelled.");
            Editor edit = this.a.edit();
            String str = "MdxAutoCastCancelCount";
            int i2 = this.a.getInt(str, 0) + 1;
            long a = this.l.a();
            if (i2 == 3) {
                j = f;
            } else {
                j = e;
            }
            edit.putLong("MdxAutoCastCancelCoolDown", a + j);
            edit.putInt(str, i2 % 3);
            edit.apply();
            c();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
