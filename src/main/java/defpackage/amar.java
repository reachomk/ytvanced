package defpackage;

import java.util.Collections;

/* renamed from: amar */
public final class amar extends aamz {
    public amar(aamd aamd, afpt afpt, atls atls) {
        super(aamd, afpt, "upload/feedback", atls);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        atls atls = (atls) c();
        amqw.b(((atlp) atls.instance).c.size() + ((atlp) atls.instance).d.size() > 0, (Object) "Empty feedback polling request");
        for (ayuf ayuf : Collections.unmodifiableList(((atlp) atls.instance).c)) {
            amqw.b((ayuf.b.isEmpty() ^ 1) + (ayuf.c.isEmpty() ^ 1) == 1, (Object) "Exactly one feedback id needs to be specified");
        }
        for (String isEmpty : Collections.unmodifiableList(((atlp) atls.instance).d)) {
            amqw.b(isEmpty.isEmpty() ^ 1, (Object) "Empty feedback continuation");
        }
    }
}
