package defpackage;

import java.util.Map;

/* renamed from: juo */
final /* synthetic */ class juo implements Runnable {
    private final acvx a;
    private final apxu b;
    private final aaas c;
    private final Map d;

    juo(acvx acvx, apxu apxu, aaas aaas, Map map) {
        this.a = acvx;
        this.b = apxu;
        this.c = aaas;
        this.d = map;
    }

    public final void run() {
        acvx acvx = this.a;
        apxu apxu = this.b;
        this.c.a(acvx.a(apxu), this.d);
    }
}
