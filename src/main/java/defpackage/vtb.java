package defpackage;

import java.util.List;
import java.util.TimeZone;

/* renamed from: vtb */
public final class vtb {
    public final xsc a;
    public final TimeZone b;
    public final aokk c;
    public long d;
    public long e;
    public List f;
    public boolean g;

    public vtb(aokk aokk, xsc xsc) {
        Object obj = TimeZone.getDefault();
        this.c = aokk;
        this.a = (xsc) amqw.a((Object) xsc);
        this.b = (TimeZone) amqw.a(obj);
    }

    public final void a() {
        this.e = this.a.a();
        this.f = null;
    }
}
