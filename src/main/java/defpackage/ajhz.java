package defpackage;

import java.util.Deque;
import java.util.TreeMap;
import org.xml.sax.Attributes;

/* renamed from: ajhz */
final class ajhz extends xwj {
    ajhz() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        if (!deque.isEmpty() && deque.peek().getClass() == ajhy.class) {
            ajhy ajhy = (ajhy) deque.peek();
            TreeMap treeMap = ajhy.b.d;
            Integer valueOf = Integer.valueOf(ajhy.c);
            int i = ajhy.c;
            attributes.getValue("media");
            ajhy.a.e.get(Integer.valueOf(ajhy.c));
            treeMap.put(valueOf, new ajho(i));
            ajhy.c++;
        }
    }
}
