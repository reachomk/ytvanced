package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: eav */
public final class eav implements ekh {
    private static final String[] g = new String[]{".loadingWhatToWatchBrowse", ".offlineAccountBrowse", ".loadingAccountBrowse"};
    public final afpu a;
    public final xsc b;
    public final Executor c;
    public final eaw d;
    public final zyw e;
    public final aamj f;
    private final File h;
    private ebe i;
    private ebe j;
    private ebe k;
    private ebe l;
    private ebe m;
    private ebe n;

    public eav(Context context, afpu afpu, xsc xsc, Executor executor, eaw eaw, eap eap, zyt zyt, zyw zyw, aamj aamj) {
        this.a = afpu;
        this.b = xsc;
        this.c = executor;
        this.h = new File(context.getFilesDir(), "offline");
        this.d = eaw;
        this.e = zyw;
        this.f = aamj;
        if (eap.a()) {
            try {
                if (((Boolean) zyt.c().get()).booleanValue()) {
                    for (String a : g) {
                        a(a).a();
                    }
                    c().b();
                    h().b();
                    e().b();
                    i().b();
                    f().b();
                    d().b();
                }
            } catch (InterruptedException | ExecutionException e) {
                afpc.a(2, afpf.initialization, "Failed to get the fail safe status", e);
            }
        }
    }

    public final void a(abif abif) {
        amqw.a((Object) abif);
        c().b(abif);
    }

    public final void a(aaxx aaxx) {
        amqw.a((Object) aaxx);
        d().b(aaxx);
    }

    public final void a(aaff aaff, String str) {
        amqw.a((Object) aaff);
        String str2 = "FElibrary";
        if (str.equals(str2)) {
            h().b(aaff);
        }
        ajrr ajrr = aaff.a;
        if (ajrr != null && ("FEaccount".equals(str) || str2.equals(str))) {
            ajrr a = eaw.a(ajrr);
            if (a != null) {
                a(a, str);
            }
        }
        Object b = this.d.b(aaff.a);
        if (b != null) {
            amqw.a(b);
            i().b(b);
        }
    }

    public final ajrr a() {
        return (ajrr) i().a();
    }

    public final aaff b() {
        aaff aaff = (aaff) h().a();
        return (aaff == null && foh.F(this.e)) ? new aaff(this.d.a()) : aaff;
    }

    public final void a(ajrr ajrr, String str) {
        amqw.a((Object) ajrr);
        if ("FElibrary".equals(str)) {
            f().b(ajrr);
        }
    }

    public final synchronized ebe c() {
        if (this.i == null) {
            this.i = new eay(this, a(".settings"));
        }
        return this.i;
    }

    public final synchronized ebe d() {
        if (this.n == null) {
            this.n = new eax(this, a(".guide"));
        }
        return this.n;
    }

    private final synchronized ebe h() {
        if (this.j == null) {
            this.j = new eba(this, a(".offlineLibraryBrowse"));
        }
        return this.j;
    }

    public final synchronized ebe e() {
        if (this.k == null) {
            this.k = new eaz(this, a(".generatedSingleTabAccountBrowseResponse"));
        }
        return this.k;
    }

    private final synchronized ebe i() {
        if (this.l == null) {
            this.l = new ebc(this, a(".offlineCloudSingleTabBrowse"));
        }
        return this.l;
    }

    public final synchronized ebe f() {
        if (this.m == null) {
            this.m = new ebb(this, a(".loadingLibraryBrowse"));
        }
        return this.m;
    }

    private final ebg a(String str) {
        return new ebg(new File(this.h, str));
    }

    public final boolean g() {
        boolean z = false;
        try {
            if (a() != null && a().j) {
                z = true;
            }
            return z;
        } catch (IOException e) {
            xtl.a("Failed to fetch offline browse", e);
            return false;
        }
    }
}
