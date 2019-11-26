package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;

/* renamed from: zvi */
public final class zvi implements zwq {
    public static final int[] g = new int[0];
    private static final int[] q = new int[]{16842919, 16842910};
    public final Context a;
    public final Animation b;
    public View c;
    public zwj d;
    public boolean e;
    public ans f;
    private final zwt h;
    private final zwh i;
    private final Animation j;
    private final Animation k;
    private final ViewStub l;
    private RecyclerView m;
    private zvp n;
    private TextView o;
    private final apv p = new zvm(this);

    public zvi(Context context, zwt zwt, ViewStub viewStub, zwh zwh) {
        this.a = context;
        this.l = (ViewStub) amqw.a((Object) viewStub);
        this.h = (zwt) amqw.a((Object) zwt);
        this.i = (zwh) amqw.a((Object) zwh);
        this.b = AnimationUtils.loadAnimation(context, R.anim.top_translate_in);
        this.b.setAnimationListener(new zvk(this, zwt));
        this.j = AnimationUtils.loadAnimation(context, R.anim.top_translate_out);
        this.j.setAnimationListener(new zvj(this));
        this.k = AnimationUtils.loadAnimation(context, R.anim.top_translate_out);
    }

    public final void a(zwj zwj) {
        this.d = zwj;
    }

    public final void a(zuf zuf, int i, boolean z) {
        if (this.e) {
            this.m.e(i);
            return;
        }
        this.e = true;
        if (this.c == null) {
            this.c = this.l.inflate();
            this.c.findViewById(R.id.close).setOnClickListener(new zvo(this));
            this.m = (RecyclerView) this.c.findViewById(R.id.info_cards);
            this.f = new ans();
            this.m.a(new zvn(this));
            this.m.a(this.f);
            this.n = new zvp(this.a, false);
            this.m.a(this.n);
            this.m.a(this.p);
        }
        this.n.a(zuf.a(), this.i, this.d);
        CharSequence b = zuf.b();
        if (b != null) {
            this.o = (TextView) this.c.findViewById(R.id.info_card_drawer_title);
            this.o.setText(b);
            this.c.setContentDescription(b);
        }
        TextView textView = (TextView) this.c.findViewById(R.id.ad_badge);
        arwt arwt = zuf.a.g;
        if (arwt == null || (arwt.a & 1) == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (z && ((View) this.c.getParent()).isShown()) {
            this.c.setVisibility(4);
            this.c.post(new zvh(this));
        } else {
            this.c.setVisibility(0);
            this.h.a();
        }
        this.m.c(i);
        xrn.a((View) this.m.getParent());
        View childAt = this.m.getChildAt(Math.max(0, i) - this.f.p());
        if (childAt != null) {
            xrn.a(childAt);
        }
    }

    public final void a(boolean z) {
        if (this.e) {
            this.e = false;
            if (z && ((View) this.c.getParent()).isShown()) {
                this.c.startAnimation(this.j);
            } else {
                this.c.setVisibility(8);
            }
            this.h.b();
            return;
        }
        if (this.j.hasStarted() && !this.j.hasEnded()) {
            this.j.cancel();
        }
    }

    public final void a(zuf zuf, int i) {
        if (this.e) {
            this.e = false;
            if (((View) this.c.getParent()).isShown()) {
                this.k.setAnimationListener(new zvl(this, zuf, i));
                this.c.startAnimation(this.k);
            }
        }
    }

    public final void a(int i) {
        RecyclerView recyclerView = this.m;
        if (recyclerView != null) {
            recyclerView.c(i);
        }
    }

    public final void b(int i) {
        if (!(this.m == null || xrn.c(this.a))) {
            if (this.e) {
                this.m.e(i);
                zvi.a(this.f.c(i));
                return;
            }
            this.f.a_(i, 0);
            this.m.c(i);
        }
    }

    public final void a() {
        this.n.aa_();
    }

    public static void a(View view) {
        if (view instanceof CardView) {
            Drawable foreground = ((CardView) view).getForeground();
            if (foreground != null) {
                foreground.setState(q);
                view.postDelayed(new zvq(foreground), 250);
            }
        }
    }
}
