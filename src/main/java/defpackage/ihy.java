package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.youtube.R;

/* renamed from: ihy */
public final class ihy extends aiua implements enc, vwf {
    private aohe A;
    private jsr B;
    private View C;
    private float D;
    private ejd E;
    private int F;
    private int G = 1;
    public ViewGroup a;
    public int b;
    public int c;
    public vwe d;
    private final Context e;
    private final akkq f;
    private final int g;
    private final vrk h;
    private final epj i;
    private ImageView j;
    private ImageView k;
    private TextView l;
    private View m;
    private TextView n;
    private View o;
    private TextView p;
    private TextView q;
    private View r;
    private TextView s;
    private TextView t;
    private View u;
    private CharSequence v;
    private TimeBar w;
    private aihk x;
    private View y;
    private eph z;

    public ihy(Context context, akkq akkq, int i, vrk vrk, epj epj) {
        super(context);
        this.e = context;
        this.f = (akkq) amqw.a((Object) akkq);
        this.g = i;
        this.h = (vrk) amqw.a((Object) vrk);
        this.i = (epj) amqw.a((Object) epj);
    }

    public final void c() {
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.l.setClickable(false);
            this.m.setVisibility(8);
            this.n.setVisibility(8);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            this.u.setVisibility(8);
            this.q.setVisibility(8);
            this.t.setVisibility(8);
            this.s.setVisibility(8);
            this.x.g();
            this.w.a(this.x);
            this.j.setClickable(false);
            this.r.setClickable(false);
            this.y.setBackgroundColor(this.F);
        }
        eph eph = this.z;
        if (eph != null) {
            eph.a();
        }
        jsr jsr = this.B;
        if (jsr != null) {
            jsr.a();
        }
        this.b = 0;
        this.c = 0;
        this.v = null;
        setVisibility(8);
    }

    public final void a(long j, long j2) {
        if (this.a != null) {
            long j3 = (long) ((int) j2);
            this.x.a((long) ((int) (j2 - j)), 0, j3, j3);
            this.w.a(this.x);
            String b = xvd.b((long) ((int) Math.ceil((double) (((float) j) / 1000.0f))));
            this.q.setText(this.a.getResources().getString(R.string.ad_normal, new Object[]{" · ", b}));
        }
    }

    public final void a(Bitmap bitmap) {
        this.k.setImageBitmap(bitmap);
        this.k.setVisibility(bitmap != null ? 0 : 4);
        if (!TextUtils.isEmpty(this.v)) {
            this.k.setContentDescription(this.v);
        }
    }

    public final void a(boolean z) {
        setVisibility(!z ? 8 : 0);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final boolean a(ejd ejd) {
        return emq.a(ejd);
    }

    public final void b(ejd ejd) {
        this.E = ejd;
        jsr jsr;
        if (ejd.f()) {
            if (this.a != null) {
                this.l.setVisibility(8);
                this.m.setVisibility(8);
                this.n.setVisibility(8);
                this.t.setVisibility(8);
                this.s.setVisibility(8);
                this.u.setVisibility(8);
                this.y.setClickable(false);
                if (this.A != null) {
                    this.z.a();
                }
                jsr = this.B;
                if (jsr != null) {
                    jsr.a();
                }
            }
        } else if (this.a != null) {
            ihy.a(this.l);
            ihy.a(this.t);
            ihy.a(this.s);
            xpr.a(this.u, this.h.f ^ 1);
            this.y.setClickable(true);
            aohe aohe = this.A;
            if (aohe == null || this.B == null) {
                this.m.setVisibility(0);
                ihy.a(this.n);
            } else {
                this.z.a(aohe, null);
            }
            jsr = this.B;
            if (jsr != null) {
                jsr.a(this.D, this.G);
            }
        }
    }

    private static void a(TextView textView) {
        if (textView != null) {
            textView.setVisibility(!TextUtils.isEmpty(textView.getText()) ? 0 : 8);
        }
    }

    public final void a(aolm aolm) {
        if (!(this.C == null || (aolm.a & 2) == 0)) {
            aolq aolq = aolm.c;
            if (aolq == null) {
                aolq = aolq.c;
            }
            if (aolq.a == 1) {
                aolq = aolm.c;
                if (aolq == null) {
                    aolq = aolq.c;
                }
                ayiv ayiv = aolq.a == 1 ? (ayiv) aolq.b : ayiv.i;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setStartOffset((long) ayiv.c);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setDuration((long) ayiv.b);
                TranslateAnimation translateAnimation = new TranslateAnimation(((float) (this.a.getWidth() / 2)) * ayiv.d, 0.0f, ((float) (this.a.getHeight() / 2)) * ayiv.e, 0.0f);
                translateAnimation.setStartOffset((long) ayiv.c);
                translateAnimation.setFillAfter(true);
                translateAnimation.setDuration((long) ayiv.b);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(translateAnimation);
                this.C.startAnimation(animationSet);
            }
        }
        aolo aolo = aolm.b;
        if (aolo == null) {
            aolo = aolo.c;
        }
        if (aolo.a == 1) {
            aolo aolo2 = aolm.b;
            if (aolo2 == null) {
                aolo2 = aolo.c;
            }
            ayit ayit = aolo2.a == 1 ? (ayit) aolo2.b : ayit.e;
            if (VERSION.SDK_INT >= 21) {
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                float max = (float) (Math.max(width, height + height) / 2);
                ViewGroup viewGroup = this.a;
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(viewGroup, Math.round(((float) viewGroup.getWidth()) * ayit.c), Math.round(((float) this.a.getHeight()) * ayit.d), 0.01f * max, max + max);
                createCircularReveal.setDuration((long) ayit.b);
                createCircularReveal.start();
            }
        }
    }

    public final void a(Spanned spanned, CharSequence charSequence, Spanned spanned2, float f, CharSequence charSequence2, aygk aygk, aohe aohe, Integer num, aolm aolm, int i, boolean z, boolean z2, boolean z3) {
        Spanned spanned3 = spanned;
        float f2 = f;
        aygk aygk2 = aygk;
        aolm aolm2 = aolm;
        int i2 = i;
        if (this.a == null) {
            this.a = (ViewGroup) LayoutInflater.from(this.e).inflate(R.layout.endcap_layout, this);
            this.y = this.a.findViewById(R.id.endcap_layout);
            this.j = (ImageView) this.a.findViewById(R.id.background_image);
            this.C = this.a.findViewById(R.id.metadata_container);
            this.k = (ImageView) this.C.findViewById(R.id.ad_thumbnail);
            this.l = (TextView) this.C.findViewById(R.id.title);
            this.m = this.C.findViewById(R.id.action_button);
            this.n = (TextView) this.C.findViewById(R.id.action_button_text);
            this.o = this.C.findViewById(R.id.action_cta_button);
            this.p = (TextView) this.C.findViewById(R.id.ad_cta_button_text);
            this.r = this.C.findViewById(R.id.description_container);
            this.s = (TextView) this.r.findViewById(R.id.app_store_text);
            this.t = (TextView) this.r.findViewById(R.id.ratings_count_text);
            this.q = (TextView) this.a.findViewById(R.id.ad_text);
            this.u = this.a.findViewById(R.id.skip_ad_button);
            this.w = (TimeBar) this.a.findViewById(R.id.time_bar);
            this.x = new aihk();
            this.x.o = aicd.i.q;
            this.x.q = aicd.i.r;
            this.x.r = aicd.i.x;
            this.x.s = aicd.i.t;
            this.x.t = aicd.i.y;
            this.w.a(this.x);
            if (this.z == null) {
                this.z = this.i.a(null, this.o);
            }
            if (this.B == null) {
                this.B = new jsr(this.C);
            }
            this.F = ((ColorDrawable) this.y.getBackground()).getColor();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.u.getLayoutParams();
            layoutParams.bottomMargin += this.g;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams2.bottomMargin += this.g;
            this.u.setOnClickListener(new iic(this));
            this.u.setOnTouchListener(new iib(this));
            this.m.setOnClickListener(new iie(this));
            this.o.setOnClickListener(new iid(this));
            this.k.setOnClickListener(new ihx(this));
            this.l.setOnClickListener(new iia(this));
            this.r.setOnClickListener(new ihz(this));
        }
        c();
        this.v = spanned3;
        this.l.setText(spanned);
        ihy.a(this.l);
        this.l.setClickable(z2);
        Spanned spanned4 = spanned2;
        this.s.setText(spanned2);
        ihy.a(this.s);
        CharSequence charSequence3 = charSequence2;
        this.t.setText(charSequence2);
        ihy.a(this.t);
        this.r.setClickable(z3);
        View view = this.u;
        boolean z4 = (TextUtils.isEmpty(this.v) || this.h.f) ? false : true;
        xpr.a(view, z4);
        xpr.a(this.q, TextUtils.isEmpty(this.v) ^ 1);
        this.w.setEnabled(TextUtils.isEmpty(this.v) ^ 1);
        this.D = f2;
        this.G = i2;
        this.B.a(f, i2);
        if (num.intValue() != 0) {
            this.y.setBackgroundColor(num.intValue());
        }
        if (aygk2 != null) {
            this.f.a(this.j, aygk2);
            this.j.setVisibility(0);
            this.j.setClickable(z);
            this.j.setImageAlpha(63);
        } else {
            this.j.setVisibility(8);
        }
        this.A = aohe;
        aohe aohe2 = this.A;
        if (aohe2 != null) {
            this.z.a(aohe2, null);
        } else {
            this.m.setVisibility(0);
            CharSequence charSequence4 = charSequence;
            this.n.setText(charSequence);
            ihy.a(this.n);
        }
        ejd ejd = this.E;
        if ((ejd == null || ejd.c()) && aolm2 != null) {
            if (abe.H(this.a)) {
                a(aolm2);
            } else {
                this.a.getViewTreeObserver().addOnGlobalLayoutListener(new iig(this, aolm2));
            }
        }
        setVisibility(0);
    }
}
