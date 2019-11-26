package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

/* renamed from: ija */
final class ija implements iin {
    public ImageView a;
    public boolean b;
    public OnClickListener c;

    private ija() {
    }

    public final int a() {
        return 0;
    }

    public final acwc b() {
        return acwc.FULLSCREEN_ENGAGEMENT_EXPLICIT_CLOSE_BUTTON;
    }

    public final void a(boolean z) {
        this.b = z;
        View view = this.a;
        if (view != null) {
            xpr.a(view, z);
        }
    }

    public final void a(OnClickListener onClickListener) {
        this.c = onClickListener;
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    /* synthetic */ ija(byte b) {
    }
}
