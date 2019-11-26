package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: aewh */
public final class aewh {
    public final Uri a;
    public final nvo b;
    private final ExecutorService c;
    private Future d;

    public aewh(Builder builder, String str, nvo nvo, ExecutorService executorService) {
        this.a = builder.appendQueryParameter("itag", str).build();
        this.b = nvo;
        this.c = executorService;
    }

    public final void a() {
        this.d = this.c.submit(new aewg(this));
    }

    public final void b() {
        Future future = this.d;
        if (future != null) {
            future.cancel(true);
        }
    }
}
