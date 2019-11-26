package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: wwo */
public final class wwo implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wwo(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wwo a(bcaa bcaa, bcaa bcaa2) {
        return new wwo(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        Object sharedPreferences;
        Context context = (Context) this.a.get();
        amro amro = (amro) this.b.get();
        if (amro == null) {
            sharedPreferences = context.getSharedPreferences("youtube", 0);
        } else {
            sharedPreferences = (SharedPreferences) amro.get();
        }
        return (SharedPreferences) baqd.a(sharedPreferences, "Cannot return null from a non-@Nullable @Provides method");
    }
}
