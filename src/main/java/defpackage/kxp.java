package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.PrimetimePromoPanelRendererOuterClass;
import com.google.protos.youtube.api.innertube.PrimetimePromoRendererOuterClass;

/* renamed from: kxp */
public final class kxp extends akpl {
    public final xci a;
    public final TextView b = ((TextView) this.d.findViewById(R.id.dismiss_button));
    public final Context c;
    private final View d;
    private final flu e;
    private final kxl f;
    private final kxj g;
    private final aaas h;
    private final akyy i;

    public kxp(Context context, akzb akzb, aaas aaas, xci xci, flu flu, kxk kxk, kxi kxi) {
        this.c = context;
        this.h = aaas;
        this.a = xci;
        this.e = flu;
        this.d = View.inflate(context, R.layout.primetime_promo_layout, null);
        this.f = new kxl((akkq) kxk.a((akkq) kxk.a.get(), 1), (ViewStub) kxk.a((ViewStub) this.d.findViewById(R.id.primetime_promo_header), 2));
        this.g = new kxj((Context) kxi.a((Context) kxi.a.get(), 1), (kxt) kxi.a((kxt) kxi.b.get(), 2), (kxf) kxi.a((kxf) kxi.c.get(), 3), (FrameLayout) kxi.a((FrameLayout) this.d.findViewById(R.id.primetime_promo_box), 4));
        this.i = akzb.a(this.b);
        this.b.addOnLayoutChangeListener(new kxo(this));
        this.e.a(this.d);
    }

    public final View K_() {
        return this.e.b;
    }

    public final void a(akpb akpb) {
        kxa kxa = this.g.g;
        if (kxa != null) {
            kxa.a.c.clear();
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        anxr access$000;
        Object b;
        obj = (awnv) obj;
        anxp anxp = obj.b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(PrimetimePromoRendererOuterClass.primetimePromoHeaderRenderer);
        anxp.a(access$0002);
        boolean a = anxp.h.a(access$0002.d);
        aphg aphg = null;
        if (a) {
            anxp = obj.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(PrimetimePromoRendererOuterClass.primetimePromoHeaderRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            b = (awnu) b;
        } else {
            b = null;
        }
        this.f.a_(akor, b);
        kxj kxj = this.g;
        kxj.d.removeAllViews();
        anxp anxp2 = obj.h;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        anxr access$0003 = anxl.checkIsLite(PrimetimePromoPanelRendererOuterClass.primetimePromoPanelRenderer);
        anxp2.a(access$0003);
        FrameLayout frameLayout;
        if (anxp2.h.a(access$0003.d)) {
            kxq kxq;
            frameLayout = kxj.d;
            if (xss.e(kxj.a)) {
                if (kxj.h == null) {
                    kxj.h = kxj.b.a(kxj.a, (int) R.layout.primetime_promo_single_panel_box_landscape_layout);
                }
                kxq = kxj.h;
            } else {
                if (kxj.i == null) {
                    kxj.i = kxj.b.a(kxj.a, (int) R.layout.primetime_promo_box_layout);
                }
                kxq = kxj.i;
            }
            kxq.a(akor, obj);
            frameLayout.addView(kxq.a);
        } else {
            ajzw a2;
            if ((obj.a & 64) != 0) {
                axak axak = obj.h;
                if (axak == null) {
                    axak = axak.a;
                }
                a2 = ajzv.a(axak);
            } else {
                a2 = null;
            }
            if (ajzv.b(a2, ajwd.class)) {
                ajzw a3;
                frameLayout = kxj.d;
                if (kxj.g == null) {
                    kxf kxf = kxj.c;
                    kxj.g = new kxa((kxg) kxf.a((kxg) kxf.b.get(), 1), (Context) kxf.a((Context) kxf.a.get(), 2), (akpe) kxf.a((akpe) kxf.c.get(), 3), (akvz) kxf.a((akvz) kxf.d.get(), 4), (acwa) kxf.a((acwa) kxf.e.get(), 5));
                }
                kxa kxa = kxj.g;
                kxa.c.a_(akor, obj);
                kxc kxc = kxa.a;
                if ((obj.a & 64) != 0) {
                    axak axak2 = obj.h;
                    if (axak2 == null) {
                        axak2 = axak.a;
                    }
                    a3 = ajzv.a(axak2);
                } else {
                    a3 = null;
                }
                ajwg[] ajwgArr = ((ajwd) ajzv.a(a3, ajwd.class)).a;
                kxc.a.a(kxc.b);
                kxc.c.clear();
                kxc.d.a = kxc.e.t();
                for (ajwg ajwg : ajwgArr) {
                    awnt awnt = ajwg.A;
                    if (awnt != null) {
                        kxc.c.add(awnt);
                    }
                }
                frameLayout.addView(kxj.g.b);
            }
        }
        int a4 = awnj.a(obj.e);
        if (a4 == 0) {
            a4 = 1;
        }
        a4--;
        LayoutParams layoutParams;
        if (a4 == 0 || a4 == 1) {
            layoutParams = kxj.d.getLayoutParams();
            kxj.d.setBackground(null);
            kxj.d.setPadding(0, 0, 0, 0);
            if (xss.e(kxj.a)) {
                anxp anxp3 = obj.h;
                if (anxp3 == null) {
                    anxp3 = axak.a;
                }
                anxr access$0004 = anxl.checkIsLite(PrimetimePromoPanelRendererOuterClass.primetimePromoPanelRenderer);
                anxp3.a(access$0004);
                if (anxp3.h.a(access$0004.d)) {
                    kxj.a(layoutParams, 0);
                }
            }
            kxj.a(layoutParams, kxj.e);
        } else {
            int dimensionPixelSize;
            layoutParams = kxj.d.getLayoutParams();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(xwe.a(kxj.a, R.attr.ytGeneralBackgroundA, 0));
            Resources resources = kxj.a.getResources();
            gradientDrawable.setCornerRadius(resources.getDimension(R.dimen.primetime_box_corner_radius));
            gradientDrawable.setStroke(resources.getDimensionPixelSize(R.dimen.primetime_box_border), xwe.a(kxj.a, R.attr.ytGeneralBackgroundC, 0));
            kxj.d.setBackground(gradientDrawable);
            if (xss.e(kxj.a)) {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.primetime_box_padding_landscape);
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.primetime_box_padding_portrait);
            }
            kxj.d.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0);
            kxj.a(layoutParams, kxj.f);
        }
        anxp2 = obj.h;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        access$0003 = anxl.checkIsLite(PrimetimePromoPanelRendererOuterClass.primetimePromoPanelRenderer);
        anxp2.a(access$0003);
        if (anxp2.h.a(access$0003.d)) {
            kxj.a(R.dimen.primetime_single_panel_end_margin);
        } else {
            kxj.a(R.dimen.primetime_carousel_end_margin);
        }
        this.e.a(akor);
        aabd.a(this.h, obj.j, obj);
        anxp = obj.d;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = obj.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$0002);
            b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aphg = (aphg) b;
        }
        this.i.a(aphg, akor.a);
        this.i.c = new kxr(this, obj);
    }
}
