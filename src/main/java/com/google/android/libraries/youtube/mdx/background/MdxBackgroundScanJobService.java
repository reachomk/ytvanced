package com.google.android.libraries.youtube.mdx.background;

import android.os.Handler;
import android.os.Looper;
import defpackage.aczl;
import defpackage.aczm;
import defpackage.aczz;
import defpackage.adaa;
import defpackage.adac;
import defpackage.adad;
import defpackage.adaf;
import defpackage.adfq;
import defpackage.adgw;
import defpackage.amqw;
import defpackage.amuw;
import defpackage.amxn;
import defpackage.amxo;
import defpackage.deq;
import defpackage.der;
import defpackage.xhv;
import defpackage.xse;
import defpackage.xtl;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MdxBackgroundScanJobService extends deq {
    public adgw d;
    public adfq e;
    public aczz f;
    public xhv g;
    public boolean h;
    public adac i;
    public aczm j;
    public der k;
    private Handler l;
    private final Runnable m = new adad(this);

    public final void onCreate() {
        this.l = new Handler(Looper.getMainLooper());
        ((adaf) xse.a(getApplication())).a(this);
        this.j = aczl.a(this);
    }

    public final boolean a(der der) {
        amuw b = b();
        if (b.isEmpty()) {
            return false;
        }
        long toMillis;
        this.k = der;
        String str = "mdx_fallback_background_scanner";
        this.j.a(getClass(), str, a(b).c(), 1);
        amqw.b(b.isEmpty() ^ 1);
        this.i = a(b);
        if (this.g.e()) {
            toMillis = TimeUnit.SECONDS.toMillis((long) this.i.b());
            String.format(Locale.US, "scanning for %d ms", new Object[]{Long.valueOf(toMillis)});
            if (this.h) {
                this.d.a((Object) this);
            } else {
                this.d.b((Object) this);
            }
        } else {
            toMillis = 0;
        }
        this.l.postDelayed(this.m, toMillis);
        return true;
    }

    public final boolean a() {
        this.l.removeCallbacks(this.m);
        this.d.c(this);
        return true;
    }

    public final amuw b() {
        Collection hashSet = new HashSet();
        amxn amxn = (amxn) this.f.a().e().listIterator();
        while (amxn.hasNext()) {
            adaa adaa = (adaa) amxn.next();
            if (adaa.c().a()) {
                hashSet.add(adaa);
            }
        }
        return amuw.a(hashSet);
    }

    private static adac a(amuw amuw) {
        amqw.b(amuw.isEmpty() ^ 1);
        amxo amxo = (amxo) amuw.iterator();
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        while (amxo.hasNext()) {
            adaa adaa = (adaa) amxo.next();
            String.format(Locale.US, "client %s: enabled=%b scan_duration=%d scan_period=%d scan_period_no_devices=%d", new Object[]{adaa.b(), Boolean.valueOf(adaa.c().a()), Integer.valueOf(adaa.c().b()), Integer.valueOf(adaa.c().d()), Integer.valueOf(adaa.c().c())});
            i = Math.max(i, adaa.c().b());
            i3 = Math.min(i3, adaa.c().c());
            i2 = Math.min(i2, adaa.c().d());
        }
        return adac.e().a(i).c(i2).b(i3).a();
    }

    static {
        xtl.b("MDX.BackgroundScannerJobService");
    }
}
