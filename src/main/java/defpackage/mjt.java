package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.youtube.R;
import java.util.concurrent.CancellationException;

/* renamed from: mjt */
final class mjt implements afsw {
    private final /* synthetic */ Uri a;
    private final /* synthetic */ Intent b;
    private final /* synthetic */ anko c;
    private final /* synthetic */ mjr d;

    mjt(mjr mjr, Uri uri, Intent intent, anko anko) {
        this.d = mjr;
        this.a = uri;
        this.b = intent;
        this.c = anko;
    }

    public final void a(bqn bqn) {
        if (bqn.getCause() == null || !(bqn.getCause() instanceof CancellationException)) {
            xpr.a(this.d.a, (int) R.string.url_resolver_failed, 1);
        }
        fiw h = this.d.d.h();
        if (h == null || fil.a(h)) {
            this.d.d.a(this.d.d.i());
        }
        this.c.a_(Boolean.FALSE);
    }
}
