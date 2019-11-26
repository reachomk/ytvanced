package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: ycr */
public final class ycr {
    public final CharSequence a;

    public ycr(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ycr) && TextUtils.equals(((ycr) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
