package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import java.io.IOException;

/* renamed from: aemd */
final class aemd implements Runnable {
    private final afhg a;
    private final Uri b;
    private final aajk c;

    public final void run() {
        String str = "0";
        Builder appendQueryParameter = this.b.buildUpon().appendQueryParameter("owc", "yes").appendQueryParameter("pvi", str).appendQueryParameter("pai", str);
        if (((aajj) this.c.get()).s()) {
            appendQueryParameter = appendQueryParameter.authority(aepe.b(this.b.getAuthority()));
        }
        ovm ovm = new ovm(appendQueryParameter.build());
        ovi a = this.a.a();
        try {
            a.a(ovm);
        } catch (IOException unused) {
        } finally {
            ozp.a(a);
        }
    }

    /* synthetic */ aemd(afhg afhg, Uri uri, aajk aajk) {
        this.a = (afhg) amqw.a((Object) afhg);
        this.b = (Uri) amqw.a((Object) uri);
        this.c = aajk;
    }
}
