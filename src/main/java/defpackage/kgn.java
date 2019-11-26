package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;

/* renamed from: kgn */
public final class kgn implements akot, ele, xcp {
    public final ImageView a = ((ImageView) this.n.findViewById(R.id.set_repeat));
    public final ImageView b = ((ImageView) this.n.findViewById(R.id.set_shuffle));
    public kgo c;
    public final aaas d;
    public final aizy e;
    public final ltz f;
    private final Context g;
    private final xci h;
    private final akvo i;
    private final ekz j;
    private final lum k;
    private final fhu l;
    private final jlw m;
    private final View n;
    private final TextView o = ((TextView) this.n.findViewById(R.id.set_content_title));
    private final ImageView p = ((ImageView) this.n.findViewById(R.id.like_button));
    private final ImageView q = ((ImageView) this.n.findViewById(R.id.contextual_menu_anchor));
    private acvx r;
    private fie s;

    public kgn(Context context, xci xci, akvo akvo, fhu fhu, aizy aizy, ekz ekz, lum lum, aaas aaas, ltz ltz, ViewGroup viewGroup) {
        this.g = context;
        this.h = xci;
        this.j = ekz;
        this.k = lum;
        this.i = akvo;
        this.l = fhu;
        this.d = aaas;
        this.e = aizy;
        this.f = ltz;
        this.n = LayoutInflater.from(context).inflate(R.layout.set_content_header, viewGroup, false);
        this.q.setClickable(true);
        this.q.setEnabled(true);
        this.a.setOnClickListener(new kgm(this, aizy));
        this.b.setOnClickListener(new kgr(this));
        fhu.a(this.n.findViewById(R.id.like_button));
        this.m = new jlw(context, this.n.findViewById(R.id.set_share), aaas);
        ekz.a((ele) this);
    }

    public final View K_() {
        return this.n;
    }

    private final void a(fie fie) {
        kgo kgo = this.c;
        if (kgo == null || fie == null || !TextUtils.equals(kgo.a.e, fie.a)) {
            this.s = null;
            return;
        }
        this.l.a(fie.b);
        this.s = fie;
    }

    public final void a(akpb akpb) {
        this.h.b(this);
    }

    public final void a(boolean z, boolean z2) {
        this.a.setSelected(z);
        if (!kgn.a(this.c.a())) {
            this.b.setSelected(z2);
        }
    }

    public static boolean a(aphv aphv) {
        return (aphv == null || (aphv.a & 1024) == 0) ? false : true;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ajya ajya;
        kgo kgo = (kgo) obj;
        this.h.a((Object) this);
        this.c = kgo;
        this.r = akor.a;
        this.n.setVisibility(0);
        kgo kgo2 = this.c;
        Object obj2 = (kgo2.c || kgo2.a() != null) ? 1 : null;
        if (!this.c.b && obj2 == null) {
            this.o.setVisibility(0);
            this.o.setText(ajqy.a(this.c.a.l));
            this.a.setVisibility(8);
            this.b.setVisibility(8);
        } else {
            this.o.setVisibility(8);
            this.a.setVisibility(!this.c.b ? 8 : 0);
            this.b.setVisibility(obj2 == null ? 8 : 0);
        }
        ekz ekz = this.j;
        a(ekz.a, ekz.b);
        ajya ajya2 = this.c.a;
        if (ajya2.h) {
            this.o.setText(this.g.getResources().getString(R.string.radio_total_videos));
            this.q.setVisibility(8);
        } else {
            auvn auvn;
            akvo akvo = this.i;
            ImageView imageView = this.q;
            auvr auvr = ajya2.n;
            if (auvr == null || (auvr.a & 1) == 0) {
                auvn = null;
            } else {
                auvn = auvr.b;
                if (auvn == null) {
                    auvn = auvn.l;
                }
            }
            akvo.a(imageView, auvn, ajya2, this.r);
        }
        if (this.k.c() == null || this.k.c().d()) {
            this.p.setVisibility(8);
        } else {
            atzq atzq;
            atzt atzt = this.c.a.j;
            if (atzt == null || (atzt.a & 1) == 0) {
                atzq = null;
            } else {
                anxl anxl = atzt.b;
                if (anxl == null) {
                    anxl = atzr.p;
                }
                atzq = (atzq) ((anxo) anxl.toBuilder());
            }
            this.l.a(atzq);
            if (atzq != null) {
                ajya = this.c.a;
                atzs atzs = (atzs) ((anxo) ajya.j.toBuilder());
                atzs.a(atzq);
                ajya.j = (atzt) ((anxl) atzs.build());
            }
        }
        a(this.s);
        jlw jlw = this.m;
        ajya = this.c.a;
        if (ajya == null || abmn.b(ajya) == null) {
            xpr.a(jlw.a, false);
            jlw.a.setOnClickListener(null);
            return;
        }
        auvr auvr2 = ajya.n;
        if (auvr2 != null) {
            auvn auvn2 = auvr2.b;
            if (auvn2 == null) {
                auvn2 = auvn.l;
            }
            if (auvn2.b.size() != 0) {
                auvn2 = ajya.n.b;
                if (auvn2 == null) {
                    auvn2 = auvn.l;
                }
                for (auvj auvj : r9.b) {
                    auvl auvl = auvj.b;
                    if (auvl == null) {
                        auvl = auvl.f;
                    }
                    anxp anxp = auvl.d;
                    if (anxp == null) {
                        anxp = apxu.d;
                    }
                    anxr access$000 = anxl.checkIsLite(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
                    anxp.a(access$000);
                    if (anxp.h.a(access$000.d)) {
                        auvl auvl2 = auvj.b;
                        if (auvl2 == null) {
                            auvl2 = auvl.f;
                        }
                        apxu apxu = auvl2.d;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        jlw.d = apxu;
                    }
                }
            }
        }
        jlw.b = xvd.f(xvd.b(ajya.b));
        jlw.c = abmn.b(ajya);
        jlw.a.setOnClickListener(jlw);
        xpr.a(jlw.a, aebk.a(ajya.e) ^ 1);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{fie.class};
        } else if (i == 0) {
            a((fie) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
