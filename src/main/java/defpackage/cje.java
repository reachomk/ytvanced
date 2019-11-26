package defpackage;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: cje */
public final class cje extends bakn {
    public String a;
    public List b = Collections.emptyList();
    private long c;

    public cje() {
        super("ftyp");
    }

    public cje(String str, long j, List list) {
        super("ftyp");
        this.a = str;
        this.c = j;
        this.b = list;
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) ((this.b.size() << 2) + 8);
    }

    public final void a(ByteBuffer byteBuffer) {
        this.a = cio.j(byteBuffer);
        this.c = cio.a(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.b = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.b.add(cio.j(byteBuffer));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(cil.a(this.a));
        cin.a(byteBuffer, this.c);
        for (String a : this.b) {
            byteBuffer.put(cil.a(a));
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FileTypeBox[majorBrand=");
        stringBuilder.append(this.a);
        stringBuilder.append(";minorVersion=");
        stringBuilder.append(this.c);
        for (String str : this.b) {
            stringBuilder.append(";compatibleBrand=");
            stringBuilder.append(str);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
