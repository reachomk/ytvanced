package defpackage;

/* renamed from: uam */
public final class uam extends uak {
    public static final uam a = new uam();

    private uam() {
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ String a(anze anze) {
        bcar bcar = (bcar) anze;
        bcah bcah = bcar.d;
        if (bcah == null) {
            bcah = bcah.d;
        }
        bcah bcah2;
        if ((bcah.a & 2) == 0) {
            bcah2 = bcar.d;
            if (bcah2 == null) {
                bcah2 = bcah.d;
            }
            return Long.toHexString(bcah2.b);
        }
        bcah2 = bcar.d;
        if (bcah2 == null) {
            bcah2 = bcah.d;
        }
        return bcah2.c;
    }
}
