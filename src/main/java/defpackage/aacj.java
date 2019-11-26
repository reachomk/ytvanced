package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aacj */
final /* synthetic */ class aacj implements Callable {
    private final aacg a;
    private final int b;

    aacj(aacg aacg, int i) {
        this.a = aacg;
        this.b = i;
    }

    public final Object call() {
        aacg aacg = this.a;
        int i = this.b;
        aadq b = aacg.c.b(aacg.a);
        aabs aabs = aacg.c;
        return b != null ? aadz.f().a(aacg.a).b(b).a(aabs.a(aacg.a, b, aacg.b, aabs.a(i)).c).b(aacg.b).d() : null;
    }
}
