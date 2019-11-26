package defpackage;

import android.view.View;

/* renamed from: akdc */
public final class akdc implements tai {
    private final akei a;
    private final acvx b;
    private final akhr c;
    private final cmg d;
    private final cwj e = new cwj(this.d);

    public akdc(akei akei, acvx acvx, akhr akhr, View view) {
        this.a = akei;
        this.b = acvx;
        this.c = akhr;
        this.d = new cmg(view.getContext());
    }

    public final /* synthetic */ taf a(Object obj) {
        return new akcz(this.a, this.b, this.c, this.d, this.e, (akda) obj);
    }
}
