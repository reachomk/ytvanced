package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhu */
final class ajhu extends xwj {
    ajhu() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajib ajib = (ajib) deque.peek();
        long parseLong = Long.parseLong(attributes.getValue("d"));
        str = "yt:sid";
        ajib.b += attributes.getValue(str) != null ? Long.parseLong(attributes.getValue(str)) : 0;
        ajhm ajhm = ajib.a;
        ajhr ajhr = new ajhr(ajib.e);
        ajhm.e.put(Integer.valueOf(ajhr.a), ajhr);
        ajib.b += parseLong;
        ajib.c += parseLong;
        ajib.d += parseLong;
        ajib.e++;
    }
}
