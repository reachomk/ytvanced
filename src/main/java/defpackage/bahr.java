package defpackage;

import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: bahr */
public final class bahr extends baho {
    public static final Creator CREATOR = new bahq();

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        return true;
    }

    public bahr(byte[] bArr) {
        super(bArr);
    }

    public final String toString() {
        int c = c();
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("HeadTrackingState[");
        stringBuilder.append(c);
        stringBuilder.append(" bytes]");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj instanceof bahr ? Arrays.equals(((bahr) obj).a, this.a) : false;
        } else {
            return true;
        }
    }
}
