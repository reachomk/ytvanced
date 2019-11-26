package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: aejy */
public final class aejy implements Callable, nwp {
    public final aekb a;
    public aaiz b;
    private final afhg c;
    private final aajj d;
    private final aeke e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private int g;

    public aejy(afhg afhg, aajj aajj, aeke aeke, aekb aekb) {
        this.c = afhg;
        this.d = aajj;
        this.e = aeke;
        this.a = aekb;
    }

    /* renamed from: b */
    public final aaiz call() {
        int i;
        xak.b();
        afiw afiw = new afiw(this.c.a());
        aekh aekh = new aekh(this.e.a);
        xvo a = xvo.a(this.e.c);
        if (!TextUtils.isEmpty(this.e.b)) {
            a.b("cpn", this.e.b);
        }
        awdg awdg = this.d.c;
        int i2 = 0;
        if ((awdg.a & 8192) != 0) {
            aosb aosb = awdg.i;
            if (aosb == null) {
                aosb = aosb.n;
            }
            i = aosb.h;
        } else {
            i = 0;
        }
        if (i == 0) {
            i = 5;
        }
        String uri = a.a("mpd_version", i).a().toString();
        awdg = this.d.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i2 = arhh.ba;
        }
        if (i2 == 0) {
            i2 = 3;
        }
        this.b = new aaiz(uri, afiw, aekh, i2);
        aekc aekc = new aekc(this, "mediaDash");
        aekc.start();
        try {
            aekc.join();
        } catch (InterruptedException e) {
            if (this.a != null) {
                this.f.post(new aejx(this, e));
            }
        }
        return this.b;
    }

    public final void c() {
        aaiz aaiz = this.b;
        nwu nwu = new nwu(aaiz, new nwe(aaiz.d, aaiz.b, aaiz.a), Looper.myLooper(), this);
        nwu.d = SystemClock.elapsedRealtime();
        nwu.c.a(nwu.b, nwu.a, nwu);
    }

    public final void a(IOException iOException) {
        xak.b();
        int i = this.g + 1;
        this.g = i;
        if (i < 2) {
            try {
                Thread.sleep(2500);
                c();
            } catch (InterruptedException unused) {
            }
            return;
        }
        if (this.a != null) {
            this.f.post(new aejz(this, iOException));
        }
        aejy.d();
    }

    private static void d() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    public final /* synthetic */ void a() {
        xak.b();
        if (this.a != null) {
            this.f.post(new aeka(this));
        }
        aejy.d();
    }
}
