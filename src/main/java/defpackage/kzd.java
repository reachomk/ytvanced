package defpackage;

import java.util.List;

/* renamed from: kzd */
public final class kzd implements afqd {
    private final /* synthetic */ List b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ amqp e;
    private final /* synthetic */ kzb f;

    public kzd(kzb kzb, List list, String str, String str2, amqp amqp) {
        this.f = kzb;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = amqp;
    }

    public final void b() {
    }

    public final void a() {
        this.f.g.a(this.b, this.c, this.d, this.e).show();
    }

    public final void a(Exception exception) {
        this.f.f.c(exception);
    }
}
