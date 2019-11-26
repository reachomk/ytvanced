package defpackage;

import java.util.concurrent.Callable;

/* renamed from: smo */
final /* synthetic */ class smo implements Callable {
    private final syc a;
    private final syi b;
    private final byte[] c;
    private final bapc d;

    smo(syc syc, syi syi, byte[] bArr, bapc bapc) {
        this.a = syc;
        this.b = syi;
        this.c = bArr;
        this.d = bapc;
    }

    public final Object call() {
        syc syc = this.a;
        syi syi = this.b;
        byte[] bArr = this.c;
        bapc bapc = this.d;
        syc.c();
        syh a = syi.a(bArr, bapc);
        syc.d();
        return a;
    }
}
