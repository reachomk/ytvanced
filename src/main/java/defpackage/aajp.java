package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* renamed from: aajp */
public final class aajp implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aajp(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aajp a(bcaa bcaa, bcaa bcaa2) {
        return new aajp(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new aajk((Executor) this.a.get(), (SharedPreferences) this.b.get());
    }
}
