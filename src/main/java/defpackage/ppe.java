package defpackage;

/* renamed from: ppe */
final class ppe implements Runnable {
    private final /* synthetic */ ppa a;
    private final /* synthetic */ ppi b;

    ppe(ppa ppa, ppi ppi) {
        this.a = ppa;
        this.b = ppi;
    }

    public final void run() {
        boolean z;
        ppa ppa = this.a;
        ppi ppi = this.b;
        pjb pjb = ppi.d;
        if (!ppj.a(pjb, ppa.b)) {
            ppa.b = pjb;
            ppa.d.a(ppa.b);
        }
        double d = ppi.a;
        if (Double.isNaN(d) || Math.abs(d - ppa.j) <= 1.0E-7d) {
            z = false;
        } else {
            ppa.j = d;
            z = true;
        }
        boolean z2 = ppi.b;
        if (z2 != ppa.g) {
            ppa.g = z2;
            z = true;
        }
        ppa.a.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(ppa.i));
        pjk pjk = ppa.d;
        if (pjk != null && (z || ppa.i)) {
            pjk.b();
        }
        int i = ppi.c;
        if (i != ppa.l) {
            ppa.l = i;
            z = true;
        } else {
            z = false;
        }
        ppa.a.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(ppa.i));
        pjk = ppa.d;
        if (pjk != null && (z || ppa.i)) {
            pjk.b(ppa.l);
        }
        i = ppi.e;
        if (i != ppa.m) {
            ppa.m = i;
            z = true;
        } else {
            z = false;
        }
        ppa.a.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(ppa.i));
        pjk = ppa.d;
        if (pjk != null && (z || ppa.i)) {
            pjk.c(ppa.m);
        }
        if (!ppj.a(ppa.k, ppi.f)) {
            ppa.k = ppi.f;
        }
        pjk pjk2 = ppa.d;
        ppa.i = false;
    }
}
