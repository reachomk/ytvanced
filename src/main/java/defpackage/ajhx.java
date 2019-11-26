package defpackage;

import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import org.xml.sax.Attributes;

/* renamed from: ajhx */
final class ajhx extends xwj {
    private final /* synthetic */ HashMap a;

    ajhx(HashMap hashMap) {
        this.a = hashMap;
    }

    public final void a(Deque deque, Attributes attributes) {
        Integer num = (Integer) this.a.get(attributes.getValue("mimeType"));
        if (num == null) {
            return;
        }
        if (num.intValue() == 1 || num.intValue() == 2) {
            ajhm ajhm = (ajhm) deque.peek();
            if (num.intValue() == 1) {
                ajhm.c = true;
            }
            deque.push(new ajhy(ajhm, ((Integer) ajhm.e.firstKey()).intValue(), new ajhp(num.intValue(), attributes.getValue("lang"))));
        }
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        Integer num = (Integer) this.a.get(attributes.getValue("mimeType"));
        if (num != null) {
            boolean z = true;
            if (num.intValue() == 1 || num.intValue() == 2) {
                ajhy ajhy = (ajhy) deque.poll();
                ajhm ajhm = (ajhm) deque.peek();
                ajhp ajhp = ajhy.b;
                if (!(ajhm.c || ajhp.a == 1)) {
                    z = false;
                }
                ajhm.c = z;
                ((List) ajhm.f.get(ajhp.a)).add(ajhp);
            }
        }
    }
}
