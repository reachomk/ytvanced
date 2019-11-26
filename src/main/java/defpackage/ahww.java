package defpackage;

import com.google.android.youtube.R;

/* renamed from: ahww */
public final class ahww extends ahwz implements ahwl {
    public final ahwt b;
    public final ahwy d;
    public final int e;
    public final int f;
    public final int g;

    public ahww(ahxb ahxb, boolean z, boolean z2) {
        String valueOf = String.valueOf(ahwt.a(ahxb));
        String valueOf2 = String.valueOf(ahxb.a(R.raw.gl_streaming_video_texture_program_vert));
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        valueOf = ahwt.a(ahxb, z);
        String a = ahwy.a(ahxb, z2);
        String a2 = ahxb.a(R.raw.gl_streaming_video_texture_program_frag);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + String.valueOf(a).length()) + String.valueOf(a2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(a);
        stringBuilder.append(a2);
        super(valueOf2, stringBuilder.toString());
        this.e = b("uTexMultiplier");
        this.f = b("uTexOffset");
        this.g = b("uTextureMatrix");
        this.b = new ahwt(this, z);
        this.d = new ahwy(this, z2);
    }

    public final void a(boolean z, byte[] bArr, long j) {
        this.b.a(z, bArr, j);
    }

    public final void e() {
        this.b.a();
        super.e();
    }

    public final void a(int i, int i2, int i3) {
        this.b.a(i, i2, i3);
    }
}
