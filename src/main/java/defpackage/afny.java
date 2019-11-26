package defpackage;

import java.io.InputStream;

/* renamed from: afny */
public abstract class afny extends afnp {
    private final xwk a;

    public afny(xwk xwk) {
        this.a = (xwk) amqw.a((Object) xwk);
    }

    public abstract xwi a();

    /* Access modifiers changed, original: protected|final */
    public final Object a(InputStream inputStream) {
        try {
            return ((afqj) this.a.a(inputStream, a())).b();
        } catch (Exception e) {
            throw new xwd(e);
        }
    }
}
