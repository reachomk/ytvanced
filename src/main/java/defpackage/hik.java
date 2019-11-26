package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: hik */
public final class hik implements xcp {
    private final Resources a;
    private final albi b;
    private final SharedPreferences c;

    public hik(Context context, albi albi, SharedPreferences sharedPreferences) {
        this.a = context.getResources();
        this.b = albi;
        this.c = sharedPreferences;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{agls.class};
        } else if (i == 0) {
            agls agls = (agls) obj;
            agqy agqy = agls.a;
            if (!(agqy == null || agqy.j == null)) {
                String str = "offline_has_shown_download_expiration_disclaimer";
                if (!this.c.getBoolean(str, false)) {
                    int toDays = (int) TimeUnit.SECONDS.toDays(agls.a.j.g());
                    this.b.b(this.b.b().b(this.a.getQuantityString(R.plurals.offline_go_online_to_renew_snackbar_message, toDays, new Object[]{Integer.valueOf(toDays)})).c(false).d());
                    this.c.edit().putBoolean(str, true).apply();
                    return null;
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
