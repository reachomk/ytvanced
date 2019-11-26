package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: ovb */
public final class ovb extends ouz {
    private final ContentResolver a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public ovb(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    public final long a(ovm ovm) {
        try {
            this.b = ovm.a;
            b(ovm);
            this.c = this.a.openAssetFileDescriptor(this.b, "r");
            AssetFileDescriptor assetFileDescriptor = this.c;
            if (assetFileDescriptor != null) {
                this.d = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                long startOffset = this.c.getStartOffset();
                long skip = this.d.skip(ovm.e + startOffset) - startOffset;
                if (skip == ovm.e) {
                    startOffset = ovm.f;
                    if (startOffset != -1) {
                        this.e = startOffset;
                    } else {
                        startOffset = this.c.getLength();
                        if (startOffset == -1) {
                            FileChannel channel = this.d.getChannel();
                            long size = channel.size();
                            this.e = size != 0 ? size - channel.position() : -1;
                        } else {
                            this.e = startOffset - skip;
                        }
                    }
                    this.f = true;
                    c(ovm);
                    return this.e;
                }
                throw new EOFException();
            }
            String valueOf = String.valueOf(this.b);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 36);
            stringBuilder.append("Could not open file descriptor for: ");
            stringBuilder.append(valueOf);
            throw new FileNotFoundException(stringBuilder.toString());
        } catch (IOException e) {
            throw new ove(e);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new ove(e);
            }
        }
        int read = this.d.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.e;
            if (j2 != -1) {
                this.e = j2 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.e == -1) {
            return -1;
        } else {
            throw new ove(new EOFException());
        }
    }

    public final Uri b() {
        return this.b;
    }

    public final void a() {
        this.b = null;
        try {
            FileInputStream fileInputStream = this.d;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.d = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.c;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.c = null;
                if (this.f) {
                    this.f = false;
                    f();
                }
            } catch (IOException e) {
                throw new ove(e);
            } catch (Throwable th) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    f();
                }
            }
        } catch (IOException e2) {
            throw new ove(e2);
        } catch (Throwable th2) {
            this.d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.c = null;
                if (this.f) {
                    this.f = false;
                    f();
                }
            } catch (IOException e22) {
                throw new ove(e22);
            } catch (Throwable th3) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    f();
                }
            }
        }
    }
}
