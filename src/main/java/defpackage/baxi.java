package defpackage;

import java.io.InputStream;

/* renamed from: baxi */
public abstract class baxi implements bbhn {
    public abstract baxh c();

    public abstract bbbw d();

    public final void a(InputStream inputStream) {
        amqw.a((Object) inputStream, (Object) "message");
        try {
            if (!d().b()) {
                d().a(inputStream);
            }
            bbby.a(inputStream);
        } catch (Throwable th) {
            bbby.a(inputStream);
        }
    }

    public final void f() {
        if (!d().b()) {
            d().a();
        }
    }

    public final void a(basn basn) {
        d().a((basn) amqw.a((Object) basn, (Object) "compressor"));
    }
}
