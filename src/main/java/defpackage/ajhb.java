package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhb */
final class ajhb extends xwj {
    ajhb() {
    }

    public final void a(Deque deque, Attributes attributes) {
        if ("3".equals(attributes.getValue("format"))) {
            deque.offerFirst(new ajik());
        } else {
            deque.offerFirst(new ajjj());
        }
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        if ("3".equals(attributes.getValue("format"))) {
            ajik ajik = (ajik) deque.peekFirst();
            ajin ajin = ajik.f;
            if (ajin != null) {
                ajik.a(ajin);
            }
        }
        deque.pollFirst();
    }
}
