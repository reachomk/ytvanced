package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: ziu */
public final class ziu {
    private static final float[] j = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    private static final float[] k = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;
    private int f;
    private int g;
    private final FloatBuffer h;
    private final FloatBuffer i;

    public ziu() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.f = ziu.a(35633, "attribute vec4 aPos;\nattribute vec4 aTexCoord;\nvarying vec2 vTexCoord;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nvoid main() {\n  gl_Position = uMVPMatrix * aPos;\n  vTexCoord = (uSTMatrix * aTexCoord).xy;\n}\n");
        this.g = ziu.a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTexCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTexCoord);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        this.e = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, this.f);
            zij.a("Failed to attach vertex shader.");
            GLES20.glAttachShader(this.e, this.g);
            zij.a("Failed to attach fragment shader.");
            GLES20.glLinkProgram(this.e);
            zij.a("Failed to link shader program.");
            this.h = ByteBuffer.allocateDirect(384).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.h.put(j);
            this.h.position(0);
            this.i = ByteBuffer.allocateDirect(256).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.i.put(k);
            this.i.position(0);
            this.a = GLES20.glGetAttribLocation(this.e, "aPos");
            this.b = GLES20.glGetAttribLocation(this.e, "aTexCoord");
            this.c = GLES20.glGetUniformLocation(this.e, "uMVPMatrix");
            this.d = GLES20.glGetUniformLocation(this.e, "uSTMatrix");
            return;
        }
        throw new RuntimeException("Failed to initialize shader program.");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.e);
        this.e = 0;
        zij.a("Failed to delete shader program.");
        GLES20.glDeleteShader(this.f);
        this.f = 0;
        zij.a("Failed to delete vertex shader.");
        GLES20.glDeleteShader(this.g);
        this.g = 0;
        zij.a("Failed to delete fragment shader.");
    }

    public final void a(int i, float[] fArr, float[] fArr2) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.e);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glVertexAttribPointer(this.a, 3, 5126, false, 0, this.h);
        zij.a("Failed to attach vertices.");
        GLES20.glEnableVertexAttribArray(this.a);
        zij.a("Failed to enable vertex array.");
        GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 0, this.i);
        zij.a("Failed to attach texture coordinates.");
        GLES20.glEnableVertexAttribArray(this.b);
        zij.a("Failed to enable texture coordinate array.");
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.orthoM(fArr3, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
        float[] fArr4 = new float[16];
        Matrix.multiplyMM(fArr4, 0, fArr3, 0, fArr, 0);
        GLES20.glUniformMatrix4fv(this.c, 1, false, fArr4, 0);
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr2, 0);
        GLES20.glDrawArrays(5, 0, 4);
        zij.a("Failed to draw texture.");
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
    }

    private static int a(int i, String str) {
        i = GLES20.glCreateShader(i);
        zij.a("Failed to create shader.");
        if (i > 0) {
            GLES20.glShaderSource(i, str);
            GLES20.glCompileShader(i);
            zij.a("Failed to compile shader.");
            return i;
        }
        throw new RuntimeException("Create shader returned invalid result.");
    }
}
