package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhg */
final class ajhg extends xwj {
    ajhg() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajik ajik = (ajik) deque.peekFirst();
        ajip ajip = new ajip(ajik.a(xvd.a(ajgw.a(attributes, "p"), 0)));
        ajip.a = ajgw.a(attributes, 0, "id");
        ajip.b = ajgw.b(attributes, new String[]{"i"});
        ajip.c = ajgw.b(attributes, new String[]{"u"});
        ajip.d = ajgw.b(attributes, new String[]{"b"});
        ajip.e = ajgw.a(attributes, 1, "of");
        ajip.f = ajgw.a(attributes, 100, "sz");
        ajip.g = ajgw.a(attributes, 0, "et");
        String str2 = "#000000";
        ajip.m = ajgw.a(attributes, str2, "ec");
        ajip.h = ajgw.a(attributes, 0, "fs");
        ajip.i = ajgw.a(attributes, "#FFFFFF", "fc");
        ajip.j = ajgw.a(attributes, 255, "fo");
        ajip.k = ajgw.a(attributes, str2, "bc");
        ajip.l = ajgw.a(attributes, 255, "bo");
        ajik.a.put(Integer.valueOf(ajip.a), ajip);
    }
}
