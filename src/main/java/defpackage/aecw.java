package defpackage;

import java.util.Map;

/* renamed from: aecw */
final class aecw implements afhi {
    private final /* synthetic */ xsd a;
    private final /* synthetic */ afhi b;

    aecw(xsd xsd, afhi afhi) {
        this.a = xsd;
        this.b = afhi;
    }

    public final void a(Map map) {
        Long a = new afja(map).a("x-walltime-ms");
        if (a != null) {
            this.a.a(a);
        }
        this.b.a(map);
    }
}
