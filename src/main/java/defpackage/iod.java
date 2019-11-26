package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* renamed from: iod */
final class iod extends iob {
    private final xom d = xop.a(this.e.findViewById(R.id.banner_scrim));
    private final FixedAspectRatioFrameLayout e = ((FixedAspectRatioFrameLayout) this.b.findViewById(R.id.banner_layout));
    private final ImageView f = ((ImageView) this.e.findViewById(R.id.banner));
    private final ImageView g = ((ImageView) this.e.findViewById(R.id.logo));
    private final float h;
    private final int i;
    private final int j;
    private final /* synthetic */ ioc k;

    iod(ioc ioc) {
        this.k = ioc;
        super(ioc, R.layout.details_header, ioc.a);
        this.h = ioc.c.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        this.j = ioc.c.getDimensionPixelSize(R.dimen.red_carpet_details_header_logo_height);
        this.i = ioc.c.getDimensionPixelSize(R.dimen.red_carpet_details_header_logo_width);
    }

    public final void a(akor akor, aqvl aqvl) {
        super.a(akor, aqvl);
        aqvn a = ioc.a(aqvl);
        aygk a2 = ioc.a(a, this.k.l);
        boolean z = false;
        if (a2 != null) {
            float f;
            FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = this.e;
            if ((aqvl.a & 8) == 0) {
                f = this.h;
            } else {
                ioc ioc = this.k;
                aqvh aqvh;
                if (ioc.l) {
                    if (ioc.k) {
                        aqvh = aqvl.e;
                        if (aqvh == null) {
                            aqvh = aqvh.f;
                        }
                        f = aqvh.d;
                    } else {
                        aqvh = aqvl.e;
                        if (aqvh == null) {
                            aqvh = aqvh.f;
                        }
                        f = aqvh.b;
                    }
                } else if (ioc.k) {
                    aqvh = aqvl.e;
                    if (aqvh == null) {
                        aqvh = aqvh.f;
                    }
                    f = aqvh.e;
                } else {
                    aqvh = aqvl.e;
                    if (aqvh == null) {
                        aqvh = aqvh.f;
                    }
                    f = aqvh.c;
                }
            }
            fixedAspectRatioFrameLayout.a = f;
            xpr.a(this.e, true);
            this.k.d.a(this.f, a2);
            if ((a.a & 4) == 0) {
                this.g.getLayoutParams().height = this.j;
                this.g.getLayoutParams().width = this.i;
            } else {
                float f2;
                ioc ioc2 = this.k;
                aqvj aqvj;
                if (ioc2.l) {
                    if (ioc2.k) {
                        aqvj = a.d;
                        if (aqvj == null) {
                            aqvj = aqvj.f;
                        }
                        f2 = aqvj.d;
                    } else {
                        aqvj = a.d;
                        if (aqvj == null) {
                            aqvj = aqvj.f;
                        }
                        f2 = aqvj.b;
                    }
                } else if (ioc2.k) {
                    aqvj = a.d;
                    if (aqvj == null) {
                        aqvj = aqvj.f;
                    }
                    f2 = aqvj.e;
                } else {
                    aqvj = a.d;
                    if (aqvj == null) {
                        aqvj = aqvj.f;
                    }
                    f2 = aqvj.c;
                }
                aygk aygk = a.c;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                float g = aklb.g(aygk);
                this.g.getLayoutParams().height = (int) f2;
                this.g.getLayoutParams().width = (int) (f2 * g);
            }
            akkq akkq = this.k.d;
            ImageView imageView = this.g;
            aygk aygk2 = a.c;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            akkq.a(imageView, aygk2);
            View view = this.g;
            if ((a.a & 2) != 0) {
                z = true;
            }
            xpr.a(view, z);
            this.d.a(anhe.a(aqvl.m));
            return;
        }
        xpr.a(this.e, false);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a(akor, (aqvl) obj);
    }
}
