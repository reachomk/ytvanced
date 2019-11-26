package defpackage;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: afnq */
public abstract class afnq extends afnp {
    public abstract Object a(JSONObject jSONObject);

    /* Access modifiers changed, original: protected|final */
    public final Object a(xhn xhn) {
        try {
            return a(new JSONObject(xhn.f()));
        } catch (IOException | JSONException | xwd e) {
            throw new xwd(e);
        }
    }
}
