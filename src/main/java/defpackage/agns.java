package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* renamed from: agns */
public final class agns implements agnw {
    private final File a;
    private final bcaa b;
    private final bcaa c;
    private final int d;

    public final Uri a() {
        return Uri.fromFile(this.a);
    }

    public final FileChannel b() {
        File a = agmn.a(this.a);
        amqw.b(a.exists(), (Object) "Need in-progress file to begin writing.");
        return new RandomAccessFile(a, "rw").getChannel();
    }

    public final void c() {
        ((agmp) this.b.get()).a(a());
    }

    public final void d() {
        if (agmn.a(this.a).renameTo(this.a)) {
            ((agmp) this.b.get()).a(a());
            if (this.d != 4) {
                ((agmv) this.c.get()).a(this.a);
                return;
            }
            return;
        }
        throw new agnx(14, "Failed to rename ytb file to incomplete file for download.");
    }

    public final void e() {
        if (!agmn.a(this.a).exists()) {
            File parentFile = this.a.getParentFile();
            int i = 11;
            if (parentFile != null) {
                String format = String.format(Locale.US, "Could not find in-progress ytb file to continue download. Containing folder exists: %b. Containing folder can write: %b. Completed file exists: %b (size: %d bytes).", new Object[]{Boolean.valueOf(parentFile.exists()), Boolean.valueOf(parentFile.canWrite()), Boolean.valueOf(this.a.exists()), Long.valueOf(this.a.length())});
                if (parentFile.exists()) {
                    i = 10;
                }
                throw new agnx(i, format);
            }
            throw new agnx(11, "In progress YTB file did not have a containing folder?");
        }
    }

    /* synthetic */ agns(File file, int i, bcaa bcaa, bcaa bcaa2) {
        this.a = file;
        this.d = i;
        this.b = bcaa;
        this.c = bcaa2;
    }
}
