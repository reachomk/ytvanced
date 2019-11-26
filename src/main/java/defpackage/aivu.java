package defpackage;

import android.net.Uri;
import java.io.File;
import java.security.Key;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

/* renamed from: aivu */
final class aivu extends aivf {
    private final Key a;

    aivu(Key key) {
        this.a = key;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Uri uri, Header header, HttpResponse httpResponse) {
        File file = new File(uri.getQueryParameter("f"));
        String valueOf;
        String str;
        if (!file.exists()) {
            valueOf = String.valueOf(file.getAbsolutePath());
            str = "Requested file not found: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.c(valueOf);
            httpResponse.setStatusCode(404);
        } else if (file.canRead()) {
            aivh a = aivh.a(header, file.length());
            if (a.a(httpResponse)) {
                httpResponse.setEntity(new aivs(file, a.a, a.b, this.a));
            }
        } else {
            valueOf = String.valueOf(file.getAbsolutePath());
            str = "Requested file cannot be read: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.c(valueOf);
            httpResponse.setStatusCode(403);
        }
    }
}
