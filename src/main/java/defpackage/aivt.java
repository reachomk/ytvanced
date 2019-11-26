package defpackage;

import android.net.Uri;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

/* renamed from: aivt */
final class aivt extends aivf {
    private final afhg a;

    aivt(afhg afhg) {
        this.a = afhg;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Uri uri, Header header, HttpResponse httpResponse) {
        aive a = aive.a(uri);
        if (a != null) {
            Uri parse = Uri.parse(uri.getQueryParameter("s"));
            aivh a2 = aivh.a(header, a.d);
            String a3 = a2.c != -1 ? aeey.a(a.a, a.b, a.c, a.e) : null;
            ovm ovm;
            if (a2.c == -1) {
                ovm = new ovm(parse, a2.a, -1, a3, 16);
            } else {
                long j = a2.a;
                ovm = new ovm(parse, j, 1 + (a2.b - j), a3, 16);
            }
            ovi a4 = this.a.a();
            if (a2.a(httpResponse)) {
                httpResponse.setEntity(new aivr(a4, r11));
            }
            return;
        }
        httpResponse.setStatusCode(404);
    }
}
