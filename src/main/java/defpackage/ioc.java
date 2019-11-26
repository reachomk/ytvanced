package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DetailsHeaderRendererOuterClass;

/* renamed from: ioc */
public final class ioc implements akot {
    public final Context a;
    public final Context b;
    public final Resources c;
    public final akkq d;
    public final aaas e;
    public final akzb f;
    public final iow g;
    public final hjs h;
    public final agwc i;
    public final zyw j;
    public boolean k;
    public boolean l;
    private final ViewGroup m;
    private iod n;
    private iog o;

    public ioc(Context context, Context context2, akkq akkq, aaas aaas, akzb akzb, iow iow, hjs hjs, agwc agwc, zyw zyw) {
        if (!wvl.a(zyw)) {
            context = context2;
        }
        this.a = context;
        this.j = zyw;
        this.b = context2;
        this.d = akkq;
        this.e = aaas;
        this.c = this.a.getResources();
        this.g = iow;
        this.f = akzb;
        this.i = agwc;
        this.h = hjs;
        this.m = new FrameLayout(this.a);
    }

    public final View K_() {
        return this.m;
    }

    public final void a(akpb akpb) {
        iod iod = this.n;
        if (iod != null) {
            iod.a(akpb);
        }
        iog iog = this.o;
        if (iog != null) {
            iog.a(akpb);
        }
    }

    public static aqvn a(aqvl aqvl) {
        if (aqvl == null) {
            return null;
        }
        anxp anxp = aqvl.d;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(DetailsHeaderRendererOuterClass.detailsHeaderThumbnailsRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (aqvn) b;
    }

    public static aygk a(aqvn aqvn, boolean z) {
        if (aqvn != null) {
            aygo aygo = aqvn.b;
            if (aygo == null) {
                aygo = aygo.c;
            }
            if ((aygo.a & 1) != 0) {
                aygk aygk;
                aygo aygo2 = aqvn.b;
                if (aygo2 == null) {
                    aygo2 = aygo.c;
                }
                aygn aygn = aygo2.b;
                if (aygn == null) {
                    aygn = aygn.d;
                }
                if (z) {
                    aygk = aygn.c;
                    if (aygk == null) {
                        return aygk.f;
                    }
                }
                aygk = aygn.b;
                if (aygk == null) {
                    return aygk.f;
                }
                return aygk;
            }
        }
        return null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        iob iob;
        aqvl aqvl = (aqvl) obj;
        this.k = xss.b(this.a);
        this.l = fka.a(this.a.getResources().getConfiguration().orientation);
        this.m.removeAllViews();
        if (!this.k) {
            int f = xss.f(this.a);
            int dimensionPixelSize = this.c.getDimensionPixelSize(R.dimen.details_content_side_padding);
            if (f < this.c.getDimensionPixelSize(R.dimen.details_page_min_content_width) + (dimensionPixelSize + dimensionPixelSize)) {
                if (this.n == null) {
                    this.n = new iod(this);
                }
                iob = this.n;
                iob.a(akor, aqvl);
                this.m.addView(iob.b);
            }
        }
        if (this.o == null) {
            this.o = new iog(this);
        }
        iob = this.o;
        iob.a(akor, aqvl);
        this.m.addView(iob.b);
    }
}
