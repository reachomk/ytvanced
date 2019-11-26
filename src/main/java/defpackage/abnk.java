package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: abnk */
final class abnk implements anij {
    private final /* synthetic */ anjv a;
    private final /* synthetic */ anjv b;
    private final /* synthetic */ anjv c;
    private final /* synthetic */ abnj d;

    abnk(abnj abnj, anjv anjv, anjv anjv2, anjv anjv3) {
        this.d = abnj;
        this.a = anjv;
        this.b = anjv2;
        this.c = anjv3;
    }

    public final anjv a() {
        try {
            Object obj = (abnp) anjf.a(this.a);
            obj.a.size();
            if (!obj.a.isEmpty()) {
                return anjf.a(obj);
            }
        } catch (ExecutionException e) {
            e.getCause();
        }
        boolean z = false;
        try {
            Object obj2 = (abnp) anjf.a(this.b);
            obj2.a.size();
            if (obj2.a.size() >= this.d.a.i()) {
                z = this.d.a.b();
                if (this.d.a.a()) {
                    this.c.cancel(true);
                    return anjf.a(obj2);
                }
            }
        } catch (ExecutionException unused) {
        }
        return anic.a(this.c, new abnn(z), this.d.d);
    }
}
