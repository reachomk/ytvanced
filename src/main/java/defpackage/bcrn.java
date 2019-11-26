package defpackage;

import java.io.Serializable;

/* renamed from: bcrn */
public abstract class bcrn extends bcpx implements Serializable {
    public static final long serialVersionUID = -2554245107589433218L;
    public final bcpw a;

    protected bcrn(bcpw bcpw) {
        if (bcpw != null) {
            this.a = bcpw;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public final boolean b() {
        return true;
    }

    public final bcpw a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a.m;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 15);
        stringBuilder.append("DurationField[");
        stringBuilder.append(str);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final /* synthetic */ int compareTo(Object obj) {
        int i;
        long d = ((bcpx) obj).d();
        long d2 = d();
        if (d2 == d) {
            i = 0;
        } else if (d2 < d) {
            return -1;
        } else {
            i = 1;
        }
        return i;
    }
}
