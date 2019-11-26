package defpackage;

import java.nio.ByteBuffer;

@bamh(a = {0})
/* renamed from: bama */
public abstract class bama {
    public int a;
    public int b;
    public int c;

    public abstract void a(ByteBuffer byteBuffer);

    public final int a() {
        return (this.b + 1) + this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BaseDescriptor{tag=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sizeOfInstance=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
