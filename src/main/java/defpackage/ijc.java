package defpackage;

import com.google.android.youtube.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ijc */
public final class ijc implements aimd, ajan, eib {
    public final ails a;
    public arnu b;
    private final iiv c;
    private final Set d = Collections.newSetFromMap(new WeakHashMap());
    private final int e;
    private final boolean f;
    private boolean g;

    public ijc(iiv iiv, List list, ails ails, acvx acvx, zyw zyw) {
        this.c = iiv;
        this.a = ails;
        this.d.addAll(list);
        this.d.add(iiv.b);
        this.e = ails.getContext().getResources().getDimensionPixelSize(R.dimen.fullscreen_engagement_action_bar_height);
        this.f = foh.d(zyw);
        for (iin iin : this.d) {
            iin.a(new ijb(acvx, iin, ails));
        }
        b();
    }

    public final void a(float f, boolean z) {
    }

    public final long e() {
        return 1;
    }

    public final void a(eja eja) {
        this.b = null;
        a();
    }

    public final void a(int i, int i2, int i3) {
        if (i != i2 || this.g != i3) {
            this.g = i3 != 0;
            a();
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().f().a(bcut.a()).a(new ije(this), ijd.a)};
    }

    public final void a() {
        arnu arnu = this.b;
        boolean z = true;
        boolean z2 = arnu != null && this.g;
        Object obj = (arnu == null || !this.a.d.a()) ? null : 1;
        if (!this.f) {
            this.c.a(this.b);
        }
        arnp a = iik.a(this.b);
        Object obj2 = (a == null || a.a.size() <= 0) ? null : 1;
        ails ails = this.a;
        int i = obj2 != null ? this.e : 0;
        if (ails.h != i) {
            ails.h = i;
            ails.h();
        }
        b();
        if (obj != null) {
            if (this.f) {
                this.c.a(this.b);
            }
            this.c.a(true, z2, true);
            return;
        }
        if (this.f && this.b == null) {
            this.c.a(null);
        }
        iiv iiv = this.c;
        if (this.b == null || this.a.d.c()) {
            z = false;
        }
        iiv.a(false, z2, z);
    }

    private final void b() {
        for (iin iin : this.d) {
            if (this.b == null) {
                iin.a(false);
            } else {
                int a = iin.a();
                if (a == 0) {
                    iin.a(this.a.d.c() ^ 1);
                } else if (a != 1) {
                    iin.a(false);
                } else {
                    iin.a(this.a.d.b());
                }
            }
        }
    }
}
