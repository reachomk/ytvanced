package defpackage;

import com.google.android.youtube.R;

/* renamed from: acop */
final class acop implements accg {
    private final /* synthetic */ acnc a;

    acop(acnc acnc) {
        this.a = acnc;
    }

    public final void a() {
        acnc acnc = this.a;
        if (acnc.bb) {
            CharSequence a = acnc.a((int) R.string.lc_error_battery_low);
            xpr.a(this.a.p(), a, 0);
            acnc acnc2 = this.a;
            acnc2.ad.a(1, acnc2.aT, a, false);
        }
    }

    public final void b() {
        acnc acnc = this.a;
        if (acnc.bb) {
            acnc.ad.a(acnc.aT);
        }
    }

    public final void c() {
        boolean z = this.a.bb;
    }
}
