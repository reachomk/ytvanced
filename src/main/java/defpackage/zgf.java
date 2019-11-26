package defpackage;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ShortBuffer;

/* renamed from: zgf */
public final class zgf implements ujr {
    public Uri a;
    public nlp b;
    public final nlu c = new zgi(this);
    public final ByteArrayOutputStream d = new ByteArrayOutputStream();
    public DataOutputStream e = new DataOutputStream(this.d);
    public zgh f;
    public int g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    private final int l = 250;
    private final int m = 4;

    public final void a() {
    }

    public final long b() {
        return 1000000 / ((long) this.l);
    }

    public final int c() {
        return this.d.size() / 2;
    }

    private final long a(int i, int i2) {
        return (((long) i) * ((long) i2)) / ((long) this.l);
    }

    public final void a(ShortBuffer shortBuffer, int i, int i2) {
        amqw.a(i > 0);
        amqw.a(i2 > 0);
        amqw.a(shortBuffer.remaining() % i2 == 0);
        try {
            long a = a(this.j + 1, i);
            int position = shortBuffer.position();
            int i3 = this.i;
            while (true) {
                position += i3;
                if (position >= shortBuffer.limit()) {
                    break;
                }
                for (i3 = 0; i3 < i2; i3++) {
                    this.g = Math.max(this.g, Math.abs(shortBuffer.get(position + i3)));
                }
                this.h += (long) this.m;
                while (this.h >= a) {
                    this.e.writeShort(Math.min(32767, this.g));
                    this.g = 0;
                    int i4 = this.j + 1;
                    this.j = i4;
                    a = a(i4 + 1, i);
                }
                i3 = this.m * i2;
            }
            this.i = position - shortBuffer.limit();
            zgh zgh = this.f;
            if (zgh != null) {
                zgh.a();
            }
            this.e.flush();
        } catch (IOException e) {
            xtl.a("Error writing to maxValueStream", e);
        }
    }
}
