package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Deque;
import org.xml.sax.Attributes;

/* renamed from: ajhs */
final class ajhs extends xwj {
    ajhs() {
    }

    public final void a(Deque deque, Attributes attributes) {
        long time;
        ajhm ajhm = (ajhm) deque.peek();
        try {
            time = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS").parse(attributes.getValue("yt:segmentIngestTime")).getTime();
        } catch (ParseException unused) {
            time = 0;
        }
        ajhm.a = nxf.b(attributes.getValue("start"));
        ajhm.b = time;
    }

    public final void a(Deque deque, Attributes attributes, String str) {
        deque.pop();
    }
}
