package defpackage;

import android.content.res.Resources;
import android.view.View;

/* renamed from: xnz */
public final class xnz extends xmv {
    public final View a;
    public long b;
    public long c;
    private final zl d;
    private int e;
    private int f;
    private xqa g;

    public xnz(View view, long j, xqa xqa, int i) {
        this.a = (View) amqw.a((Object) view);
        this.d = new zl();
        a(xqa);
        this.c = j;
        this.b = j;
        this.f = i;
        b(view.getVisibility() == 0, false);
    }

    public xnz(View view, long j, int i) {
        this(view, j, new xmy(), i);
    }

    public xnz(View view) {
        Resources resources = view.getResources();
        this(view, (long) (resources != null ? resources.getInteger(17694721) : 0), 8);
    }

    public xnz(View view, byte b) {
        this(view);
    }

    public final void a(xqa xqa) {
        this.g = (xqa) amqw.a((Object) xqa);
    }

    public final void a(long j) {
        this.c = j;
    }

    public final void b(long j) {
        this.b = j;
    }

    public final void a(int i) {
        if (this.f != i) {
            this.f = i;
            if (this.e == 0) {
                g();
            }
        }
    }

    public final void a(xqf xqf) {
        this.d.add((xqf) amqw.a((Object) xqf));
    }

    public final void b(xqf xqf) {
        this.d.remove(amqw.a((Object) xqf));
    }

    public final View d() {
        return this.a;
    }

    public final int e() {
        return this.e;
    }

    public final void a(boolean z, boolean z2) {
        if (!z2 || z != b()) {
            b(z, z2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        this.a.setVisibility(0);
        b(2);
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        this.a.setVisibility(this.f);
        b(0);
    }

    private final void b(boolean z, boolean z2) {
        this.g.a(this.a);
        if (z2) {
            long j;
            if (z) {
                j = this.c;
            } else {
                j = this.b;
            }
            if (j > 0 && abe.H(this.a)) {
                if (z) {
                    j = this.c;
                    this.a.setVisibility(0);
                    b(1);
                    this.g.a(this.a, j, new xny(this));
                    return;
                }
                j = this.b;
                this.a.setVisibility(0);
                b(3);
                this.g.b(this.a, j, new xob(this));
                return;
            }
        }
        if (z) {
            f();
        } else {
            g();
        }
    }

    private final void b(int i) {
        if (i != this.e) {
            this.e = i;
            int i2 = 0;
            while (true) {
                zl zlVar = this.d;
                if (i2 < zlVar.b) {
                    ((xqf) zlVar.a(i2)).a(i, this);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
