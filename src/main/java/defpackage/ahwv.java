package defpackage;

import android.opengl.GLES20;

/* renamed from: ahwv */
public class ahwv extends ahwi implements ahwl {
    public final int a;
    public final ahwy b;
    private final ahwt d;

    public ahwv(ahxb ahxb, String str, String str2, boolean z, boolean z2) {
        String valueOf = String.valueOf(ahwt.a(ahxb));
        str = String.valueOf(str);
        if (str.length() == 0) {
            str = new String(valueOf);
        } else {
            str = valueOf.concat(str);
        }
        valueOf = ahwt.a(ahxb, z);
        String a = ahwy.a(ahxb, z2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + String.valueOf(a).length()) + String.valueOf(str2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(a);
        stringBuilder.append(str2);
        super(str, stringBuilder.toString());
        this.a = a("aVertPos");
        this.d = new ahwt(this, z);
        this.b = new ahwy(this, z2);
    }

    public final void a() {
        GLES20.glEnableVertexAttribArray(this.a);
        ahsl.b();
    }

    public final void a(ahsr ahsr) {
        this.d.a(ahsr);
    }

    public final void a(boolean z, byte[] bArr, long j) {
        this.d.a(z, bArr, j);
    }

    public final void e() {
        this.d.a();
        super.e();
    }

    public final void a(int i, int i2, int i3) {
        this.d.a(i, i2, i3);
    }
}
