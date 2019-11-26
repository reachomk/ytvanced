package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adrr */
final /* synthetic */ class adrr implements Runnable {
    private final adrs a;
    private final adiv b;
    private final JSONObject c;

    adrr(adrs adrs, adiv adiv, JSONObject jSONObject) {
        this.a = adrs;
        this.b = adiv;
        this.c = jSONObject;
    }

    public final void run() {
        adrs adrs = this.a;
        adiv adiv = this.b;
        JSONObject jSONObject = this.c;
        for (adqg adqg : adrs.a.r) {
            try {
                int ordinal = adiv.ordinal();
                if (ordinal == 12) {
                    adrs.a(jSONObject);
                    adqg.H();
                } else if (ordinal == 41) {
                    adro adro = adrs.a;
                    boolean z = adro.N;
                    boolean z2 = adro.O;
                    adqg.b();
                } else if (ordinal == 32) {
                    adrs.a(jSONObject);
                    jSONObject.getInt("timeout");
                    adqg.I();
                } else if (ordinal == 33) {
                    adqg.J();
                } else if (ordinal == 35) {
                    adqg.a(adrs.a(jSONObject));
                } else if (ordinal == 36) {
                    adqg.a(adrs.a.M);
                } else if (ordinal == 38) {
                    adqg.a(adrs.a.Z);
                } else if (ordinal == 39) {
                    adqg.a(adrs.a.aa);
                }
            } catch (JSONException e) {
                xtl.a(adro.e, "Error parsing lounge message", e);
            }
        }
    }
}
