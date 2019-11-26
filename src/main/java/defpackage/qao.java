package defpackage;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: qao */
public final class qao {
    private final SparseIntArray a;
    private psh b;

    public qao() {
        this(psf.a);
    }

    public qao(psh psh) {
        this.a = new SparseIntArray();
        pzr.a((Object) psh);
        this.b = psh;
    }

    public final int a(Context context, psw psw) {
        pzr.a((Object) context);
        pzr.a((Object) psw);
        psw.l();
        int c = psw.c();
        int i = this.a.get(c, -1);
        if (i == -1) {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                int keyAt = this.a.keyAt(i2);
                if (keyAt > c && this.a.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
            }
            if (i == -1) {
                i = psh.b(context, c);
            }
            this.a.put(c, i);
        }
        return i;
    }

    public final void a() {
        this.a.clear();
    }
}
