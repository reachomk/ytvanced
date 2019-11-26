package defpackage;

import android.view.View.OnClickListener;
import android.widget.ImageView;

/* renamed from: ifb */
public final class ifb implements iin {
    public ImageView a;
    public ifd b;
    public boolean c;
    public OnClickListener d;

    ifb() {
    }

    public final int a() {
        return 1;
    }

    public final acwc b() {
        return acwc.FULLSCREEN_ENGAGEMENT_EXPLICIT_ENTRYPOINT;
    }

    public final void a(boolean z) {
        this.c = z;
        ifd ifd = this.b;
        if (ifd != null && ifd.m != z) {
            ifd.m = z;
            ifd.a();
        }
    }

    public final void a(OnClickListener onClickListener) {
        this.d = onClickListener;
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }
}
