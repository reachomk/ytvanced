package defpackage;

import java.util.List;

/* renamed from: kim */
final /* synthetic */ class kim implements xar {
    private final kik a;

    kim(kik kik) {
        this.a = kik;
    }

    public final void accept(Object obj) {
        kik kik = this.a;
        List<amea> list = (List) obj;
        if (kik.g) {
            for (amea amea : list) {
                int a = amem.a(amea.H);
                if (a == 0) {
                    a = 1;
                }
                if (a == 1 || a == 2) {
                    kik.a(amea);
                }
            }
            kik.b();
        }
    }
}
