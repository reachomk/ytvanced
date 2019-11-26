package defpackage;

import android.content.SharedPreferences;

/* renamed from: adtn */
public final class adtn {
    public final SharedPreferences a;

    public adtn(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final void a() {
        String str = "";
        this.a.edit().putInt("mdx.recovery.session_type", -1).putString("mdx.recovery.ssdp_id", str).putString("mdx.recovery.ssid", str).putLong("mdx.recovery.last_connected_time", -1).putLong("mdx.recovery.expiration_time", -1).putString("mdx.recovery.route_id", str).putString("mdx.recovery.screen_name", str).putInt("mdx.recovery.disconnect_reason", -1).apply();
    }

    static {
        xtl.b("MDX.SessionInfoStorage");
    }
}
