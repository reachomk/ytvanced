package defpackage;

import com.google.android.youtube.api.service.EmbedFirebaseJobDispatcherService;

/* renamed from: amkq */
final /* synthetic */ class amkq implements Runnable {
    private final amkr a;
    private final mlp b;
    private final der c;

    amkq(amkr amkr, mlp mlp, der der) {
        this.a = amkr;
        this.b = mlp;
        this.c = der;
    }

    public final void run() {
        amkr amkr = this.a;
        mlp mlp = this.b;
        der der = this.c;
        int a = mlp.f.n().a(der.c(), der.h());
        boolean z = false;
        mlp.a(false);
        EmbedFirebaseJobDispatcherService embedFirebaseJobDispatcherService = amkr.a;
        if (a == 2) {
            z = true;
        }
        embedFirebaseJobDispatcherService.a(der, z);
    }
}
