package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajgz */
final class ajgz extends xwj {
    ajgz() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        ajjj ajjj = (ajjj) deque.peekFirst();
        int a = ajgw.a(Float.parseFloat(ajgw.a(attributes, "start")));
        ajjj.a(0, str.replaceAll("\n", "<br/>"), a, ajgw.a(xvd.a(ajgw.a(attributes, "dur"), 5.0f)) + a);
    }
}
