package defpackage;

import com.google.android.libraries.youtube.account.AccountsChangedJobIntentService;

/* renamed from: dja */
final class dja implements uql {
    private final /* synthetic */ diu a;

    public final void a(AccountsChangedJobIntentService accountsChangedJobIntentService) {
        diu diu = this.a;
        bcaa bcaa = diu.bX;
        if (bcaa == null) {
            bcaa = new dlk(diu, 361);
            diu.bX = bcaa;
        }
        accountsChangedJobIntentService.e = bapx.b(bcaa);
    }

    /* synthetic */ dja(diu diu) {
        this.a = diu;
    }
}
