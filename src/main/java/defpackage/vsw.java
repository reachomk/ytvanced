package defpackage;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vsw */
public final class vsw extends vsr {
    private vsu a;

    private vsw() {
        super(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "surveyAd";
    }

    public vsw(vsu vsu) {
        super(vsu);
        this.a = vsu;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        afns.a(jSONObject, "surveyAdRenderer", (Object) Base64.encodeToString(this.a.a.toByteArray(), 2));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            try {
                return new vsu(afns.a(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), afns.a(jSONObject, "contentPlayerAdParams"), afns.a(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), aajj.b, afns.a(jSONObject, "adCpn"), (axzh) ((anxl) ((axzg) ((anvi) ((axzg) axzh.h.createBuilder()).mergeFrom(Base64.decode(afns.a(jSONObject, "surveyAdRenderer"), 2), anxa.c()))).build()), (byte) 0);
            } catch (anyg unused) {
                throw new JSONException("Invalid protobuf");
            }
        }
        throw new JSONException("Unsupported version");
    }
}
