package defpackage;

/* renamed from: ihe */
final class ihe implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ ihb b;
    private final /* synthetic */ int c;

    public final void run() {
        igz igz = this.b.a;
        int i = this.c;
        boolean z = this.a;
        igz.g = i;
        igz.f = z;
        igz.b(2);
        ihb ihb = this.b;
        i = this.c;
        if (ihb.c) {
            ihd ihd = ihb.d;
            if (ihd != null) {
                byte[] bArr = ihd.b;
                if (bArr != null && bArr.length > 0 && i != 3 && i != 1) {
                    ihb.c = false;
                    ihb.b.a(bArr, null);
                }
            }
        }
    }

    ihe(ihb ihb, int i, boolean z) {
        this.b = ihb;
        this.c = i;
        this.a = z;
    }
}
