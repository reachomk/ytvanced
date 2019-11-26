package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: etz */
public final class etz {
    public final SharedPreferences a;
    public final xsc b;

    public etz(SharedPreferences sharedPreferences, xsc xsc) {
        this.a = sharedPreferences;
        this.b = xsc;
    }

    public final void a(boolean z) {
        String str = "restore_context_crash_timestamp";
        Editor remove = this.a.contains(str) ? this.a.edit().remove("restore_context_video_id").remove("restore_context_playlist_id").remove("restore_context_playlist_index").remove("restore_context_video_start_time").remove(str) : null;
        String str2 = "restore_context_last_time_shown";
        if (z != this.a.getBoolean(str2, false)) {
            if (remove == null) {
                remove = this.a.edit();
            }
            if (z) {
                remove.putBoolean(str2, true);
            } else {
                remove.remove(str2);
            }
        }
        if (remove != null) {
            remove.apply();
        }
    }
}
