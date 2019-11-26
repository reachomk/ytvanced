package defpackage;

import android.view.View;

/* renamed from: atd */
final class atd implements apf {
    private final /* synthetic */ ata a;

    atd(ata ata) {
        this.a = ata;
    }

    public final int a(int i, int i2) {
        ata ata = this.a;
        View view = ata.s;
        if (view == null) {
            return i2;
        }
        int i3 = ata.t;
        if (i3 == -1) {
            i3 = ata.p.indexOfChild(view);
            this.a.t = i3;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            i2++;
        }
        return i2;
    }
}
