package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fcn */
final /* synthetic */ class fcn implements OnClickListener {
    private final OnClickListener a;
    private final fbv b;

    fcn(OnClickListener onClickListener, fbv fbv) {
        this.a = onClickListener;
        this.b = fbv;
    }

    public final void onClick(View view) {
        OnClickListener onClickListener = this.a;
        fbv fbv = this.b;
        onClickListener.onClick(view);
        fbv.a(1);
    }
}
