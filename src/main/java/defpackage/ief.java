package defpackage;

import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: ief */
public final class ief extends iba implements ibc {
    public aibe a;
    public boolean b;
    public boolean c;
    private final xqc d;
    private final aics e;
    private aich f = aich.a();
    private aicd g = aicd.a;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;

    ief(ImageView imageView) {
        this.d = new xnz(imageView, (long) imageView.getResources().getInteger(R.integer.fade_duration_fast), 4);
        imageView.setOnClickListener(new iei(this));
        this.e = new aics(imageView, imageView.getContext());
    }

    public final void i(boolean z) {
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        amqw.a(this.a);
        if (this.f.a == aicj.PLAYING) {
            this.a.d();
        } else if (this.f.a == aicj.PAUSED) {
            this.a.aJ_();
        } else if (this.f.a == aicj.ENDED) {
            this.a.j();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(boolean z) {
        xqc xqc = this.d;
        if (xqc != null) {
            xqc.a(z);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(boolean z) {
        xqc xqc = this.d;
        if (xqc != null) {
            xqc.b(z);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean f(boolean z) {
        if (!(this.c || this.k || this.l)) {
            return z ? ((!this.f.i() && (!this.j || !this.f.b)) || !this.g.u || this.i || this.h || this.b) ? false : true : !this.h && this.j && this.f.b && !this.b;
        }
    }

    public final void a(aicd aicd) {
        this.g = aicd;
        a();
    }

    public final void a(aich aich) {
        this.f = aich;
        this.e.a(aich);
        a();
    }

    public final void a(ejd ejd) {
        boolean z = true;
        if (!(ejd.f() || ejd.n())) {
            z = false;
        }
        this.h = z;
        a();
    }

    public final void h(boolean z) {
        this.i = z;
        a();
    }

    public final void j(boolean z) {
        this.k = z;
        a(false);
    }

    /* Access modifiers changed, original: final */
    public final void l(boolean z) {
        this.j = z;
        a();
    }

    public final void k(boolean z) {
        this.l = z;
        a(false);
    }

    public final void g_(boolean z) {
        b(z);
    }

    public final void g(boolean z) {
        c(z);
    }
}
