package defpackage;

import android.content.Intent;

/* renamed from: ahxf */
final /* synthetic */ class ahxf implements wxe {
    private final ahxc a;
    private final int b;

    ahxf(ahxc ahxc, int i) {
        this.a = ahxc;
        this.b = i;
    }

    public final boolean a(int i, int i2, Intent intent) {
        ahxc ahxc = this.a;
        int i3 = this.b;
        if (i != 500) {
            return false;
        }
        ahxc.c.post(new ahxg(ahxc, i3));
        return true;
    }
}
