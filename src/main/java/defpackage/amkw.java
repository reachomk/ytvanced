package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentServiceFactoryService;
import com.google.android.youtube.api.service.YouTubeService;
import java.util.Set;

/* renamed from: amkw */
public final class amkw extends ammd implements amks, DeathRecipient, mlx {
    public static final Set e = amuw.a("com.google.android.googlequicksearchbox", "com.google.android.apps.magazines", "com.google.android.apps.newsstand_exp", "com.google.android.apps.newsstanddev", "com.google.android.play.games");
    public final Context a;
    public final Handler b;
    public final String c;
    public final mma d;
    private final amkt f;
    private volatile amlg g;
    private volatile mlp h;
    private volatile ApiPlayerFactoryService i;
    private volatile EmbedFragmentServiceFactoryService j;
    private xge k;

    public amkw(Context context, amkt amkt, String str, amlg amlg, mma mma) {
        this.a = (Context) amqw.a((Object) context);
        this.g = (amlg) amqw.a((Object) amlg);
        this.b = new Handler(context.getMainLooper());
        this.f = (amkt) amqw.a((Object) amkt, (Object) "serviceDestroyedNotifier");
        this.c = (String) amqw.a((Object) str);
        this.d = (mma) amqw.a((Object) mma);
    }

    public final void a(mlp mlp) {
        this.h = mlp;
        this.k = new xgi(this.a, mlp.f.oC(), mlp.f.oD(), mlp.f.oK());
        this.i = new ApiPlayerFactoryService(this.a, this.b, this.f, mlp);
        this.j = new EmbedFragmentServiceFactoryService(this.b, this.f, mlp);
        if (this.g != null) {
            try {
                this.g.asBinder().linkToDeath(this, 0);
                amlg amlg = this.g;
                String a = amla.a(1);
                asBinder();
                amlg.a(a, this);
            } catch (RemoteException unused) {
            }
        }
        this.f.a(this);
    }

    public final void a(Exception exception) {
        this.h = null;
        xtl.a("Error creating ApiEnvironment", (Throwable) exception);
        if (this.g != null) {
            YouTubeService.a(this.g, mlp.a(exception));
        }
    }

    private final void d() {
        if (this.h == null) {
            throw new IllegalStateException("YouTubeServiceEntity not initialized");
        }
    }

    public final IBinder b() {
        d();
        ApiPlayerFactoryService apiPlayerFactoryService = this.i;
        apiPlayerFactoryService.asBinder();
        return apiPlayerFactoryService;
    }

    public final IBinder c() {
        d();
        EmbedFragmentServiceFactoryService embedFragmentServiceFactoryService = this.j;
        embedFragmentServiceFactoryService.asBinder();
        return embedFragmentServiceFactoryService;
    }

    public final ammc a(amma amma) {
        d();
        return new nid(this.b, this.h, amma);
    }

    public final void a(boolean z) {
        this.b.post(new amkv(this, z));
    }

    public final void binderDied() {
        a(true);
        String str = this.c;
        mlp mlp = (mlp) mlp.a.get();
        if (mlp != null && str.equals(mlp.b.a)) {
            mlp.a.compareAndSet(mlp, null);
        }
    }

    public final void a() {
        b(true);
    }

    public final void b(boolean z) {
        xge xge = this.k;
        if (xge != null) {
            xge.a();
            this.k = null;
        }
        if (this.h != null) {
            this.h.a(z ^ 1);
            this.h = null;
        }
        this.i = null;
        this.j = null;
        if (this.g != null) {
            this.g.asBinder().unlinkToDeath(this, 0);
            this.g = null;
        }
        this.f.b(this);
        System.gc();
    }

    static {
        amuw.a((Object) "com.examples.youtubeapidemo");
    }
}
