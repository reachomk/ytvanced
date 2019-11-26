package defpackage;

import java.io.IOException;

/* renamed from: onu */
final class onu implements oom {
    private final Object a;
    private oop b;
    private final /* synthetic */ ons c;

    public onu(ons ons, Object obj) {
        this.c = ons;
        this.b = ons.a(null);
        this.a = obj;
    }

    private static opb a(opb opb) {
        return opb;
    }

    public final void a(int i, ook ook) {
        if (d(i, ook)) {
            this.b.a();
        }
    }

    public final void b(int i, ook ook) {
        if (d(i, ook)) {
            this.b.b();
        }
    }

    public final void a(int i, ook ook, ooy ooy, opb opb) {
        if (d(i, ook)) {
            this.b.a(ooy, onu.a(opb));
        }
    }

    public final void b(int i, ook ook, ooy ooy, opb opb) {
        if (d(i, ook)) {
            this.b.b(ooy, onu.a(opb));
        }
    }

    public final void c(int i, ook ook, ooy ooy, opb opb) {
        if (d(i, ook)) {
            this.b.c(ooy, onu.a(opb));
        }
    }

    public final void a(int i, ook ook, ooy ooy, opb opb, IOException iOException, boolean z) {
        if (d(i, ook)) {
            this.b.a(ooy, onu.a(opb), iOException, z);
        }
    }

    public final void c(int i, ook ook) {
        if (d(i, ook)) {
            this.b.c();
        }
    }

    public final void a(int i, ook ook, opb opb) {
        if (d(i, ook)) {
            this.b.a(onu.a(opb));
        }
    }

    public final void b(int i, ook ook, opb opb) {
        if (d(i, ook)) {
            this.b.b(onu.a(opb));
        }
    }

    private final boolean d(int i, ook ook) {
        if (ook != null) {
            ook = this.c.a(this.a, ook);
            if (ook == null) {
                return false;
            }
        }
        ook = null;
        i = this.c.a(this.a, i);
        oop oop = this.b;
        if (!(oop.a == i && ozp.a(oop.b, (Object) ook))) {
            this.b = this.c.g_.a(i, ook);
        }
        return true;
    }
}
