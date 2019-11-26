package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ouv */
public final class ouv extends ouz {
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public ouv(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    public final long a(ovm ovm) {
        try {
            this.b = ovm.a;
            String path = this.b.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(ovm);
            this.c = this.a.open(path, 1);
            if (this.c.skip(ovm.e) >= ovm.e) {
                long j = ovm.f;
                if (j != -1) {
                    this.d = j;
                } else {
                    j = (long) this.c.available();
                    this.d = j;
                    if (j == 2147483647L) {
                        this.d = -1;
                    }
                }
                this.e = true;
                c(ovm);
                return this.d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new ouy(e);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new ouy(e);
            }
        }
        int read = this.c.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.d == -1) {
            return -1;
        } else {
            throw new ouy(new EOFException());
        }
    }

    public final Uri b() {
        return this.b;
    }

    public final void a() {
        this.b = null;
        try {
            InputStream inputStream = this.c;
            if (inputStream != null) {
                inputStream.close();
            }
            this.c = null;
            if (this.e) {
                this.e = false;
                f();
            }
        } catch (IOException e) {
            throw new ouy(e);
        } catch (Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                f();
            }
        }
    }
}
