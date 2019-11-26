package defpackage;

import java.util.ArrayList;
import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhc */
final class ajhc extends xwj {
    ajhc() {
    }

    public final void a(Deque deque, Attributes attributes) {
        ajip a;
        ajik ajik = (ajik) deque.peekFirst();
        ajio d = ajik.d(ajgw.a(attributes, 0, "w"));
        String value = attributes.getValue("p");
        if (value != null) {
            a = ajik.a(xvd.a(value, 0));
        } else if (d != null) {
            a = d.d;
        } else {
            a = ajik.a(0);
        }
        ajik.g = a;
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajir ajir;
        ajiq ajiq;
        ajik ajik = (ajik) deque.peekFirst();
        ajip ajip = ajik.g;
        ajio d = ajik.d(ajgw.a(attributes, 0, "w"));
        if (d != null) {
            ajir = d.b;
        } else {
            ajir = ajik.c(ajgw.a(attributes, 0, "wp"));
        }
        if (d != null) {
            ajiq = d.c;
        } else {
            ajiq = ajik.b(ajgw.a(attributes, 0, "ws"));
        }
        ajin ajin = new ajin();
        ajin.a = ajgw.a(attributes, 0, "t");
        ajin.b = ajgw.a(attributes, 0, "d");
        ajin.c = ajgw.b(attributes, new String[]{"a"});
        ajin.d = ajir;
        ajin.e = ajiq;
        ajgw.a(attributes, 0, "rc");
        ajgw.a(attributes, 0, "cc");
        String a = ajip.a();
        str = str.replaceAll("\n", "<br/>");
        String b = ajip.b();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + String.valueOf(str).length()) + String.valueOf(b).length());
        stringBuilder.append(a);
        stringBuilder.append(str);
        stringBuilder.append(b);
        ajin.g = stringBuilder.toString();
        ajin ajin2 = ajik.f;
        if (ajin2 != null) {
            if (ajin2.b == 0) {
                ajin2.b = ajin.a - ajin2.a;
            }
            ajik.a(ajin2);
        }
        ajik.f = ajin;
        ajin.f = ajik.e;
        ajik.e = new ArrayList();
        ajik.g = null;
    }
}
