package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aach */
final /* synthetic */ class aach implements Callable {
    private final aace a;
    private final int b;

    aach(aace aace, int i) {
        this.a = aace;
        this.b = i;
    }

    public final Object call() {
        aace aace = this.a;
        aabt a = aace.c.a(aace.a.a(), aace.a, aace.b, aace.c.a(this.b));
        if (aace.a.equals(a.b) && aace.b.equals(a.c)) {
            return null;
        }
        return aadz.f().a(aace.a.a()).a(a.b).b(aace.a).a(a.c).b(aace.b).d();
    }
}
