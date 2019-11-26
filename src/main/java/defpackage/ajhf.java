package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhf */
final class ajhf extends xwj {
    ajhf() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajik ajik = (ajik) deque.peekFirst();
        ajio ajio = new ajio();
        ajio.a = ajgw.a(attributes, 0, "id");
        ajio.d = ajik.a(ajgw.a(attributes, 0, "p"));
        ajgw.a(attributes, 0, "t");
        ajgw.a(attributes, Long.MAX_VALUE, "d");
        ajio.b = ajik.c(ajgw.a(attributes, 0, "wp"));
        ajio.c = ajik.b(ajgw.a(attributes, 0, "ws"));
        ajgw.a(attributes, 0, "rc");
        ajgw.a(attributes, 0, "cc");
        ajik.d.put(Integer.valueOf(ajio.a), ajio);
    }
}
