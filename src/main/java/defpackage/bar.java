package defpackage;

import java.util.Collection;

/* renamed from: bar */
final class bar implements Runnable {
    private final /* synthetic */ Collection a;
    private final /* synthetic */ bap b;

    bar(bap bap, Collection collection) {
        this.b = bap;
        this.a = collection;
    }

    public final void run() {
        bap bap = this.b;
        bap.c.a(bap, this.a);
    }
}
