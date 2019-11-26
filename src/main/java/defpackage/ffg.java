package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ffg */
public final class ffg implements OnClickListener, ejc, ffn {
    public ffk a;
    public ffm b;
    public FloatingActionButton c;
    public final Context d;
    public fff e;
    public fff f;
    public boolean g;
    public ObjectAnimator h;
    public ObjectAnimator i;
    public ffl j;
    public boolean k;
    public final fmx l;
    public acvx m;
    private final bcaa n;
    private final akvp o;
    private int p;
    private final eyb q = new eyb();

    public ffg(Context context, bcaa bcaa, akvp akvp, eif eif, fmx fmx) {
        this.d = context;
        this.n = bcaa;
        this.o = akvp;
        this.l = fmx;
        eif.a(this);
    }

    public final void a(fff fff) {
        if (this.k) {
            if (fff != null) {
                if (this.e == fff) {
                    a();
                    return;
                } else if (this.h.isRunning() || this.i.isRunning() || (ffg.d(fff) && !this.j.a(fff))) {
                    this.f = fff;
                    return;
                }
            }
            c(fff);
            this.f = null;
        }
    }

    private final void c(fff fff) {
        this.e = fff;
        b();
        fff = this.e;
        if (fff == null) {
            a(false);
            return;
        }
        ffk b = b(fff);
        if (b != null) {
            b.b();
            b.a(this.p);
            if (b instanceof ffm) {
                ffm ffm = (ffm) b;
                ffl ffl = this.j;
                int b2 = ffl.b(fff);
                if (b2 != -1) {
                    ffl.b.get(b2);
                }
                ffm.c();
            }
        }
        arwf a = this.e.a();
        if (a != null) {
            akvp akvp = this.o;
            arwh a2 = arwh.a(a.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            this.c.setImageResource(akvp.a(a2));
        } else {
            this.c.setImageDrawable(null);
        }
        this.c.setContentDescription(this.e.c());
        a();
    }

    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            ffg.a(this.i);
            if (this.c.getVisibility() != 0) {
                a(false);
                this.h.start();
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            ObjectAnimator objectAnimator = this.i;
            if (!(objectAnimator == null || objectAnimator.isStarted())) {
                ffg.a(this.h);
                if (this.c.getVisibility() != 8) {
                    this.i.start();
                }
            }
            return;
        }
        ffg.a(this.h);
        this.c.setScaleX(0.0f);
        this.c.setScaleY(0.0f);
        this.c.setVisibility(8);
    }

    private static void a(ObjectAnimator objectAnimator) {
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
    }

    public final void b() {
        this.b.c();
    }

    public final void onClick(View view) {
        fff fff = this.e;
        if (fff != null) {
            String str = "com.google.android.libraries.youtube.innertube.endpoint.tag";
            Map hashMap;
            if (fff.d() != null) {
                hashMap = new HashMap();
                hashMap.put(str, this.e);
                ((aaas) this.n.get()).a(this.e.d(), hashMap);
            } else if (this.e.b() != null) {
                hashMap = new HashMap();
                hashMap.put(str, this.e);
                ((aaas) this.n.get()).a(this.e.b(), hashMap);
            }
        }
    }

    public final ffk b(fff fff) {
        if (fff instanceof ffe) {
            return this.a;
        }
        if ((fff instanceof ffh) || (fff instanceof ffp)) {
            return this.b;
        }
        return null;
    }

    public final void a(int i, int i2) {
        this.q.a(i, i2);
        i = this.q.b;
        this.p = i;
        fff fff = this.e;
        if (fff != null) {
            ffk b = b(fff);
            if (b != null) {
                b.a(i);
            }
        }
    }

    public final void c() {
        fff fff = this.f;
        if (fff == null) {
            return;
        }
        if (!ffg.d(fff) || this.j.a(this.f)) {
            c(this.f);
            this.f = null;
        }
    }

    private static boolean d(fff fff) {
        return (fff instanceof ffh) || (fff instanceof ffp);
    }

    public final void d() {
        FloatingActionButton floatingActionButton = this.c;
        if (floatingActionButton != null) {
            floatingActionButton.setTranslationY(0.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.c.setVisibility(8);
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        boolean z = this.g;
        boolean z2 = (ejd2.g() && ejd2.a()) ? false : true;
        this.g = z2;
        if (z != z2 && this.e != null) {
            if (z2) {
                a();
            } else {
                a(true);
            }
        }
    }
}
