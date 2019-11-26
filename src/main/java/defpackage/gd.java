package defpackage;

import android.graphics.drawable.Drawable;
import android.support.design.floatingactionbutton.FloatingActionButton;

/* renamed from: gd */
public final class gd implements hq {
    private final /* synthetic */ FloatingActionButton a;

    public gd(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.a.c.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = this.a;
        int i5 = floatingActionButton.a;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public final boolean a() {
        return this.a.b;
    }
}
