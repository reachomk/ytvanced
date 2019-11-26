package com.google.android.libraries.youtube.account;

import android.accounts.Account;
import android.os.RemoteException;
import defpackage.afpw;
import defpackage.amqw;
import defpackage.bapu;
import defpackage.pl;
import defpackage.tbd;
import defpackage.tei;
import defpackage.tej;
import defpackage.uqj;
import defpackage.uqk;
import defpackage.uqm;
import defpackage.ust;
import defpackage.uzn;
import defpackage.xak;
import defpackage.xse;
import defpackage.xtl;
import java.io.IOException;

public class AccountsChangedJobIntentService extends pl {
    public bapu e;

    public final void onCreate() {
        super.onCreate();
        ((uqm) xse.a(getApplicationContext())).pl().a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        uqj uqj = (uqj) this.e.get();
        uqk uqk = (uqk) amqw.a((Object) new uqk(uqj.a, getApplicationContext().getSharedPreferences("ach_persisted_event_index", 0), uqj.b, uqj.c, uqj.d, uqj.e, uqj.f));
        xak.b();
        String str = "account_last_handled_event_index";
        if (!uqk.a.contains(str)) {
            String str2 = "index";
            if (uqk.b.contains(str2)) {
                uqk.a.edit().putInt(str, uqk.b.getInt(str2, 0)).apply();
                uqk.b.edit().remove(str2).apply();
            }
        }
        try {
            Account[] a = uqk.e.a();
            try {
                int i = uqk.a.getInt(str, 0);
                int i2 = i;
                for (Account account : a) {
                    i2 = Math.max(i2, uqk.a(i, -1, account.name));
                }
                uqk.a.edit().putInt(str, i2).apply();
            } catch (IOException | tbd e) {
                xtl.b("Error getting Account rename information, continuing regardless.", e);
            }
            if (uqk.c.a() && (uqk.c.c() instanceof ust) && !uzn.b(((ust) uqk.c.c()).b(), a)) {
                uqk.f.a("Account was removed from device", false);
            }
            Iterable<ust> a2 = uqk.c.a(a);
            uqk.d.a((Iterable) a2);
            for (ust afpw : a2) {
                uqk.g.d(new afpw(afpw));
            }
        } catch (RemoteException | tei | tej unused) {
            uqk.f.a("Error retrieving list of accounts after device account change", false);
        }
    }
}
