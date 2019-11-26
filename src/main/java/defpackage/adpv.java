package defpackage;

import java.util.List;

/* renamed from: adpv */
public abstract class adpv {
    adpv() {
    }

    public abstract adpv a(int i);

    public abstract adpv a(long j);

    public abstract adpv a(ajis ajis);

    public abstract adpv a(String str);

    public abstract adpv a(List list);

    public abstract adpv a(boolean z);

    public abstract adpv a(byte[] bArr);

    public abstract amqp a();

    public abstract adpv b(String str);

    public abstract amqp b();

    public abstract int c();

    public abstract adpv c(String str);

    public abstract adpv d(String str);

    public abstract adpw d();

    public final adpw e() {
        String str = "";
        if (!a().a()) {
            a(str);
        }
        if (!b().a()) {
            b(str);
        }
        if (c() < 0) {
            a(-1);
        }
        return d();
    }
}
