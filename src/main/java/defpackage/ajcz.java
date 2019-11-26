package defpackage;

import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;

/* renamed from: ajcz */
public final class ajcz {
    public final xsc a;
    public final Executor b;
    public final Handler c;
    public final SecureRandom d;
    public final aayd e;
    public final String f;
    public ajdd g;
    public final ahhq h;

    public ajcz(xsc xsc, Executor executor, Handler handler, SecureRandom secureRandom, aayd aayd, String str, ahhq ahhq) {
        this.a = (xsc) amqw.a((Object) xsc);
        this.b = (Executor) amqw.a((Object) executor);
        this.c = (Handler) amqw.a((Object) handler);
        this.d = (SecureRandom) amqw.a((Object) secureRandom);
        this.e = (aayd) amqw.a((Object) aayd);
        this.f = xvd.a(str);
        this.h = (ahhq) amqw.a((Object) ahhq);
    }

    public static boolean a(atdh atdh) {
        return (atdh == null || atdh.b.isEmpty() || atdh.c <= 0 || atdh.d == 0) ? false : true;
    }

    public static boolean a(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }
}
