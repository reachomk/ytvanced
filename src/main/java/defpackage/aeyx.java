package defpackage;

import java.util.List;

/* renamed from: aeyx */
final /* synthetic */ class aeyx implements Runnable {
    private final aeyt a;
    private final List b;

    aeyx(aeyt aeyt, List list) {
        this.a = aeyt;
        this.b = list;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
