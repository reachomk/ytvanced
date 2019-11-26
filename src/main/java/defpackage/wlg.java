package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.Executor;

/* renamed from: wlg */
public final class wlg {
    public final ImageView a;
    public boolean b;
    private final akkq c;
    private final afnw d;
    private final Executor e;
    private Uri f;

    public wlg(akkq akkq, afnw afnw, ImageView imageView, Executor executor) {
        this.c = (akkq) amqw.a((Object) akkq);
        this.d = (afnw) amqw.a((Object) afnw);
        this.a = (ImageView) amqw.a((Object) imageView);
        this.e = (Executor) amqw.a((Object) executor);
    }

    public final void a(Uri uri) {
        if (this.a.getWidth() == 0 || uri == null || uri.toString().isEmpty()) {
            this.a.setImageDrawable(null);
            this.f = null;
            return;
        }
        if (!uri.equals(this.f)) {
            this.c.c(uri, new wlf(this.a, this.d, this.e, this.b));
            this.f = uri;
        }
    }

    public final void a() {
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        this.f = null;
    }
}
