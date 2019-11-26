package defpackage;

import android.content.SharedPreferences;
import java.util.List;

/* renamed from: zjp */
public final class zjp {
    public final List a;
    public final SharedPreferences b;

    public static String a(String str) {
        str = String.valueOf(str);
        String str2 = "VISITED_EFFECT_ID_";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    public zjp(List list, SharedPreferences sharedPreferences) {
        this.a = (List) amqw.a((Object) list);
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        if (!sharedPreferences.contains(zjp.a("NORMAL"))) {
            for (zjt zjt : list) {
                sharedPreferences.edit().putInt(zjp.a(zjt.a), 2).apply();
            }
        }
        for (zjt zjt2 : list) {
            zjt2.c = c(zjt2.a);
        }
    }

    public final void b(String str) {
        if (!zjs.b(c(str))) {
            this.b.edit().putInt(zjp.a(str), 2).apply();
            zjt d = d(str);
            if (d != null) {
                d.c = new zjs(2);
            }
        }
    }

    public final zjs c(String str) {
        return new zjs(this.b.getInt(zjp.a(str), 0));
    }

    public final zjt d(String str) {
        return zjt.a(this.a, str);
    }
}
