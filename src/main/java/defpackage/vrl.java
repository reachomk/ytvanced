package defpackage;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vrl */
public final class vrl extends vsr {
    private vrj a;

    private vrl() {
        super(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "adVideoEnd";
    }

    public vrl(vrj vrj) {
        super(vrj);
        this.a = vrj;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        vso vso = this.a.b;
        if (vso instanceof vtk) {
            afns.a(jSONObject, "videoAd", (afnt) vso);
        } else {
            xtl.c("Encountered an AdVideoEnd with a player ad for reporting that was not a VideoAd.");
        }
        afns.a(jSONObject, "adVideoEndRenderer", (Object) Base64.encodeToString(this.a.a.toByteArray(), 2));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            vso vso;
            String str = "videoAd";
            if (vtk.c.b(jSONObject, str) != null) {
                vso = (vso) vtk.c.b(jSONObject, str);
            } else {
                xtl.c("Encountered an AdVideoEnd with a player ad for reporting that was not a VideoAd.");
                vso = null;
            }
            vso vso2 = vso;
            try {
                return new vrj(afns.a(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), afns.a(jSONObject, "contentPlayerAdParams"), afns.a(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), aajj.b, afns.a(jSONObject, "adCpn"), (aolc) ((anxl) ((aolf) ((anvi) ((aolf) aolc.h.createBuilder()).mergeFrom(Base64.decode(afns.a(jSONObject, "adVideoEndRenderer"), 2), anxa.c()))).build()), vso2);
            } catch (anyg unused) {
                throw new JSONException("Invalid protobuf");
            }
        }
        throw new JSONException("Unsupported version");
    }
}
