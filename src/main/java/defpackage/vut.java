package defpackage;

import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

/* renamed from: vut */
public final class vut implements abjg {
    private final afqv a;
    private final wal b;
    private final Executor c;

    public vut(afqv afqv, wal wal, Executor executor) {
        this.a = (afqv) amqw.a((Object) afqv);
        this.b = (wal) amqw.a((Object) wal);
        this.c = (Executor) amqw.a((Object) executor);
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.c.execute(new vus(this, parse));
                return;
            }
            a(parse);
        }
    }

    public final void a(Uri uri) {
        xvo a = xvo.a(uri);
        for (Entry entry : this.b.a().entrySet()) {
            a.b((String) entry.getKey(), (String) entry.getValue());
        }
        uri = a.a();
        String.valueOf(uri).length();
        afqy a2 = afqv.a("remarketing");
        a2.a(uri);
        this.a.a(a2, aftp.a);
    }
}
