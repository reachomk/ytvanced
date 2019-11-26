package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;

/* renamed from: ihm */
public final class ihm extends ihj {
    private final epj n;
    private TextView o;
    private TextView p;
    private eph q;
    private eph r;

    public ihm(Context context, akkq akkq, epj epj) {
        super(context, akkq);
        this.n = (epj) amqw.a((Object) epj);
    }

    public final void b() {
        super.b();
        eph eph = this.q;
        if (eph != null) {
            eph.a();
            this.q.a(false);
        }
        eph = this.r;
        if (eph != null) {
            eph.a();
            this.r.a(false);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(View view) {
        this.b = xpr.a(view, (int) R.id.collapsible_ad_cta_overlay_stub, (int) R.id.collapsible_ad_cta_overlay);
        this.c = this.b.findViewById(R.id.expanded_background_container);
        this.d = this.b.findViewById(R.id.expanded_metadata_container);
        this.e = (ImageView) this.b.findViewById(R.id.thumbnail_icon);
        this.o = (TextView) this.b.findViewById(R.id.expanded_title);
        this.p = (TextView) this.b.findViewById(R.id.expanded_description);
        this.q = this.n.a((epk) this, this.b.findViewById(R.id.expanded_cta_button));
        this.f = this.q.a;
        this.r = this.n.a((epk) this, this.b.findViewById(R.id.collapsed_cta_button));
        this.g = this.r.a;
        this.c.setOnClickListener(new ihl(this));
        this.e.setOnClickListener(new iho(this));
    }

    public final void a() {
        if (this.h != null && this.e != null) {
            arml arml;
            eph eph;
            super.a();
            apxr apxr = ((apxp) this.h).c;
            if (apxr == null) {
                apxr = apxr.g;
            }
            int a = aohf.a(apxr.f);
            if (a == 0) {
                a = 1;
            }
            this.l = a;
            apxo apxo = ((apxp) this.h).d;
            if (apxo == null) {
                apxo = apxo.d;
            }
            a = aohf.a(apxo.c);
            if (a == 0) {
                a = 1;
            }
            this.m = a;
            this.e.setImageResource(R.drawable.website_linkout);
            apxp apxp = (apxp) this.h;
            if ((apxp.a & 1) != 0) {
                akkq akkq = this.a;
                ImageView imageView = this.e;
                aygk aygk = apxp.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akkq.a(imageView, aygk, akko.h().a(true).a(new ihn(this)).a());
            }
            TextView textView = this.o;
            apxr apxr2 = ((apxp) this.h).c;
            if (apxr2 == null) {
                apxr2 = apxr.g;
            }
            arml arml2 = null;
            if ((apxr2.a & 2) == 0) {
                arml = null;
            } else {
                apxr2 = ((apxp) this.h).c;
                if (apxr2 == null) {
                    apxr2 = apxr.g;
                }
                arml = apxr2.c;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            textView.setText(ajqy.a(arml));
            textView = this.p;
            apxr2 = ((apxp) this.h).c;
            if (apxr2 == null) {
                apxr2 = apxr.g;
            }
            if ((apxr2.a & 4) != 0) {
                apxr2 = ((apxp) this.h).c;
                if (apxr2 == null) {
                    apxr2 = apxr.g;
                }
                arml2 = apxr2.d;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            textView.setText(ajqy.a(arml2));
            apxr = ((apxp) this.h).c;
            if (apxr == null) {
                apxr = apxr.g;
            }
            anxp anxp = apxr.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                this.q.a(true);
                eph = this.q;
                apxr2 = ((apxp) this.h).c;
                if (apxr2 == null) {
                    apxr2 = apxr.g;
                }
                anxp anxp2 = apxr2.b;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                eph.a((aohe) b);
            }
            apxo = ((apxp) this.h).d;
            if (apxo == null) {
                apxo = apxo.d;
            }
            anxp = apxo.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                this.r.a(true);
                eph = this.r;
                apxo apxo2 = ((apxp) this.h).d;
                if (apxo2 == null) {
                    apxo2 = apxo.d;
                }
                anxp anxp3 = apxo2.b;
                if (anxp3 == null) {
                    anxp3 = axak.a;
                }
                access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                anxp3.a(access$000);
                Object b2 = anxp3.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                eph.a((aohe) b2);
            }
            Drawable background = this.c.getBackground();
            apxr apxr3 = ((apxp) this.h).c;
            if (apxr3 == null) {
                apxr3 = apxr.g;
            }
            background.setColorFilter(apxr3.e, Mode.SRC);
            if (((apxp) this.h).g && VERSION.SDK_INT >= 21) {
                this.c.setElevation(10.0f);
                this.d.setZ(10.0f);
                this.e.setZ(10.0f);
                this.g.setZ(10.0f);
            }
        }
    }
}
