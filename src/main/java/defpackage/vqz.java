package defpackage;

import android.net.Uri;

/* renamed from: vqz */
public final class vqz implements aftl {
    private int a = -1;
    private int b = -1;

    public vqz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String a(Uri uri, String str) {
        Integer num = (Integer) vqq.a.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 22) {
            return Integer.toString(this.a);
        }
        if (intValue != 23) {
            return null;
        }
        return Integer.toString(this.b);
    }

    public final String a() {
        return vqz.class.getSimpleName();
    }
}
