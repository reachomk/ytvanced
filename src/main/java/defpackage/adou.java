package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: adou */
public final class adou {
    public static final String a = xtl.b("MDX.promotion");
    public final xsc b;
    public final Map c = new HashMap();
    public final Map d;
    private final SharedPreferences e;
    private int f;
    private int g;

    public adou(SharedPreferences sharedPreferences, Set set, int i, xsc xsc) {
        this.e = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = (xsc) amqw.a((Object) xsc);
        amqw.a((Object) set);
        for (adog adog : set) {
            this.c.put(adog.a, adog);
        }
        this.d = new HashMap();
        this.f = this.e.getInt("promotion_counter_ref_id", 0);
        for (adog adog2 : this.c.values()) {
            String a = adou.a(adog2.a);
            if (this.e.contains(a)) {
                try {
                    this.d.put(adog2.a, new adot(adog2.a, this.e.getString(a, "")));
                    String.format(Locale.US, "loaded promotion item: type=%s value=%s", new Object[]{adog2.a, r3.toString()});
                } catch (IllegalArgumentException e) {
                    String str = a;
                    String valueOf = String.valueOf(a);
                    a = "Failed to load promotion: ";
                    xtl.a(str, valueOf.length() == 0 ? new String(a) : a.concat(valueOf), e);
                }
            }
        }
        this.g = i;
        if (this.f < i) {
            String.format(Locale.US, "clearing promotion storage: stored promotion counter ref id %d < %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g)});
            for (adow adow : this.d.keySet()) {
                this.d.put(adow, new adot(adow));
            }
            a();
        }
    }

    public final void a() {
        Editor edit = this.e.edit();
        int i = this.g;
        if (i > this.f) {
            edit.putInt("promotion_counter_ref_id", i);
        }
        for (adot adot : this.d.values()) {
            edit.putString(adou.a(adot.a), adot.toString());
        }
        edit.commit();
    }

    private static String a(adow adow) {
        String valueOf = String.valueOf(adow);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
        stringBuilder.append("notification-type-");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
