package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bank */
public final class bank extends bakp {
    public short a;
    public short[] b = new short[0];
    public int c;
    public String d;
    private String e;

    public bank() {
        super("saiz");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) ((((n() & 1) == 0 ? 4 : 12) + 5) + (this.a == (short) 0 ? this.b.length : 0));
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        if ((n() & 1) == 1) {
            byteBuffer.put(cil.a(this.d));
            byteBuffer.put(cil.a(this.e));
        }
        cin.c(byteBuffer, this.a);
        if (this.a == (short) 0) {
            cin.a(byteBuffer, (long) this.b.length);
            for (int c : this.b) {
                cin.c(byteBuffer, c);
            }
            return;
        }
        cin.a(byteBuffer, (long) this.c);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        if ((n() & 1) == 1) {
            this.d = cio.j(byteBuffer);
            this.e = cio.j(byteBuffer);
        }
        this.a = (short) cio.d(byteBuffer);
        int a = bana.a(cio.a(byteBuffer));
        this.c = a;
        if (this.a == (short) 0) {
            this.b = new short[a];
            for (a = 0; a < this.c; a++) {
                this.b[a] = (short) cio.d(byteBuffer);
            }
        }
    }

    public final String toString() {
        short s = this.a;
        int i = this.c;
        String str = this.d;
        String str2 = this.e;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 130) + String.valueOf(str2).length());
        stringBuilder.append("SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=");
        stringBuilder.append(s);
        stringBuilder.append(", sampleCount=");
        stringBuilder.append(i);
        stringBuilder.append(", auxInfoType='");
        stringBuilder.append(str);
        stringBuilder.append("', auxInfoTypeParameter='");
        stringBuilder.append(str2);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}
