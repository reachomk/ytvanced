package defpackage;

import android.app.backup.RestoreObserver;
import android.content.SharedPreferences;

/* renamed from: dtc */
public final class dtc extends RestoreObserver {
    private final /* synthetic */ SharedPreferences a;

    public dtc(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final void onUpdate(int i, String str) {
    }

    public final void restoreStarting(int i) {
    }

    public final void restoreFinished(int i) {
        if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("Manual restore failed with error: ");
            stringBuilder.append(i);
            xtl.d(stringBuilder.toString());
            return;
        }
        this.a.edit().putBoolean("got_future_restore", false).apply();
        xtl.e("Manual restore succeeded.");
    }
}
