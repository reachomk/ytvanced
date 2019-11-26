package defpackage;

import java.io.DataOutputStream;
import java.nio.ByteBuffer;

/* renamed from: acin */
final class acin {
    public final DataOutputStream a = new DataOutputStream(this.b);
    private final acik b = new acik();

    acin() {
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.b.reset();
    }

    /* Access modifiers changed, original: final */
    public final ByteBuffer b() {
        return ByteBuffer.wrap(this.b.a(), 0, this.b.b());
    }

    /* Access modifiers changed, original: final */
    public final void a(double d) {
        this.a.writeByte(0);
        this.a.writeDouble(d);
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        this.a.writeByte(5);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        this.a.writeByte(2);
        this.a.writeShort(str.length());
        this.a.write(str.getBytes("UTF-8"));
    }

    /* Access modifiers changed, original: final */
    public final void b(String str) {
        this.a.writeShort(str.length());
        this.a.write(str.getBytes("UTF-8"));
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.a.writeShort(0);
        this.a.writeByte(9);
    }
}
