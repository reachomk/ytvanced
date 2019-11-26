package defpackage;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vrz */
public final class vrz extends vsr {
    private vrx a;

    private vrz() {
        super(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "forecastingAd";
    }

    public vrz(vrx vrx) {
        super(vrx);
        this.a = vrx;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        afns.a(jSONObject, "forecastingAdRenderer", (Object) Base64.encodeToString(this.a.a.toByteArray(), 2));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            try {
                return new vrx(afns.a(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), afns.a(jSONObject, "contentPlayerAdParams"), afns.a(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), aajj.b, afns.a(jSONObject, "adCpn"), jSONObject.getLong("expirationTimeMillis"), (arku) ((anxl) ((arkx) ((anvi) ((arkx) arku.b.createBuilder()).mergeFrom(Base64.decode(afns.a(jSONObject, "forecastingAdRenderer"), 2), anxa.c()))).build()), (byte) 0);
            } catch (anyg unused) {
                throw new JSONException("Invalid protobuf");
            }
        }
        throw new JSONException("Unsupported version");
    }
}
