package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@bamh(a = {4})
/* renamed from: bamf */
public final class bamf extends bama {
    private static Logger k = Logger.getLogger(bamf.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public bamb j;
    private bame l;
    private final List m = new ArrayList();
    private byte[] n;

    public final void a(ByteBuffer byteBuffer) {
        bama a;
        Logger logger;
        String valueOf;
        ByteBuffer byteBuffer2 = byteBuffer;
        this.d = cio.d(byteBuffer);
        int d = cio.d(byteBuffer);
        this.e = d >>> 2;
        this.f = (d >> 1) & 1;
        this.g = cio.b(byteBuffer);
        this.h = cio.a(byteBuffer);
        this.i = cio.a(byteBuffer);
        String str = "parseDetail";
        String str2 = "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor";
        String str3 = ", size: ";
        if (byteBuffer.remaining() > 2) {
            d = byteBuffer.position();
            a = bamk.a(this.d, byteBuffer2);
            int position = byteBuffer.position() - d;
            logger = k;
            Level level = Level.FINER;
            String valueOf2 = String.valueOf(a);
            valueOf = String.valueOf(a != null ? Integer.valueOf(a.a()) : null);
            StringBuilder stringBuilder = new StringBuilder((valueOf2.length() + 48) + valueOf.length());
            stringBuilder.append(valueOf2);
            stringBuilder.append(" - DecoderConfigDescr1 read: ");
            stringBuilder.append(position);
            stringBuilder.append(str3);
            stringBuilder.append(valueOf);
            logger.logp(level, str2, str, stringBuilder.toString());
            if (a != null) {
                d = a.a();
                if (position < d) {
                    this.n = new byte[(d - position)];
                    byteBuffer2.get(this.n);
                }
            }
            if (a instanceof bame) {
                this.l = (bame) a;
            }
            if (a instanceof bamb) {
                this.j = (bamb) a;
            }
        }
        while (byteBuffer.remaining() > 2) {
            d = byteBuffer.position();
            a = bamk.a(this.d, byteBuffer2);
            long position2 = ((long) byteBuffer.position()) - ((long) d);
            logger = k;
            Level level2 = Level.FINER;
            valueOf = String.valueOf(a);
            String valueOf3 = String.valueOf(a != null ? Integer.valueOf(a.a()) : null);
            StringBuilder stringBuilder2 = new StringBuilder((valueOf.length() + 57) + valueOf3.length());
            stringBuilder2.append(valueOf);
            stringBuilder2.append(" - DecoderConfigDescr2 read: ");
            stringBuilder2.append(position2);
            stringBuilder2.append(str3);
            stringBuilder2.append(valueOf3);
            logger.logp(level2, str2, str, stringBuilder2.toString());
            if (a instanceof bamn) {
                this.m.add((bamn) a);
            }
        }
    }

    public final int b() {
        bamb bamb = this.j;
        return (bamb != null ? bamb.b() : 0) + 15;
    }

    public final String toString() {
        String obj;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DecoderConfigDescriptor{objectTypeIndication=");
        stringBuilder.append(this.d);
        stringBuilder.append(", streamType=");
        stringBuilder.append(this.e);
        stringBuilder.append(", upStream=");
        stringBuilder.append(this.f);
        stringBuilder.append(", bufferSizeDB=");
        stringBuilder.append(this.g);
        stringBuilder.append(", maxBitRate=");
        stringBuilder.append(this.h);
        stringBuilder.append(", avgBitRate=");
        stringBuilder.append(this.i);
        stringBuilder.append(", decoderSpecificInfo=");
        stringBuilder.append(this.l);
        stringBuilder.append(", audioSpecificInfo=");
        stringBuilder.append(this.j);
        stringBuilder.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.n;
        if (bArr == null) {
            bArr = new byte[0];
        }
        stringBuilder.append(cim.a(bArr));
        stringBuilder.append(", profileLevelIndicationDescriptors=");
        if (this.m != null) {
            obj = Arrays.asList(new List[]{this.m}).toString();
        } else {
            obj = "null";
        }
        stringBuilder.append(obj);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
