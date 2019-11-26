package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cjx */
public final class cjx extends bakp {
    public final List a = new ArrayList();

    public cjx() {
        super("subs");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        long j = 8;
        for (cka cka : this.a) {
            j += 6;
            for (int i = 0; i < cka.b.size(); i++) {
                j = (j + (m() != 1 ? 2 : 4)) + 6;
            }
        }
        return j;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        long a = cio.a(byteBuffer);
        for (int i = 0; ((long) i) < a; i++) {
            cka cka = new cka();
            cka.a = cio.a(byteBuffer);
            int c = cio.c(byteBuffer);
            for (int i2 = 0; i2 < c; i2++) {
                long c2;
                cjz cjz = new cjz();
                if (m() != 1) {
                    c2 = (long) cio.c(byteBuffer);
                } else {
                    c2 = cio.a(byteBuffer);
                }
                cjz.a = c2;
                cjz.b = cio.d(byteBuffer);
                cjz.c = cio.d(byteBuffer);
                cjz.d = cio.a(byteBuffer);
                cka.b.add(cjz);
            }
            this.a.add(cka);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, (long) this.a.size());
        for (cka cka : this.a) {
            cin.a(byteBuffer, cka.a);
            cin.b(byteBuffer, cka.b.size());
            for (cjz cjz : cka.b) {
                if (m() != 1) {
                    cin.b(byteBuffer, bana.a(cjz.a));
                } else {
                    cin.a(byteBuffer, cjz.a);
                }
                cin.c(byteBuffer, cjz.b);
                cin.c(byteBuffer, cjz.c);
                cin.a(byteBuffer, cjz.d);
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 57);
        stringBuilder.append("SubSampleInformationBox{entryCount=");
        stringBuilder.append(size);
        stringBuilder.append(", entries=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
