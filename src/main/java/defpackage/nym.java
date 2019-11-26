package defpackage;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;

@Deprecated
/* renamed from: nym */
public final class nym implements Comparable {
    private final int a = 15;

    public nym() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SparseArray sparseArray = new SparseArray();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        nym nym = (nym) obj;
        if (nym != null) {
            i = this.a - nym.a;
            if (i == 0) {
                return 0;
            }
        }
        i = 1;
        return i;
    }
}
