package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aacs */
final /* synthetic */ class aacs implements Callable {
    private final aacr a;
    private final String b;
    private final byte[] c;
    private final boolean d;

    aacs(aacr aacr, String str, byte[] bArr, boolean z) {
        this.a = aacr;
        this.b = str;
        this.c = bArr;
        this.d = z;
    }

    public final Object call() {
        return this.a.b(this.b, this.c, this.d);
    }
}
