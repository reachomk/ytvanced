package defpackage;

/* renamed from: anvk */
public abstract class anvk implements anzq {
    private static final anxa a = anxa.b();

    public anze a(byte[] bArr, int i, int i2, anxa anxa) {
        throw null;
    }

    private static anze a(anze anze) {
        if (anze == null || anze.isInitialized()) {
            return anze;
        }
        aoas aoas = !(anze instanceof anvf) ? !(anze instanceof anvh) ? new aoas() : new aoas() : ((anvf) anze).newUninitializedMessageException();
        throw aoas.a();
    }

    private final anze b(byte[] bArr, int i, int i2, anxa anxa) {
        return anvk.a(a(bArr, i, i2, anxa));
    }

    private final anze b(byte[] bArr, anxa anxa) {
        return b(bArr, 0, bArr.length, anxa);
    }
}
