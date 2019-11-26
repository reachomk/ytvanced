package defpackage;

import com.google.android.youtube.api.service.EmbedFirebaseJobDispatcherService;

/* renamed from: amkr */
public final class amkr implements mlx {
    public final /* synthetic */ EmbedFirebaseJobDispatcherService a;
    private final /* synthetic */ der b;

    public amkr(EmbedFirebaseJobDispatcherService embedFirebaseJobDispatcherService, der der) {
        this.a = embedFirebaseJobDispatcherService;
        this.b = der;
    }

    public final void a(mlp mlp) {
        mlp.f.oz().execute(new amkq(this, mlp, this.b));
    }

    public final void a(Exception exception) {
        this.a.a(this.b, true);
    }
}
