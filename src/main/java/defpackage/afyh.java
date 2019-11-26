package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: afyh */
public final class afyh extends wah {
    private final bcaa g;
    private final bcaa h;
    private final zzl i;
    private final agwm j;
    private final ahdm k;

    public afyh(xci xci, abfc abfc, bcaa bcaa, bcaa bcaa2, zzl zzl, agwm agwm, Executor executor, Executor executor2, Set set, xua xua, ahdm ahdm) {
        super(xci, abfc, executor, executor2, set, xua);
        this.g = (bcaa) amqw.a((Object) bcaa);
        this.h = (bcaa) amqw.a((Object) bcaa2);
        this.i = zzl;
        this.j = agwm;
        this.k = ahdm;
    }

    public final airv a(aaga aaga) {
        ArrayList arrayList = new ArrayList(this.e);
        arrayList.add(new wak(aaga));
        return new agsa(this.a, this.b, this.g, this.h, this.c, this.d, arrayList, this.i, this.j, this.f, this.k);
    }
}
