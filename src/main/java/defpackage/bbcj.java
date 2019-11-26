package defpackage;

import java.util.HashSet;

/* renamed from: bbcj */
public abstract class bbcj {
    private final HashSet a = new HashSet();

    public abstract void b();

    public abstract void c();

    public final void a(Object obj, boolean z) {
        int size = this.a.size();
        if (z) {
            this.a.add(obj);
            if (size == 0) {
                b();
            }
        } else if (this.a.remove(obj) && size == 1) {
            c();
        }
    }

    public final boolean a() {
        return this.a.isEmpty() ^ 1;
    }
}
