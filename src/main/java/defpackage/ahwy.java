package defpackage;

import android.opengl.GLES20;
import com.google.android.youtube.R;

/* renamed from: ahwy */
public final class ahwy {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;

    public static String a(ahxb ahxb, boolean z) {
        String str = !z ? "" : "#define ENABLE_WHITE_NOISE\n";
        String valueOf = String.valueOf(ahxb.a(R.raw.gl_white_noise_program_ext_frag));
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    public ahwy(ahwi ahwi, boolean z) {
        this.a = z;
        if (z) {
            this.b = ahwi.b("uNoiseOffset");
            this.c = ahwi.b("uNoiseScale");
            this.d = ahwi.b("uNoiseSeed");
            return;
        }
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    public final void a(float f, float f2, float f3) {
        if (this.a) {
            GLES20.glUniform1f(this.b, f3);
            GLES20.glUniform1f(this.c, f2);
            GLES20.glUniform1f(this.d, f);
            ahsl.b();
        }
    }
}
