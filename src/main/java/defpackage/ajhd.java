package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhd */
final class ajhd extends xwj {
    ajhd() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajip a;
        ajik ajik = (ajik) deque.peekFirst();
        String value = attributes.getValue("p");
        if (value != null) {
            a = ajik.a(xvd.a(value, 0));
        } else {
            a = ajik.g;
        }
        ajim ajim = new ajim();
        ajim.a = (long) ajgw.a(attributes, 0, "t");
        ajgw.a(attributes, 0, "ac");
        String a2 = a.a();
        str = str.replaceAll("\n", "<br/>");
        value = a.b();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a2).length() + String.valueOf(str).length()) + String.valueOf(value).length());
        stringBuilder.append(a2);
        stringBuilder.append(str);
        stringBuilder.append(value);
        ajim.b = stringBuilder.toString();
        ajik.e.add(ajim);
    }
}
