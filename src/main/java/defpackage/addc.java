package defpackage;

import android.net.Uri;
import java.io.IOException;

/* renamed from: addc */
final class addc implements aebm {
    private final /* synthetic */ adiy a;
    private final /* synthetic */ addz b;
    private final /* synthetic */ adcz c;

    addc(adcz adcz, adiy adiy, addz addz) {
        this.c = adcz;
        this.a = adiy;
        this.b = addz;
    }

    public final void a(xho xho) {
        int b = xho.b();
        if (b == 201) {
            this.c.b.a(new addf(-1, this.a, this.b));
            String str = "LOCATION";
            Uri parse = xho.d().a(str) != null ? Uri.parse(xho.d().a(str)) : null;
            if (parse != null && parse.getHost() == null) {
                parse = null;
            }
            this.b.a(parse);
        } else if (b >= 400 && b < 500) {
            this.b.a(2);
        } else if (b >= 500) {
            this.b.a(0);
        } else {
            this.b.a(5);
        }
    }

    public final void a(IOException iOException) {
        this.b.a(4);
    }
}
