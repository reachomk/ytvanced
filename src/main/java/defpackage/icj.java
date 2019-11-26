package defpackage;

import android.text.TextUtils;
import android.widget.TextView;

/* renamed from: icj */
public final class icj implements ems {
    public final xqc a;
    public boolean b;
    private boolean c;
    private boolean d;
    private CharSequence e;
    private boolean f;

    public icj(xqc xqc) {
        this.a = (xqc) amqw.a((Object) xqc);
        g(false);
        a(null, null);
    }

    public final void b(boolean z) {
    }

    public final void c(boolean z) {
    }

    public final void e(boolean z) {
    }

    public final void d(boolean z) {
        if (!this.b) {
            this.d = z;
        }
    }

    public final void a(boolean z) {
        if (!this.b) {
            this.d = z ^ 1;
        }
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        if (this.d) {
            a(charSequence);
        }
    }

    public final void f(boolean z) {
        if (!this.c) {
            this.c = true;
            h(z);
        }
    }

    public final void g(boolean z) {
        if (this.c) {
            this.c = false;
            h(z);
        }
    }

    private final void h(boolean z) {
        this.a.a(this.c, z);
    }

    public final void a(CharSequence charSequence) {
        boolean z = this.d ^ 1;
        if (!TextUtils.equals(this.e, charSequence) || this.f != z) {
            this.f = z;
            this.e = charSequence;
            ((TextView) this.a.d()).setText(this.e);
        }
    }
}
