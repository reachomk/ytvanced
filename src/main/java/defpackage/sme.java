package defpackage;

import java.util.concurrent.Callable;

/* renamed from: sme */
final /* synthetic */ class sme implements Callable {
    private final syc a;
    private final syg b;
    private final bdgm c;
    private final bdho d;

    sme(syc syc, syg syg, bdgm bdgm, bdho bdho) {
        this.a = syc;
        this.b = syg;
        this.c = bdgm;
        this.d = bdho;
    }

    public final Object call() {
        syc syc = this.a;
        syg syg = this.b;
        bdgm bdgm = this.c;
        bdho bdho = this.d;
        syc.c();
        syf a = syg.a(bdgm.b, bdho);
        syc.d();
        return a;
    }
}
