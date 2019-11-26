package defpackage;

import android.opengl.GLES20;
import com.google.android.youtube.R;

/* renamed from: ahwh */
public final class ahwh extends ahwe {
    public final int b = a("aColor");

    public ahwh(ahxb ahxb) {
        super(ahxb.a(R.raw.gl_color_program_vert), ahxb.a(R.raw.gl_color_program_frag));
    }

    public final void a() {
        super.a();
        GLES20.glEnableVertexAttribArray(this.b);
        ahsl.b();
    }

    public final void b() {
        super.b();
        GLES20.glDisableVertexAttribArray(this.b);
        ahsl.b();
    }
}
