package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adre */
final class adre extends tgh {
    private final /* synthetic */ adrb a;

    adre(adrb adrb) {
        this.a = adrb;
    }

    public final void a() {
        boolean z = true;
        if (this.a.k != 1) {
            z = false;
        }
        amqw.b(z);
        xtl.c(adrb.e, "Connected to Cast, launching app.");
        this.a.N();
    }

    public final void a(String str) {
        String.valueOf(str).length();
        this.a.j.a("cc_las");
        try {
            this.a.g.a("{\"type\": \"getMdxSessionStatus\"}");
        } catch (sbt | sbv e) {
            xtl.b(adrb.e, "Failed to request screen id from Cast device", e);
        }
    }

    public final void a(teg teg) {
        String str = adrb.e;
        adrb adrb = this.a;
        String str2 = adrb.i;
        String valueOf = String.valueOf(adrb.h);
        String valueOf2 = String.valueOf(teg);
        int length = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 37) + valueOf.length()) + valueOf2.length());
        stringBuilder.append("Launching app id ");
        stringBuilder.append(str2);
        stringBuilder.append(" on screen ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" failed: ");
        stringBuilder.append(valueOf2);
        xtl.a(str, stringBuilder.toString());
        this.a.j.a("cc_cf");
        adrb adrb2 = this.a;
        boolean z = true;
        if (adrb2.k != 1) {
            adrb2.O();
            adrb2 = this.a;
            adpr adpr = adpr.NETWORK;
            if (adrb2.o == null) {
                z = false;
            }
            amqw.b(z);
            adrb2.a(adpr);
            adrb2.b(5);
            return;
        }
        adrb2.O();
        this.a.a(adpr.LAUNCH_CAST_FAIL_TIMEOUT, 8);
    }

    public final void a(int i) {
        this.a.O();
        this.a.j.a("cc_laf");
        if (i == 0) {
            i = 1;
        }
        this.a.a(adpr.LAUNCH_CAST_FAIL_TIMEOUT, 5, i);
    }

    public final void b(int i) {
        String str = adrb.e;
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("Cast onApplicationDisconnected ");
        stringBuilder.append(i);
        xtl.c(str, stringBuilder.toString());
        this.a.b(7, i);
    }

    public final void b(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Received Cast message: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            str2.concat(valueOf);
        }
        String str3;
        try {
            valueOf = new JSONObject(str).getJSONObject("data").getString("screenId");
            adrb adrb = this.a;
            if (adrb.k == 1) {
                adrb.k = 2;
                str3 = "Connected to Cast screen. Initiating cloud connection to ";
                str2 = String.valueOf(valueOf);
                if (str2.length() == 0) {
                    str2 = new String(str3);
                } else {
                    str3.concat(str2);
                }
                adio b = adio.h().a(new adjb(valueOf)).a(this.a.h.bv_()).a(adix.CAST).b();
                adrb adrb2 = this.a;
                adtm adtm = adrb2.f;
                adtw Q = adrb2.Q();
                adrb adrb3 = this.a;
                adrb2.a(adtm.a(b, Q, adrb3, adrb3.j, 0));
            }
        } catch (JSONException e) {
            str3 = adrb.e;
            str = String.valueOf(str);
            str2 = "Cannot parse Cast message: ";
            xtl.b(str3, str.length() == 0 ? new String(str2) : str2.concat(str), e);
        }
    }

    public final void c(int i) {
        String str;
        int i2;
        int i3 = 0;
        if (i == 0) {
            str = "other";
            i2 = 0;
        } else if (i == 1) {
            str = "connectivity";
            i2 = 5;
        } else if (i != 2) {
            str = "explicit";
            i2 = 2;
        } else {
            str = "app not running";
            i2 = 7;
        }
        String str2 = "onDisconnectionReason:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
        if (i2 != 0) {
            adrb adrb = this.a;
            int[] iArr = new int[]{1, 3};
            while (i3 < 2) {
                if (adrb.d != iArr[i3]) {
                    i3++;
                } else {
                    adrb.d = i2;
                    return;
                }
            }
        }
    }
}
