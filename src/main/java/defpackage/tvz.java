package defpackage;

import android.os.Process;

/* renamed from: tvz */
final class tvz implements Runnable {
    private final /* synthetic */ bcbb a = null;
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ String d;
    private final /* synthetic */ tvy e;
    private final /* synthetic */ int f;

    public final void run() {
        tvp tvp = this.e.e;
        bcbb bcbb = null;
        if (tvp != null) {
            try {
                bcbb = tvp.a();
            } catch (RuntimeException unused) {
                tyv.e("MemoryMetricService", "Metric extension provider failed.", new Object[0]);
            }
        }
        tvy tvy = this.e;
        String str = this.b;
        int i = this.f;
        String str2 = this.d;
        bcfd bcfd = (bcfd) bcfe.x.createBuilder();
        bcfd.a(ucp.a(i, Process.myPid(), null, tvy.a, str2, tvy.g));
        tvy.a(str, false, (bcfe) ((anxl) bcfd.build()), bcbb);
    }

    tvz(tvy tvy, String str, int i, String str2) {
        this.e = tvy;
        this.b = str;
        this.f = i;
        this.c = false;
        this.d = str2;
    }
}
