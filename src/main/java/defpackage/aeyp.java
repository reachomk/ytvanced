package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aeyp */
final class aeyp implements Callable {
    private final ool a;
    private final long b;
    private final long c;
    private final /* synthetic */ aeyi d;

    aeyp(aeyi aeyi, ool ool, long j, long j2) {
        this.d = aeyi;
        this.a = ool;
        this.b = j;
        this.c = j2;
    }

    public final /* synthetic */ Object call() {
        boolean b = this.d.b.b(this.b);
        aeyi aeyi = this.d;
        Object obj = aeyi.c;
        if (obj == null || obj.a != this.a) {
            if (obj != null) {
                if (obj.c != null) {
                    obj.d = true;
                } else {
                    aeyi.a(obj);
                }
                b = true;
            }
            this.d.c = new aeym(this.a);
            this.d.c.a(this.c);
            aeyi = this.d;
            obj = aeyi.c;
            aeyi.a(obj, obj.a);
        } else {
            b |= obj.a(this.c);
        }
        return Boolean.valueOf(b);
    }
}
