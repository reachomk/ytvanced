package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhj */
final class ajhj extends xwj {
    ajhj() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajjj ajjj = (ajjj) deque.peekFirst();
        int a = xvd.a(ajgw.a(attributes, "w", "win"), 0);
        int parseInt = Integer.parseInt(ajgw.a(attributes, "t", "start"));
        int a2 = xvd.a(ajgw.a(attributes, "d", "dur"), 0);
        str = str.replaceAll("\n", "<br/>");
        if (ajgw.a(attributes, "append") != null) {
            ajjj.a(a).b(str, parseInt, a2 + parseInt);
        } else {
            ajjj.a(a, str, parseInt, a2 + parseInt);
        }
    }
}
