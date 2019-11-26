package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import com.google.android.youtube.R;

/* renamed from: dwz */
public final class dwz {
    public final Context a;
    private final AudioManager b;
    private final SharedPreferences c;
    private final String d;
    private final String e;

    public dwz(Context context, SharedPreferences sharedPreferences) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = (SharedPreferences) amqw.a((Object) sharedPreferences);
        context.getString(R.string.off);
        this.d = context.getString(R.string.on_if_hh);
        this.e = context.getString(R.string.on);
    }

    public final boolean a() {
        return f().equals(this.d);
    }

    public final boolean b() {
        return f().equals(this.e);
    }

    public final boolean c() {
        boolean z = true;
        if (!b()) {
            if (!a()) {
                z = false;
            } else if (this.b.isWiredHeadsetOn() || this.b.isBluetoothA2dpOn() || this.b.isBluetoothScoOn()) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    private final String f() {
        return this.c.getString(ebn.BACKGROUND_AUDIO_POLICY, this.e);
    }

    public final boolean d() {
        return this.c.getBoolean(ebn.SHOW_BACKGROUND_PLAYBACK_SETTINGS_DIALOG, true);
    }

    public final void e() {
        this.c.edit().putBoolean(ebn.SHOW_BACKGROUND_PLAYBACK_SETTINGS_DIALOG, false).apply();
    }
}
