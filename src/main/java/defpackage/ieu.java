package defpackage;

import android.widget.ImageView;

/* renamed from: ieu */
public final class ieu implements ibc {
    private final xqc a;
    private boolean b;
    private boolean c;

    ieu(ImageView imageView) {
        this.a = new xnz((ImageView) amqw.a((Object) imageView), (byte) 0);
        a(false);
    }

    public final void a(aicd aicd) {
    }

    public final void a(aich aich) {
    }

    public final void a(ejd ejd) {
    }

    public final void i(boolean z) {
    }

    public final void j(boolean z) {
    }

    public final void k(boolean z) {
    }

    public final void h(boolean z) {
        this.c = z;
        a(false);
    }

    public final void g_(boolean z) {
        this.b = true;
        a(z);
    }

    public final void g(boolean z) {
        this.b = false;
        a(z);
    }

    private final void a(boolean z) {
        xqc xqc = this.a;
        if (xqc != null) {
            if (!this.b) {
                xqc.b(z);
            } else if (this.c) {
                xqc.b(false);
            } else {
                xqc.a(z);
            }
        }
    }
}
