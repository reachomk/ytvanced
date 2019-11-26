package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: vzq */
public class vzq {
    private final Drawable a;
    private final float b;
    public final View d;
    public aohb e = null;
    public boolean f;

    public vzq(View view, Drawable drawable, float f) {
        this.d = (View) amqw.a((Object) view);
        this.a = drawable;
        this.b = f;
    }

    public void b() {
        aogz aogz;
        float f;
        aohb aohb = this.e;
        int i = 1;
        aohd aohd = null;
        if (aohb == null || (aohb.a & 1) == 0) {
            aogz = null;
        } else {
            aogz = aohb.b;
            if (aogz == null) {
                aogz = aogz.c;
            }
        }
        Drawable background = this.d.getBackground();
        if (aogz == null) {
            this.d.setBackground(this.a);
        } else if (!(background != null && (background instanceof ColorDrawable) && aogz.b == ((ColorDrawable) background).getColor())) {
            this.d.setBackground(new ColorDrawable(aogz.b));
        }
        aohb = this.e;
        if (!(aohb == null || (aohb.a & 2) == 0)) {
            aohd = aohb.c;
            if (aohd == null) {
                aohd = aohd.c;
            }
        }
        if (aohd != null) {
            f = aohd.b;
        } else {
            f = this.b;
        }
        if (f != this.d.getAlpha()) {
            this.d.setAlpha(f);
        }
        aohb = this.e;
        int i2 = 0;
        int i3 = ((aohb != null && aohb.d) || this.f) ? 1 : 0;
        if (this.d.getVisibility() != 8) {
            i = 0;
        }
        if (i != i3) {
            View view = this.d;
            if (i3 != 0) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }
}
