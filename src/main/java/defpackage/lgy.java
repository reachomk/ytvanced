package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;

/* renamed from: lgy */
public final class lgy extends aikt {
    private final enl a;

    public lgy(bcaa bcaa, bcaa bcaa2, enl enl) {
        super(bcaa, bcaa2);
        this.a = enl;
    }

    public final /* bridge */ /* synthetic */ void a() {
    }

    /* Access modifiers changed, original: protected|final */
    public final List a(aikc aikc, int i) {
        int a = aikc.a(i);
        int e = i == 0 ? aikc.e() : -1;
        amuo a2 = amul.a(a);
        for (int i2 = 0; i2 < a; i2++) {
            enm enm = (enm) aikc.a(i, i2);
            apxx apxx = (apxx) ((anxo) airn.a(enm.c(), "", -1, 0.0f).toBuilder());
            if (i2 == e && (enm instanceof enk)) {
                this.a.a((apxu) ((anxl) apxx.build()), ((enk) enm).b());
            } else {
                String f = enm.f();
                azjd azjd = (azjd) ((anxo) ((azje) apxx.b(WatchEndpointOuterClass.watchEndpoint)).toBuilder());
                if (f != null) {
                    azjd.copyOnWrite();
                    azje azje = (azje) azjd.instance;
                    azje.a |= 1048576;
                    azje.p = f;
                } else {
                    azjd.copyOnWrite();
                    azje azje2 = (azje) azjd.instance;
                    azje2.a &= -1048577;
                    azje2.p = azje.r.p;
                }
                apxx.a(WatchEndpointOuterClass.watchEndpoint, (azje) ((anxl) azjd.build()));
            }
            a2.c(this.a.a((apxu) ((anxl) apxx.build())));
        }
        return a2.a();
    }
}
