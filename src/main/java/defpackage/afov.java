package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: afov */
public final class afov implements afpd {
    public final afmh a;
    private final xsv b;
    private final xgq c;
    private final SharedPreferences d;
    private afoz e;
    private final String f;
    private final bapu g;
    private final String h;
    private final String i;

    public afov(xsv xsv, xgq xgq, SharedPreferences sharedPreferences, afmh afmh, bapu bapu, String str, String str2) {
        this.b = (xsv) amqw.a((Object) xsv);
        this.c = (xgq) amqw.a((Object) xgq);
        this.d = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.a = (afmh) amqw.a((Object) afmh);
        this.f = xvd.a(str);
        this.g = (bapu) amqw.a((Object) bapu);
        xvd.a(str2);
        String str3 = "%s_%s";
        this.h = String.format(str3, new Object[]{"apiary_device_id", str2});
        this.i = String.format(str3, new Object[]{"apiary_device_key", str2});
    }

    private final synchronized afoz c() {
        long j;
        StringBuilder stringBuilder;
        xak.b();
        if (this.a.i() == null) {
            return null;
        }
        afoz afoz = this.e;
        if (afoz != null) {
            return afoz;
        }
        afoz afoz2;
        String string = this.d.getString(this.h, null);
        String string2 = this.d.getString(this.i, null);
        if (string == null || string2 == null) {
            afoz2 = null;
        } else {
            afoz2 = new afoz(string, Base64.decode(string2, 0));
        }
        this.e = afoz2;
        afoz = this.e;
        if (afoz != null) {
            return afoz;
        }
        xsw a = this.b.a();
        Uri build = this.a.d().buildUpon().appendEncodedPath(this.a.e()).appendQueryParameter("key", this.f).appendQueryParameter("rawDeviceId", (String) this.g.get()).build();
        try {
            afou afou = new afou(this);
            afse afse = new afse(this.c, new afox(), afou);
            wxf a2 = wxf.a();
            do {
                afse.a(build, a2);
                try {
                    this.e = (afoz) a2.get(15, TimeUnit.SECONDS);
                    afoz afoz3 = this.e;
                    this.d.edit().putString(this.h, afoz3.a).putString(this.i, new String(Base64.encode(afoz3.b, 0))).apply();
                    xtl.e("Successfully completed device registration.");
                    return this.e;
                } catch (ExecutionException | TimeoutException e) {
                    String simpleName = e.getClass().getSimpleName();
                    String message = e.getMessage();
                    simpleName.length();
                    String.valueOf(message).length();
                    if (!a.a()) {
                        j = a.b;
                        stringBuilder = new StringBuilder(54);
                        stringBuilder.append("Giving up device auth after ");
                        stringBuilder.append(j);
                        stringBuilder.append(" tries");
                        xtl.a(stringBuilder.toString(), e);
                        return null;
                    }
                }
            } while (a.a());
            j = a.b;
            stringBuilder = new StringBuilder(54);
            stringBuilder.append("Giving up device auth after ");
            stringBuilder.append(j);
            stringBuilder.append(" tries");
            xtl.a(stringBuilder.toString(), e);
            return null;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (NoSuchPaddingException unused2) {
            return null;
        }
    }

    public final void a(Map map, String str, byte[] bArr) {
        if (c() != null) {
            Object[] objArr = new Object[]{c().a, c().a(xsa.a(str.getBytes(), str.getBytes().length + 1), 4), c().a(bArr, 20)};
            map.put("X-Goog-Device-Auth", String.format("device_id=%s,data=%s,content=%s", objArr));
        }
    }

    public final void a() {
        c();
    }

    public final void b() {
        this.e = null;
        this.d.edit().remove(this.h).remove(this.i).apply();
    }
}
