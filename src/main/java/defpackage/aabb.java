package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aabb */
public final class aabb {
    private static final CharSequence[] a = new CharSequence[0];

    public static CharSequence[] a(arml[] armlArr, aaas aaas) {
        if (armlArr != null) {
            int length = armlArr.length;
            if (length != 0) {
                CharSequence[] charSequenceArr = new CharSequence[length];
                for (int i = 0; i < armlArr.length; i++) {
                    charSequenceArr[i] = aabb.a(armlArr[i], aaas, true);
                }
                return charSequenceArr;
            }
        }
        return a;
    }

    public static List a(List list, aaas aaas) {
        if (list == null || list.isEmpty()) {
            return Arrays.asList(a);
        }
        ArrayList arrayList = new ArrayList();
        for (arml a : list) {
            arrayList.add(aabb.a(a, aaas, true));
        }
        return arrayList;
    }

    @Deprecated
    public static Spanned a(arml arml, aaas aaas, boolean z) {
        ajqr ajqr;
        if (aaas == null) {
            ajqr = null;
        } else {
            ajqr = new aaba(aaaw.a(z), aaas);
        }
        return ajqy.a(arml, ajqr);
    }

    @Deprecated
    public static Spanned[] a(arml[] armlArr, aaas aaas, boolean z) {
        Spanned[] spannedArr = new Spanned[armlArr.length];
        for (int i = 0; i < armlArr.length; i++) {
            spannedArr[i] = aabb.a(armlArr[i], aaas, z);
        }
        return spannedArr;
    }

    public static List b(List list, aaas aaas) {
        ArrayList arrayList = new ArrayList();
        for (arml a : list) {
            arrayList.add(aabb.a(a, aaas, false));
        }
        return arrayList;
    }
}
