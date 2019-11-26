package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: aiit */
public final class aiit implements zxe {
    private final bcaa a;
    private final aiuu b;

    public aiit(bcaa bcaa, aiuu aiuu) {
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (aiuu) amqw.a((Object) aiuu);
    }

    public final void a() {
    }

    public final String b(apxu apxu) {
        Object obj;
        abfj a = ((abfc) this.a.get()).a();
        anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        azje azje = (azje) obj;
        int i = azje.a;
        if ((i & 1) != 0) {
            a.a = azje.b;
        }
        if ((i & 2) != 0) {
            a.c = azje.c;
        }
        if ((i & 4) != 0) {
            a.d = azje.d;
        }
        if ((i & 256) != 0) {
            a.b = azje.j;
        }
        a.a(apxu.b);
        a.i = true;
        this.b.a(a);
        return a.a();
    }

    public final byte[] c(apxu apxu) {
        amqw.b(a(apxu));
        anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        azjf azjf = ((azje) b).k;
        if (azjf == null) {
            azjf = azjf.e;
        }
        awbt awbt = azjf.c;
        if (awbt == null) {
            awbt = awbt.c;
        }
        return awbt.b.d();
    }

    public final boolean a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                azjf azjf = ((azje) b).k;
                if (azjf == null) {
                    azjf = azjf.e;
                }
                awbt awbt = azjf.c;
                if (awbt == null) {
                    awbt = awbt.c;
                }
                if ((awbt.a & 1) == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
