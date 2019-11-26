package defpackage;

import android.os.Bundle;

/* renamed from: pdb */
final class pdb implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ pcz b;

    pdb(pcz pcz, Bundle bundle) {
        this.b = pcz;
        this.a = bundle;
    }

    public final void run() {
        pda pda = this.b.a;
        pcy pcy = new pcy(this.a.getString("ad_id"), this.a.getBoolean("lat_enabled"));
        pda.a();
    }
}
