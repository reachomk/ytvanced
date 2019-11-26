package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qbp */
final /* synthetic */ class qbp implements Callable {
    private final boolean a;
    private final String b;
    private final qbs c;

    qbp(boolean z, String str, qbs qbs) {
        this.a = z;
        this.b = str;
        this.c = qbs;
    }

    public final Object call() {
        boolean z = this.a;
        String str = this.b;
        qbs qbs = this.c;
        boolean z2 = false;
        if (!z && qbq.b(str, qbs, true).b) {
            z2 = true;
        }
        return qca.a(str, qbs, z, z2);
    }
}
