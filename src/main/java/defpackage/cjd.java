package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.LinkedList;
import java.util.List;

/* renamed from: cjd */
public final class cjd implements cis {
    public long a;
    private ByteBuffer b = ByteBuffer.wrap(new byte[0]);
    private final List c = new LinkedList();
    private civ d;

    public final String f() {
        return "free";
    }

    public final long e() {
        return this.a;
    }

    private final ByteBuffer a() {
        ByteBuffer byteBuffer = this.b;
        return byteBuffer != null ? (ByteBuffer) byteBuffer.duplicate().rewind() : null;
    }

    public final void a(WritableByteChannel writableByteChannel) {
        for (cis a : this.c) {
            a.a(writableByteChannel);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        cin.a(allocate, (long) (this.b.limit() + 8));
        allocate.put("free".getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.b.rewind();
        writableByteChannel.write(this.b);
        this.b.rewind();
    }

    public final civ c() {
        return this.d;
    }

    public final void a(civ civ) {
        this.d = civ;
    }

    public final long d() {
        long j = 8;
        for (cis d : this.c) {
            j += d.d();
        }
        return j + ((long) this.b.limit());
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        this.a = bakq.b() - ((long) byteBuffer.remaining());
        if (j > 1048576) {
            this.b = bakq.a(bakq.b(), j);
            bakq.a(bakq.b() + j);
            return;
        }
        this.b = ByteBuffer.allocate(bana.a(j));
        bakq.a(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cjd cjd = (cjd) obj;
        return a() == null ? cjd.a() == null : a().equals(cjd.a());
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.b;
        return byteBuffer != null ? byteBuffer.hashCode() : 0;
    }
}
