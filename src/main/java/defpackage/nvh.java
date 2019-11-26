package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: nvh */
public final class nvh implements nwb {
    private final AssetManager a;
    private String b;
    private InputStream c;
    private long d;
    private boolean e;

    public nvh(Context context) {
        this.a = context.getAssets();
    }

    public final long a(nvq nvq) {
        try {
            this.b = nvq.a.toString();
            String path = nvq.a.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            this.b = nvq.a.toString();
            this.c = this.a.open(path, 1);
            if (this.c.skip(nvq.d) >= nvq.d) {
                long j = nvq.e;
                if (j != -1) {
                    this.d = j;
                } else {
                    j = (long) this.c.available();
                    this.d = j;
                    if (j == 2147483647L) {
                        this.d = -1;
                        j = -1;
                    }
                }
                this.e = true;
                return j;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new nvk(e);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new nvk(e);
            }
        }
        int read = this.c.read(bArr, i, i2);
        if (read > 0) {
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - ((long) read);
            }
        }
        return read;
    }

    public final String a() {
        return this.b;
    }

    public final void b() {
        this.b = null;
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
                this.c = null;
                if (this.e) {
                    this.e = false;
                }
            } catch (IOException e) {
                throw new nvk(e);
            } catch (Throwable th) {
                this.c = null;
                if (this.e) {
                    this.e = false;
                }
            }
        }
    }
}
