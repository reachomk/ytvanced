package defpackage;

import android.widget.ImageView;

/* renamed from: vzp */
public final class vzp extends wag {
    public ImageView a;
    private boolean f;

    public vzp() {
        super(Boolean.valueOf(false));
    }

    public final void a(boolean z) {
        this.f = z;
        a(((Boolean) this.b).booleanValue(), this.d);
    }

    private final void a(boolean z, boolean z2) {
        ImageView imageView = this.a;
        if (imageView != null) {
            Object obj;
            int i = 0;
            if (z2 && z && !this.f) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }
}
