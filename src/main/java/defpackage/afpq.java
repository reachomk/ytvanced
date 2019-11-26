package defpackage;

import android.accounts.AccountManager;

/* renamed from: afpq */
final /* synthetic */ class afpq implements Runnable {
    private final afpr a;
    private final String b;
    private final AccountManager c;
    private final String d;

    afpq(afpr afpr, String str, AccountManager accountManager, String str2) {
        this.a = afpr;
        this.b = str;
        this.c = accountManager;
        this.d = str2;
    }

    public final void run() {
        afpr afpr = this.a;
        String str = this.b;
        AccountManager accountManager = this.c;
        String str2 = this.d;
        afpr.a.a(str);
        accountManager.invalidateAuthToken(str2, str);
    }
}
