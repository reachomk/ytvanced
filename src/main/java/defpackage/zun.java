package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: zun */
public final class zun {
    public awly a;
    public List b;
    public boolean c = false;
    public long d;

    public zun(awly awly) {
        this.a = (awly) amqw.a((Object) awly);
        this.b = new ArrayList(awly.c.size());
        this.d = 0;
        for (awlw zuq : awly.c) {
            zuq zuq2 = new zuq(this, zuq);
            this.b.add(zuq2);
            this.d += zuq2.a.c;
            this.c |= zuq2.a();
        }
        if (this.b.size() == 1) {
            this.c = false;
        }
    }

    public final CharSequence a() {
        arml arml;
        awly awly = this.a;
        if ((awly.a & 1) != 0) {
            arml = awly.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }
}
