package defpackage;

import com.google.android.youtube.R;

/* renamed from: acnt */
final /* synthetic */ class acnt implements acav {
    private final acnc a;
    private final boolean b;

    acnt(acnc acnc, boolean z) {
        this.a = acnc;
        this.b = z;
    }

    public final void a(int i) {
        nf nfVar = this.a;
        boolean z = this.b;
        if (aclo.a(nfVar)) {
            nfVar.al();
            aeg aeg = new aeg(nfVar.p(), R.style.f494Theme.AppCompat.Dialog);
            aeg.b(R.string.lc_confirm_ignore_bandwidth_warning);
            aeg.a(R.string.lc_low_bandwidth_continue, new acnl(nfVar, z));
            aeg.b(R.string.lc_low_bandwidth_abort, new acno(nfVar));
            aeg.a(false);
            aeg.b();
        }
    }
}
