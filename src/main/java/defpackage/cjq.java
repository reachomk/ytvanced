package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cjq */
public final class cjq extends bakp {
    public List a = new ArrayList();

    public cjq() {
        super("sdtp");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) (this.a.size() + 4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        for (cjp cjp : this.a) {
            cin.c(byteBuffer, cjp.a);
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.a.add(new cjp(cio.d(byteBuffer)));
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SampleDependencyTypeBox{entries=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
