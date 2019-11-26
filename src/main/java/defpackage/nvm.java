package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: nvm */
public final class nvm implements nwb {
    private final ContentResolver a;
    private AssetFileDescriptor b;
    private InputStream c;
    private String d;
    private long e;
    private boolean f;

    public nvm(Context context) {
        this.a = context.getContentResolver();
    }

    public final long a(nvq nvq) {
        try {
            this.d = nvq.a.toString();
            this.b = this.a.openAssetFileDescriptor(nvq.a, "r");
            this.c = new FileInputStream(this.b.getFileDescriptor());
            if (this.c.skip(nvq.d) >= nvq.d) {
                long j = nvq.e;
                if (j != -1) {
                    this.e = j;
                } else {
                    j = (long) this.c.available();
                    this.e = j;
                    if (j == 0) {
                        this.e = -1;
                        j = -1;
                    }
                }
                this.f = true;
                return j;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new nvl(e);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new nvl(e);
            }
        }
        int read = this.c.read(bArr, i, i2);
        if (read > 0) {
            long j2 = this.e;
            if (j2 != -1) {
                this.e = j2 - ((long) read);
            }
        }
        return read;
    }

    public final String a() {
        return this.d;
    }

    public final void b() {
        this.d = null;
        try {
            InputStream inputStream = this.c;
            if (inputStream != null) {
                inputStream.close();
            }
            this.c = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.b;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.b = null;
                if (this.f) {
                    this.f = false;
                }
            } catch (IOException e) {
                throw new nvl(e);
            } catch (Throwable th) {
                this.b = null;
                if (this.f) {
                    this.f = false;
                }
            }
        } catch (IOException e2) {
            throw new nvl(e2);
        } catch (Throwable th2) {
            this.c = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.b;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.b = null;
                if (this.f) {
                    this.f = false;
                }
            } catch (IOException e22) {
                throw new nvl(e22);
            } catch (Throwable th3) {
                this.b = null;
                if (this.f) {
                    this.f = false;
                }
            }
        }
    }
}
