package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.google.android.youtube.R;

/* renamed from: zvs */
public class zvs extends aiua implements AnimationListener {
    private Animation a;
    public zvw b;
    public boolean c;
    public final View d;
    public final RecyclerView e;
    public final ans f;
    public final zvp g;
    public final View h;
    public final zwa i;
    public zwj j;
    public final Animation k;
    public final Animation l;
    public Animation m;
    public Animation n;
    public Runnable o;
    private Animation p;
    private Animation q;
    private Animation r;
    private int s = -1;
    private final apv t;

    public zvs(Context context, zwa zwa) {
        super(context);
        Resources resources = context.getResources();
        this.i = zwa;
        this.k = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.l = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        long integer = (long) resources.getInteger(R.integer.fade_duration_fast);
        this.k.setDuration(integer);
        this.l.setDuration(integer);
        this.l.setAnimationListener(this);
        LayoutInflater.from(context).inflate(R.layout.info_card_drawer_overlay, this);
        this.d = findViewById(R.id.info_cards_drawer);
        findViewById(R.id.info_cards_drawer_close).setOnClickListener(new zvr(this));
        this.e = (RecyclerView) findViewById(R.id.info_cards);
        this.f = new ans();
        this.e.a(new zvu(context));
        this.e.a(this.f);
        this.g = new zvp(context, true);
        this.e.a(this.g);
        this.t = new zvt(this);
        this.h = findViewById(R.id.info_cards_drawer_separator);
        this.e.a(this.t);
        d();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void c() {
        int g = abe.g(this);
        if (g != this.s) {
            this.s = g;
            if (g == 0) {
                if (this.q == null) {
                    this.q = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_right_translate_in);
                    this.q.setAnimationListener(this);
                }
                if (this.r == null) {
                    this.r = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_right_translate_out);
                    this.r.setAnimationListener(this);
                }
                this.m = this.q;
                this.n = this.r;
                return;
            }
            if (this.a == null) {
                this.a = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_left_translate_in);
                this.a.setAnimationListener(this);
            }
            if (this.p == null) {
                this.p = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_left_translate_out);
                this.p.setAnimationListener(this);
            }
            this.m = this.a;
            this.n = this.p;
        }
    }

    public final void d() {
        this.d.setVisibility(8);
        zwa zwa = this.i;
        if (zwa != null) {
            zwa.setVisibility(0);
            this.i.c();
        }
    }

    public LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(int i) {
        if (this.d.isShown()) {
            if (!xrn.c(getContext())) {
                zvi.a(this.f.c(i));
                this.e.e(i);
            }
            return;
        }
        this.e.c(i);
    }

    public final boolean e() {
        int i = 0;
        boolean z = this.d.getVisibility() == 0 && !this.c;
        if (!z) {
            i = 8;
        }
        setVisibility(i);
        return z;
    }

    public final void onAnimationEnd(Animation animation) {
        if (animation == this.l) {
            setVisibility(8);
            a((ViewGroup) this);
        }
        if (animation == this.m) {
            xrn.a(this.d);
            View findFocus = this.e.findFocus();
            if (findFocus == null) {
                findFocus = this.e.getChildAt(0);
            }
            if (findFocus != null) {
                xrn.a(findFocus);
            }
        }
        if (animation == this.n) {
            this.d.setVisibility(8);
            Runnable runnable = this.o;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private final void a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.clearAnimation();
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
        }
    }
}
