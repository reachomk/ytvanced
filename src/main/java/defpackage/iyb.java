package defpackage;

/* renamed from: iyb */
final /* synthetic */ class iyb implements Runnable {
    private final ixw a;
    private final amoj b;

    iyb(ixw ixw, amoj amoj) {
        this.a = ixw;
        this.b = amoj;
    }

    public final void run() {
        ixw ixw = this.a;
        amoj amoj = this.b;
        iyc iyc = ixw.a.e;
        amoz amoz = amoj.c;
        if (amoz == null) {
            amoz = amoz.b;
        }
        iyc.a(amoz.a);
    }
}
