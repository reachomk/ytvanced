package defpackage;

/* renamed from: baup */
final class baup extends baur {
    private final baus c;

    /* Access modifiers changed, original: final */
    public final byte[] a(Object obj) {
        return this.c.a(obj);
    }

    /* Access modifiers changed, original: final */
    public final Object a(byte[] bArr) {
        return this.c.a(bArr);
    }

    /* synthetic */ baup(String str, baus baus) {
        boolean z = false;
        super(str, false);
        Object obj = "-bin";
        amqw.a(str.endsWith(obj), "Binary header is named %s. It must end with %s", (Object) str, obj);
        if (str.length() > 4) {
            z = true;
        }
        amqw.a(z, (Object) "empty key name");
        this.c = (baus) amqw.a((Object) baus, (Object) "marshaller is null");
    }
}
