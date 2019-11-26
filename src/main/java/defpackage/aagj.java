package defpackage;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aagj */
public final class aagj extends afns {
    private aagh a;

    private aagj() {
    }

    public final int a() {
        return 2;
    }

    public aagj(aagh aagh) {
        this.a = aagh;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        jSONObject.put("data_pb", Base64.encodeToString(this.a.a.toByteArray(), 0));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 2) {
            try {
                return new aagh((nkx) anxl.parseFrom(nkx.b, Base64.decode(jSONObject.getString("data_pb"), 0), anxa.c()));
            } catch (anyg e) {
                String valueOf = String.valueOf(e.getMessage());
                String str = "Unable to parse proto: ";
                throw new JSONException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
        throw new JSONException("Unsupported version");
    }
}
