package defpackage;

import android.support.design.snackbar.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jl */
public final class jl implements OnClickListener {
    private final /* synthetic */ OnClickListener a;
    private final /* synthetic */ Snackbar b;

    public jl(Snackbar snackbar, OnClickListener onClickListener) {
        this.b = snackbar;
        this.a = onClickListener;
    }

    public final void onClick(View view) {
        this.a.onClick(view);
        this.b.a(1);
    }
}
