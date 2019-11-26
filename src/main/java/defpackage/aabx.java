package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aabx */
final /* synthetic */ class aabx implements Callable {
    private final aabs a;
    private final String b;
    private final bbmi c;

    aabx(aabs aabs, String str, bbmi bbmi) {
        this.a = aabs;
        this.b = str;
        this.c = bbmi;
    }

    public final Object call() {
        aabs aabs = this.a;
        String str = this.b;
        bbmi bbmi = this.c;
        aadq b = aabs.b(str);
        if (b == null) {
            return bbmi;
        }
        return bbmi.d(aadz.f().a(str).b(b).b(aabs.c(str)).d());
    }
}
