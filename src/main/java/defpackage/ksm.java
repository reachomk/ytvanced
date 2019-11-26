package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: ksm */
public final class ksm implements akot {
    public final Context a;
    public final akkq b;
    public final aaas c;
    public final akvp d;
    public final akvo e;
    public final vmn f;
    public final tpu g;
    public final vod h;
    public final dwk i;
    public final xci j;
    public final ViewGroup k;
    public final FrameLayout l;
    private final Resources m;
    private kso n;
    private kso o;
    private kso p;

    protected ksm(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = akvp;
        this.e = akvo;
        this.f = vmn;
        this.g = tpu;
        this.h = vod;
        this.i = dwk;
        this.j = xci;
        this.m = context.getResources();
        this.k = viewGroup;
        this.l = new FrameLayout(context);
    }

    public final View K_() {
        return this.l;
    }

    public final void a(akpb akpb) {
        amqw.a(this.p);
        this.p.b.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aviq aviq;
        obj = (kss) obj;
        amqw.a((Object) akor);
        amqw.a(obj);
        this.l.removeAllViews();
        if (this.m.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.o == null) {
                this.o = new kso(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_form_landscape);
            }
            this.p = this.o;
        } else {
            if (this.n == null) {
                this.n = new kso(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_form);
            }
            this.p = this.n;
        }
        kso kso = this.p;
        awrk awrk = obj.a;
        String str = (awrk.a & 64) != 0 ? awrk.h : null;
        if (obj.d == null) {
            anze anze = awrk.b;
            if (anze == null) {
                anze = awra.k;
            }
            obj.d = (ajyp) ajzv.a(anze, ajyp.class);
        }
        ajyp ajyp = obj.d;
        if (obj.e == null) {
            anyd anyd = obj.a.c;
            obj.e = new awqo[anyd.size()];
            for (int i = 0; i < anyd.size(); i++) {
                obj.e[i] = (awqo) anyd.get(i);
            }
        }
        Object[] objArr = obj.e;
        awrk = obj.a;
        if ((awrk.a & 2) == 0) {
            aviq = null;
        } else {
            if (obj.c == null) {
                axak axak = awrk.d;
                if (axak == null) {
                    axak = axak.a;
                }
                obj.c = (aviq) ajzv.a(ajzv.a(axak), aviq.class);
            }
            aviq = obj.c;
        }
        if (obj.b == null) {
            aojc aojc = obj.a.e;
            if (aojc == null) {
                aojc = aojc.f;
            }
            obj.b = aojc;
        }
        aojc aojc2 = obj.b;
        if (obj.f == null) {
            obj.f = obj.a.f.d();
        }
        byte[] bArr = obj.f;
        kso.g = akor.a;
        aphg aphg = (aphg) ajzv.a(ajyp.m, aphg.class);
        kso.a.a(ajyp.k, ajyp.p);
        kso.b.a(akor.a, obj, str, ajyp, objArr, aojc2, bArr);
        kso.c.a(kso.g, obj, ajyp, aviq, Integer.valueOf(xwe.a(kso.f.getContext(), R.attr.ytBorderedButtonChipBackground, 0)));
        kso.d.a(kso.g, aphg, aviq);
        this.l.addView(this.p.e);
    }
}
