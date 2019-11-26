package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* renamed from: qae */
public abstract class qae extends pyd implements psw, qai {
    private final Set a;
    private final Account b;

    protected qae(Context context, Looper looper, int i, pyp pyp, pte pte, pth pth) {
        pte = (pte) pzr.a((Object) pte);
        pth = (pth) pzr.a((Object) pth);
        super(context, looper, pyw.a(context), psf.a, i, pte != null ? new qah(pte) : null, pth != null ? new qag(pth) : null, pyp.f);
        this.b = pyp.a;
        Set<Scope> set = pyp.c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.a = set;
    }

    public final psc[] s() {
        return new psc[0];
    }

    public final Account r() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final Set w() {
        return this.a;
    }

    public int c() {
        return psh.c;
    }
}
