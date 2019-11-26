package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: hie */
public final class hie extends hid {
    private final aizy b;
    private final SharedPreferences c;

    public hie(Context context, hia hia, ahcn ahcn, bcaa bcaa, aizy aizy, bcaa bcaa2, SharedPreferences sharedPreferences, aaas aaas) {
        super(context, hia, ahcn, bcaa, bcaa2, aaas);
        this.b = aizy;
        this.c = sharedPreferences;
    }

    public final void a(String str) {
        SharedPreferences sharedPreferences = this.c;
        String str2 = ebn.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED;
        if (sharedPreferences.contains(str2)) {
            sharedPreferences.edit().putBoolean(str2, true).apply();
        }
        String k = this.b.k();
        if (!(k == null || !k.equals(str) || elq.b(this.b) == null || b(str))) {
            if (TextUtils.isEmpty(str)) {
                xpr.a(this.a, (int) R.string.add_video_to_offline_error, 1);
                return;
            }
            a(str, aiqr.b(elq.b(this.b).l()));
        }
    }
}
