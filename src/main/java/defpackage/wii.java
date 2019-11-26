package defpackage;

import android.view.ViewTreeObserver.OnScrollChangedListener;

/* renamed from: wii */
final /* synthetic */ class wii implements OnScrollChangedListener {
    private final wih a;
    private final aruh b;
    private final aqrn c;
    private final acvx d;

    wii(wih wih, aruh aruh, aqrn aqrn, acvx acvx) {
        this.a = wih;
        this.b = aruh;
        this.c = aqrn;
        this.d = acvx;
    }

    public final void onScrollChanged() {
        wih wih = this.a;
        aruh aruh = this.b;
        aqrn aqrn = this.c;
        acvx acvx = this.d;
        wix wix = new wix(wih);
        wev wev = wih.c;
        wev.a(aruh, wih.p, (anxl) aqrn.build(), acvx, wix);
    }
}
