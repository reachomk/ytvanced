package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.HashMap;

/* renamed from: amez */
public final class amez {
    private final HashMap a = new HashMap();

    public final void a(amfa amfa) {
        this.a.put(amfa.a(), amfa);
    }

    public final amev a(Uri uri, amex amex) {
        if (uri != null) {
            amfa amfa = (amfa) this.a.get(uri.getScheme());
            if (amfa != null) {
                return amfa.a(uri, amex);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
            stringBuilder.append("Unsupported Uri scheme: ");
            stringBuilder.append(valueOf);
            throw new FileNotFoundException(stringBuilder.toString());
        }
        throw new FileNotFoundException("Null Uri scheme");
    }
}
