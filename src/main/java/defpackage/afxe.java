package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* renamed from: afxe */
public final class afxe implements xsu {
    public final akun a;
    public final Map b = new HashMap();
    public final afxf c;
    public final Handler d;
    private final afxb e;
    private final afxg f = new afxg(this);

    public afxe(akun akun, afxb afxb, afxf afxf) {
        this.a = (akun) amqw.a((Object) akun);
        this.e = (afxb) amqw.a((Object) afxb);
        this.c = (afxf) amqw.a((Object) afxf);
        this.d = new Handler(Looper.getMainLooper());
    }

    public static String a(atun atun) {
        if (TextUtils.isEmpty(atun.d)) {
            String valueOf = String.valueOf(Integer.toHexString(atun.b));
            String valueOf2 = String.valueOf(anar.c.b().a(atun.c.d()));
            return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        return anar.c.b().a(atun.d.getBytes(Charset.forName("UTF-8")));
    }

    public final boolean a(ajtf ajtf) {
        boolean containsKey;
        synchronized (this.b) {
            Object obj = (atuj) ajtj.a(ajtf, atuj.class);
            amqw.a(obj);
            atun atun = obj.b;
            if (atun == null) {
                atun = atun.g;
            }
            containsKey = this.b.containsKey(afxe.a(atun));
        }
        return containsKey;
    }

    public final void b(ajtf ajtf) {
        Object obj = (atuj) ajtj.a(ajtf, atuj.class);
        amqw.a(obj);
        atun atun = obj.b;
        if (atun == null) {
            atun = atun.g;
        }
        Object a = afxe.a(atun);
        synchronized (this.b) {
            boolean containsKey = this.b.containsKey(a);
            if (containsKey) {
                this.a.d(a);
            }
            this.b.put(a, ajtf);
            if (obj.c != 0) {
                this.a.a(a, ajtf);
            }
            if (!containsKey) {
                this.e.a(atun, this.f);
            }
        }
    }

    public final void a() {
        synchronized (this.b) {
            for (ajtf a : this.b.values()) {
                Object obj = (atuj) ajtj.a(a, atuj.class);
                amqw.a(obj);
                atun atun = obj.b;
                if (atun == null) {
                    atun = atun.g;
                }
                synchronized (this.b) {
                    this.a.d(afxe.a(atun));
                    this.b.remove(afxe.a(atun));
                    this.e.b(atun, this.f);
                }
            }
        }
    }

    public final void c() {
        a();
    }
}
