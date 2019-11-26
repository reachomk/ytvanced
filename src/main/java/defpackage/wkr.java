package defpackage;

import android.content.Intent;

/* renamed from: wkr */
final class wkr implements wxe {
    public final /* synthetic */ wjv a;

    public final boolean a(int i, int i2, Intent intent) {
        boolean z = false;
        if (i == 1800 && i2 == -1) {
            String[] stringArrayExtra = intent.getStringArrayExtra("frontend_ids");
            if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
                this.a.ax = null;
            } else {
                this.a.ax = stringArrayExtra[0];
            }
            this.a.ac();
            wjv wjv = this.a;
            wmb wmb = new wmb(wjv.ax, wjv.ad, wjv.ak, wjv.ae);
            Object wku = new wku(this, wmb);
            z = true;
            if (this.a.ax != null) {
                amqw.a(wku);
                wmb.a = wku;
                wmb.e.a(wmb.f.c(), wmb.g);
                wmb.i = true;
                wmb.h = wmb.e.a(wmb.f.c());
                xan.a(wmb.h, wmb.d, wme.a, new wmd(wmb));
            }
        }
        return z;
    }

    /* synthetic */ wkr(wjv wjv) {
        this.a = wjv;
    }
}
