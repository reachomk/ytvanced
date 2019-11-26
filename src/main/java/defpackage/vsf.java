package defpackage;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vsf */
public final class vsf extends afns {
    private vsd a;

    private vsf() {
    }

    public final int a() {
        return 1;
    }

    public vsf(vsd vsd) {
        this.a = vsd;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        afns.a(jSONObject, "adBreakRenderer", (afnt) this.a.c);
        jSONObject.put("adBreakIndex", this.a.d);
        jSONObject.put("isForOffline", this.a.e);
        jSONObject.put("orginalVideoId", this.a.f);
        jSONObject.put("adBreakId", this.a.g);
        afns.a(jSONObject, "contentPlayerAdParams", (Object) this.a.h);
        jSONObject.put("requestTrackingParams", Base64.encodeToString(this.a.i, 0));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new vsd((aafx) aafx.b.b(jSONObject, "adBreakRenderer"), jSONObject.getInt("adBreakIndex"), jSONObject.getBoolean("isForOffline"), jSONObject.getString("orginalVideoId"), jSONObject.getString("adBreakId"), afns.a(jSONObject, "contentPlayerAdParams"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0));
        }
        throw new JSONException("Unsupported version");
    }
}
