package defpackage;

import android.view.KeyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: aicq */
public final class aicq implements aibb {
    private final List a;

    public aicq(aibb... aibbArr) {
        this.a = (List) amqw.a(Arrays.asList(aibbArr));
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    public final void a(aibe aibe) {
        for (aibb a : this.a) {
            a.a(aibe);
        }
    }

    public final void a(aicd aicd) {
        for (aibb a : this.a) {
            a.a(aicd);
        }
    }

    public final void h_(boolean z) {
        for (aibb h_ : this.a) {
            h_.h_(z);
        }
    }

    public final void c_(boolean z) {
        for (aibb c_ : this.a) {
            c_.c_(z);
        }
    }

    public final void e() {
        for (aibb e : this.a) {
            e.e();
        }
    }

    public final void f() {
        for (aibb f : this.a) {
            f.f();
        }
    }

    public final void a(aich aich) {
        for (aibb a : this.a) {
            a.a(aich);
        }
    }

    public final void a(String str, boolean z) {
        for (aibb a : this.a) {
            a.a(str, z);
        }
    }

    public final void c(boolean z) {
        for (aibb c : this.a) {
            c.c(z);
        }
    }

    public final void a(long j, long j2, long j3, long j4) {
        for (aibb a : this.a) {
            a.a(j, j2, j3, j4);
        }
    }

    public final void au_() {
        for (aibb au_ : this.a) {
            au_.au_();
        }
    }

    public final void g() {
        for (aibb g : this.a) {
            g.g();
        }
    }

    public final void h() {
        for (aibb h : this.a) {
            h.h();
        }
    }

    public final void i() {
        for (aibb i : this.a) {
            i.i();
        }
    }

    public final void a(Map map) {
        for (aibb a : this.a) {
            a.a(map);
        }
    }

    public final void d_(boolean z) {
        for (aibb d_ : this.a) {
            d_.d_(z);
        }
    }

    public final void a(CharSequence charSequence) {
        for (aibb a : this.a) {
            a.a(charSequence);
        }
    }
}
