package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* renamed from: ovd */
public final class ovd extends ouz {
    private ovm a;
    private int b;
    private byte[] c;

    public ovd() {
        super(false);
    }

    public final long a(ovm ovm) {
        b(ovm);
        this.a = ovm;
        Uri uri = ovm.a;
        String scheme = uri.getScheme();
        String str;
        if ("data".equals(scheme)) {
            String[] a = ozp.a(uri.getSchemeSpecificPart(), ",");
            if (a.length == 2) {
                str = a[1];
                if (a[0].contains(";base64")) {
                    try {
                        this.c = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        str = String.valueOf(str);
                        String str2 = "Error while parsing Base64 encoded string: ";
                        throw new oae(str.length() == 0 ? new String(str2) : str2.concat(str), e);
                    }
                }
                this.c = ozp.c(URLDecoder.decode(str, "US-ASCII"));
                c(ovm);
                return (long) this.c.length;
            }
            str = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(str.length() + 23);
            stringBuilder.append("Unexpected URI format: ");
            stringBuilder.append(str);
            throw new oae(stringBuilder.toString());
        }
        str = String.valueOf(scheme);
        scheme = "Unsupported scheme: ";
        if (str.length() == 0) {
            str = new String(scheme);
        } else {
            str = scheme.concat(str);
        }
        throw new oae(str);
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.c.length - this.b;
        if (length == 0) {
            return -1;
        }
        i2 = Math.min(i2, length);
        System.arraycopy(this.c, this.b, bArr, i, i2);
        this.b += i2;
        a(i2);
        return i2;
    }

    public final Uri b() {
        ovm ovm = this.a;
        return ovm != null ? ovm.a : null;
    }

    public final void a() {
        if (this.c != null) {
            this.c = null;
            f();
        }
        this.a = null;
    }
}
