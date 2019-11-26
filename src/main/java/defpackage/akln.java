package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: akln */
public final class akln implements akkl {
    private final Context a;
    private final Executor b;
    private final aklu c;

    public akln(Context context, Executor executor, bcaa bcaa, aort aort, bcaa bcaa2) {
        this.a = context;
        this.b = executor;
        if (aort.n && ((alxv) bcaa2.get()).a(aort.p, "streamz_glide_image_client")) {
            this.c = new aklu((alwu) bcaa.get());
        } else {
            this.c = null;
        }
    }

    public final void a(Uri uri, wxg wxg) {
        amqw.a((Object) wxg);
        brj a = bqy.b(this.a).d().a(this.c);
        if (cgg.a == null) {
            cgg.a = (cgg) ((cgg) new cgg().a(cbw.b, new cbo())).k();
        }
        a = ((brj) a.b(cgg.a)).a(uri);
        if (chv.b()) {
            a.a(new aklr(wxg, uri));
        } else {
            this.b.execute(new aklp(a, wxg, uri));
        }
    }

    public final void b(Uri uri, wxg wxg) {
        amqw.a((Object) wxg);
        brj a = bqy.b(this.a).a(byte[].class).a(uri);
        if (chv.b()) {
            a.a(new akls(wxg, uri));
        } else {
            this.b.execute(new aklq(a, wxg, uri));
        }
    }

    public final void a() {
        bqy.a(this.a).b();
    }
}
