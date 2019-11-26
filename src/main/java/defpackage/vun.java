package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: vun */
final class vun implements Runnable {
    private final /* synthetic */ Uri a;
    private final /* synthetic */ Pattern b;
    private final /* synthetic */ vul c;

    vun(vul vul, Uri uri, Pattern pattern) {
        this.c = vul;
        this.a = uri;
        this.b = pattern;
    }

    public final void run() {
        String.valueOf(this.a).length();
        afqy a = this.c.a.a(this.a, "vastad");
        aage aage = this.c.b;
        if (aage != null) {
            a.e = aage.bb_();
            a.f = this.c.b.b();
        }
        this.c.a.a(a, this.b, aftp.a);
    }
}
