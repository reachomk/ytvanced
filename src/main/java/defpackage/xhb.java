package defpackage;

import android.text.TextUtils;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: xhb */
public abstract class xhb {
    public final boolean a;
    public final long b;
    public final String c;

    protected xhb() {
        this(0, null);
    }

    public abstract InputStream b();

    public abstract void c();

    public byte[] d() {
        throw null;
    }

    protected xhb(long j, String str) {
        this.a = true;
        this.b = Math.max(j, -1);
        this.c = str;
    }

    public final boolean a() {
        return this.b == -1;
    }

    public ByteBuffer e() {
        byte[] d = d();
        return d != null ? ByteBuffer.wrap(d) : null;
    }

    public static xhb a(Map map, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "ISO-8859-1";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
            stringBuilder.append('=');
            stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
        }
        return xhb.a(stringBuilder.toString().getBytes(str), "application/x-www-form-urlencoded");
    }

    public static xhb a(byte[] bArr, String str) {
        return bArr != null ? new xhe(bArr, bArr.length, str) : null;
    }
}
