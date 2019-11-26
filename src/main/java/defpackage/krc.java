package defpackage;

import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;

/* renamed from: krc */
public class krc extends krd {
    public final akkq a;
    public final akvp b;
    private final View e;
    private final View f = this.e.findViewById(R.id.cta_button_start_filler);
    private final View g = this.e.findViewById(R.id.cta_button_touchable_wrapper);
    private final View h = this.e.findViewById(R.id.cta_button_end_filler);
    private final TextView i = ((TextView) this.e.findViewById(R.id.cta_button));
    private final View j = this.e.findViewById(R.id.ad_cta_button);
    private final eza k;
    private final eph l;
    private final boolean m;

    protected krc(akkq akkq, akvp akvp, akvo akvo, View view, View view2, boolean z) {
        super(akvo, view, view2);
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (akvp) amqw.a((Object) akvp);
        this.m = z;
        this.e = view2.findViewById(R.id.cta_button_wrapper);
        this.k = krl.a(view.getContext());
        view.setBackground(this.k);
        View view3 = this.i;
        xpr.a(view3, view3.getBackground());
        if (this.j != null) {
            this.l = new eph(akkq, view.getContext(), akvp, null, this.j);
            return;
        }
        this.l = null;
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajyp ajyp, aviq aviq, Integer num) {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajyx ajyx, aviq aviq) {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajzc ajzc, aviq aviq) {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajyq ajyq, aviq aviq, Integer num) {
        super.a(acvx, obj, ajyq, aviq);
        awqz awqz = null;
        aohg aohg = ajzv.b(ajyq.o, aohe.class) ? (aohg) ((anxo) ((aohe) ajzv.a(ajyq.o, aohe.class)).toBuilder()) : null;
        if (!(aohg == null || num == null)) {
            aohg.a(num.intValue());
            ajzv.a(ajyq.o, AdCtaButtonRendererOuterClass.adCtaButtonRenderer, (anxl) aohg.build());
        }
        Spanned a = ajqy.a(ajyq.f);
        aohe aohe = aohg != null ? (aohe) ((anxl) aohg.build()) : null;
        awqw awqw = ajyq.q;
        if (awqw != null) {
            awqz = (awqz) ((anxo) awqw.toBuilder());
        }
        a(a, aohe, awqz, ajyq.n);
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajym ajym) {
        super.a(acvx, obj, ajym);
        a(null, null, null, false);
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajym ajym, awpq awpq, boolean z) {
        aohe aohe;
        Spanned spanned;
        super.a(acvx, obj, ajym);
        anxp anxp = awpq.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        anxp.a(access$000);
        boolean a = anxp.h.a(access$000.d);
        awqz awqz = null;
        if (a) {
            anxp = awpq.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            anxp.a(access$0002);
            Object b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aohe = (aohe) b;
        } else {
            aohe = null;
        }
        if (aohe == null) {
            spanned = null;
        } else {
            arml arml = aohe.d;
            if (arml == null) {
                arml = arml.f;
            }
            spanned = ajqy.a(arml);
        }
        anxl anxl;
        if (z) {
            if ((awpq.a & 8) != 0) {
                anxl = awpq.e;
                if (anxl == null) {
                    anxl = awqw.d;
                }
                awqz = (awqz) ((anxo) anxl.toBuilder());
            }
        } else if ((awpq.a & 4) != 0) {
            anxl = awpq.d;
            if (anxl == null) {
                anxl = awqw.d;
            }
            awqz = (awqz) ((anxo) anxl.toBuilder());
        }
        a(spanned, aohe, awqz, false);
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajyq ajyq, awpi awpi, boolean z) {
        aohe aohe;
        Spanned spanned;
        awqz awqz = null;
        super.a(acvx, obj, ajyq, null);
        anxp anxp = awpi.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = awpi.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aohe = (aohe) b;
        } else {
            aohe = null;
        }
        if (aohe == null) {
            spanned = null;
        } else {
            arml arml = aohe.d;
            if (arml == null) {
                arml = arml.f;
            }
            spanned = ajqy.a(arml);
        }
        anxl anxl;
        if (z) {
            if ((awpi.a & 8) != 0) {
                anxl = awpi.e;
                if (anxl == null) {
                    anxl = awqw.d;
                }
                awqz = (awqz) ((anxo) anxl.toBuilder());
            }
        } else if ((awpi.a & 4) != 0) {
            anxl = awpi.d;
            if (anxl == null) {
                anxl = awqw.d;
            }
            awqz = (awqz) ((anxo) anxl.toBuilder());
        }
        a(spanned, aohe, awqz, false);
    }

    public final void a(Spanned spanned, aohe aohe, awqz awqz, boolean z) {
        View view;
        View view2;
        boolean z2 = false;
        View view3;
        if (aohe != null) {
            if (this.j == null || this.l == null) {
                this.e.setVisibility(8);
                view3 = null;
            } else {
                this.e.setVisibility(0);
                this.i.setVisibility(8);
                this.j.setVisibility(0);
                view3 = this.j;
                this.l.a((Object) aohe);
            }
            view = view3;
        } else {
            xpr.a(this.i, (CharSequence) spanned);
            View view4 = this.i;
            view2 = this.e;
            if (spanned != null) {
                z2 = true;
            }
            xpr.a(view2, z2);
            view3 = this.j;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            view = view4;
        }
        if (this.m && this.e.getVisibility() == 0) {
            view2 = this.f;
            if (view2 != null) {
                View view5 = this.g;
                if (view5 != null) {
                    View view6 = this.h;
                    if (!(view6 == null || view == null)) {
                        krc.a(this.e, view2, view5, view6, view, awqz);
                    }
                }
            }
        }
        this.k.a(z);
    }

    public static void a(View view, View view2, View view3, View view4, View view5, awqz awqz) {
        LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParams2 = view2.getLayoutParams();
        LayoutParams layoutParams3 = view3.getLayoutParams();
        LayoutParams layoutParams4 = view4.getLayoutParams();
        LayoutParams layoutParams5 = view5.getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams4 instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams2;
            LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams3;
            LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams4;
            if (awqz != null) {
                if (awqz.a() < 0.0f) {
                    awqz.a(0.0f);
                } else if (awqz.a() > 1.0f) {
                    awqz.a(1.0f);
                }
            }
            if (awqz == null) {
                layoutParams.width = -2;
                layoutParams6.width = 0;
                layoutParams7.width = -2;
                layoutParams8.width = 0;
                layoutParams5.width = -2;
                layoutParams6.weight = 0.0f;
                layoutParams7.weight = 0.0f;
                layoutParams8.weight = 0.0f;
            } else if (awqz.a() == 1.0f) {
                layoutParams.width = -1;
                layoutParams6.width = 0;
                layoutParams7.width = -1;
                layoutParams8.width = 0;
                layoutParams5.width = -1;
                layoutParams6.weight = 0.0f;
                layoutParams7.weight = 0.0f;
                layoutParams8.weight = 0.0f;
            } else {
                layoutParams.width = -1;
                layoutParams6.width = 0;
                layoutParams7.width = -2;
                layoutParams8.width = 0;
                layoutParams5.width = -1;
                float a = 1.0f - awqz.a();
                layoutParams7.weight = awqz.a();
                int a2 = awqu.a(((awqw) awqz.instance).b);
                if (a2 == 0) {
                    a2 = 1;
                }
                a2--;
                if (a2 == 2) {
                    layoutParams6.weight = a;
                    layoutParams8.weight = 0.0f;
                } else if (a2 != 3) {
                    layoutParams6.weight = 0.0f;
                    layoutParams8.weight = a;
                } else {
                    a /= 2.0f;
                    layoutParams6.weight = a;
                    layoutParams8.weight = a;
                }
            }
            view.requestLayout();
        }
    }
}
