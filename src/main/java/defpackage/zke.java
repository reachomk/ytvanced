package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: zke */
final class zke {
    public final int a;
    public int b;
    public int c;
    public int d;
    public FloatBuffer e;
    private final String f;
    private int g = -1;

    public zke(String str, int i) {
        this.f = str;
        this.a = i;
    }

    public final void a(float[] fArr) {
        this.b = 8;
        this.c = 2;
        this.d = 5126;
        int i = this.g;
        int length = fArr.length;
        if (i != length) {
            this.e = ByteBuffer.allocateDirect(length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.g = length;
        }
        this.e.put(fArr).position(0);
    }

    public final String toString() {
        return this.f;
    }
}
