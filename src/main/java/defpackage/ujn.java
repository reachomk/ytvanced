package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor.AutoCloseInputStream;
import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* renamed from: ujn */
public final class ujn implements bakq {
    private final Uri a;
    private final FileChannel b;

    private ujn(FileChannel fileChannel, Uri uri) {
        this.a = uri;
        this.b = fileChannel;
    }

    public static bakq a(Context context, Uri uri) {
        return new ujn(new AutoCloseInputStream(context.getContentResolver().openAssetFileDescriptor(uri, "r")).getChannel(), uri);
    }

    public final int a(ByteBuffer byteBuffer) {
        return this.b.read(byteBuffer);
    }

    public final long a() {
        return this.b.size();
    }

    public final long b() {
        return this.b.position();
    }

    public final void a(long j) {
        this.b.position(j);
    }

    public final long a(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.b.transferTo(j, j2, writableByteChannel);
    }

    public final ByteBuffer a(long j, long j2) {
        if (j2 > 2147483647L || j2 < 0) {
            StringBuilder stringBuilder = new StringBuilder(62);
            stringBuilder.append("ByteBuffer cannot perform mapping of size ");
            stringBuilder.append(j2);
            throw new IOException(stringBuilder.toString());
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) j2);
            this.b.position(j);
            band.a(this.b, allocate);
            return allocate;
        } catch (IndexOutOfBoundsException | OutOfMemoryError e) {
            try {
                this.b.close();
            } catch (Exception unused) {
            }
            throw new IOException(e);
        }
    }

    public final void close() {
        this.b.close();
    }

    public final String toString() {
        return this.a.toString();
    }
}
