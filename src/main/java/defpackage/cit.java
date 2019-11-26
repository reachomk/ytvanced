package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cit */
public final class cit extends bakp {
    public List a = Collections.emptyList();

    public cit() {
        super("ctts");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) ((this.a.size() << 3) + 8);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        int a = bana.a(cio.a(byteBuffer));
        this.a = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.a.add(new ciw(bana.a(cio.a(byteBuffer)), byteBuffer.getInt()));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, (long) this.a.size());
        for (ciw ciw : this.a) {
            cin.a(byteBuffer, (long) ciw.a);
            byteBuffer.putInt(ciw.b);
        }
    }
}
