package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

@qlp
/* renamed from: pbr */
public final class pbr extends pbs {
    private final qtf a;
    private final qti b;
    private final qsr c;
    private boolean d = false;

    public pbr(String str, Context context, boolean z) {
        qsr qsr;
        qsu.a(context, z);
        this.a = new qtf(context, str, z);
        this.b = new qti(this.a);
        if (z) {
            qsr = null;
        } else {
            qsu.a(context, true);
            qsr = new qsr(context);
        }
        this.c = qsr;
    }

    public final String a() {
        return "ms";
    }

    public final void a(String str, String str2) {
        qti qti = this.b;
        qti.a = str;
        qti.b = str2;
    }

    public final boolean a(qcs qcs) {
        Uri uri = (Uri) qct.a(qcs);
        qti qti = this.b;
        if (uri != null) {
            try {
                if (uri.getHost().equals(qti.a) && uri.getPath().equals(qti.b)) {
                    return true;
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw new NullPointerException();
    }

    public final boolean b(qcs qcs) {
        Uri uri = (Uri) qct.a(qcs);
        qti qti = this.b;
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : qti.c) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
                return false;
            } catch (NullPointerException unused) {
                return false;
            }
        }
        throw new NullPointerException();
    }

    public final void a(String str) {
        this.b.c = str.split(",");
    }

    public final qcs a(qcs qcs, qcs qcs2) {
        return a(qcs, qcs2, true);
    }

    public final String c(qcs qcs) {
        return a(qcs, null);
    }

    public final String a(qcs qcs, byte[] bArr) {
        Context context = (Context) qct.a(qcs);
        String a = this.a.a(context, bArr);
        qsr qsr = this.c;
        if (qsr == null || !this.d) {
            return a;
        }
        String a2 = qsr.a(a, qsr.a(context, bArr));
        this.d = false;
        return a2;
    }

    public final String a(qcs qcs, String str) {
        return this.a.a((Context) qct.a(qcs), str);
    }

    public final void d(qcs qcs) {
        this.b.d.a((MotionEvent) qct.a(qcs));
    }

    public final qcs b(qcs qcs, qcs qcs2) {
        return a(qcs, qcs2, false);
    }

    public final boolean a(String str, boolean z) {
        if (this.c == null) {
            return false;
        }
        this.c.a = new pcy(str, z);
        this.d = true;
        return true;
    }

    private final qcs a(qcs qcs, qcs qcs2, boolean z) {
        try {
            Object a;
            Uri uri = (Uri) qct.a(qcs);
            Context context = (Context) qct.a(qcs2);
            if (z) {
                a = this.b.a(uri, context, null, false);
            } else {
                a = this.b.a(uri, context);
            }
            return qct.a(a);
        } catch (qth unused) {
            return null;
        }
    }
}
