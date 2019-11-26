package defpackage;

import java.util.Collections;

/* renamed from: aaxg */
public final class aaxg extends aamz {
    private final atqp a;

    aaxg(aamd aamd, afpt afpt, atqp atqp, byte[] bArr) {
        super(aamd, afpt, "offline/get_ytb_blueprint", atqp);
        this.a = atqp;
        a(bArr);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = true;
        amqw.b((((atqq) this.a.instance).a & 2) != 0);
        atqp atqp = this.a;
        if (((atqq) atqp.instance).e) {
            if (atqp.a() != 0) {
                z = false;
            }
            amqw.a(z, (Object) "YTB blueprint requests for refresh should not contain streams.");
            return;
        }
        amqw.a(atqp.a() != 0, (Object) "Must include at least one stream in ytb blueprint request.");
        for (atqo atqo : Collections.unmodifiableList(((atqq) this.a.instance).d)) {
            amqw.a(atqo.b > 0);
            amqw.a(atqo.d > 0);
        }
    }
}
