package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: adyo */
final class adyo extends bark {
    private static final String d = xtl.b("MDX.transport");
    private final adxy e;
    private final adzc f;
    private final xci g;

    public adyo(baqw baqw, adxy adxy, adzc adzc, xci xci) {
        super(baqw);
        this.e = (adxy) amqw.a((Object) adxy);
        this.f = (adzc) amqw.a((Object) adzc);
        this.g = xci;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.f.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(barl barl) {
        String a;
        String str;
        String valueOf;
        try {
            a = barl.a();
            str = "Web Socket Frame - Payload text: ";
            valueOf = String.valueOf(a);
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            if (!TextUtils.isEmpty(a)) {
                try {
                    adym a2 = adym.a(new JSONArray(a));
                    this.g.d(new adck(a2.a(), "local_ws"));
                    this.e.a(a2);
                } catch (JSONException e) {
                    xtl.a(d, String.format("Invalid message format: %s", new Object[]{r0}), e);
                }
            }
        } catch (JSONException e2) {
            str = d;
            a = String.valueOf(e2.getMessage());
            valueOf = "Failed to parse message: ";
            if (a.length() == 0) {
                a = new String(valueOf);
            } else {
                a = valueOf.concat(a);
            }
            xtl.b(str, a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(IOException iOException) {
        xtl.a(d, "Unexpected error on web socket", (Throwable) iOException);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, boolean z) {
        String.format("onClose: reason=%s initiatedByRemote=%s", new Object[]{str, Boolean.valueOf(z)});
        this.f.b();
    }
}
