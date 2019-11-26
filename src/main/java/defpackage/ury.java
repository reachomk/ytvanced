package defpackage;

import android.os.Bundle;

/* renamed from: ury */
final class ury implements urz {
    ury() {
    }

    public final nd a() {
        return new urj();
    }

    public final nd a(byte[] bArr, int i) {
        Bundle bundle = new Bundle();
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("source", i2);
            bundle.putByteArray("token", bArr);
            bundle.putInt("style", 0);
            bundle.putInt("account_icon", 0);
            urj urj = new urj();
            urj.f(bundle);
            return urj;
        }
        throw null;
    }
}
