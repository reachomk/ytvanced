package defpackage;

import java.util.List;

/* renamed from: vfb */
final /* synthetic */ class vfb implements Runnable {
    private final vet a;
    private final List b;

    vfb(vet vet, List list) {
        this.a = vet;
        this.b = list;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
