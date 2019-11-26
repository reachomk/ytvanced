package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: bakn */
public abstract class bakn implements cis {
    private static bang a = bang.a(bakn.class);
    private boolean b;
    private ByteBuffer c;
    private long d;
    private long e;
    private long f = -1;
    private bakq g;
    public final String h;
    public byte[] i;
    public civ j;
    public boolean k;
    private ByteBuffer l = null;

    private final synchronized void a() {
        if (!this.b) {
            try {
                bang bang = a;
                String str = "mem mapping ";
                String valueOf = String.valueOf(this.h);
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                bang.a(valueOf);
                this.c = this.g.a(this.d, this.f);
                this.b = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public abstract void a(ByteBuffer byteBuffer);

    public abstract long b();

    public abstract void b(ByteBuffer byteBuffer);

    public final long e() {
        return this.e;
    }

    protected bakn(String str) {
        this.h = str;
        this.b = true;
        this.k = true;
    }

    protected bakn(String str, byte[] bArr) {
        this.h = str;
        this.i = bArr;
        this.b = true;
        this.k = true;
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        long b = bakq.b();
        this.d = b;
        this.e = b - ((long) byteBuffer.remaining());
        this.f = j;
        this.g = bakq;
        bakq.a(bakq.b() + j);
        this.b = false;
        this.k = false;
        l();
    }

    public final void a(WritableByteChannel writableByteChannel) {
        String str = "uuid";
        int i = 8;
        int i2 = 0;
        int i3 = 16;
        ByteBuffer allocate;
        if (!this.b) {
            if (!g()) {
                i = 16;
            }
            if (str.equals(this.h)) {
                i2 = 16;
            }
            allocate = ByteBuffer.allocate(i + i2);
            c(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            this.g.a(this.d, this.f, writableByteChannel);
        } else if (this.k) {
            allocate = ByteBuffer.allocate(bana.a(d()));
            c(allocate);
            b(allocate);
            ByteBuffer byteBuffer = this.l;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                while (this.l.remaining() > 0) {
                    allocate.put(this.l);
                }
            }
            writableByteChannel.write((ByteBuffer) allocate.rewind());
        } else {
            if (!g()) {
                i = 16;
            }
            if (!str.equals(this.h)) {
                i3 = 0;
            }
            allocate = ByteBuffer.allocate(i + i3);
            c(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            writableByteChannel.write((ByteBuffer) this.c.position(0));
        }
    }

    public final synchronized void l() {
        a();
        bang bang = a;
        String valueOf = String.valueOf(this.h);
        String str = "parsing details of ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        bang.a(valueOf);
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            this.k = true;
            byteBuffer.rewind();
            a(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.l = byteBuffer.slice();
            }
            this.c = null;
        }
    }

    public final long d() {
        long j;
        ByteBuffer byteBuffer;
        int i = 0;
        if (!this.b) {
            j = this.f;
        } else if (this.k) {
            j = b();
        } else {
            byteBuffer = this.c;
            j = (long) (byteBuffer != null ? byteBuffer.limit() : 0);
        }
        j += (long) (((j >= 4294967288L ? 8 : 0) + 8) + (!"uuid".equals(this.h) ? 0 : 16));
        byteBuffer = this.l;
        if (byteBuffer != null) {
            i = byteBuffer.limit();
        }
        return j + ((long) i);
    }

    public final String f() {
        return this.h;
    }

    public final civ c() {
        return this.j;
    }

    public final void a(civ civ) {
        this.j = civ;
    }

    private final boolean g() {
        int i = !"uuid".equals(this.h) ? 8 : 24;
        if (!this.b) {
            return this.f + ((long) i) < 4294967296L;
        } else {
            if (this.k) {
                long b = b();
                ByteBuffer byteBuffer = this.l;
                return (b + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
            } else {
                this.c.limit();
                return true;
            }
        }
    }

    private final void c(ByteBuffer byteBuffer) {
        if (g()) {
            cin.a(byteBuffer, d());
            byteBuffer.put(cil.a(this.h));
        } else {
            cin.a(byteBuffer, 1);
            byteBuffer.put(cil.a(this.h));
            byteBuffer.putLong(d());
        }
        if ("uuid".equals(this.h)) {
            byteBuffer.put(this.i);
        }
    }
}
