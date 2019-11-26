package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: addq */
final /* synthetic */ class addq implements Callable {
    private final addo a;
    private final String b;
    private final Map c;
    private final byte[] d;

    addq(addo addo, String str, Map map, byte[] bArr) {
        this.a = addo;
        this.b = str;
        this.c = map;
        this.d = bArr;
    }

    public final Object call() {
        addo addo = this.a;
        String str = this.b;
        Map map = this.c;
        byte[] bArr = this.d;
        xhg a = xhc.a(str);
        a.b("Origin", "package:com.google.android.youtube");
        aebj.a(addo.f, a.a(), new addp(addo, map, bArr, str));
        return null;
    }
}
