package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: eap */
public final class eap {
    public final xti a;

    public eap(xti xti) {
        this.a = (xti) amqw.a((Object) xti);
    }

    public static SparseBooleanArray a(String str) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (String parseInt : str.split(",")) {
            try {
                sparseBooleanArray.put(Integer.parseInt(parseInt), true);
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }

    public final boolean a() {
        return this.a.a("failsafe_clear_cache_release_13_02", false);
    }
}
