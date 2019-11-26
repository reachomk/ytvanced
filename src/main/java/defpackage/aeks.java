package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aeks */
public final class aeks {
    public final Map a = new HashMap();
    public byte[] b;

    public final void a(byte[] bArr) {
        this.b = (byte[]) amqw.a((Object) bArr);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj instanceof aeks) {
                aeks aeks = (aeks) obj;
                if (Arrays.equals(this.b, aeks.b)) {
                    if (this.a.entrySet().equals(aeks.a.entrySet())) {
                        return z;
                    }
                    return false;
                }
            }
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
