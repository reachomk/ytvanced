package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vtm */
public final class vtm extends vsr {
    private vtk a;

    private vtm() {
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

    public vtm(vtk vtk) {
        super(vtk);
        this.a = vtk;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        afns.a(jSONObject, "videoAdRenderer", (Object) Base64.encodeToString(this.a.a.toByteArray(), 2));
        afns.a(jSONObject, "playerResponse", (Object) Base64.encodeToString(this.a.b.w(), 2));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            String a = afns.a(jSONObject, "originalVideoId");
            byte[] decode = Base64.decode(jSONObject.getString("requestTrackingParams"), 0);
            String a2 = afns.a(jSONObject, "contentPlayerAdParams");
            String a3 = afns.a(jSONObject, "adBreakId");
            boolean z = jSONObject.getBoolean("isForOffline");
            String a4 = afns.a(jSONObject, "adCpn");
            long j = jSONObject.getLong("expirationTimeMillis");
            try {
                aakj a5;
                ayxm ayxm = (ayxm) ayxm.o.getParserForType().a(Base64.decode(afns.a(jSONObject, "videoAdRenderer"), 2), anxa.c());
                String a6 = afns.a(jSONObject, "playerResponse");
                if (TextUtils.isEmpty(a6)) {
                    a5 = aakj.a();
                } else {
                    a5 = aakj.a(Base64.decode(a6, 2), 0);
                }
                return new vtk(a, decode, a2, a3, z, a4, j, ayxm, a5);
            } catch (anyg unused) {
                throw new JSONException("Invalid protobuf");
            }
        }
        throw new JSONException("Unsupported version");
    }
}
