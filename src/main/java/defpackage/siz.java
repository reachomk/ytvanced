package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import java.io.IOException;
import java.util.List;

/* renamed from: siz */
public final class siz implements siv {
    public final tms a;
    private final Context b;
    private final tbg c;
    private final tlj d;
    private final tet e;
    private final tln f;
    private final tlm g;
    private final tdv h;
    private final tmq i;
    private final tmv j;
    private final tbk k = null;
    private tlk l;
    private ter m;
    private tmo n;
    private final sis o;

    public siz(Context context, tbg tbg, tlj tlj, tet tet, tln tln, tlm tlm, tdu tdu, tmp tmp, tmq tmq, tmv tmv, tms tms) {
        this.b = context;
        this.c = tbg;
        this.d = tlj;
        this.e = tet;
        this.f = tln;
        this.g = tlm;
        this.h = tdu.a(context, "OAUTH_INTEGRATIONS");
        this.i = tmq;
        this.j = tmv;
        this.a = tms;
        this.o = new siu(tmp, "com.google.oauthintegrations.ExperimentFlags");
    }

    public final String a(String str, List list) {
        boolean z = false;
        if (list != null && list.iterator().hasNext()) {
            z = true;
        }
        amqw.a(z);
        String valueOf = String.valueOf(amqh.a(' ').a((Iterable) list));
        String str2 = "oauth2: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        try {
            return this.c.a(str, valueOf);
        } catch (IOException | tbd e) {
            throw new siy(e);
        }
    }

    private final void c() {
        if (this.m == null) {
            this.m = this.e.a(this.b).a(this.j).a(new sjd()).a();
        }
        if (!this.m.d() || !this.m.e()) {
            this.m.b();
        }
    }

    public final void a(sja sja, int i) {
        tli tli = new tli();
        tli.a = false;
        if (this.l == null) {
            this.l = this.f.a(this.e.a(this.b).a(this.g.a(), this.g.a(i)).a(new sje()).a());
        }
        if (!(this.l.c() || this.l.d())) {
            this.l.a();
        }
        this.d.a(this.l, tli).a(new sjg(sja));
    }

    public final void a(String str, String str2) {
        try {
            String[] strArr = new String[]{str2};
            tbk tbk = null;
            tbk.a(b(str), strArr);
        } catch (IOException | tbd | tbi e) {
            throw new IllegalArgumentException("Failed to fetch or set cookie.", e);
        }
    }

    public final String a(String str) {
        return b(str).name;
    }

    private final Account b(String str) {
        try {
            for (Account account : this.c.b("com.google")) {
                if (account.name.compareToIgnoreCase(str) == 0) {
                    return account;
                }
            }
            throw new IllegalArgumentException("No matching device account name from Google Play service.");
        } catch (RemoteException | tei | tej e) {
            throw new IllegalArgumentException("Failed retrieving a matching device account name from Google Play service.", e);
        }
    }

    static String a(tls tls) {
        try {
            String c = tls.c();
            try {
                if (tls.d()) {
                    return c;
                }
                return null;
            } catch (UnsupportedOperationException unused) {
                if ("null".equals(c)) {
                    return null;
                }
                return c;
            }
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final void a(String str, aodj aodj, aodi aodi, anbn anbn) {
        amqw.a((Object) str);
        amqw.a((Object) aodj);
        tdv tdv = this.h;
        aodj.getClass();
        tds a = tdv.a(new sjc(aodj)).a(str);
        if (anbn != null) {
            a.a(new sjb(anbn));
        }
        if (aodi != null) {
            a.a(aodi.getNumber());
        }
        a.a();
    }

    public final void a(String str, SharedPreferences sharedPreferences, String str2) {
        c();
        if (this.n == null) {
            this.n = this.i.a(this.m, new sjf(this, sharedPreferences), str);
        }
        this.n.a();
        this.n.a(str2);
    }

    public final sis a() {
        return this.o;
    }

    public final void a(String str, int i, String str2) {
        c();
        this.a.a().a(this.m, str, i, new String[]{str2}).a(new sji());
    }

    public final String a(SharedPreferences sharedPreferences) {
        return this.a.a().a(sharedPreferences);
    }

    public final void b() {
        tlk tlk = this.l;
        if (tlk != null && tlk.c()) {
            this.l.b();
        }
        ter ter = this.m;
        if (ter != null && ter.d()) {
            this.m.c();
        }
    }
}
