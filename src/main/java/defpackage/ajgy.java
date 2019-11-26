package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajgy */
final class ajgy extends xwj {
    ajgy() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajjj ajjj = (ajjj) deque.peekFirst();
        int a = xvd.a(ajgw.a(attributes, "w", "win", "id"), 0);
        int parseInt = Integer.parseInt(ajgw.a(attributes, "t", "start"));
        String value = attributes.getValue("op");
        if (value != null && value.equals("define")) {
            int i;
            value = ajgw.a(attributes, "ap");
            if (value == null) {
                i = 34;
            } else {
                i = ajgw.a(Integer.parseInt(value));
            }
            value = ajgw.a(attributes, "ah");
            int max = value != null ? Math.max(0, Math.min(Integer.parseInt(value), 100)) : 50;
            value = ajgw.a(attributes, "av");
            int max2 = value != null ? Math.max(0, Math.min(Integer.parseInt(value), 100)) : 95;
            value = ajgw.a(attributes, "vs");
            ajjj.a(a).a(parseInt, new ajiy(i, max, max2, value != null ? Boolean.parseBoolean(value) : true, ajgw.a(attributes, "sd") != null));
        }
    }
}
