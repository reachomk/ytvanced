package defpackage;

import android.util.Base64;
import org.json.JSONObject;

/* renamed from: vsr */
public abstract class vsr extends afns {
    private final vso a;

    protected vsr(vso vso) {
        this.a = vso;
    }

    public abstract String b();

    /* Access modifiers changed, original: protected */
    public void a(JSONObject jSONObject) {
        afns.a(jSONObject, "originalVideoId", (Object) this.a.d);
        jSONObject.put("requestTrackingParams", Base64.encodeToString(this.a.e, 0));
        afns.a(jSONObject, "contentPlayerAdParams", (Object) this.a.f);
        afns.a(jSONObject, "adBreakId", (Object) this.a.g);
        jSONObject.put("isForOffline", this.a.h);
        afns.a(jSONObject, "adCpn", (Object) this.a.j);
        jSONObject.put("expirationTimeMillis", this.a.k);
        afns.a(jSONObject, "adType", (Object) b());
    }
}
