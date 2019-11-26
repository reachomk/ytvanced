package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abop */
public final class abop extends xle {
    public boolean a;
    private final bqj b;
    private Map k = new HashMap();

    public abop(String str, bqj bqj, bqk bqk) {
        super(0, str, bqk);
        this.b = (bqj) amqw.a((Object) bqj);
    }

    public final void a(String str, String str2) {
        this.k.put(str, str2);
    }

    public final Map c() {
        return this.k;
    }

    public final bqh a(bqd bqd) {
        byte[] bArr = bqd.b;
        Object obj = null;
        if (bArr != null) {
            this.k = bqd.c;
            if (this.a) {
                return bqh.a(new abmx(bArr), bqp.a(bqd));
            }
            String str = "content-type";
            if (this.k.containsKey(str)) {
                String str2 = (String) this.k.get(str);
                if (TextUtils.equals(str2, "application/x-protobuffer")) {
                    obj = new abnr(bqd.b);
                } else if (TextUtils.equals(str2, "application/json; charset=UTF-8")) {
                    obj = new abmy(bqd.b, this.k);
                }
                return bqh.a(obj, bqp.a(bqd));
            }
        }
        return null;
    }
}
