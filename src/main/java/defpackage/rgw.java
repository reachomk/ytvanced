package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: rgw */
final class rgw {
    public static final rgw a = new rgw();
    private final rgz b;
    private final ConcurrentMap c = new ConcurrentHashMap();

    public final rha a(Class cls) {
        String str = "messageType";
        rfc.a((Object) cls, str);
        rha rha = (rha) this.c.get(cls);
        if (rha == null) {
            rha = this.b.a(cls);
            rfc.a((Object) cls, str);
            rfc.a((Object) rha, "schema");
            rha rha2 = (rha) this.c.putIfAbsent(cls, rha);
            return rha2 == null ? rha : rha2;
        }
    }

    public final rha a(Object obj) {
        return a(obj.getClass());
    }

    private rgw() {
        String[] strArr = new String[]{"com.google.protobuf.AndroidProto3SchemaFactory"};
        rgz rgz = null;
        for (Object obj = null; obj <= null; obj = 1) {
            try {
                rgz = (rgz) Class.forName(strArr[0]).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                rgz = null;
            }
            if (rgz != null) {
                break;
            }
        }
        if (rgz == null) {
            rgz = new rfv();
        }
        this.b = rgz;
    }
}
