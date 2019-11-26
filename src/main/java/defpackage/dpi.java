package defpackage;

import java.io.IOException;

/* renamed from: dpi */
final class dpi implements Runnable {
    private final /* synthetic */ xci a;
    private final /* synthetic */ dos b;

    dpi(dos dos, xci xci) {
        this.b = dos;
        this.a = xci;
    }

    public final void run() {
        try {
            Object obj = (afpp) this.b.s.get();
            this.a.a(obj);
            if (((eav) this.b.t.get()).b() != null) {
                obj.b();
            } else {
                obj.a();
            }
        } catch (IOException e) {
            xtl.a("Failed to read offline browse from store", e);
        }
    }
}
