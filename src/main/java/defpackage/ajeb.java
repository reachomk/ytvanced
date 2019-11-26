package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ajeb */
public final class ajeb {
    private final afqv a;
    private final xhv b;
    private final afmi c;
    private final amro d;
    private final Executor e;
    private final ajea f;
    private final acum g;
    private final zzl h;
    private final amro i;

    public ajeb(afqv afqv, xhv xhv, afmi afmi, amro amro, Executor executor, ajea ajea, acum acum, zzl zzl, amro amro2) {
        this.a = (afqv) amqw.a((Object) afqv);
        this.b = (xhv) amqw.a((Object) xhv);
        this.c = (afmi) amqw.a((Object) afmi);
        this.d = (amro) amqw.a((Object) amro);
        this.e = (Executor) amqw.a((Object) executor);
        this.f = (ajea) amqw.a((Object) ajea);
        this.g = acum;
        this.h = zzl;
        this.i = amro2;
    }

    public final ajdw a(List list, List list2, String str) {
        return new ajdw(this.a, this.b, this.c, this.d, list == null ? new ArrayList() : list, list2 == null ? new ArrayList() : list2, str, this.e, this.f, this.g, this.h, this.i);
    }
}
