package defpackage;

import java.util.Map.Entry;

/* renamed from: aoad */
final class aoad extends aoae {
    aoad(int i) {
        super(i);
    }

    public final void a() {
        if (!this.c) {
            for (int i = 0; i < b(); i++) {
                ((anxf) b(i).getKey()).c();
            }
            for (Entry key : c()) {
                ((anxf) key.getKey()).c();
            }
        }
        super.a();
    }
}
