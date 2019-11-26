package defpackage;

import java.io.IOException;

/* renamed from: brt */
public final class brt {
    public final brw a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ brs d;

    public final void a() {
        this.d.a(this, false);
    }

    public final void b() {
        if (!this.c) {
            try {
                a();
            } catch (IOException unused) {
            }
        }
    }

    /* synthetic */ brt(brs brs, brw brw) {
        boolean[] zArr;
        this.d = brs;
        this.a = brw;
        if (brw.d) {
            zArr = null;
        } else {
            zArr = new boolean[brs.d];
        }
        this.b = zArr;
    }
}
