package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.youtube.R;

/* renamed from: kaq */
public final class kaq extends akpl implements jih {
    public akor a;
    public aqeq b;
    public jif c;
    public apxu d;
    public apxu e;
    public byte[] f;
    public acvx g;
    private final Context h;
    private final akou i;
    private final akkq j;
    private final fmx k;
    private final ejw l;
    private final View m;
    private final TextView n = ((TextView) this.m.findViewById(R.id.title));
    private final akvp o;
    private final TintableImageView p = ((TintableImageView) this.m.findViewById(R.id.thumbnail));
    private TextView q;
    private final ColorStateList r;

    public kaq(Context context, akkq akkq, akvp akvp, aaas aaas, flu flu, allb allb, fmx fmx, ejw ejw) {
        this.h = context;
        this.i = (akou) amqw.a((Object) flu);
        this.o = (akvp) amqw.a((Object) akvp);
        amqw.a((Object) aaas);
        this.j = (akkq) amqw.a((Object) akkq);
        this.k = fmx;
        this.l = ejw;
        this.m = LayoutInflater.from(context).inflate(R.layout.compact_link, null);
        this.r = xwe.b(context, R.attr.ytIcon1);
        flu.a(this.m);
        flu.a(new kat(this, allb, aaas));
    }

    public final View K_() {
        return this.i.a();
    }

    public final void a(akpb akpb) {
        this.l.b(this);
        jif jif = this.c;
        if (jif != null) {
            jif.a((jih) this);
        }
    }

    public final void a(boolean z) {
        flt.a(this.h, this.a, this.i, z);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        arml arml2;
        int a;
        aqeq aqeq = (aqeq) obj;
        TextView textView = this.n;
        int i = 8;
        apxu apxu = null;
        if ((aqeq.a & 8) != 0) {
            arml = aqeq.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        this.a = akor;
        this.b = aqeq;
        amqp a2 = jif.a(akor);
        if (a2.a()) {
            this.c = (jif) a2.b();
            this.c.b(this, aqeq);
        } else {
            this.c = null;
        }
        if ((aqeq.a & 16) != 0) {
            arml2 = aqeq.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence a3 = ajqy.a(arml2);
        if (!TextUtils.isEmpty(a3) && this.q == null) {
            this.q = (TextView) ((ViewStub) this.m.findViewById(R.id.subtitle)).inflate().findViewById(R.id.subtitle);
        }
        TextView textView2 = this.q;
        if (textView2 != null) {
            xpr.a(textView2, a3);
        }
        boolean z = true;
        if ((aqeq.a & 1) == 0) {
            akkq akkq = this.j;
            ImageView imageView = this.p;
            aygk aygk = aqeq.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
            this.p.setImageTintList(null);
            TintableImageView tintableImageView = this.p;
            if ((aqeq.a & 2) != 0) {
                i = 0;
            }
            tintableImageView.setVisibility(i);
        } else {
            akvp akvp = this.o;
            arwf arwf = aqeq.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a4 = arwh.a(arwf.b);
            if (a4 == null) {
                a4 = arwh.UNKNOWN;
            }
            a = akvp.a(a4);
            this.j.a(this.p);
            if (a == 0) {
                this.p.setImageDrawable(null);
                this.p.setVisibility(8);
                this.p.a(null);
            } else {
                this.p.setImageResource(a);
                this.p.setVisibility(0);
                this.p.a(this.r);
            }
        }
        this.g = akor.a;
        aqeo aqeo = aqeq.i;
        if (aqeo == null) {
            aqeo = aqeo.c;
        }
        if (aqeo.a == 102716411) {
            View view;
            aruh aruh;
            if (this.p.getVisibility() == 0) {
                view = this.p;
            } else if (this.n.getVisibility() == 0) {
                view = this.n;
            } else {
                textView = this.q;
                if (textView == null || textView.getVisibility() != 0) {
                    view = this.m;
                } else {
                    view = this.q;
                }
            }
            fmx fmx = this.k;
            aqeo aqeo2 = aqeq.i;
            if (aqeo2 == null) {
                aqeo2 = aqeo.c;
            }
            if (aqeo2.a == 102716411) {
                aruh = (aruh) aqeo2.b;
            } else {
                aruh = aruh.j;
            }
            fmx.a(aruh, view, aqeq, this.g);
        }
        a = aqeq.b;
        this.e = a == 4 ? (apxu) aqeq.c : null;
        this.d = a == 9 ? (apxu) aqeq.c : null;
        this.f = aqeq.j.d();
        akou akou = this.i;
        if (this.e == null && this.d == null) {
            z = false;
        }
        akou.a(z);
        ejw ejw = this.l;
        if (aqeq.b == 4) {
            apxu = (apxu) aqeq.c;
        }
        ejw.a(this, apxu);
        this.i.a(akor);
    }
}
