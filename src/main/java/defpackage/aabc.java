package defpackage;

/* renamed from: aabc */
public final class aabc {
    public static apxu a(byte[] bArr) {
        apxx apxx = (apxx) apxu.d.createBuilder();
        if (bArr != null) {
            try {
                apxx.mergeFrom(bArr, anxa.c());
            } catch (anyg unused) {
            }
        }
        return (apxu) ((anxl) apxx.build());
    }

    public static apxu b(byte[] bArr) {
        if (bArr != null) {
            try {
                return (apxu) anxl.parseFrom(apxu.d, bArr, anxa.c());
            } catch (anyg unused) {
            }
        }
        return apxu.d;
    }

    public static anvu a(apxu apxu) {
        if (apxu == null || (apxu.a & 1) == 0) {
            return anvu.a;
        }
        return apxu.b;
    }
}
