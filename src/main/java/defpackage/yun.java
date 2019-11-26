package defpackage;

import android.text.TextUtils;

/* renamed from: yun */
final /* synthetic */ class yun implements bbnv {
    private final yuh a;
    private final aygk b;
    private final String c;
    private final arml d;

    yun(yuh yuh, aygk aygk, String str, arml arml) {
        this.a = yuh;
        this.b = aygk;
        this.c = str;
        this.d = arml;
    }

    public final Object a(Object obj) {
        yuh yuh = this.a;
        aygk aygk = this.b;
        String str = this.c;
        arml arml = this.d;
        ykp ykp = (ykp) obj;
        ykn ykn = null;
        if (!(aygk == null || TextUtils.isEmpty(str))) {
            yjx yjx = new yjx();
            yjx.a = aygk;
            yjx.c = arml;
            yjx.b = str;
            ykn = new yjy(yjx.a, yjx.b, yjx.c);
        }
        aaea b = yuh.a.b();
        yks f = ykp.f();
        f.b = ykn;
        return b.a(f.a()).a();
    }
}
