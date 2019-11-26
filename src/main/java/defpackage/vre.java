package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vre */
public final class vre extends vsr {
    private vrc a;

    private vre() {
        super(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "videoAd";
    }

    public vre(vrc vrc) {
        super(vrc);
        this.a = vrc;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        afns.a(jSONObject, "playerResponse", (Object) Base64.encodeToString(this.a.a.w(), 2));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            aakj a;
            String a2 = afns.a(jSONObject, "originalVideoId");
            byte[] decode = Base64.decode(jSONObject.getString("requestTrackingParams"), 0);
            String a3 = afns.a(jSONObject, "contentPlayerAdParams");
            String a4 = afns.a(jSONObject, "adBreakId");
            boolean z = jSONObject.getBoolean("isForOffline");
            String a5 = afns.a(jSONObject, "adCpn");
            long j = jSONObject.getLong("expirationTimeMillis");
            String a6 = afns.a(jSONObject, "playerResponse");
            if (TextUtils.isEmpty(a6)) {
                a = aakj.a();
            } else {
                a = aakj.a(Base64.decode(a6, 2), 0);
            }
            return new vrc(a2, decode, a3, a4, z, a5, j, a);
        }
        throw new JSONException("Unsupported version");
    }
}
