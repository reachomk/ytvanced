package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhh */
final class ajhh extends xwj {
    ajhh() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajiq ajiq;
        ajik ajik = (ajik) deque.peekFirst();
        int a = ajgw.a(attributes, 0, "ws");
        if (a != 0) {
            ajiq = new ajiq(ajik.b(a));
        } else {
            ajiq = new ajiq();
        }
        ajiq.a = ajgw.a(attributes, 0, "id");
        ajiq.b = ajgw.a(attributes, 0, "mh");
        ajiq.c = ajgw.a(attributes, 2, "ju");
        ajiq.d = ajgw.a(attributes, 0, "pd");
        ajiq.e = ajgw.a(attributes, 3, "sd");
        ajiq.f = ajgw.a(attributes, 0, "wfc");
        ajiq.g = ajgw.a(attributes, 255, "wfo");
        ajiq.h = ajgw.a(attributes, 0, "wbt");
        ajiq.i = ajgw.a(attributes, 16777215, "wbc");
        ajik.b.put(Integer.valueOf(ajiq.a), ajiq);
    }
}
