package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.google.android.youtube.R;

/* renamed from: lii */
public final class lii implements OnLayoutChangeListener, lrm {
    private static final lix a = new lid(3, 2.4f);
    private final View b;
    private final lij c;
    private final int d;
    private boolean e;

    public lii(View view, lij lij) {
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.flexy_minimum_metadata_view_height);
        this.b = view;
        this.d = dimensionPixelOffset;
        this.c = lij;
    }

    public final void a(int i, int i2) {
        boolean b = lrh.b(i);
        boolean b2 = lrh.b(i2);
        if (b != b2) {
            if (b2) {
                this.b.addOnLayoutChangeListener(this);
                b(this.b.getWidth(), this.b.getHeight());
                return;
            }
            this.b.removeOnLayoutChangeListener(this);
            this.c.a(3);
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        b(i3 - i, i4 - i2);
    }

    private final void b(int i, int i2) {
        boolean z = i2 < Math.round(((float) i) / 1.777f) + this.d;
        if (this.e != z) {
            if (z) {
                this.c.a(a);
            } else if (this.c.a(3) != null) {
                this.c.a(0, false);
            }
            this.e = z;
        }
    }
}
