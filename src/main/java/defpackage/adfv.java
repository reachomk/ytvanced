package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: adfv */
public final class adfv extends ban {
    public static final String i = xtl.b("MDX.mediaroute");
    public bcaa j;
    public bcaa k;
    public bcaa l;
    public bcaa m;
    public boolean n;
    public volatile boolean o = false;
    public boolean p = false;
    public int q;
    public final adfz r = new adfz(this);
    public final adfx s = new adfx(this);
    public final Handler t = new Handler(Looper.getMainLooper());
    private final Map u = new ConcurrentHashMap();

    public adfv(Context context) {
        super(context);
    }

    public final bay a(String str) {
        adis adis = (adis) this.u.get(str);
        return adis != null ? new adgd(this.m, adis, this.l, str) : null;
    }

    public final void b(bao bao) {
        new adfu(this).execute(new bao[]{bao});
    }

    public static String a(adis adis) {
        if (adis instanceof adil) {
            return adis.b();
        }
        if (!(adis instanceof adiq)) {
            return String.valueOf(adis.b().hashCode());
        }
        String str = "";
        return adis.b().replace("-", str).replace("uuid:", str);
    }

    public final bax a() {
        this.u.clear();
        bba bba = new bba();
        for (adis adis : ((adqc) this.j.get()).b()) {
            String bv_;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("MDX_MEDIA_ROUTE_CONTROL_CATEGORY");
            if (this.n) {
                bv_ = adis.bv_();
                if (this.n) {
                    StringBuilder stringBuilder = new StringBuilder();
                    if (adis instanceof adiq) {
                        stringBuilder.append("d");
                        if (((adiq) adis).n()) {
                            stringBuilder.append(",w");
                        }
                    } else if (adis instanceof adil) {
                        stringBuilder.append("ca");
                    } else if (adis instanceof adio) {
                        stringBuilder.append("cl");
                    }
                    if (stringBuilder.length() > 0) {
                        stringBuilder.insert(0, " <");
                        stringBuilder.append(">");
                    }
                    bv_ = bv_.concat(stringBuilder.toString());
                }
            } else {
                bv_ = adis.bv_();
            }
            bal bal = new bal(adfv.a(adis), bv_);
            bal.a(intentFilter);
            bal.b(1);
            bal.f(1);
            bal.a(true);
            bal.e(100);
            bal.a.putBundle("extras", adis.l());
            bal.c(1);
            adqe c = ((adqf) this.k.get()).c();
            if (c != null && adis.equals(c.h())) {
                bal.d(this.q);
                int d = c.d();
                if (d == 0) {
                    bal.a(1);
                } else if (d == 1) {
                    bal.a(2);
                }
            }
            bam a = bal.a();
            bba.a(a);
            this.u.put(a.a(), adis);
        }
        return bba.a();
    }

    public final void b() {
        adqc adqc = (adqc) this.j.get();
        String str = "MDX_MEDIA_ROUTE_CONTROL_CATEGORY";
        if (!this.o || this.p) {
            adqc.c(str);
        } else {
            adqc.d(str);
        }
    }
}
