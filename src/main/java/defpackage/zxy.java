package defpackage;

import java.util.concurrent.Executor;

/* renamed from: zxy */
public final class zxy implements baqa {
    private final bcaa a;
    private final bcaa b;

    private zxy(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static zxy a(bcaa bcaa, bcaa bcaa2) {
        return new zxy(bcaa, bcaa2);
    }

    public static aald a(Executor executor, bcaa bcaa) {
        return (aald) baqd.a(new aald(new zzr(), bcaa, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zxy.a((Executor) this.a.get(), this.b);
    }
}
