package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: uzn */
public final class uzn {
    public static final Set a;
    private static final Set e;
    public final AccountManager b;
    public final tbg c;
    public final String d;
    private final uzk f;
    private final String g;

    public uzn(AccountManager accountManager, tbg tbg, uzk uzk, Set set) {
        this((AccountManager) amqw.a((Object) accountManager), (tbg) amqw.a((Object) tbg), (uzk) amqw.a((Object) uzk), set, "com.google");
    }

    protected uzn() {
        this(null, null, null, Collections.singleton("http://gdata.youtube.com"), "");
    }

    private uzn(AccountManager accountManager, tbg tbg, uzk uzk, Set set, String str) {
        this.b = accountManager;
        this.c = tbg;
        this.f = uzk;
        String valueOf = String.valueOf(TextUtils.join(" ", set));
        String str2 = "oauth2:";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        this.d = valueOf;
        this.g = str;
    }

    public final Account[] a() {
        return this.f.a(this.g);
    }

    @Deprecated
    public final Account[] b() {
        try {
            return a();
        } catch (RemoteException | tei | tej unused) {
            return new Account[0];
        }
    }

    public static Account a(String str, Account[] accountArr) {
        if (!TextUtils.isEmpty(str)) {
            for (Account account : accountArr) {
                if (TextUtils.equals(account.name, str)) {
                    return account;
                }
            }
        }
        return null;
    }

    public static boolean b(String str, Account[] accountArr) {
        return uzn.a(str, accountArr) != null;
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("https://www.googleapis.com/auth/youtube");
        hashSet.add("https://www.googleapis.com/auth/youtube.force-ssl");
        e = Collections.unmodifiableSet(hashSet);
        hashSet = new HashSet(e);
        hashSet.add("https://www.googleapis.com/auth/identity.lateimpersonation");
        a = Collections.unmodifiableSet(hashSet);
    }
}
