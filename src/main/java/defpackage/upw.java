package defpackage;

import android.accounts.AccountManager;
import android.content.Context;

/* renamed from: upw */
public final class upw implements baqa {
    private final bcaa a;

    private upw(bcaa bcaa) {
        this.a = bcaa;
    }

    public static upw a(bcaa bcaa) {
        return new upw(bcaa);
    }

    public final /* synthetic */ Object get() {
        return (AccountManager) baqd.a(AccountManager.get((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
