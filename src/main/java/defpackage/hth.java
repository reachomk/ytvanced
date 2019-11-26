package defpackage;

import android.content.IntentFilter;

/* renamed from: hth */
public final class hth implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ htf b;

    public hth(htf htf, String str) {
        this.b = htf;
        this.a = str;
    }

    public final void run() {
        this.b.a.registerReceiver(new htk(this), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
    }
}
