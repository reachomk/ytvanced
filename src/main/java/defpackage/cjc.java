package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* renamed from: cjc */
public final class cjc extends bakp {
    public List a = new LinkedList();

    public cjc() {
        super("elst");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        int size;
        if (m() == 1) {
            size = this.a.size() * 20;
        } else {
            size = this.a.size() * 12;
        }
        return ((long) size) + 8;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        int a = bana.a(cio.a(byteBuffer));
        this.a = new LinkedList();
        for (int i = 0; i < a; i++) {
            this.a.add(new cjb(this, byteBuffer));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, (long) this.a.size());
        for (cjb cjb : this.a) {
            if (cjb.a.m() == 1) {
                byteBuffer.putLong(cjb.b);
                byteBuffer.putLong(cjb.c);
            } else {
                cin.a(byteBuffer, (long) bana.a(cjb.b));
                byteBuffer.putInt(bana.a(cjb.c));
            }
            cin.a(byteBuffer, cjb.d);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
        stringBuilder.append("EditListBox{entries=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
