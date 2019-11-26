package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yqy */
public final class yqy extends ypa {
    public final yio f;
    public final Map g = new HashMap();
    public final String i;
    private final yyc j;

    public yqy(Context context, Handler handler, ywk ywk, yio yio, yyc yyc, String str) {
        super(context, handler, ywk);
        this.f = yio;
        this.j = (yyc) amqw.a((Object) yyc);
        this.i = xvd.a(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.h, new yqx(this));
    }

    public final void a(amul amul) {
        amuo amuo = new amuo();
        amxn amxn = (amxn) amul.listIterator();
        while (amxn.hasNext()) {
            ykv ykv = (ykv) amxn.next();
            ykr ykr = (ykr) this.g.get(ykv.a);
            if (ykr != null) {
                ywt ywt = new ywt();
                String str = ykv.a;
                if (str != null) {
                    ywt.a = str;
                    aygk avatar = ykv.getAvatar();
                    if (avatar != null) {
                        ywt.b = avatar;
                        ywt.c = Boolean.valueOf(ykr.b());
                        String str2 = "";
                        if (ywt.a == null) {
                            str2 = str2.concat(" contactEntityKey");
                        }
                        if (ywt.b == null) {
                            str2 = String.valueOf(str2).concat(" avatar");
                        }
                        if (ywt.c == null) {
                            str2 = String.valueOf(str2).concat(" active");
                        }
                        if (str2.isEmpty()) {
                            amuo.c(new ywu(ywt.a, ywt.b, ywt.c.booleanValue()));
                        } else {
                            String str3 = "Missing required properties:";
                            throw new IllegalStateException(str2.length() == 0 ? new String(str3) : str3.concat(str2));
                        }
                    }
                    throw new NullPointerException("Null avatar");
                }
                throw new NullPointerException("Null contactEntityKey");
            }
        }
        yyc yyc = this.j;
        amul a = amuo.a();
        ahc a2 = ahb.a(new yyf(yyc, a));
        yye yye = yyc.a;
        yye.c.clear();
        yye.c.addAll(a);
        yye.aa_();
        a2.a(yyc.a);
        xpr.a(yyc.b, yyc.a.a() > 0);
    }
}
