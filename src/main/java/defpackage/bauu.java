package defpackage;

/* renamed from: bauu */
final class bauu extends baur {
    private final baut c;

    /* Access modifiers changed, original: final */
    public final byte[] a(Object obj) {
        return this.c.a(obj);
    }

    /* Access modifiers changed, original: final */
    public final Object a(byte[] bArr) {
        return this.c.a(bArr);
    }

    /* synthetic */ bauu(String str, boolean z, baut baut) {
        super(str, z);
        Object obj = "-bin";
        amqw.a(str.endsWith(obj) ^ 1, "ASCII header is named %s.  Only binary headers may end with %s", (Object) str, obj);
        this.c = (baut) amqw.a((Object) baut, (Object) "marshaller");
    }
}
