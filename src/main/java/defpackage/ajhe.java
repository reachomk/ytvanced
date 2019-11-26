package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhe */
final class ajhe extends xwj {
    ajhe() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajir ajir;
        ajik ajik = (ajik) deque.peekFirst();
        int a = ajgw.a(attributes, 0, "wp");
        if (a != 0) {
            ajir = new ajir(ajik.c(a));
        } else {
            ajir = new ajir();
        }
        ajir.a = ajgw.a(attributes, 0, "id");
        ajir.b = ajgw.a(ajgw.a(attributes, 7, "ap"));
        ajir.c = ajgw.a(attributes, 100, "av");
        ajir.d = ajgw.a(attributes, 50, "ah");
        ajir.e = ajgw.a(attributes, 0, "rc");
        ajir.f = ajgw.a(attributes, 0, "cc");
        ajik.c.put(Integer.valueOf(ajir.a), ajir);
    }
}
