package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: yad */
final class yad implements afsw {
    public final /* synthetic */ yae a;
    private final apxu b;
    private final Map c;
    private final Uri d;
    private final String e;

    yad(yae yae, apxu apxu, Map map, String str, Uri uri) {
        this.a = yae;
        this.b = apxu;
        this.c = map;
        this.e = str;
        this.d = uri;
    }

    public final void a(bqn bqn) {
        a(false);
        this.a.a.c(bqn);
    }

    public final void a(boolean z) {
        ycm a = this.a.a(this.d);
        if (a != null) {
            akmx akmx = this.a.b;
            Uri uri = this.d;
            ycl a2 = a.a();
            a2.d = z;
            akmx.b(uri, a2.a());
        }
    }
}
