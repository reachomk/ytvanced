package defpackage;

import android.support.v4.widget.NestedScrollView;

/* renamed from: spo */
final /* synthetic */ class spo implements adh {
    private final swf a;
    private final bapj b;

    spo(swf swf, bapj bapj) {
        this.a = swf;
        this.b = bapj;
    }

    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        swf swf = this.a;
        bapj bapj = this.b;
        azve azve = (azve) azvf.d.createBuilder();
        azve.a((float) i);
        azve.b((float) i2);
        spl.a(nestedScrollView, swf, bapj.c(), (azvf) ((anxl) azve.build()));
    }
}
