package defpackage;

import java.nio.ByteBuffer;

/* renamed from: anre */
public abstract class anre {
    private static anre a;

    public abstract int a(CharSequence charSequence);

    public abstract String a(ByteBuffer byteBuffer, int i, int i2);

    public abstract void a(CharSequence charSequence, ByteBuffer byteBuffer);

    public static anre a() {
        if (a == null) {
            a = new anrg();
        }
        return a;
    }
}
