package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cih */
public abstract class cih implements cij {
    private static Logger a = Logger.getLogger(cih.class.getName());
    private final ThreadLocal b = new cik();

    public abstract cis a(String str, byte[] bArr, String str2);

    public final cis a(bakq bakq, civ civ) {
        long b = bakq.b();
        ((ByteBuffer) this.b.get()).rewind().limit(8);
        while (true) {
            int a = bakq.a((ByteBuffer) this.b.get());
            if (a == 8) {
                ((ByteBuffer) this.b.get()).rewind();
                b = cio.a((ByteBuffer) this.b.get());
                byte[] bArr = null;
                if (b < 8 && b > 1) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    StringBuilder stringBuilder = new StringBuilder(80);
                    stringBuilder.append("Plausibility check failed: size < 8 (size = ");
                    stringBuilder.append(b);
                    stringBuilder.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", stringBuilder.toString());
                    return null;
                }
                String j = cio.j((ByteBuffer) this.b.get());
                if (b == 1) {
                    ((ByteBuffer) this.b.get()).limit(16);
                    bakq.a((ByteBuffer) this.b.get());
                    ((ByteBuffer) this.b.get()).position(8);
                    b = cio.f((ByteBuffer) this.b.get()) - 16;
                } else {
                    b = b == 0 ? bakq.a() - bakq.b() : b - 8;
                }
                if ("uuid".equals(j)) {
                    ((ByteBuffer) this.b.get()).limit(((ByteBuffer) this.b.get()).limit() + 16);
                    bakq.a((ByteBuffer) this.b.get());
                    bArr = new byte[16];
                    for (int position = ((ByteBuffer) this.b.get()).position() - 16; position < ((ByteBuffer) this.b.get()).position(); position++) {
                        bArr[position - (((ByteBuffer) this.b.get()).position() - 16)] = ((ByteBuffer) this.b.get()).get(position);
                    }
                    b -= 16;
                }
                long j2 = b;
                cis a2 = a(j, bArr, civ instanceof cis ? ((cis) civ).f() : "");
                a2.a(civ);
                ((ByteBuffer) this.b.get()).rewind();
                a2.a(bakq, (ByteBuffer) this.b.get(), j2, this);
                return a2;
            } else if (a < 0) {
                bakq.a(b);
                throw new EOFException();
            }
        }
    }
}
