package defpackage;

import java.util.Deque;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: xwl */
final class xwl extends DefaultHandler {
    public Object a;
    private final xwi b;
    private final Deque c;
    private final Deque d = new LinkedList();
    private final Deque e;
    private final Deque f;

    public xwl(xwi xwi) {
        this.b = xwi;
        this.d.offerFirst("");
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.c = new LinkedList();
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        str = (String) this.d.peekFirst();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append("/");
        stringBuilder.append(str3);
        str = stringBuilder.toString();
        this.d.offerFirst(str);
        xwo a = this.b.a(str);
        if (a != null) {
            Object attributesImpl;
            Deque deque = this.e;
            if (attributes != null) {
                attributesImpl = new AttributesImpl(attributes);
            } else {
                attributesImpl = xwk.a;
            }
            deque.offerFirst(attributesImpl);
            this.f.offerFirst(new StringBuilder());
            a.a(this.c, attributes);
        }
    }

    public final void endElement(String str, String str2, String str3) {
        xwo a = this.b.a((String) this.d.pollFirst());
        if (a != null) {
            Attributes attributes = (Attributes) this.e.pollFirst();
            str3 = ((StringBuilder) this.f.pollFirst()).toString();
            Object peekFirst = this.c.peekFirst();
            if (peekFirst == null) {
                peekFirst = this.a;
            }
            this.a = peekFirst;
            a.a(this.c, attributes, str3);
        }
    }

    public final void characters(char[] cArr, int i, int i2) {
        if (this.b.a((String) this.d.peekFirst()) != null) {
            ((StringBuilder) this.f.peekFirst()).append(cArr, i, i2);
        }
    }
}
