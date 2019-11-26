package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: agop */
public final class agop implements Closeable {
    public final agmo a;
    private final FileChannel b;

    agop(agmo agmo) {
        this.a = agmo;
        this.b = agmo.a();
    }

    public final byte[] a(agoi agoi) {
        if (agoi.b() <= 1048576) {
            ByteBuffer allocate = ByteBuffer.allocate((int) agoi.b());
            if (((long) this.b.read(allocate, agoi.a())) == agoi.b()) {
                return allocate.array();
            }
            throw new agml("Did not read full length of bytes covered by signature. Reading content past end of file?");
        }
        throw new agml("Read segment is larger than max allowed (1048576B). Will not read segment to avoid excessive memory consumption.");
    }

    public final void close() {
        this.b.close();
    }
}
