package defpackage;

import android.content.res.Resources;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBar;
import com.google.android.youtube.R;

/* renamed from: emo */
public class emo extends emh {
    public final InlineTimeBar e;
    public boolean f;
    public boolean g;
    public boolean h;
    private boolean i;
    private boolean j = true;
    private boolean k;

    public emo(InlineTimeBar inlineTimeBar, ems ems) {
        super(inlineTimeBar, ems);
        this.e = inlineTimeBar;
        Resources resources = inlineTimeBar.getResources();
        this.c.o = resources.getColor(R.color.inline_time_bar_progress_color);
        this.c.n = resources.getColor(R.color.inline_time_bar_buffered_color);
    }

    public final void b(boolean z) {
        super.b(z);
        a(true, z);
    }

    public final void c(boolean z) {
        super.c(z);
        a(false, z);
    }

    public void a(aicd aicd) {
        super.a(aicd);
        this.k = aicd.c(aicd);
        this.j = aicd.p;
        h();
        d(false);
    }

    public final void f() {
        InlineTimeBar inlineTimeBar = this.e;
        int i = this.g ^ 1;
        if (!inlineTimeBar.l()) {
            int i2 = inlineTimeBar.i;
            if (i2 != 0) {
                if (i == 0 || i2 == 1) {
                    inlineTimeBar.f.a();
                } else {
                    emn emn = inlineTimeBar.f;
                    emn.a();
                    emn.f.postDelayed(emn.e, emn.d);
                }
            }
        }
    }

    public final void g() {
        c();
        d();
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        long d;
        if (this.e.l()) {
            d = this.e.d();
        } else {
            d = this.c.k;
        }
        this.b.c(aicm.a(d, this.c.i));
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        if (this.c.i > 0) {
            long k;
            aimt aimt = this.d;
            Object obj = null;
            if ((aimt == null || !aimt.a()) && this.e.l()) {
                obj = 1;
            }
            ems ems = this.b;
            if (obj != null) {
                k = this.e.k();
            } else {
                k = this.e.j();
            }
            ems.a(emh.a(k), emh.a(this.c.i));
        }
    }

    public final void d(boolean z) {
        Object obj = 1;
        Object obj2 = (this.j && this.i) ? 1 : null;
        if (this.h || (this.f && obj2 == null)) {
            obj = null;
        }
        InlineTimeBar inlineTimeBar = this.e;
        emi emi;
        if (obj != null) {
            emi = inlineTimeBar.e;
            if (emi.b() == 1.0f) {
                emi.d();
            } else {
                if (z) {
                    emi.e();
                } else {
                    emi.d();
                }
                emi.a.postInvalidate();
            }
            f();
            return;
        }
        emi = inlineTimeBar.e;
        if (emi.b() == 0.0f) {
            emi.c();
            return;
        }
        if (z) {
            emi.f();
        } else {
            emi.c();
            emi.a.b();
        }
        emi.a.postInvalidate();
    }

    public final void h() {
        InlineTimeBar inlineTimeBar = this.e;
        boolean z = true;
        if (!this.k && this.f) {
            z = false;
        }
        inlineTimeBar.a(z);
    }

    private final void a(boolean z, boolean z2) {
        this.i = z;
        d(z2);
    }

    public final void a(int i) {
        this.e.a(i);
    }

    public void a(float f) {
        this.e.setAlpha(f);
    }
}
