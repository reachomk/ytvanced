package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kxy */
public final class kxy extends kyc {
    public final ViewGroup a;
    public final klk b;
    private final Context f;
    private final Handler g;
    private final aaas h;
    private final TextView i = ((TextView) this.a.findViewById(R.id.title));
    private final View j = this.a.findViewById(R.id.expansion_icon);
    private final TextView k = ((TextView) this.a.findViewById(R.id.collapsed_subtitle));
    private final TextView l = ((TextView) this.a.findViewById(R.id.expanded_subtitle));
    private final ViewGroup m;
    private final String n;
    private final String o;
    private final bgx p;
    private final Runnable q;

    public kxy(Context context, Handler handler, aaas aaas, kln kln) {
        this.f = context;
        this.g = handler;
        this.h = aaas;
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_information, null);
        this.b = kln.a((ViewStub) this.a.findViewById(R.id.standalone_collection_badge));
        this.m = (ViewGroup) this.a.findViewById(R.id.badge_container);
        this.n = context.getString(R.string.load_more_label);
        this.o = context.getString(R.string.load_less_label);
        bhj bhj = new bhj();
        bgx eyl = new eyl();
        eyl.a((int) R.id.container);
        bhj.a(eyl);
        eyl = new eyx();
        eyl.a((int) R.id.expansion_icon);
        bhj.a(eyl);
        eyl = new bfl();
        eyl.a((int) R.id.title);
        eyl.a((int) R.id.standalone_collection_badge);
        eyl.a((int) R.id.badge_and_subtitle_container);
        bhj.a(eyl);
        bgx bga = new bga();
        bga.a((int) R.id.collapsed_subtitle);
        bga.a((int) R.id.expanded_subtitle);
        bhj.a(bga);
        this.p = bhj;
        this.q = new kyb(this, context.getResources().getDimensionPixelSize(R.dimen.standalone_collection_badge_expansion_amount));
        this.a.setOnClickListener(new kya(this));
        this.b.b = false;
        this.j.setAccessibilityDelegate(new kyd());
    }

    public final View K_() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        ezn ezn = this.e;
        boolean z = true;
        if (!ezn.g) {
            axpw axpw = ezn.c;
            if ((axpw.a & 2) != 0) {
                ezn.b.a(axpw.c, ezn);
                aaas aaas = ezn.a;
                apxu apxu = ezn.c.d;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
                ezn.g = true;
            }
        }
        acvx acvx = this.c.a;
        axpu axpu = (axpu) this.d;
        acvx.a(axpu.h.d(), null);
        acvx.a(new acvs(acwc.SLIM_VIDEO_INFORMATION_RENDERER_EXPAND_ICON));
        acvx.a(new acvs(acwc.SLIM_VIDEO_INFORMATION_RENDERER_COLLAPSE_ICON));
        arml arml = axpu.b;
        if (arml == null) {
            arml = arml.f;
        }
        acxk.a(arml, acvx);
        f();
        g();
        h();
        axpu axpu2 = (axpu) this.d;
        apdx apdx = axpu2.e;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 4) != 0) {
            klk klk = this.b;
            apdx apdx2 = axpu2.e;
            if (apdx2 == null) {
                apdx2 = apdx.g;
            }
            apdz apdz = apdx2.d;
            if (apdz == null) {
                apdz = apdz.e;
            }
            klk.a(apdz, this.c.a);
            this.g.post(this.q);
        } else {
            this.b.a(null);
            this.a.setTouchDelegate(null);
        }
        axpu2 = (axpu) this.d;
        LayoutInflater from = LayoutInflater.from(this.f);
        this.m.removeAllViews();
        apdx apdx3 = axpu2.f;
        if (apdx3 == null) {
            apdx3 = apdx.g;
        }
        if ((apdx3.a & 2) != 0) {
            View inflate = from.inflate(R.layout.standalone_red_badge, this.m, false);
            ipk a = ipn.a(inflate);
            apdx apdx4 = axpu2.f;
            if (apdx4 == null) {
                apdx4 = apdx.g;
            }
            apeb apeb = apdx4.c;
            if (apeb == null) {
                apeb = apeb.e;
            }
            a.a(apeb);
            this.m.addView(inflate);
        }
        for (apdh apdh : axpu2.g) {
            int i = apdh.a;
            if ((i & 1) != 0) {
                TextView textView = (TextView) from.inflate(R.layout.text_badge, this.m, false);
                apej apej = apdh.b;
                if (apej == null) {
                    apej = apej.c;
                }
                arml arml2 = apej.b;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                textView.setText(ajqy.a(arml2));
                this.m.addView(textView);
            } else if ((i & 256) != 0) {
                ImageView imageView = (ImageView) from.inflate(R.layout.slim_privacy_badge, this.m, false);
                khp khp = new khp((ImageView) kho.a(imageView, 1), (Context) kho.a(this.f, 2));
                apdv apdv = apdh.h;
                if (apdv == null) {
                    apdv = apdv.c;
                }
                khp.a(apdv);
                this.m.addView(imageView);
            }
        }
        View view = this.m;
        if (view.getChildCount() <= 0) {
            z = false;
        }
        xpr.a(view, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        bhf.a(this.a);
        this.g.removeCallbacks(this.q);
    }

    public final void aD_() {
        bhf.a(this.a, this.p);
        f();
        g();
        h();
    }

    public final void aE_() {
        h();
    }

    private final void f() {
        arml arml;
        axpu axpu = (axpu) this.d;
        TextView textView = this.i;
        if ((axpu.a & 1) != 0) {
            arml = axpu.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(aabb.a(arml, this.h, false));
        this.i.setMaxLines(!this.e.f ? 2 : 4);
    }

    private final void g() {
        CharSequence charSequence;
        boolean z = this.e.f;
        this.j.setRotation(!z ? 360.0f : 180.0f);
        View view = this.j;
        if (z) {
            charSequence = this.o;
        } else {
            charSequence = this.n;
        }
        view.setContentDescription(charSequence);
        acvx acvx = this.c.a;
        if (this.e.f) {
            acvx.a(new acvs(acwc.SLIM_VIDEO_INFORMATION_RENDERER_COLLAPSE_ICON), null);
            acvx.c(new acvs(acwc.SLIM_VIDEO_INFORMATION_RENDERER_EXPAND_ICON));
            return;
        }
        acvx.a(new acvs(acwc.SLIM_VIDEO_INFORMATION_RENDERER_EXPAND_ICON), null);
        acvx.c(new acvs(acwc.SLIM_VIDEO_INFORMATION_RENDERER_COLLAPSE_ICON));
    }

    private final void h() {
        lsy lsy = this.e;
        azek azek = lsy.h;
        TextView textView;
        if (azek != null) {
            textView = this.l;
            arml arml = azek.b;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(textView, ajqy.a(arml));
            xpr.a(this.k, false);
            return;
        }
        axpu axpu = (axpu) this.d;
        arml arml2 = null;
        if (lsy.f || lsy.g) {
            textView = this.l;
            if ((axpu.a & 4) != 0) {
                arml2 = axpu.d;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            xpr.a(textView, ajqy.a(arml2));
            xpr.a(this.k, false);
            return;
        }
        textView = this.k;
        if ((axpu.a & 2) != 0) {
            arml2 = axpu.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml2));
        xpr.a(this.l, false);
    }
}
