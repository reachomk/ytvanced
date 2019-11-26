package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: fem */
public final class fem {
    public final Drawable a;
    public final int b;
    public final Drawable c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public boolean h;
    public final int i;
    public final int j;

    public fem(fej fej, aptl aptl, boolean z, int i) {
        boolean z2 = !z && aptl.b == 6;
        this.g = z2;
        this.f = z;
        fej.setLayoutParams(new LayoutParams(-2, -2));
        fej.setOrientation(0);
        fej.setMinimumHeight(fej.h);
        fej.setMinimumWidth(0);
        this.h = true;
        fej.setClickable(true);
        if (z) {
            this.a = xwe.d(fej.getContext(), R.attr.ytCloudChipCheckboxBackground);
            this.b = i;
            this.c = xwe.d(fej.getContext(), R.attr.ytCloudChipCheckboxBackground);
            this.d = i;
            this.e = i;
            this.i = R.attr.colorControlHighlight;
            this.j = R.attr.colorControlHighlight;
            return;
        }
        aptn aptn = aptl.d;
        if (aptn == null) {
            aptn = aptn.c;
        }
        int a = aptp.a(aptn.b);
        if (a != 0 && a == 5) {
            this.a = xwe.d(fej.getContext(), R.attr.ytCloudChipDisabledBackground);
            this.b = fej.c;
            this.c = xwe.d(fej.getContext(), R.attr.ytCloudChipPrimaryBackground);
            this.d = fej.b;
            this.e = 0;
            this.i = R.attr.colorControlHighlight;
            this.j = R.attr.colorControlHighlight;
            return;
        }
        aptn = aptl.d;
        if (aptn == null) {
            aptn = aptn.c;
        }
        a = aptp.a(aptn.b);
        int i2 = R.attr.ytCloudChipFilterSelectedBackground;
        int i3 = R.attr.ytCloudChipFilterUnselectedBackground;
        if (a != 0 && a == 7) {
            this.b = !fej.l ? fej.d : fej.f;
            Context context = fej.getContext();
            if (!fej.l) {
                i2 = R.attr.ytCloudChipHomeFilterSelectedBackground;
            }
            this.c = xwe.d(context, i2);
            z = fej.l;
            this.d = !z ? fej.e : fej.g;
            this.e = 0;
            if (z) {
                this.h = false;
                this.i = 0;
                this.j = 0;
            } else {
                this.i = R.attr.ytFilledButtonText;
                this.j = R.attr.ytCloudChipHomeFilterUnselectedTextColor;
            }
            if ((aptl.a & 2) != 0) {
                fej.setMinimumWidth(0);
                Context context2 = fej.getContext();
                if (!fej.l) {
                    i3 = R.attr.ytCloudChipHomeFilterUnselectedBackground;
                }
                this.a = xwe.d(context2, i3);
                return;
            }
            fej.setClickable(false);
            fej.setMinimumWidth(fej.k);
            this.a = xwe.d(fej.getContext(), !fej.l ? R.attr.ytCloudChipHomeFilterGhostBackground : R.attr.ytCloudChipFilterGhostBackground);
            return;
        }
        aptn aptn2 = aptl.d;
        if (aptn2 == null) {
            aptn2 = aptn.c;
        }
        int a2 = aptp.a(aptn2.b);
        if (a2 == 0 || a2 != 2) {
            this.a = xwe.d(fej.getContext(), R.attr.ytCloudChipDefaultBackground);
            this.b = fej.a;
            this.c = xwe.d(fej.getContext(), R.attr.ytCloudChipPrimaryBackground);
            this.d = fej.b;
            this.e = 0;
            this.i = R.attr.colorControlHighlight;
            this.j = R.attr.colorControlHighlight;
            return;
        }
        this.a = xwe.d(fej.getContext(), R.attr.ytCloudChipFilterUnselectedBackground);
        this.b = fej.f;
        this.c = xwe.d(fej.getContext(), R.attr.ytCloudChipFilterSelectedBackground);
        this.d = fej.g;
        this.e = 0;
        this.h = false;
        this.i = 0;
        this.j = 0;
    }
}
