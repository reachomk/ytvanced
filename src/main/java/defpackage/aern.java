package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aern */
public final class aern implements aesg {
    private final bcaa a;
    private final aerq b;

    public aern(Context context, afhg afhg, bcaa bcaa, afqv afqv, aetb aetb) {
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = new aerq(xsl.a(context), afhg, bcaa, aetb, afqv);
    }

    public final boolean a(String str, Uri uri, List list, String str2, String str3) {
        aesd a = ((aese) this.a.get()).a(str);
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(2);
        if (a != null && a.e > currentTimeMillis) {
            return false;
        }
        this.b.a(str, 0, uri, list, str2, str3);
        return true;
    }

    public final void a(String str) {
        aese aese = (aese) this.a.get();
        aesd a = aese != null ? aese.a(str) : null;
        if (a != null) {
            try {
                this.b.a(str, 2, a.d, null, null, a.g);
            } finally {
                aese.b(str);
            }
        } else {
            throw new aesf();
        }
    }

    public final boolean a() {
        aerq aerq = this.b;
        return aerq != null && aerq.a();
    }
}
