package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: wah */
public class wah {
    public final xci a;
    public final abfc b;
    public final Executor c;
    public final Executor d;
    public final Set e;
    public final xua f;

    public wah(xci xci, abfc abfc, Executor executor, Executor executor2, Set set, xua xua) {
        this.a = (xci) amqw.a((Object) xci);
        this.b = (abfc) amqw.a((Object) abfc);
        this.c = (Executor) amqw.a((Object) executor);
        this.d = (Executor) amqw.a((Object) executor2);
        this.e = (Set) amqw.a((Object) set);
        this.f = (xua) amqw.a((Object) xua);
    }

    public airv a(aaga aaga) {
        ArrayList arrayList = new ArrayList(this.e);
        arrayList.add(new wak(aaga));
        return new airv(this.a, this.b, this.c, this.d, arrayList, this.f);
    }
}
