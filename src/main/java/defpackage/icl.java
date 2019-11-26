package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: icl */
class icl {
    private final icm a;
    private final View b;
    private final ico c;
    public final TextView e;
    public aich f;
    public boolean g;

    icl(icm icm, TextView textView, View view, ico ico) {
        this.e = textView;
        this.b = view;
        this.a = icm;
        this.c = ico;
    }

    public final void f() {
        boolean g = this.f.g();
        xpr.a(this.b, g);
        xpr.a(this.e, g);
        if (g) {
            d();
        } else {
            b();
        }
        if (this.a != null) {
            aich aich = this.f;
            if (aich != null && aich.a != aicj.PAUSED && aich.a != aicj.PLAYING) {
                aich.d();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        Object obj = 1;
        if (!(this.f.a == aicj.NEW || this.f.a == aicj.PAUSED)) {
            obj = null;
        }
        aicj aicj = this.f.a;
        aicj aicj2 = aicj.ENDED;
        boolean z = this.f.b;
        if (obj == null && z) {
            e();
        } else if (aicj == aicj2) {
            d();
        } else {
            c();
        }
    }

    /* Access modifiers changed, original: protected */
    public void c() {
        this.c.a();
    }

    /* Access modifiers changed, original: protected */
    public void d() {
        this.c.a();
    }

    /* Access modifiers changed, original: protected */
    public void e() {
        ico ico = this.c;
        if (!ico.c) {
            ico.c = true;
            ico.a.postDelayed(ico.b, 0);
        }
    }
}
