package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* renamed from: utk */
public final class utk implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public utk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public final /* synthetic */ Object get() {
        return new uth((Context) this.a.get(), (SharedPreferences) this.b.get(), (uzn) this.c.get(), (Executor) this.d.get());
    }
}
