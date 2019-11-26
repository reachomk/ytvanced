package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: tbm */
class tbm implements tbg {
    public final Context a;

    public tbm(Context context) {
        this.a = context;
    }

    public Account[] b(String str) {
        throw null;
    }

    public final String a(String str, String str2) {
        try {
            return pih.a(this.a, new Account(str, "com.google"), str2);
        } catch (pij e) {
            throw new tbf(e.a, e.getMessage(), e.a(), e);
        } catch (pil e2) {
            throw new tbh(e2.getMessage(), e2.a());
        } catch (pii e3) {
            throw new tbd(e3);
        }
    }

    public final String a(String str, String str2, Bundle bundle) {
        try {
            return pih.a(this.a, new Account(str, "com.google"), str2, bundle);
        } catch (pij e) {
            throw new tbf(e.a, e.getMessage(), e.a(), e);
        } catch (pil e2) {
            throw new tbh(e2.getMessage(), e2.a());
        } catch (pii e3) {
            throw new tbd(e3);
        }
    }

    public final void a(String str) {
        try {
            Context context = this.a;
            pzr.c("Calling this from your main thread can lead to deadlock");
            pih.a(context);
            Bundle bundle = new Bundle();
            String str2 = context.getApplicationInfo().packageName;
            bundle.putString("clientPackageName", str2);
            if (!bundle.containsKey(pih.a)) {
                bundle.putString(pih.a, str2);
            }
            pih.a(context, pih.b, new piv(str, bundle));
        } catch (pii e) {
            throw new IOException(e);
        }
    }

    public final List a(int i, String str) {
        try {
            Context context = this.a;
            pzr.a(str, (Object) "accountName must be provided");
            pzr.c("Calling this from your main thread can lead to deadlock");
            pih.a(context);
            List<pie> list = (List) pih.a(context, pih.b, new piy(str, i));
            ArrayList arrayList = new ArrayList(list.size());
            for (pie tbj : list) {
                arrayList.add(new tbj(tbj));
            }
            return arrayList;
        } catch (pii e) {
            throw new tbd(e);
        }
    }

    static {
        TimeUnit.SECONDS.toMillis(2);
    }
}
