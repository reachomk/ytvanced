package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: pwd */
public final class pwd extends pux {
    private final psz b;

    public pwd(psz psz) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.b = psz;
    }

    public final pts a(pts pts) {
        return this.b.a(0, pts);
    }

    public final pts b(pts pts) {
        return this.b.a(1, pts);
    }

    public final Looper b() {
        return this.b.d;
    }

    public final Context a() {
        return this.b.a;
    }
}
