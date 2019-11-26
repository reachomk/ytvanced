package defpackage;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: admg */
final class admg implements aebm {
    public adio a = null;
    private final String b;

    admg(String str) {
        this.b = str;
    }

    public final void a(xho xho) {
        String str;
        String str2 = "screenId";
        String str3 = "loungeToken";
        int b = xho.b();
        StringBuilder stringBuilder;
        if (b == 200) {
            xhn e = xho.e();
            if (e != null) {
                try {
                    try {
                        admi admi = new admi(new JSONObject(e.f()).getJSONObject("screen"));
                        adio adio = null;
                        try {
                            JSONObject jSONObject = admi.b;
                            if (!(jSONObject == null || jSONObject.optString("accessType", null) == null)) {
                                String optString = admi.b.optString("name", null);
                                String string = admi.b.getString(str3);
                                if (admi.b.has(str2)) {
                                    adjb adjb = new adjb(admi.b.getString(str2));
                                    adim adim = admi.b.has(str3) ? new adim(string) : null;
                                    str3 = admi.b.optString("clientName", null);
                                    adin a = adio.h().a(adix.MANUAL).a(adjb).a(optString).a(str3 != null ? new adik(str3) : null);
                                    a.a = adim;
                                    adio = a.b();
                                } else {
                                    str2 = admi.a;
                                    str3 = String.valueOf(admi.b);
                                    stringBuilder = new StringBuilder(str3.length() + 47);
                                    stringBuilder.append("We got a permanent screen without a screen id. ");
                                    stringBuilder.append(str3);
                                    xtl.a(str2, stringBuilder.toString());
                                }
                            }
                        } catch (JSONException e2) {
                            xtl.a(admi.a, "Error parsing screen ", e2);
                        }
                        this.a = adio;
                        return;
                    } catch (JSONException e3) {
                        str2 = admd.a;
                        str3 = String.valueOf(this.b);
                        str = "Error loading screen info from ";
                        if (str3.length() == 0) {
                            str3 = new String(str);
                        } else {
                            str3 = str.concat(str3);
                        }
                        xtl.a(str2, str3, e3);
                        return;
                    }
                } catch (IOException | JSONException e32) {
                    str2 = admd.a;
                    str3 = String.valueOf(this.b);
                    str = "Error loading from ";
                    if (str3.length() == 0) {
                        str3 = new String(str);
                    } else {
                        str3 = str.concat(str3);
                    }
                    xtl.a(str2, str3, e32);
                    return;
                }
            }
            xtl.a(admd.a, "Body from response is null");
            return;
        }
        String str4 = admd.a;
        str2 = this.b;
        stringBuilder = new StringBuilder(String.valueOf(str2).length() + 31);
        stringBuilder.append("Got status of ");
        stringBuilder.append(b);
        stringBuilder.append(" from ");
        stringBuilder.append(str2);
        xtl.a(str4, stringBuilder.toString());
    }

    public final void a(IOException iOException) {
        String str = admd.a;
        String valueOf = String.valueOf(this.b);
        String str2 = "Failed getting response from ";
        xtl.a(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), (Throwable) iOException);
    }
}
