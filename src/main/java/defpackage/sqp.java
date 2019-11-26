package defpackage;

import android.view.View;

/* renamed from: sqp */
final /* synthetic */ class sqp implements swu {
    private final sqq a;
    private final azsv b;
    private final swn c;

    sqp(sqq sqq, azsv azsv, swn swn) {
        this.a = sqq;
        this.b = azsv;
        this.c = swn;
    }

    public final void a(View view, syj syj) {
        sqq sqq = this.a;
        azsv azsv = this.b;
        swn swn = this.c;
        swf swf = sqq.b;
        anvf anvf = azsv.b;
        if (anvf == null) {
            anvf = azsr.a;
        }
        swf.a(anvf.toByteArray(), sqq.a(view, syj, swn)).a(sqq.c).c();
    }
}
