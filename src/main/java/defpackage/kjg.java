package defpackage;

import android.util.DisplayMetrics;
import com.google.android.youtube.R;

/* renamed from: kjg */
final /* synthetic */ class kjg implements akoq {
    private final kjf a;
    private final awyk b;
    private final boolean c;

    kjg(kjf kjf, awyk awyk, boolean z) {
        this.a = kjf;
        this.b = awyk;
        this.c = z;
    }

    public final void a(akor akor, aknh aknh, int i) {
        int i2;
        kjf kjf = this.a;
        awyk awyk = this.b;
        boolean z = this.c;
        int size = awyk.d.size();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        kjf.b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i3 = displayMetrics.widthPixels;
        int dimensionPixelSize = kjf.a.getResources().getDimensionPixelSize(R.dimen.reel_multiple_item_padding_start_end);
        dimensionPixelSize = i3 - (dimensionPixelSize + dimensionPixelSize);
        if (z) {
            float f;
            awym awym;
            if ((awyk.a & 4) == 0) {
                f = 0.0f;
            } else if (kjf.b.getResources().getConfiguration().orientation != 1) {
                awym = awyk.e;
                if (awym == null) {
                    awym = awym.f;
                }
                f = awym.c;
            } else {
                awym = awyk.e;
                if (awym == null) {
                    awym = awym.f;
                }
                f = awym.b;
            }
            if (f == 0.0f) {
                f = kjf.a.getResources().getFraction(R.fraction.reel_portrait_item_width_to_screen_ratio, 1, 1);
            }
            size = (int) (((float) i3) * f);
        } else if (size > 4) {
            double d = (double) i3;
            Double.isNaN(d);
            size = (int) (d * 0.22d);
        } else {
            size = dimensionPixelSize / size;
        }
        akor.a("width", Integer.valueOf(size));
        if (z && (awyk.a & 4) != 0) {
            float f2 = kjf.b.getResources().getDisplayMetrics().density;
            awym awym2 = awyk.e;
            if (awym2 == null) {
                awym2 = awym.f;
            }
            i3 = (int) (awym2.e * f2);
        } else {
            i3 = 0;
        }
        if (i3 <= 0) {
            i3 = 0;
        }
        akor.a("margin", Integer.valueOf(i3));
        if (z && (awyk.a & 4) != 0) {
            float f3 = kjf.b.getResources().getDisplayMetrics().density;
            awym awym3 = awyk.e;
            if (awym3 == null) {
                awym3 = awym.f;
            }
            i2 = (int) (awym3.d * f3);
        } else {
            i2 = 0;
        }
        if (i2 <= 0) {
            i2 = 0;
        }
        akor.a("avatar_size", Integer.valueOf(i2));
    }
}
