package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.mediarouter.app.MediaRouteButton;

/* renamed from: hcn */
final /* synthetic */ class hcn implements OnClickListener {
    private final hco a;

    hcn(hco hco) {
        this.a = hco;
    }

    public final void onClick(View view) {
        hco hco = this.a;
        ((MediaRouteButton) hco.a.get()).performClick();
        hco.b.b(hco.c.h);
    }
}
