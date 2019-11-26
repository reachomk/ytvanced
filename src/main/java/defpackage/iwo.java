package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import java.util.Arrays;

/* renamed from: iwo */
abstract class iwo implements akot {
    public final View a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public final Context e;
    public apxu f = null;
    private final TextView g;
    private final ViewGroup h;
    private final ViewStub i;
    private final TextView j;
    private final View k;
    private final OnClickListener l;
    private final akkq m;
    private final alax n;
    private final akyy o;
    private final akvp p;
    private final fap q;
    private final eso r;
    private final eus s;

    public iwo(Context context, aaas aaas, akkq akkq, alax alax, akzb akzb, akvp akvp, est est, eur eur, int i, ViewGroup viewGroup) {
        eus eus = null;
        this.e = context;
        this.m = (akkq) amqw.a((Object) akkq);
        this.p = akvp;
        this.n = alax;
        this.a = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.d = (TextView) this.a.findViewById(R.id.title);
        this.b = (TextView) this.a.findViewById(R.id.subtitle);
        this.c = (ImageView) this.a.findViewById(R.id.avatar);
        this.g = (TextView) this.a.findViewById(R.id.avatar_text);
        this.h = (ViewGroup) this.a.findViewById(R.id.badge_layout);
        this.i = (ViewStub) this.a.findViewById(R.id.title_badge);
        this.j = (TextView) this.a.findViewById(R.id.subscribe_button);
        this.k = this.a.findViewById(R.id.subscription_notification_view);
        this.l = new iwr(this, aaas);
        this.o = akzb.a((TextView) this.a.findViewById(R.id.action_button));
        this.q = new fap(akvp, context, this.i);
        View view = this.k;
        if (view != null) {
            eus = eur.a(view);
        }
        this.s = eus;
        this.r = est.a(this.j, this.s);
    }

    public abstract void a(aziq aziq);

    /* renamed from: a */
    public final void a_(akor akor, aziq aziq) {
        apxu apxu;
        arml arml;
        auxa auxa;
        axwa axwa = null;
        if ((aziq.a & 2) != 0) {
            apxu = aziq.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        this.f = apxu;
        this.a.setOnClickListener(this.l);
        TextView textView = this.d;
        if ((aziq.a & 1) != 0) {
            arml = aziq.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        fap fap = this.q;
        anxp anxp = aziq.k;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = aziq.k;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            auxa = (auxa) b;
        } else {
            auxa = null;
        }
        fap.a(auxa);
        this.c.setVisibility(8);
        this.g.setVisibility(8);
        this.o.a(null, null);
        Spanned a = ajqy.a(aziq.b == 9 ? (arml) aziq.c : null);
        if (TextUtils.isEmpty(a)) {
            if (aklb.a(aziq.b == 5 ? (aygk) aziq.c : aygk.f)) {
                aygk aygk;
                akkq akkq = this.m;
                ImageView imageView = this.c;
                if (aziq.b == 5) {
                    aygk = (aygk) aziq.c;
                } else {
                    aygk = aygk.f;
                }
                akkq.a(imageView, aygk);
                this.c.setVisibility(0);
            } else if (aziq.b == 10) {
                aphg aphg;
                akyy akyy = this.o;
                aphj aphj = (aphj) aziq.c;
                if ((aphj.a & 1) == 0) {
                    aphg = null;
                } else {
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                }
                akyy.a(aphg, akor.a);
            }
        } else {
            this.g.setVisibility(0);
            this.g.setText(a);
        }
        azhq[] azhqArr = (azhq[]) aziq.g.toArray(new azhq[0]);
        View view = this.h;
        boolean z = azhqArr != null && azhqArr.length > 0;
        xpr.a(view, z);
        iwv.a(this.e, this.h, this.p, Arrays.asList(azhqArr), true);
        anxp anxp2 = aziq.j;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        anxp2.a(access$0002);
        if (anxp2.h.a(access$0002.d)) {
            anxp2 = aziq.j;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0003 = anxl.checkIsLite(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
            anxp2.a(access$0003);
            Object b2 = anxp2.h.b(access$0003.d);
            if (b2 == null) {
                b2 = access$0003.b;
            } else {
                b2 = access$0003.a(b2);
            }
            axwa = (axwa) b2;
        }
        if (axwa == null) {
            this.s.a();
        } else {
            axwa = (axwa) ((anxl) evj.a(this.e, (axwd) ((anxo) axwa.toBuilder()), this.d.getText()).build());
        }
        this.r.a(axwa, akor.a);
        eus eus = this.s;
        if (eus != null) {
            View b3 = eus.b();
            if (b3 != null) {
                b3.setPaddingRelative(b3.getPaddingStart(), 0, 0, 0);
            }
        }
        azhc azhc = aziq.i;
        if (azhc == null) {
            azhc = azhc.c;
        }
        int i = azhc.a;
        azhc azhc2 = aziq.h;
        if (azhc2 == null) {
            azhc2 = azhc.c;
        }
        int i2 = azhc2.a;
        apfb apfb;
        if (i != 118483990) {
            if (i2 == 118483990) {
                azhc = aziq.h;
                if (azhc == null) {
                    azhc = azhc.c;
                }
                apfb = azhc.a == 118483990 ? (apfb) azhc.b : apfb.f;
                this.d.setTextColor(apfb.c);
                this.b.setTextColor(apfb.d);
                this.g.setTextColor(apfb.c);
                this.a.setBackgroundColor(apfb.b);
                a(aziq);
            }
        } else if (i2 == 118483990) {
            azhc = aziq.i;
            if (azhc == null) {
                azhc = azhc.c;
            }
            apfb = azhc.a == 118483990 ? (apfb) azhc.b : apfb.f;
            azhc2 = aziq.h;
            if (azhc2 == null) {
                azhc2 = azhc.c;
            }
            apfb apfb2 = azhc2.a == 118483990 ? (apfb) azhc2.b : apfb.f;
            this.d.setTextColor(this.n.a(apfb2.c, apfb.c));
            this.b.setTextColor(this.n.a(apfb2.d, apfb.d));
            this.g.setTextColor(this.n.a(apfb2.c, apfb.c));
            this.a.setBackgroundColor(this.n.a(apfb2.b, apfb.b));
            a(aziq);
        }
        this.d.setTextColor(xwe.a(this.e, R.attr.ytTextPrimary, 0));
        this.b.setTextColor(xwe.a(this.e, R.attr.ytTextSecondary, 0));
        this.g.setTextColor(xwe.a(this.e, R.attr.ytTextPrimary, 0));
        this.a.setBackgroundColor(xwe.a(this.e, R.attr.ytGeneralBackgroundB, 0));
        a(aziq);
    }

    public final void a(akpb akpb) {
        this.r.a();
    }

    public final View K_() {
        return this.a;
    }
}
