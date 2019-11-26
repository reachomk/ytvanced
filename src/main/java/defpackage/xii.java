package defpackage;

import java.util.Collection;

/* renamed from: xii */
public final class xii {
    public Collection a;
    private boolean b;

    public final synchronized boolean a() {
        return this.b;
    }

    public final synchronized void a(Collection collection) {
        this.a = collection;
        this.b = true;
    }
}
