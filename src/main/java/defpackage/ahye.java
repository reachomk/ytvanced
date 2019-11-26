package defpackage;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ahye */
public final class ahye {
    public final Set a = new HashSet();
    public byte[] b;
    public byte[] c;
    public acvx d;
    private final Map e = new HashMap();

    ahye() {
    }

    public final void a(acvx acvx) {
        this.d = (acvx) amqw.a((Object) acvx);
    }

    public final void a(byte[] bArr, String str, apxu apxu) {
        this.e.put(ByteBuffer.wrap(bArr), apxu);
        if (!TextUtils.isEmpty(str)) {
            a(str);
        }
    }

    public final void a(String str) {
        for (ByteBuffer byteBuffer : this.e.keySet()) {
            acxf a = ahye.a((apxu) this.e.get(byteBuffer));
            byte[] array = byteBuffer.array();
            if (a != null) {
                this.d.a(new acvs(array), a);
                this.d.a(a, str);
            } else {
                this.d.a(new acvs(array));
                this.d.a(str);
            }
        }
        this.e.clear();
    }

    public static acxf a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(avjd.b);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(avjd.b);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                azfa azfa = ((avjf) b).g;
                if (azfa == null) {
                    azfa = azfa.h;
                }
                return acxf.a(azfa);
            }
        }
        return null;
    }
}
