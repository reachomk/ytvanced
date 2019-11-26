package defpackage;

import android.view.View;

/* renamed from: squ */
final /* synthetic */ class squ implements sws {
    private final sqq a;
    private final azsv b;
    private final swn c;

    squ(sqq sqq, azsv azsv, swn swn) {
        this.a = sqq;
        this.b = azsv;
        this.c = swn;
    }

    public final void a(View view) {
        sqq sqq = this.a;
        azsv azsv = this.b;
        swn swn = this.c;
        swf swf = sqq.b;
        anvf anvf = azsv.f;
        if (anvf == null) {
            anvf = azsr.a;
        }
        swf.a(anvf.toByteArray(), sqq.a(view, null, swn)).a(sqq.c).c();
    }
}
