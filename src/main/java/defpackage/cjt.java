package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cjt */
public final class cjt extends bakp {
    public List a = Collections.emptyList();

    public cjt() {
        super("stsc");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) ((this.a.size() * 12) + 8);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        int a = bana.a(cio.a(byteBuffer));
        this.a = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.a.add(new cjw(cio.a(byteBuffer), cio.a(byteBuffer), cio.a(byteBuffer)));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, (long) this.a.size());
        for (cjw cjw : this.a) {
            cin.a(byteBuffer, cjw.a);
            cin.a(byteBuffer, cjw.b);
            cin.a(byteBuffer, cjw.c);
        }
    }

    public final String toString() {
        int size = this.a.size();
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("SampleToChunkBox[entryCount=");
        stringBuilder.append(size);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
