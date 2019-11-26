package defpackage;

import android.net.Uri;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: zdl */
public final class zdl {
    public final xsc a;
    public long b;
    public Uri c;
    private final LinkedBlockingDeque d = new LinkedBlockingDeque(25);

    public zdl(xsc xsc) {
        this.a = xsc;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str) {
        String format = DateFormat.getTimeInstance().format(new Date(this.a.a()));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(format).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(format);
        stringBuilder.append("\n");
        stringBuilder.append(str);
        str = stringBuilder.toString();
        while (!this.d.offer(str)) {
            this.d.remove();
        }
    }
}
