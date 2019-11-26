package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: utf */
public final class utf extends utc {
    private final uzn b;
    private final tbg c;
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    utf(ute ute, Context context, tem tem, aott aott, tbg tbg, uzn uzn) {
        super(ute, context, tem, aott);
        this.c = (tbg) amqw.a((Object) tbg);
        this.b = (uzn) amqw.a((Object) uzn);
    }

    public final afpz b(ust ust) {
        String d = utf.d(ust);
        String str = (String) this.d.get(d);
        if (str != null) {
            return afpz.a(str);
        }
        synchronized (this) {
            d = (String) this.d.get(d);
            afpz a;
            if (d != null) {
                a = afpz.a(d);
                return a;
            }
            Bundle bundle;
            if (ust.e()) {
                bundle = new Bundle();
                bundle.putInt("delegation_type", 1);
                bundle.putString("delegatee_user_id", ust.a());
            } else {
                bundle = null;
            }
            a = a(ust.b(), bundle);
            return a;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String b(String str, Bundle bundle) {
        Object a;
        Object a2;
        if (this.a) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("handle_notification", true);
        }
        if (bundle != null) {
            a = utf.a(str, bundle.getString("delegatee_user_id"));
            a2 = this.c.a(str, this.b.d, bundle);
        } else {
            a = utf.a(str, null);
            a2 = this.c.a(str, this.b.d);
        }
        this.d.put(a, a2);
        return a2;
    }

    public final synchronized void a(Iterable iterable) {
        for (ust d : iterable) {
            this.d.remove(utf.d(d));
        }
    }

    public final synchronized void c(ust ust) {
        String d = utf.d(ust);
        if (this.d.containsKey(d)) {
            a((String) this.d.get(d));
            this.d.remove(d);
        }
    }

    private static String d(ust ust) {
        return utf.a(ust.b(), ust.e() ? ust.a() : null);
    }

    private static String a(String str, String str2) {
        Object str3;
        str = String.valueOf(str);
        if (str2 != null) {
            String str4 = "-";
            str3 = str2.length() == 0 ? new String(str4) : str4.concat(str2);
        } else {
            str3 = "";
        }
        str2 = String.valueOf(str3);
        return str2.length() == 0 ? new String(str) : str.concat(str2);
    }

    private final synchronized void a(String str) {
        try {
            this.c.a(str);
        } catch (IOException e) {
            str = String.valueOf(e.toString());
            String str2 = "AuthTokenProvider: clearToken IOException:";
            xtl.c(str.length() == 0 ? new String(str2) : str2.concat(str));
        }
    }
}
