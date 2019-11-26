package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import com.google.android.youtube.R;

/* renamed from: lnr */
public final class lnr implements loe {
    public final float a;
    public final ValueAnimator b;
    public float c;
    public boolean d;
    private final zl e = new zl();
    private final loc f;
    private final elh g;
    private final lob h;

    public lnr(Activity activity, loc loc, elh elh, lob lob) {
        int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R.dimen.swipey_ad_max_parallax_scroll_distance);
        this.f = loc;
        this.g = elh;
        this.h = lob;
        lob.a((loe) this);
        this.a = (float) dimensionPixelOffset;
        this.b = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.b.addUpdateListener(new lnt(this, activity));
        this.b.addListener(new lnu(this, loc));
    }

    public final void a(eln eln) {
        this.e.add(eln);
    }

    public final void a(int i) {
        if (!this.d && i >= 0) {
            int i2 = this.h.a;
            if (i2 == 2 || i2 == 1 || i == 0) {
                a(-i, 1.0f);
                float a = th.a(Math.abs(((float) i) / this.a));
                if (Math.abs(this.c - a) >= 0.01f) {
                    this.c = a;
                    wae wae = this.f.a;
                    if (wae != null) {
                        wae.a(a);
                    }
                }
            }
        }
    }

    public final void a(int i, float f) {
        ((elf) this.g.get()).j().i.setTranslationX((float) i);
        int i2 = 0;
        while (true) {
            zl zlVar = this.e;
            if (i2 < zlVar.b) {
                ((eln) zlVar.a(i2)).a(i, f);
                i2++;
            } else {
                return;
            }
        }
    }

    public final void a(boolean z) {
        if (!z && this.d) {
            a(0, 1.0f);
            this.d = false;
        }
    }
}
