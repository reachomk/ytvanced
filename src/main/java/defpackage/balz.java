package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: balz */
public class balz extends bakp {
    private static Logger b = Logger.getLogger(balz.class.getName());
    public ByteBuffer a;

    public balz(String str) {
        super(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        this.a.rewind();
        byteBuffer.put(this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) (this.a.limit() + 4);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        this.a = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.a.rewind();
            bamk.a(-1, this.a);
        } catch (IOException e) {
            b.logp(Level.WARNING, "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "_parseDetails", "Error parsing ObjectDescriptor", e);
        } catch (IndexOutOfBoundsException e2) {
            b.logp(Level.WARNING, "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "_parseDetails", "Error parsing ObjectDescriptor", e2);
        }
    }
}
