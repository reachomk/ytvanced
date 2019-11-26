package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhv */
final class ajhv extends xwj {
    ajhv() {
    }

    public final void a(Deque deque, Attributes attributes) {
        ajhm ajhm = (ajhm) deque.peek();
        ajib ajib = new ajib(ajhm);
        ajib.c = ajhm.a;
        ajib.d = Long.parseLong(attributes.getValue("presentationTimeOffset"));
        ajib.b = ajhm.b;
        ajib.e = Integer.parseInt(attributes.getValue("startNumber"));
        deque.push(ajib);
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        deque.pop();
    }
}
