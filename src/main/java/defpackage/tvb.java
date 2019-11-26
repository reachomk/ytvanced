package defpackage;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: tvb */
final class tvb implements Callable {
    private final /* synthetic */ File a;
    private final /* synthetic */ tvc b;

    tvb(tvc tvc, File file) {
        this.b = tvc;
        this.a = file;
    }

    public final /* synthetic */ Object call() {
        ubl a = ubl.a(this.a);
        ubn a2 = ubf.a(a);
        ubf.b(a2, a);
        return ubf.a(a2, a);
    }
}
