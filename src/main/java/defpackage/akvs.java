package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: akvs */
final class akvs implements OnGlobalLayoutListener {
    public final /* synthetic */ akvt a;
    private final /* synthetic */ View b;
    private final /* synthetic */ auvn c;
    private final /* synthetic */ View d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ acvx f;

    akvs(akvt akvt, View view, auvn auvn, View view2, Object obj, acvx acvx) {
        this.a = akvt;
        this.b = view;
        this.c = auvn;
        this.d = view2;
        this.e = obj;
        this.f = acvx;
    }

    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.post(new akvv(this, this.c, this.d, this.e, this.f));
    }
}
