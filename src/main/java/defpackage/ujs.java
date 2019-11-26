package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ujs */
public final class ujs {
    public final List a = new ArrayList();
    public ujt b = ujt.NOT_STARTED;
    private final int c;
    private final ujy d;
    private final ByteArrayOutputStream e = new ByteArrayOutputStream();
    private final DataOutputStream f = new DataOutputStream(this.e);
    private final ujr g;
    private long h = Long.MAX_VALUE;
    private final uju i;
    private final long j;

    public ujs(ujr ujr, long j, uju uju) {
        uhy.a(true, "Invalid samplesPerSec (%s)", Integer.valueOf(48000));
        this.c = 147;
        this.d = ujy.a(2);
        this.g = (ujr) uhy.a((Object) ujr);
        j = (j * 7056000) / 1000000;
        this.j = j;
        this.h = j;
        this.i = uju;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        while (true) {
            int size;
            uju uju;
            if (this.b != ujt.FINISHED) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ujw ujw = (ujw) it.next();
                    if (ujw.c) {
                        ujv ujv = ujw.a;
                        if (ujv.b() < ((long) ujv.a)) {
                            it.remove();
                            size = this.a.size();
                            StringBuilder stringBuilder = new StringBuilder(47);
                            stringBuilder.append("Removed finished source, ");
                            stringBuilder.append(size);
                            stringBuilder.append(" remaining.");
                            ujo.c(stringBuilder.toString());
                        }
                    }
                }
                if (this.h < ((long) this.c)) {
                    this.g.a();
                    uju = this.i;
                    if (uju != null) {
                        uju.a(1.0d);
                    }
                    this.b = ujt.FINISHED;
                }
            }
            if (this.b != ujt.STARTED) {
                break;
            }
            long min = Math.min(this.h, (long) (this.c << 12));
            for (ujw ujw2 : this.a) {
                min = Math.min(min, ujw2.a.b());
            }
            size = (int) (min / ((long) this.c));
            if (size <= 0) {
                break;
            }
            try {
                int i;
                float f;
                int i2;
                if (this.d.a()) {
                    for (i = 0; i < size; i++) {
                        f = 0.0f;
                        float f2 = 0.0f;
                        for (i2 = 0; i2 < this.a.size(); i2++) {
                            ujw ujw3 = (ujw) this.a.get(i2);
                            f += ujw3.a(1);
                            f2 += ujw3.a(2);
                            ujw3.a((long) this.c);
                        }
                        this.f.writeShort(ujs.a(f));
                        this.f.writeShort(ujs.a(f2));
                    }
                } else {
                    for (i = 0; i < size; i++) {
                        f = 0.0f;
                        for (i2 = 0; i2 < this.a.size(); i2++) {
                            ujw ujw4 = (ujw) this.a.get(i2);
                            f += ujw4.a.a() * ujw4.b;
                            ujw4.a((long) this.c);
                        }
                        this.f.writeShort(ujs.a(f));
                    }
                }
                long j = this.h - ((long) (size * this.c));
                this.h = j;
                uju = this.i;
                if (uju != null) {
                    double d = (double) j;
                    double d2 = (double) this.j;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    uju.a(1.0d - (d / d2));
                }
                try {
                    this.f.flush();
                } catch (IOException e) {
                    ujo.a("Exception while flushing mixed audio", e);
                }
                if (this.e.size() > 0) {
                    this.g.a(ByteBuffer.wrap(this.e.toByteArray()).asShortBuffer(), 7056000 / this.c, this.d.a);
                    this.e.reset();
                }
            } catch (IOException e2) {
                ujo.a("Exception while mixing audio", e2);
            }
        }
    }

    private static short a(float f) {
        return (short) Math.round(Math.max(-32768.0f, Math.min(32767.0f, f)));
    }
}
