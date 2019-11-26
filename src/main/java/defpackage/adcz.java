package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* renamed from: adcz */
public final class adcz implements adea {
    public static final String a;
    public final addg b;
    private final addd c = new adde();
    private final xgq d;
    private final bcaa e;
    private final adzb f;
    private final bcaa g;
    private final int h;
    private final String i;
    private final String j;

    public adcz(adlv adlv, xgq xgq, bcaa bcaa, int i, adzb adzb, bcaa bcaa2, String str, String str2) {
        this.d = xgq;
        this.e = bcaa;
        this.f = adzb;
        this.g = bcaa2;
        this.h = i;
        this.i = str;
        this.j = str2;
        HandlerThread handlerThread = new HandlerThread(getClass().getName(), 10);
        handlerThread.start();
        this.b = new addg(handlerThread.getLooper(), adlv);
    }

    public final void a(Uri uri, adpw adpw, String str, String str2, addz addz) {
        String valueOf;
        adiy a = this.c.a();
        xhg b = xhc.b(uri.toString());
        b.b("Content-Type", "text/plain; charset=\"utf-8\"");
        b.b("Origin", "package:com.google.android.youtube");
        Builder builder = new Builder();
        builder.appendQueryParameter("pairingCode", a.a);
        builder.appendQueryParameter("theme", str);
        if (this.h == 1) {
            builder.appendQueryParameter("rUrl", this.f.a("ws"));
            builder.appendQueryParameter("rId", (String) this.g.get());
            this.f.a(new addi(addz, this.b, str2));
        }
        str = "dialLaunch";
        if (adpw.l()) {
            builder.appendQueryParameter(str, "watch");
        } else {
            builder.appendQueryParameter(str, "browse");
        }
        StringBuilder stringBuilder = new StringBuilder(builder.build().toString().replaceFirst("\\?", ""));
        stringBuilder.append(((aebh) this.e.get()).d);
        if (!TextUtils.isEmpty(this.i)) {
            valueOf = String.valueOf(this.i);
            str2 = "Using receiverLoader: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                str2.concat(valueOf);
            }
            stringBuilder.append(this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            valueOf = String.valueOf(this.j);
            str2 = "Using additionalParams: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                str2.concat(valueOf);
            }
            stringBuilder.append("&");
            stringBuilder.append(this.j);
        }
        try {
            valueOf = stringBuilder.toString();
            str = "UTF-8";
            if (TextUtils.isEmpty(str)) {
                str = "ISO-8859-1";
            }
            byte[] bytes = valueOf.getBytes(str);
            str2 = "text/plain; charset=";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            b.c = xhb.a(bytes, str);
            aebj.a(this.d, b.a(), new addc(this, a, addz));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error setting body for request", e);
        }
    }

    public final void a() {
        this.b.removeMessages(1);
    }

    public final void a(Uri uri) {
        String uri2 = uri.toString();
        xhg h = xhc.h();
        h.a = "DELETE";
        h.b = uri2;
        h.b("Origin", "package:com.google.android.youtube");
        aebj.a(this.d, h.a(), new addb());
    }

    static {
        String valueOf = String.valueOf(adcz.class.getCanonicalName());
        String str = "MDX.";
        a = xtl.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
