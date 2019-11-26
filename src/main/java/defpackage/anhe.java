package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: anhe */
public final class anhe {
    public static int a(byte b, byte b2, byte b3, byte b4) {
        return (((b << 24) | ((b2 & 255) << 16)) | ((b3 & 255) << 8)) | (b4 & 255);
    }

    public static int a(long j) {
        return j <= 2147483647L ? j >= -2147483648L ? (int) j : aocf.UNSET_ENUM_VALUE : Integer.MAX_VALUE;
    }

    public static int a(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int[] a(Collection collection) {
        if (collection instanceof anhd) {
            anhd anhd = (anhd) collection;
            return Arrays.copyOfRange(anhd.a, anhd.b, anhd.c);
        }
        Object[] toArray = collection.toArray();
        int length = toArray.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) amqw.a(toArray[i])).intValue();
        }
        return iArr;
    }

    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new anhd(iArr);
    }
}
