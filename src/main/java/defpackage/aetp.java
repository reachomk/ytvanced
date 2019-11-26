package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aetp */
class aetp {
    public final aesx a;
    public final AtomicInteger b = new AtomicInteger();
    public volatile Integer c;
    private final aetb d;
    private final Handler e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private boolean k;

    aetp(aetb aetb, Handler handler, aesx aesx) {
        this.d = (aetb) amqw.a((Object) aetb);
        this.e = (Handler) amqw.a((Object) handler);
        this.a = (aesx) amqw.a((Object) aesx);
    }

    /* Access modifiers changed, original: protected */
    public void a(String str, String str2, String str3, String str4, String str5) {
        this.f = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.g = str5;
        this.k = false;
        this.b.incrementAndGet();
    }

    /* Access modifiers changed, original: final */
    public final byte[] a(String str, byte[] bArr) {
        return this.d.a(Uri.parse(str), bArr, this.g);
    }

    /* Access modifiers changed, original: final */
    public final byte[] a(byte[] bArr) {
        int i = this.b.get();
        String str = this.f;
        aetl a = this.d.a(str != null ? Uri.parse(str) : null, bArr, this.j, this.g, this.h, this.i, this.c);
        if (i == this.b.get()) {
            a(a.b(), i);
            Map d = a.d();
            if (!d.isEmpty()) {
                this.e.post(new aeto(this, i, d));
            }
        }
        return a.a();
    }

    public final void a(List list, int i) {
        if (list.contains(Integer.valueOf(3)) && !this.k) {
            this.e.post(new aetr(this, i));
            this.k = true;
        }
    }
}
