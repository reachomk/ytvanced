package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: ou */
final class ou implements Runnable {
    private final /* synthetic */ nf a;
    private final /* synthetic */ nf b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ zj d;
    private final /* synthetic */ View e;
    private final /* synthetic */ Rect f;

    ou(nf nfVar, nf nfVar2, boolean z, zj zjVar, View view, Rect rect) {
        this.a = nfVar;
        this.b = nfVar2;
        this.c = z;
        this.d = zjVar;
        this.e = view;
        this.f = rect;
    }

    public final void run() {
        ot.a(this.a, this.b, this.c, this.d);
        View view = this.e;
        if (view != null) {
            pc.a(view, this.f);
        }
    }
}
