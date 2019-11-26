package defpackage;

import java.io.IOException;
import org.json.JSONArray;

/* renamed from: adyz */
final /* synthetic */ class adyz implements Runnable {
    private final adyw a;
    private final adiv b;
    private final adja c;

    adyz(adyw adyw, adiv adiv, adja adja) {
        this.a = adyw;
        this.b = adiv;
        this.c = adja;
    }

    public final void run() {
        adyw adyw = this.a;
        JSONArray a = adyn.a(this.b, this.c);
        String jSONArray;
        String str;
        try {
            adzb adzb = adyw.g;
            jSONArray = a.toString();
            if (adzb.b != null) {
                adzb.b.b(new barl(barn.Text, jSONArray));
                str = "Sending WS: ";
                jSONArray = String.valueOf(jSONArray);
                if (jSONArray.length() == 0) {
                    jSONArray = new String(str);
                    return;
                }
                str.concat(jSONArray);
            }
        } catch (IOException e) {
            jSONArray = adyw.f;
            str = String.valueOf(e.getMessage());
            String str2 = "Failed to send message: ";
            xtl.a(jSONArray, str.length() == 0 ? new String(str2) : str2.concat(str));
        }
    }
}
