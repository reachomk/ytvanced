package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: owp */
public final class owp extends ouz {
    private final Resources a;
    private Uri b;
    private AssetFileDescriptor c;
    private InputStream d;
    private long e;
    private boolean f;

    public owp(Context context) {
        super(false);
        this.a = context.getResources();
    }

    public final long a(ovm ovm) {
        try {
            this.b = ovm.a;
            if (TextUtils.equals("rawresource", this.b.getScheme())) {
                int parseInt = Integer.parseInt(this.b.getLastPathSegment());
                b(ovm);
                this.c = this.a.openRawResourceFd(parseInt);
                this.d = new FileInputStream(this.c.getFileDescriptor());
                this.d.skip(this.c.getStartOffset());
                if (this.d.skip(ovm.e) >= ovm.e) {
                    long j = ovm.f;
                    long j2 = -1;
                    if (j != -1) {
                        this.e = j;
                    } else {
                        j = this.c.getLength();
                        if (j != -1) {
                            j2 = j - ovm.e;
                        }
                        this.e = j2;
                    }
                    this.f = true;
                    c(ovm);
                    return this.e;
                }
                throw new EOFException();
            }
            throw new ows("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new ows("Resource identifier must be an integer.");
        } catch (IOException e) {
            throw new ows(e);
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
                throw new ows(e);
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
            throw new ows(new EOFException());
        }
    }

    public final Uri b() {
        return this.b;
    }

    public final void a() {
        this.b = null;
        try {
            InputStream inputStream = this.d;
            if (inputStream != null) {
                inputStream.close();
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
                throw new ows(e);
            } catch (Throwable th) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    f();
                }
            }
        } catch (IOException e2) {
            throw new ows(e2);
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
                throw new ows(e22);
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
