package defpackage;

import java.util.Arrays;

/* renamed from: vxd */
public final class vxd {
    public static final vxd a = new vxd(null, null, null);
    public final CharSequence b;
    public final CharSequence c;
    public final aygk d;

    public vxd(CharSequence charSequence, CharSequence charSequence2, aygk aygk) {
        this.b = charSequence;
        this.c = charSequence2;
        this.d = aygk;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            vxd vxd = (vxd) obj;
            return amqq.a(this.b, vxd.b) && amqq.a(this.c, vxd.c) && amqq.a(this.d, vxd.d);
        }
    }
}
