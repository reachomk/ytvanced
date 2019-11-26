package defpackage;

import android.content.SharedPreferences;
import org.json.JSONObject;

@qlp
/* renamed from: rnr */
public abstract class rnr {
    public final int a;
    public final String b;
    public final Object c;

    public static rnr a(int i, String str, Boolean bool) {
        return new rnu(i, str, bool);
    }

    public abstract Object a(SharedPreferences sharedPreferences);

    public abstract Object a(JSONObject jSONObject);

    public static rnr a(int i, String str, int i2) {
        return new rnt(i, str, Integer.valueOf(i2));
    }

    public static rnr a(int i, String str, long j) {
        return new rnw(i, str, Long.valueOf(j));
    }

    public static rnr a(int i, String str, float f) {
        return new rnv(i, str, Float.valueOf(f));
    }

    public static rnr a(int i, String str, String str2) {
        return new rny(i, str, str2);
    }

    public static rnr a(int i, String str) {
        rnr a = rnr.a(i, str, null);
        rlj.c().b.add(a);
        return a;
    }

    public static rnr b(int i, String str) {
        rnr a = rnr.a(i, str, null);
        rlj.c().c.add(a);
        return a;
    }

    /* synthetic */ rnr(int i, String str, Object obj) {
        this.a = i;
        this.b = str;
        this.c = obj;
        rlj.c().a.add(this);
    }
}
