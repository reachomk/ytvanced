package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aere */
public final class aere implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private aere(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static aere a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new aere(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        return new aeqz((xhv) this.a.get(), (SharedPreferences) this.b.get(), (ScheduledExecutorService) this.c.get(), (zzl) this.d.get());
    }
}
