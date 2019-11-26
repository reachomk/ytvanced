package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: amhn */
final /* synthetic */ class amhn implements anim {
    private final amhm a;
    private final String b;

    amhn(amhm amhm, String str) {
        this.a = amhm;
        this.b = str;
    }

    public final anjv a(Object obj) {
        amhm amhm = this.a;
        String str = this.b;
        azzl azzl = (azzl) obj;
        if (azzl.a()) {
            throw new bqe(azzl.a);
        } else if (azzl.b()) {
            azyp azyp = azzl.b;
            int i = azyp.a;
            if (i >= 0) {
                azyn azyn = azyp.b;
                if (azyn != null) {
                    try {
                        InputStream inputStream = azyp.c;
                        if (inputStream != null) {
                            byte[] a = anaz.a(inputStream);
                            String b = azyn.b("X-Goog-Upload-Status");
                            if ("cancelled".equals(b)) {
                                throw new bql(amhm.a(i, azyn, a));
                            } else if (!"final".equals(b)) {
                                throw new bqe(amhm.a(i, azyn, a));
                            } else if (i == 200) {
                                try {
                                    JSONObject jSONObject = new JSONObject(new String(a, amhm.a));
                                    String string = jSONObject.getString("status");
                                    String optString = jSONObject.optString("scottyResourceId", "");
                                    if (string.equals("STATUS_SUCCESS") && !TextUtils.isEmpty(optString) && optString.equals(str)) {
                                        return anjf.a(amhm.a(amjq.a(), true));
                                    }
                                    throw new bql(amhm.a(200, azyn, a));
                                } catch (JSONException unused) {
                                    throw new bqf(amhm.a(200, azyn, a));
                                }
                            } else {
                                throw new bql(amhm.a(i, azyn, a));
                            }
                        }
                        throw new bqe();
                    } catch (IOException unused2) {
                        throw new bqe();
                    }
                }
                throw new AssertionError("Null response headers");
            }
            throw new bqe();
        } else {
            throw new bqe();
        }
    }
}
