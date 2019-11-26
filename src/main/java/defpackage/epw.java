package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: epw */
final /* synthetic */ class epw implements akok {
    private final epx a;

    epw(epx epx) {
        this.a = epx;
    }

    public final boolean a(View view) {
        epx epx = this.a;
        akok akok = epx.c;
        if (akok == null || !akok.a(view)) {
            OnClickListener onClickListener = epx.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            epx.b();
            return false;
        }
        epx.b();
        return true;
    }
}
