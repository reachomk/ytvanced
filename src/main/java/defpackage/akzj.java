package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: akzj */
final /* synthetic */ class akzj implements OnPreDrawListener {
    private final akzg a;
    private final RecyclerView b;

    akzj(akzg akzg, RecyclerView recyclerView) {
        this.a = akzg;
        this.b = recyclerView;
    }

    public final boolean onPreDraw() {
        this.a.c(this.b);
        return true;
    }
}
