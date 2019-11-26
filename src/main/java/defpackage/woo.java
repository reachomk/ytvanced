package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.TvfilmOffersRendererOuterClass;

/* renamed from: woo */
public final class woo implements akot {
    public final ViewGroup a;
    private final wod b;
    private final wmz c;
    private final wmw d;

    public woo(Context context, wod wod, wmz wmz, ViewGroup viewGroup, wmw wmw) {
        this.b = wod;
        this.c = wmz;
        this.d = wmw;
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.tvfilm_offers_layout, viewGroup, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ayjh ayjh = (ayjh) obj;
        this.a.removeAllViews();
        for (axak axak : ayjh.b) {
            anxr access$000 = anxl.checkIsLite(TvfilmOffersRendererOuterClass.offerGroupRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                wod wod = this.b;
                wob wob = new wob((Context) wod.a((Context) wod.a.get(), 1), (akzb) wod.a((akzb) wod.b.get(), 2), (ViewGroup) wod.a(this.a, 3));
                anxr access$0002 = anxl.checkIsLite(TvfilmOffersRendererOuterClass.offerGroupRenderer);
                axak.a(access$0002);
                Object b = axak.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                wob.a_(akor, (ayjf) b);
                this.a.addView(wob.a);
            }
        }
        anxp anxp = ayjh.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0003 = anxl.checkIsLite(TvfilmOffersRendererOuterClass.couponRenderer);
        anxp.a(access$0003);
        if (anxp.h.a(access$0003.d)) {
            wmt wmt = new wmt((Context) wmz.a((Context) this.c.a.get(), 1), (wmw) wmz.a(this.d, 2), (ViewGroup) wmz.a(this.a, 3));
            anxp = ayjh.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$0004 = anxl.checkIsLite(TvfilmOffersRendererOuterClass.couponRenderer);
            anxp.a(access$0004);
            Object b2 = anxp.h.b(access$0004.d);
            if (b2 == null) {
                b2 = access$0004.b;
            } else {
                b2 = access$0004.a(b2);
            }
            wmt.a((ayje) b2);
            this.a.addView(wmt.b);
        }
        this.a.setOnTouchListener(new wor(this));
    }
}
