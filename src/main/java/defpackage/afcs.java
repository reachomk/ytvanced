package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: afcs */
final class afcs implements nmg {
    private Set b;
    private Set c;
    private boolean d;
    private int e;

    private afcs() {
    }

    public final nlo a(String str, boolean z) {
        Set set;
        if (this.e == 2) {
            set = this.b;
        } else {
            set = Collections.emptySet();
        }
        int i = 0;
        if (this.d && oyu.b(str)) {
            i = 4096;
        }
        return afjk.a(str, z, this.c, set, i);
    }

    /* synthetic */ afcs(byte b) {
    }

    public final void a(int i, Set set, Set set2, boolean z) {
        this.e = i;
        this.b = set;
        this.c = set2;
        this.d = z;
    }
}
