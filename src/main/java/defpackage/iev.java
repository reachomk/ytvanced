package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;

/* renamed from: iev */
public final class iev implements OnLayoutChangeListener, hbj, iem {
    public final ifd a;
    public final bcud b;
    public final acvx c;
    public final ifb d;
    public final iaw e;
    public final lcm f;
    public final hyc g;
    public final hyc h;
    public final hvk i;
    public final hwf j;
    public ifc k;
    public iau l;
    private final fhs m;
    private aphv n;
    private boolean o;

    public iev(fhs fhs, ifd ifd, bcud bcud, acvx acvx, ifb ifb, iaw iaw, lcm lcm, hyc hyc, hyc hyc2, hvk hvk, hwf hwf) {
        this.m = fhs;
        this.a = ifd;
        this.b = bcud;
        this.c = acvx;
        this.d = ifb;
        this.e = iaw;
        this.f = lcm;
        this.g = hyc;
        this.h = hyc2;
        this.i = hvk;
        this.j = hwf;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z = i4 - i2 > i3 - i;
        if (this.o != z) {
            this.o = z;
            if (!(this.k == null || this.i.i() == null)) {
                LayoutParams layoutParams = (LayoutParams) this.i.i();
                if (this.o) {
                    layoutParams.addRule(3, this.k.f.getId());
                    layoutParams.addRule(21);
                    layoutParams.removeRule(10);
                    layoutParams.removeRule(16);
                } else {
                    layoutParams.addRule(16, R.id.autonav_toggle);
                    layoutParams.addRule(10);
                    layoutParams.removeRule(21);
                    layoutParams.removeRule(3);
                }
                this.i.a(layoutParams);
            }
            ifd ifd = this.a;
            boolean z2 = this.o;
            if (ifd.f != z2) {
                ifd.f = z2;
                ifd.a();
            }
        }
    }

    public final void a(boolean z) {
        ifc ifc = this.k;
        if (ifc != null) {
            aphv aphv = this.n;
            if (aphv != null) {
                int i = aphv.a;
                if (!((i & 2048) == 0 || (i & 32) == 0)) {
                    arwh a;
                    CharSequence charSequence;
                    TouchImageView touchImageView = ifc.d;
                    fhs fhs = this.m;
                    arwf arwf;
                    if (z) {
                        arwf = aphv.j;
                        if (arwf == null) {
                            arwf = arwf.c;
                        }
                        a = arwh.a(arwf.b);
                        if (a == null) {
                            a = arwh.UNKNOWN;
                        }
                    } else {
                        arwf = aphv.d;
                        if (arwf == null) {
                            arwf = arwf.c;
                        }
                        a = arwh.a(arwf.b);
                        if (a == null) {
                            a = arwh.UNKNOWN;
                        }
                    }
                    touchImageView.setImageResource(fhs.a(a));
                    touchImageView = this.k.d;
                    if (z) {
                        charSequence = this.n.l;
                    } else {
                        charSequence = this.n.f;
                    }
                    touchImageView.setContentDescription(charSequence);
                    return;
                }
            }
            this.a.k = false;
        }
    }

    public final void a(aphv aphv) {
        this.n = aphv;
    }

    public final void a(CharSequence charSequence) {
        ifc ifc = this.k;
        if (ifc != null) {
            ((TextView) ifc.b.d()).setText(charSequence);
        }
    }

    public final void b(boolean z) {
        this.a.k = z;
    }
}
