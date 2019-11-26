package defpackage;

import android.view.View;

/* renamed from: sqr */
final /* synthetic */ class sqr implements swy {
    private final sqq a;
    private final azsv b;
    private final swn c;

    sqr(sqq sqq, azsv azsv, swn swn) {
        this.a = sqq;
        this.b = azsv;
        this.c = swn;
    }

    public final void a(View view) {
        sqq sqq = this.a;
        azsv azsv = this.b;
        swn swn = this.c;
        if (!sqq.a.containsKey(azsv)) {
            sqq.a.put(azsv, Boolean.valueOf(true));
            swf swf = sqq.b;
            anvf anvf = azsv.e;
            if (anvf == null) {
                anvf = azsr.a;
            }
            swf.a(anvf.toByteArray(), sqq.a(view, null, swn)).a(sqq.c).c();
        }
    }

    public final void a(View view, View view2) {
        swx.a(this, view);
    }
}
