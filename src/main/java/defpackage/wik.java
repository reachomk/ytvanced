package defpackage;

import android.view.ViewTreeObserver.OnScrollChangedListener;

/* renamed from: wik */
final /* synthetic */ class wik implements OnScrollChangedListener {
    private final wih a;
    private final aruh b;
    private final auvn c;
    private final acvx d;

    wik(wih wih, aruh aruh, auvn auvn, acvx acvx) {
        this.a = wih;
        this.b = aruh;
        this.c = auvn;
        this.d = acvx;
    }

    public final void onScrollChanged() {
        wih wih = this.a;
        wih.c.a(this.b, wih.o, this.c, this.d, new wiv(wih));
    }
}
