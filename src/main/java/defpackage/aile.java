package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.libraries.backup.Backup;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: aile */
public final class aile {
    @Backup
    public static final String QUICK_SEEK_PREFERENCE_STRING = "double_tap_skip_duration";
    public final Resources a;
    public ailb b;
    public ailb c;
    public int d;
    private final SharedPreferences e;

    public aile(Context context, SharedPreferences sharedPreferences) {
        this.e = sharedPreferences;
        this.a = context.getResources();
    }

    public final int a() {
        return (int) TimeUnit.SECONDS.toMillis((long) Integer.parseInt(this.e.getString(QUICK_SEEK_PREFERENCE_STRING, this.a.getString(R.string.pref_double_tap_skip_entry_default_quickseek))));
    }

    public static int a(int i) {
        return (int) TimeUnit.MILLISECONDS.toSeconds((long) i);
    }

    public final void b() {
        this.d = 0;
    }
}
