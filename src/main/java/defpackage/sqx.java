package defpackage;

import android.view.View;

/* renamed from: sqx */
final class sqx implements swy {
    private final /* synthetic */ azsv a;
    private final /* synthetic */ swn b;
    private final /* synthetic */ sqq c;

    sqx(sqq sqq, azsv azsv, swn swn) {
        this.c = sqq;
        this.a = azsv;
        this.b = swn;
    }

    public final void a(View view) {
        swf swf = this.c.b;
        anvf anvf = this.a.d;
        if (anvf == null) {
            anvf = azsr.a;
        }
        swf.a(anvf.toByteArray(), this.c.a(view, null, this.b)).a(this.c.c).c();
    }

    public final void a(View view, View view2) {
        swf swf = this.c.b;
        anvf anvf = this.a.d;
        if (anvf == null) {
            anvf = azsr.a;
        }
        swf.a(anvf.toByteArray(), this.c.a(view, view2, null, this.b)).a(this.c.c).c();
    }
}
