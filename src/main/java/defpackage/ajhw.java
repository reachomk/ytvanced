package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhw */
final class ajhw extends xwj {
    ajhw() {
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        if (!deque.isEmpty() && deque.peek().getClass() == ajhy.class) {
            ((ajhy) deque.peek()).b.c = str;
        }
    }
}
