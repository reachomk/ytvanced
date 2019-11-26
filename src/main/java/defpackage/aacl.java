package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aacl */
final /* synthetic */ class aacl implements Callable {
    private final aaci a;

    aacl(aaci aaci) {
        this.a = aaci;
    }

    public final Object call() {
        aaci aaci = this.a;
        aabt d = aaci.b.d(aaci.a);
        if (d.b == null) {
            return null;
        }
        return aadz.f().a(aaci.a).a(d.b).a(d.c).b(null).b(aadu.a).d();
    }
}
