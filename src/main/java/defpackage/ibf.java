package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ibf */
public final class ibf implements ejc, ela, ell, xcp {
    public final Handler a;
    public final Set b;
    public AnimatedVectorDrawable c;
    public View d;
    public long e;
    public boolean f;
    private final Context g;
    private final eif h;
    private final elm i;
    private final ekt j;
    private final ibi k;
    private final long l;
    private Animation m;
    private Runnable n;
    private boolean o = false;
    private final int p;

    public ibf(Context context, xci xci, elm elm, eif eif, ekt ekt, aoqn aoqn) {
        boolean z = false;
        if ((aoqn.a & 2) != 0) {
            z = true;
        }
        amqw.b(z);
        this.g = (Context) amqw.a((Object) context);
        this.i = (elm) amqw.a((Object) elm);
        this.h = (eif) amqw.a((Object) eif);
        this.j = (ekt) amqw.a((Object) ekt);
        this.a = new ibj(this);
        this.b = new HashSet();
        this.l = (long) aoqn.b;
        aoqj aoqj = aoqn.c;
        if (aoqj == null) {
            aoqj = aoqj.c;
        }
        int a = aoqi.a(aoqj.b);
        if (a == 0) {
            a = 1;
        }
        this.p = a;
        ibi ibi = new ibi();
        ibi.a(6, R.drawable.jumprope_animation, 1000);
        ibi.a(5, R.drawable.origami_simple_animation, 4900);
        ibi.a(8, R.drawable.springy_animation, 3000);
        ibi.a(4, R.drawable.standard_spinner_animation, 2700);
        ibi.a(7, R.drawable.wavey_strokes_animation, 3000);
        this.k = ibi;
        amqw.b(this.k.a(this.p));
        xci.a((Object) this);
        elm.a(this);
        eif.a(this);
        ekt.a((ela) this);
    }

    public final void c() {
        View view = this.d;
        if (view == null || this.c == null) {
            this.o = false;
            return;
        }
        ((ImageView) view.findViewById(R.id.animated_spinner)).setImageDrawable(this.c);
        this.m = AnimationUtils.loadAnimation(this.g, R.anim.fade_out);
        this.m.setDuration((long) this.g.getResources().getInteger(R.integer.fade_duration_slow));
        this.m.setAnimationListener(new ibh(this));
        this.n = new ibe(this);
        this.o = true;
    }

    public final void A_() {
        e();
    }

    public final void ar_() {
        a(false);
    }

    public final void a(ejd ejd, ejd ejd2) {
        boolean c = ejd.c();
        boolean c2 = ejd2.c();
        if (c && !c2) {
            a(true);
        } else if (!c && c2) {
            e();
        }
    }

    private final void e() {
        if (this.h.c().c() && this.i.b && this.j.b == 1) {
            if (!this.o && this.c == null && this.k.a(this.p)) {
                ibi ibi = this.k;
                int i = this.p;
                SparseLongArray sparseLongArray = ibi.b;
                int i2 = i - 1;
                if (i != 0) {
                    this.e = sparseLongArray.get(i2);
                    Context context = this.g;
                    ibi ibi2 = this.k;
                    i2 = this.p;
                    SparseIntArray sparseIntArray = ibi2.a;
                    int i3 = i2 - 1;
                    if (i2 != 0) {
                        this.c = (AnimatedVectorDrawable) context.getDrawable(sparseIntArray.get(i3));
                        c();
                    } else {
                        throw null;
                    }
                }
                throw null;
            }
            f();
            if (!this.f && this.o) {
                this.f = true;
                b(true);
                if (this.a.hasMessages(1)) {
                    this.a.removeMessages(1);
                }
                this.a.sendMessageDelayed(d(), this.l);
                for (ibg av_ : this.b) {
                    av_.av_();
                }
            }
        }
    }

    private final void a(boolean z) {
        if (this.f) {
            if (z) {
                this.d.startAnimation(this.m);
            }
            f();
        }
    }

    public final void a(int i) {
        if (i != 1) {
            a(false);
        } else {
            e();
        }
    }

    private final void f() {
        if (this.f && this.o) {
            this.f = false;
            if (this.a.hasMessages(1)) {
                this.a.removeMessages(1);
            }
            if (this.c.isRunning()) {
                this.c.stop();
            }
            b(false);
            for (ibg av_ : this.b) {
                av_.av_();
            }
        }
    }

    public final Message d() {
        return this.a.obtainMessage(1, this.n);
    }

    private final void b(boolean z) {
        if ((this.d.getVisibility() == 0) == z) {
            return;
        }
        if (z || this.d.getAnimation() != this.m) {
            xpr.a(this.d, z);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjc.class};
        } else if (i == 0) {
            a(false);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
