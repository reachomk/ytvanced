package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* renamed from: xhn */
public final class xhn {
    public static final xhn a;
    public InputStream b;
    private final String c;
    private final String d;
    private ArrayList e;
    private ByteBuffer f;
    private byte[] g;

    public xhn(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public static xhn a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        xhn xhn = new xhn(null, Long.toString(xhn.a(arrayList)));
        xhn.e = arrayList;
        return xhn;
    }

    public final synchronized InputStream a() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            return inputStream;
        }
        return new xlo(d());
    }

    public final synchronized void b() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final synchronized long c() {
        byte[] bArr = this.g;
        if (bArr != null) {
            return (long) bArr.length;
        }
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            return (long) byteBuffer.remaining();
        }
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            return xhn.a(arrayList);
        }
        String str = this.d;
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public final synchronized ByteBuffer d() {
        h();
        byte[] bArr = this.g;
        if (bArr != null) {
            return ByteBuffer.wrap(bArr);
        }
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            return byteBuffer.duplicate();
        }
        int i = 0;
        amqw.b(this.e != null);
        if (this.e.isEmpty()) {
            this.g = new byte[0];
            this.e = null;
            return ByteBuffer.wrap(this.g);
        } else if (this.e.size() == 1) {
            this.f = (ByteBuffer) this.e.get(0);
            this.e = null;
            return this.f.duplicate();
        } else {
            long a = xhn.a(this.e);
            if (a <= 2147483647L) {
                byteBuffer = ByteBuffer.allocate((int) a);
                while (i < this.e.size()) {
                    byteBuffer.put((ByteBuffer) this.e.get(i));
                    i++;
                }
                this.e = null;
                this.g = byteBuffer.array();
                return ByteBuffer.wrap(this.g);
            }
            throw new IOException("Body too big");
        }
    }

    private final synchronized ByteBuffer g() {
        ByteBuffer d = d();
        if (d.hasArray()) {
            return d;
        }
        return ByteBuffer.wrap(e());
    }

    public final synchronized byte[] e() {
        byte[] bArr = this.g;
        if (bArr != null) {
            return bArr;
        }
        ByteBuffer d = d();
        if (d.hasArray() && d.arrayOffset() == 0) {
            byte[] array = d.array();
            if (d.limit() == array.length) {
                this.g = array;
                return this.g;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(d.remaining());
        allocate.put(d);
        this.g = allocate.array();
        this.f = null;
        return this.g;
    }

    public final synchronized String f() {
        return a(null);
    }

    public final synchronized String a(String str) {
        byte[] array;
        int arrayOffset;
        int remaining;
        ByteBuffer g = g();
        array = g.array();
        arrayOffset = g.arrayOffset() + g.position();
        remaining = g.remaining();
        CharSequence charSequence = !TextUtils.isEmpty(this.c) ? (String) new xgz(this.c).a.get("charset".toLowerCase(Locale.ENGLISH)) : null;
        if (!TextUtils.isEmpty(charSequence)) {
            str = charSequence;
        }
        if (TextUtils.isEmpty(str)) {
            str = "ISO-8859-1";
        }
        return new String(array, arrayOffset, remaining, str);
    }

    private final synchronized void h() {
        if (this.b != null) {
            xln xln;
            long j = -1;
            if (!TextUtils.isEmpty(this.d)) {
                try {
                    j = Long.parseLong(this.d);
                } catch (NumberFormatException unused) {
                }
            }
            if (j < 0) {
                xln = new xln();
            } else {
                xln = new xln((int) Math.min(j, 1048576));
            }
            byte[] bArr = new byte[2048];
            while (true) {
                try {
                    int read = this.b.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    xln.write(bArr, 0, read);
                } finally {
                    this.b.close();
                }
            }
            this.b = null;
            this.f = xln.a();
        }
    }

    private static long a(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += (long) ((ByteBuffer) arrayList.get(i)).remaining();
        }
        return j;
    }

    static {
        byte[] bArr = new byte[0];
        xhn xhn = new xhn(null, Integer.toString(0));
        xhn.g = bArr;
        a = xhn;
    }
}
