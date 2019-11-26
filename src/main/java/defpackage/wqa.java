package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;

/* renamed from: wqa */
final class wqa implements afsw {
    private final acum a;
    private final xoi b;
    private final wqq c;
    private final wqt d;
    private final bcaa e;
    private final acvx f;
    private final Activity g;
    private final wox h;
    private final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint i;
    private final asmw j;

    wqa(acum acum, xoi xoi, wqq wqq, bcaa bcaa, acvx acvx, Activity activity, wox wox, YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, wqt wqt) {
        asmw asmw;
        this.a = acum;
        this.b = xoi;
        this.c = wqq;
        this.e = bcaa;
        this.f = acvx;
        this.g = activity;
        this.h = wox;
        this.i = ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
        this.d = wqt;
        if (ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.c.c()) {
            asmw = null;
        } else {
            wpp wpp = new wpp();
            wpp.a(ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.c.d());
            wpp.a = 3;
            asmw = wpp.d();
        }
        this.j = asmw;
    }

    private final void a() {
        asmw asmw = this.j;
        if (asmw != null) {
            this.a.a(asmw);
        }
    }

    public final void a(bqn bqn) {
        this.h.dismiss();
        a();
        xoi xoi = this.b;
        xoi.a(xoi.a((Throwable) bqn));
    }
}
