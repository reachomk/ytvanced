package defpackage;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vtr */
public final class vtr extends afns {
    private vtp a;

    private vtr() {
    }

    public final int a() {
        return 1;
    }

    public vtr(vtp vtp) {
        this.a = vtp;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        afns.a(jSONObject, "videoAdTrackingProto", (Object) Base64.encodeToString(this.a.a.toByteArray(), 2));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            try {
                return new vtp((aojx) ((anxl) ((aojw) ((anvi) ((aojw) aojx.w.createBuilder()).mergeFrom(Base64.decode(afns.a(jSONObject, "videoAdTrackingProto"), 2), anxa.c()))).build()));
            } catch (anyg unused) {
                throw new JSONException("Invalid protobuf");
            }
        }
        throw new JSONException("Unsupported version");
    }
}
