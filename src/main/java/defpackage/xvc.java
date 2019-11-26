package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xvc */
public final class xvc extends bqn {
    public static final azxt a;
    private final azxt c;

    public xvc(bqn bqn) {
        bqd bqd = bqn.b;
        for (Throwable cause = bqn.getCause(); (cause instanceof bqn) && bqd == null; cause = cause.getCause()) {
            bqd = ((bqn) cause).b;
        }
        super(bqd);
        if (bqd == null) {
            this.c = a;
        } else {
            azxt azxt;
            for (bqb bqb : this.b.d) {
                if ("Content-Type".equalsIgnoreCase(bqb.a)) {
                    if ("application/x-protobuf".equalsIgnoreCase(bqb.b)) {
                        azxt = (azxt) b().a(a);
                        break;
                    }
                    if ("application/json".equalsIgnoreCase(bqb.b)) {
                        azxt = (azxt) a().a(a);
                        break;
                    }
                }
            }
            azxt = (azxt) b().a(new xvb(this));
            this.c = azxt;
        }
        initCause(bqn);
    }

    public final String getMessage() {
        if (this.b != null) {
            return this.c.b;
        }
        return super.getMessage();
    }

    private final amqp b() {
        try {
            return amqp.b((azxt) anxl.parseFrom(azxt.c, this.b.b, anxa.c()));
        } catch (anyg e) {
            xtl.b("Could not parse proto error payload.", e);
            return ampo.a;
        }
    }

    public final amqp a() {
        try {
            JSONObject optJSONObject = new JSONObject(new String(this.b.b, "UTF-8")).optJSONObject("error");
            if (optJSONObject == null) {
                return ampo.a;
            }
            azxs azxs = (azxs) azxt.c.createBuilder();
            String optString = optJSONObject.optString("message");
            azxs.copyOnWrite();
            azxt azxt = (azxt) azxs.instance;
            if (optString != null) {
                azxt.b = optString;
                String optString2 = optJSONObject.optString("status");
                azxs.a(!TextUtils.isEmpty(optString2) ? azxq.a(optString2).getNumber() : 2);
                return amqp.b((azxt) ((anxl) azxs.build()));
            }
            throw new NullPointerException();
        } catch (UnsupportedEncodingException | JSONException e) {
            xtl.b("Could not parse json error payload.", e);
        }
    }

    static {
        azxs azxs = (azxs) azxt.c.createBuilder();
        azxs.a(2);
        a = (azxt) ((anxl) azxs.build());
    }
}
