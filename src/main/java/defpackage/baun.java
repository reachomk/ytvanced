package defpackage;

/* renamed from: baun */
final class baun extends baur {
    private final bauq c;

    /* Access modifiers changed, original: final */
    public final byte[] a(Object obj) {
        return this.c.a(obj).getBytes(ampv.a);
    }

    /* Access modifiers changed, original: final */
    public final Object a(byte[] bArr) {
        return this.c.a(new String(bArr, ampv.a));
    }

    /* synthetic */ baun(String str, bauq bauq) {
        super(str, false);
        Object obj = "-bin";
        amqw.a(str.endsWith(obj) ^ 1, "ASCII header is named %s.  Only binary headers may end with %s", (Object) str, obj);
        this.c = (bauq) amqw.a((Object) bauq, (Object) "marshaller");
    }
}
