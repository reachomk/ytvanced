package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ados */
public final class ados {
    public final adpc a;
    public adoj b;
    public final Set c;
    private final Context d;
    private final Handler e;
    private final Set f;
    private final Set g;
    private final adou h;
    private final Set i;
    private final adfq j;
    private final adqf k;
    private int l = 0;

    public ados(Context context, SharedPreferences sharedPreferences, adpc adpc, int i, Set set, Set set2, adfq adfq, adqf adqf, xsc xsc) {
        this.d = context;
        this.e = new Handler(Looper.getMainLooper());
        this.a = adpc;
        this.j = adfq;
        this.k = adqf;
        amqw.a((Object) set);
        amqw.a((Object) set2);
        this.f = ador.a(set);
        this.g = ador.b(set2);
        this.i = new HashSet();
        amqw.a((Object) sharedPreferences);
        this.h = new adou(sharedPreferences, this.f, i, xsc);
        this.c = new HashSet();
    }

    public final void a(adoi adoi) {
        this.i.add(adoi);
    }

    public final void a() {
        this.i.clear();
    }

    public final synchronized void b() {
        if (this.l == 0) {
            this.b = new adoj(this.e, this.h, this.f, this.g, this.i, this.j, this.k, this.a.l.c());
            for (adoh a : this.c) {
                this.b.a(a);
            }
        }
        this.l++;
    }

    public final synchronized void c() {
        int i = this.l - 1;
        this.l = i;
        if (i == 0) {
            adoj adoj = this.b;
            synchronized (adoj.k) {
                adoi adoi = adoj.j;
                if (adoi != null) {
                    adoi.d();
                    adoj.j = null;
                }
            }
            adoj.a();
            adoj.h.b();
            this.b = null;
        }
    }
}
