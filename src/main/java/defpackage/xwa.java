package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: xwa */
public final class xwa implements Comparable {
    private final String a;
    private String[] b;
    private int[] c;

    public xwa(String str) {
        Object obj = "";
        String replaceAll = str != null ? str.replaceAll("\\.?[^0-9.].*", obj) : obj;
        this.b = TextUtils.split(replaceAll, "\\.");
        this.c = new int[this.b.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.b;
            if (i2 >= strArr.length) {
                break;
            }
            this.c[i2] = Integer.parseInt(strArr[i2]);
            i2++;
        }
        if (str != null) {
            obj = str.substring(replaceAll.length());
        }
        String[] strArr2 = new String[3];
        while (i < 3) {
            String[] strArr3 = this.b;
            strArr2[i] = i >= strArr3.length ? "0" : strArr3[i];
            i++;
        }
        str = String.valueOf(TextUtils.join(".", strArr2));
        String valueOf = String.valueOf(obj);
        this.a = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    private final int[] a() {
        int[] iArr;
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.c;
            length = iArr.length;
            if (i >= length) {
                break;
            }
            if (iArr[i] != 0) {
                i2 = i;
            }
            i++;
        }
        i2++;
        return i2 != length ? Arrays.copyOfRange(iArr, 0, i2) : iArr;
    }

    public final String toString() {
        return this.a;
    }

    /* renamed from: a */
    public final int compareTo(xwa xwa) {
        int[] a = a();
        int[] a2 = xwa.a();
        int min = Math.min(a.length, a2.length);
        for (int i = 0; i < min; i++) {
            int i2 = a[i] - a2[i];
            if (i2 != 0) {
                return i2;
            }
        }
        return a.length - a2.length;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xwa) && Arrays.equals(a(), ((xwa) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(a()) + 527;
    }
}
