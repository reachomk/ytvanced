package defpackage;

import org.json.JSONArray;

/* renamed from: adax */
final class adax implements adbe {
    private final /* synthetic */ adas a;

    adax(adas adas) {
        this.a = adas;
    }

    public final void a(JSONArray jSONArray) {
        if (jSONArray.length() != 0) {
            adiv a = adiv.a(jSONArray.getString(0));
            if (a != null) {
                this.a.f.d(new adck(a, "cloud_bc"));
                adxy adxy = this.a.g;
                if (adxy == null) {
                    xtl.b(adas.a, "message received but channelMessageListener is null.");
                    return;
                }
                adxy.a(adym.a(jSONArray));
            }
        }
    }
}
