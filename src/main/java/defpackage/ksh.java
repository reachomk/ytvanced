package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: ksh */
public final class ksh implements akot {
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
    public ksj m;
    private final Resources n;
    private ksj o;
    private ksj p;

    protected ksh(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
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
        this.n = context.getResources();
        this.k = viewGroup;
        this.l = new FrameLayout(context);
    }

    public final View K_() {
        return this.l;
    }

    public final void a(akpb akpb) {
        amqw.a(this.m);
        this.m.a.a();
    }

    public final void b() {
        if (this.n.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.p == null) {
                this.p = new ksj(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_compact_form_landscape);
            }
            this.m = this.p;
            return;
        }
        if (this.o == null) {
            this.o = new ksj(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_compact_form);
        }
        this.m = this.o;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aviq aviq;
        Object obj2 = (ksn) obj;
        amqw.a((Object) akor);
        amqw.a(obj2);
        this.l.removeAllViews();
        b();
        ksj ksj = this.m;
        awri awri = obj2.a;
        String str = (awri.a & 64) != 0 ? awri.h : null;
        if (obj2.d == null) {
            anze anze = awri.b;
            if (anze == null) {
                anze = awra.k;
            }
            obj2.d = (ajyp) ajzv.a(anze, ajyp.class);
        }
        ajyp ajyp = obj2.d;
        if (obj2.e == null) {
            anyd anyd = obj2.a.c;
            obj2.e = new awqo[anyd.size()];
            for (int i = 0; i < anyd.size(); i++) {
                obj2.e[i] = (awqo) anyd.get(i);
            }
        }
        awqo[] awqoArr = obj2.e;
        awri awri2 = obj2.a;
        if ((awri2.a & 2) == 0) {
            aviq = null;
        } else {
            if (obj2.c == null) {
                axak axak = awri2.d;
                if (axak == null) {
                    axak = axak.a;
                }
                obj2.c = (aviq) ajzv.a(ajzv.a(axak), aviq.class);
            }
            aviq = obj2.c;
        }
        if (obj2.b == null) {
            aojc aojc = obj2.a.e;
            if (aojc == null) {
                aojc = aojc.f;
            }
            obj2.b = aojc;
        }
        aojc aojc2 = obj2.b;
        if (obj2.f == null) {
            obj2.f = obj2.a.f.d();
        }
        ksj.a(akor, obj2, str, ajyp, awqoArr, aviq, aojc2, obj2.f);
        this.l.addView(this.m.d);
    }
}
