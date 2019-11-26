package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: adsp */
final class adsp implements adug {
    private final /* synthetic */ adso a;

    adsp(adso adso) {
        this.a = adso;
    }

    public final void a(long j, long j2) {
        adso adso = this.a;
        adto adto = adso.c;
        if (adto != null) {
            adtn adtn = adso.b;
            adtl a = adto.a(j).b(j2).a();
            Editor edit = adtn.a.edit();
            int g = a.g();
            int i = g - 1;
            if (g != 0) {
                String str = "mdx.recovery.expiration_time";
                String str2 = "mdx.recovery.screen_name";
                str2 = "mdx.recovery.ssid";
                str2 = "mdx.recovery.route_id";
                Editor putString = edit.putInt("mdx.recovery.session_type", i).putLong("mdx.recovery.last_connected_time", a.a()).putLong(str, a.b()).putString(str2, a.f()).putString(str2, a.c()).putString(str2, a.e());
                i = a.h();
                int i2 = i - 1;
                if (i != 0) {
                    putString.putInt("mdx.recovery.disconnect_reason", i2);
                    if (a.g() == 3) {
                        edit.putString("mdx.recovery.ssdp_id", ((adtd) amqw.a(a.d())).a().a);
                    }
                    edit.apply();
                    return;
                }
                throw null;
            }
            throw null;
        }
    }
}
