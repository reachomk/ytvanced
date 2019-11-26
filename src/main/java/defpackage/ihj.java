package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ihj */
abstract class ihj implements epk, iha {
    public final akkq a;
    public View b;
    public View c;
    public View d;
    public ImageView e;
    public View f;
    public View g;
    public Object h;
    public ihc i;
    public boolean j = false;
    public int k;
    public int l;
    public int m;
    private final Context n;
    private AnimatorSet o;
    private AnimatorSet p;
    private AnimatorSet q;
    private AnimatorSet r;
    private AnimatorSet s;
    private AnimatorSet t;
    private AnimatorSet u;
    private boolean v;
    private int w;

    public ihj(Context context, akkq akkq) {
        this.a = (akkq) amqw.a((Object) akkq);
        this.n = (Context) amqw.a((Object) context);
        b();
    }

    public void a(ihc ihc) {
        throw null;
    }

    public void a(boolean z) {
        throw null;
    }

    public abstract void b(View view);

    public void b() {
        this.k = 1;
        this.w = 1;
        this.l = 1;
        this.m = 1;
        if (this.b != null) {
            c();
            d();
            e();
        }
        this.i = null;
        this.v = false;
        this.h = null;
    }

    public final void a(Object obj) {
        this.h = obj;
    }

    public void a(View view) {
        try {
            if (this.b == null) {
                xoe xoe = new xoe(this.n);
                b(view);
                ArrayList arrayList = new ArrayList();
                this.o = new AnimatorSet();
                Animator clone = AnimatorInflater.loadAnimator(this.n, R.animator.show_ad_cta_icon).clone();
                clone.setTarget(this.e);
                arrayList.add(clone);
                this.o.playTogether(arrayList);
                arrayList = new ArrayList();
                this.p = new AnimatorSet();
                clone = AnimatorInflater.loadAnimator(this.n, R.animator.hide_ad_cta_icon).clone();
                clone.setTarget(this.e);
                arrayList.add(clone);
                this.p.playTogether(arrayList);
                arrayList = new ArrayList();
                this.q = new AnimatorSet();
                clone = AnimatorInflater.loadAnimator(this.n, R.animator.show_ad_cta_expanded_background).clone();
                clone.setTarget(this.c);
                arrayList.add(clone);
                clone = AnimatorInflater.loadAnimator(this.n, R.animator.show_ad_cta_metadata).clone();
                clone.setTarget(this.d);
                arrayList.add(clone);
                this.q.playTogether(arrayList);
                this.r = new AnimatorSet();
                arrayList = new ArrayList();
                clone = AnimatorInflater.loadAnimator(this.n, R.animator.hide_ad_cta_expanded_background).clone();
                clone.setTarget(this.c);
                arrayList.add(clone);
                clone = AnimatorInflater.loadAnimator(this.n, R.animator.hide_ad_cta_metadata).clone();
                clone.setTarget(this.d);
                arrayList.add(clone);
                this.r.playTogether(arrayList);
                arrayList = new ArrayList();
                this.s = new AnimatorSet();
                clone = AnimatorInflater.loadAnimator(this.n, R.animator.show_ad_cta_collapsed_button).clone();
                clone.setTarget(this.g);
                arrayList.add(clone);
                this.s.playTogether(arrayList);
                arrayList = new ArrayList();
                this.t = new AnimatorSet();
                clone = AnimatorInflater.loadAnimator(this.n, R.animator.hide_ad_cta_collapsed_button).clone();
                clone.setTarget(this.g);
                arrayList.add(clone);
                this.t.playTogether(arrayList);
                arrayList = new ArrayList();
                this.u = new AnimatorSet();
                arrayList.add(this.p.clone());
                arrayList.add(this.r.clone());
                arrayList.add(this.t.clone());
                this.u.playTogether(arrayList);
                this.u.setDuration(0);
                d();
                e();
                c();
            }
        } catch (Exception e) {
            afpc.a(1, afpf.ad, "Error inflating YouTubeBaseCollapsibleAdCtaInnerOverlay:", e);
        }
    }

    private final void b(boolean z) {
        AnimatorSet clone = this.o.clone();
        if (!z) {
            clone.setDuration(0);
        }
        clone.start();
    }

    private final void c() {
        this.u.start();
    }

    public void a(Object obj, List list) {
        ihc ihc = this.i;
        if (ihc != null) {
            ihc.a(obj, list);
        }
    }

    private final void d() {
        this.g.setClickable(false);
        this.e.setClickable(false);
        boolean z = this.k == 5;
        if (this.m == 2) {
            this.g.setClickable(z);
            this.e.setClickable(false);
        }
        if (this.m == 3) {
            this.g.setClickable(z);
            this.e.setClickable(z);
        }
    }

    private final void e() {
        this.f.setClickable(false);
        this.c.setClickable(false);
        boolean z = this.k == 4;
        if (this.l == 2) {
            this.f.setClickable(z);
            this.c.setClickable(false);
        }
        if (this.l == 3) {
            this.f.setClickable(z);
            this.c.setClickable(z);
        }
    }

    public void a() {
        View view = this.b;
        if (view != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.bottomMargin = !this.j ? 0 : 30;
            this.b.setLayoutParams(marginLayoutParams);
        }
    }

    public void a(int i, boolean z) {
        if (this.e != null) {
            int i2 = this.k;
            if (!(i2 == i && this.v == z)) {
                this.w = i2;
                this.k = i;
                this.v = z;
                d();
                e();
                i = this.k;
                int i3 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i3 == 1) {
                    b(this.v);
                } else if (i3 == 2) {
                    c();
                } else if (i3 == 3) {
                    boolean z2 = this.v;
                    b(false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.q.clone());
                    if (this.w == 5) {
                        arrayList.add(this.t.clone());
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (!z2) {
                        animatorSet.setDuration(0);
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.start();
                } else if (i3 == 4) {
                    z = this.v;
                    b(false);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(this.s.clone());
                    if (this.w == 4) {
                        arrayList2.add(this.r.clone());
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (!z) {
                        animatorSet2.setDuration(0);
                    }
                    animatorSet2.playTogether(arrayList2);
                    animatorSet2.start();
                }
            }
        }
    }
}
