package defpackage;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aafz */
public final class aafz extends afns {
    private aafx a;

    private aafz() {
    }

    public final int a() {
        return 1;
    }

    public aafz(aafx aafx) {
        this.a = aafx;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        afns.a(jSONObject, "adBreakRendererProto", (Object) Base64.encodeToString(this.a.a.toByteArray(), 2));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            try {
                return new aafx((aogi) anxl.parseFrom(aogi.h, Base64.decode(afns.a(jSONObject, "adBreakRendererProto"), 2), anxa.c()));
            } catch (anyg unused) {
                throw new JSONException("Invalid protobuf");
            }
        }
        throw new JSONException("Unsupported version");
    }
}
