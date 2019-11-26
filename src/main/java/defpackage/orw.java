package defpackage;

import android.text.Layout.Alignment;

/* renamed from: orw */
final class orw extends orf implements Comparable {
    private final int e;

    public orw(CharSequence charSequence, Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        super(charSequence, f, f2, i2, (byte) 0);
        this.e = i4;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((orw) obj).e;
        int i2 = this.e;
        if (i < i2) {
            i = -1;
        } else if (i > i2) {
            return 1;
        } else {
            i = 0;
        }
        return i;
    }
}
