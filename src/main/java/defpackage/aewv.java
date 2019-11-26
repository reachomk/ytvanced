package defpackage;

/* renamed from: aewv */
final class aewv implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ long b;
    private final /* synthetic */ aewo c;

    aewv(aewo aewo, long j, long j2) {
        this.c = aewo;
        this.a = j;
        this.b = j2;
    }

    public final void run() {
        aeww aeww = this.c.b;
        String valueOf = String.valueOf(aewo.k());
        String str = "libvpx";
        String str2 = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        long j = this.a;
        aeww.a(str2, j, j - this.b);
    }
}
