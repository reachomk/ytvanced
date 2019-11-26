package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.SearchEditText;
import com.google.android.youtube.R;

/* renamed from: jml */
public final class jml extends akpl {
    public final ViewGroup a;
    public final SearchEditText b = ((SearchEditText) this.a.findViewById(R.id.search_edit_text));
    public final TextView c;
    public final Animation d;
    public boolean e;
    public CharSequence f;
    public jmh g;
    public boolean h;
    private final ImageView i;
    private final ImageView j;
    private final akvp k;
    private final xci l;
    private final Animation m;
    private boolean n;
    private axcs o;
    private String p;

    public jml(Context context, akvp akvp, xci xci) {
        this.k = akvp;
        this.l = xci;
        this.a = (ViewGroup) View.inflate(context, R.layout.search_box, null);
        this.b.addTextChangedListener(new jmo(this));
        this.b.setOnEditorActionListener(new jmm(this));
        this.b.setOnFocusChangeListener(new jmp(this));
        this.i = (ImageView) this.a.findViewById(R.id.search_icon);
        this.j = (ImageView) this.a.findViewById(R.id.clear);
        this.j.setOnClickListener(new jmk(this));
        this.c = (TextView) this.a.findViewById(R.id.cancel);
        this.c.setOnClickListener(new jmn(this));
        View view = this.c;
        xpr.a(view, view.getBackground());
        this.d = AnimationUtils.loadAnimation(context, R.anim.search_cancel_show);
        this.d.setAnimationListener(new jmr(this));
        this.m = AnimationUtils.loadAnimation(context, R.anim.search_cancel_hide);
        this.m.setAnimationListener(new jmq(this));
        this.h = false;
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final void b() {
        this.c.clearAnimation();
        if (this.f.length() > 0 || this.e) {
            this.c.setVisibility(0);
            this.h = true;
            return;
        }
        this.c.setVisibility(8);
        this.h = false;
    }

    public final void c() {
        if (this.n) {
            this.j.setVisibility(0);
            LayoutParams layoutParams = (LayoutParams) this.b.getLayoutParams();
            if (this.b.getEditableText().length() == 0) {
                layoutParams.addRule(16, R.id.cancel);
                this.b.setLayoutParams(layoutParams);
                this.j.setImageAlpha(0);
                this.j.setClickable(false);
                return;
            }
            layoutParams.addRule(16, R.id.clear);
            this.b.setLayoutParams(layoutParams);
            this.j.setImageAlpha(255);
            this.j.setClickable(true);
            return;
        }
        this.j.setImageAlpha(0);
        this.j.setVisibility(8);
    }

    public final void d() {
        this.f = "";
        f();
        c();
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (this.b.getEditableText().length() != 0 || z) {
            xpr.a(this.b);
            jmh jmh = this.g;
            if (jmh != null) {
                jmh.a();
            }
            this.l.c(new jmt(this.b.getEditableText().toString(), this.p));
        }
    }

    public final void e() {
        if (this.h) {
            this.c.startAnimation(this.m);
            this.h = false;
        }
    }

    private final void f() {
        this.b.setText(this.f);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        aphg aphg;
        ImageView imageView;
        axcs axcs = (axcs) obj;
        axcs axcs2 = this.o;
        if (axcs2 == null || axcs2 != axcs) {
            if ((axcs.a & 8) != 0) {
                arml arml = axcs.e;
                if (arml == null) {
                    arml = arml.f;
                }
                this.f = ajqy.a(arml);
                this.e = true;
            } else {
                this.f = "";
                this.e = false;
            }
            f();
        }
        if ((axcs.a & 16) != 0) {
            SearchEditText searchEditText = this.b;
            arml arml2 = axcs.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            searchEditText.setHint(ajqy.a(arml2));
            searchEditText = this.b;
            arml2 = axcs.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            searchEditText.setContentDescription(ajqy.a(arml2));
        }
        this.i.setVisibility(8);
        axcu axcu = axcs.c;
        if (axcu == null) {
            axcu = axcu.c;
        }
        if ((axcu.a & 1) != 0) {
            axcu = axcs.c;
            if (axcu == null) {
                axcu = axcu.c;
            }
            aphg = axcu.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 16) != 0) {
                imageView = this.i;
                akvp akvp = this.k;
                arwf arwf = aphg.e;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                imageView.setImageResource(akvp.a(a));
                this.i.setVisibility(0);
            }
        }
        this.n = false;
        axcq axcq = axcs.d;
        if (axcq == null) {
            axcq = axcq.c;
        }
        if ((axcq.a & 1) != 0) {
            axcq = axcs.d;
            if (axcq == null) {
                axcq = axcq.c;
            }
            aphg = axcq.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 16) != 0) {
                imageView = this.j;
                akvp akvp2 = this.k;
                arwf arwf2 = aphg.e;
                if (arwf2 == null) {
                    arwf2 = arwf.c;
                }
                arwh a2 = arwh.a(arwf2.b);
                if (a2 == null) {
                    a2 = arwh.UNKNOWN;
                }
                imageView.setImageResource(akvp2.a(a2));
                this.n = true;
                aodx aodx = aphg.q;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                if ((aodv.a & 2) != 0) {
                    imageView = this.j;
                    aodx aodx2 = aphg.q;
                    if (aodx2 == null) {
                        aodx2 = aodx.c;
                    }
                    aodv aodv2 = aodx2.b;
                    if (aodv2 == null) {
                        aodv2 = aodv.c;
                    }
                    imageView.setContentDescription(aodv2.b);
                }
            }
        }
        c();
        b();
        jmh jmh = null;
        Object a3 = akor != null ? akor.a("SearchBoxCoordinator.PRESENT_CONTEXT_KEY") : null;
        if (a3 instanceof jmh) {
            jmh = (jmh) a3;
        }
        this.g = jmh;
        jmh jmh2 = this.g;
        if (jmh2 != null) {
            jmh2.d = this;
            this.p = jmh2.c;
        }
        this.o = axcs;
    }
}
