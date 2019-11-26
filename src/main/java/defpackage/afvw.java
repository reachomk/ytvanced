package defpackage;

import java.util.Locale;

/* renamed from: afvw */
final /* synthetic */ class afvw implements rye {
    private final afvt a;
    private final long b;
    private final afwc c;

    afvw(afvt afvt, long j, afwc afwc) {
        this.a = afvt;
        this.b = j;
        this.c = afwc;
    }

    public final void a(ryi ryi) {
        afvt afvt = this.a;
        long j = this.b;
        afwc afwc = this.c;
        if (ryi.b()) {
            afvt.b.a(afvt.a.b() - j);
            return;
        }
        afvt.b.a(String.format(Locale.US, "FCM %s fail", new Object[]{afwc.name()}));
    }
}
