package defpackage;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: cjf */
public final class cjf extends bakp {
    public String a;
    public String b = null;
    private long c;
    private long d;
    private long e;
    private boolean f = true;
    private long g;

    public cjf() {
        super("hdlr");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        int b;
        if (this.f) {
            b = ciq.b(this.b) + 25;
        } else {
            b = ciq.b(this.b) + 24;
        }
        return (long) b;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        this.g = cio.a(byteBuffer);
        this.a = cio.j(byteBuffer);
        this.c = cio.a(byteBuffer);
        this.d = cio.a(byteBuffer);
        this.e = cio.a(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            this.b = cio.a(byteBuffer, byteBuffer.remaining());
            if (this.b.endsWith("\u0000")) {
                String str = this.b;
                this.b = str.substring(0, str.length() - 1);
                this.f = true;
                return;
            }
            this.f = false;
            return;
        }
        this.f = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, this.g);
        byteBuffer.put(cil.a(this.a));
        cin.a(byteBuffer, this.c);
        cin.a(byteBuffer, this.d);
        cin.a(byteBuffer, this.e);
        String str = this.b;
        if (str != null) {
            byteBuffer.put(ciq.a(str));
        }
        if (this.f) {
            byteBuffer.put((byte) 0);
        }
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 30) + String.valueOf(str2).length());
        stringBuilder.append("HandlerBox[handlerType=");
        stringBuilder.append(str);
        stringBuilder.append(";name=");
        stringBuilder.append(str2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        Collections.unmodifiableMap(hashMap);
    }
}
