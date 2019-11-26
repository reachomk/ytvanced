package defpackage;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* renamed from: agmi */
public final class agmi implements agmo {
    private final File a;

    public agmi(File file) {
        this.a = file;
    }

    public final FileChannel a() {
        return new RandomAccessFile(this.a, "r").getChannel();
    }
}
