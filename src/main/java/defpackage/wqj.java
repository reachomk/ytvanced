package defpackage;

import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;

/* renamed from: wqj */
final class wqj implements afsw {
    private final xoi a;
    private final wqg b;
    private final YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint c;
    private final acum d;
    private final aaas e;

    wqj(xoi xoi, acum acum, aaas aaas, wqg wqg, YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint) {
        this.a = xoi;
        this.b = wqg;
        this.e = aaas;
        this.c = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
        this.d = acum;
    }

    public final void a(bqn bqn) {
        xoi xoi = this.a;
        xoi.a(xoi.a((Throwable) bqn));
        wqg wqg = this.b;
        if (wqg != null) {
            wqg.a(bqn);
        }
        a(false);
    }

    private final void a(boolean z) {
        byte[] d = this.c.d.d();
        if (bchf.a(d)) {
            asmw c;
            wpp wpp = new wpp();
            wpp.a(d);
            acum acum = this.d;
            if (z) {
                c = wpp.c();
            } else {
                wpp.a = 4;
                c = wpp.d();
            }
            acum.a(c);
        }
    }
}
