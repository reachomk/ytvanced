package defpackage;

import android.accounts.AccountManager;
import java.util.Set;

/* renamed from: uzo */
public final class uzo implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private uzo(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static uzo a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new uzo(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        return new uzn((AccountManager) this.a.get(), (tbg) this.b.get(), (uzk) this.c.get(), (Set) this.d.get());
    }
}
