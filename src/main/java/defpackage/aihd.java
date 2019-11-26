package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: aihd */
final class aihd {
    public final Set a = new HashSet();
    public aihc b;
    public boolean c = false;

    private static boolean a(int i) {
        return i == 1 || i == 2;
    }

    public final void a(int i, long j) {
        a(aihd.a(i), i, j);
    }

    public final void a(boolean z, int i, long j) {
        if (z == aihd.a(i)) {
            if (this.c != z) {
                this.c = z;
                aihc aihc = this.b;
                if (aihc != null) {
                    aihc.a(z);
                }
            }
            for (aiha a : this.a) {
                a.a(i, j);
            }
        }
    }
}
