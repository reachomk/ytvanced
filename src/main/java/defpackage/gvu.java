package defpackage;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gvu */
final class gvu implements OnClickListener {
    private final /* synthetic */ AlertDialog a;
    private final /* synthetic */ gvg b;

    gvu(gvg gvg, AlertDialog alertDialog) {
        this.b = gvg;
        this.a = alertDialog;
    }

    public final void onClick(View view) {
        this.b.a(this.a);
    }
}
