package defpackage;

import java.nio.charset.Charset;

/* renamed from: uby */
public final class uby {
    public final ubx a = new ubx();

    public final Object a(String str, Object obj) {
        uhy.a(str.length() > 0);
        uhy.a(obj);
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        ubx ubx = this.a;
        ubx ubx2 = ubx;
        for (byte b : bytes) {
            if (ubx2.b == null) {
                ubx2.b = new aaf();
            }
            ubx ubx3 = (ubx) ubx2.b.a(b);
            if (ubx3 == null) {
                ubx3 = new ubx();
                ubx2.b.b(b, ubx3);
            }
            ubx2 = ubx3;
        }
        Object obj2 = ubx2.a;
        if (obj2 != null) {
            return obj2;
        }
        ubx2.a = obj;
        return null;
    }
}
