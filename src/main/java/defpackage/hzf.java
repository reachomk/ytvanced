package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hzf */
public final class hzf implements iin {
    public View a;
    public OnClickListener b;
    public boolean c;

    public final int a() {
        return 1;
    }

    public final acwc b() {
        return acwc.FULLSCREEN_ENGAGEMENT_TAP_ENTRYPOINT;
    }

    public final void a(boolean z) {
        this.c = z;
        View view = this.a;
        if (view != null) {
            xpr.a(view, z);
        }
    }

    public final void a(OnClickListener onClickListener) {
        this.b = onClickListener;
        View view = this.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }
}
