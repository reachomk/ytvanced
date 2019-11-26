package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* renamed from: nwn */
public class nwn implements nvx {
    public final nwd a;
    public final nwb b;
    public final int c;
    public volatile String d;
    public int e;
    public nvy f;
    public nwe g;
    public long h;
    public int i;
    public long j;
    public nws k;
    public volatile Object l;
    public volatile long m;
    public volatile long n;

    public nwn(String str, nwb nwb, nwd nwd, int i) {
        this.a = nwd;
        this.d = str;
        this.b = nwb;
        this.c = i;
    }

    public final void g() {
    }

    public void a(nvz nvz) {
        nvz nvz2 = this.g;
        if (nvz2 == nvz) {
            this.l = nvz2.a;
            this.m = this.h;
            this.n = SystemClock.elapsedRealtime();
            this.i = 0;
            this.k = null;
            if (this.l instanceof nwr) {
                String a = ((nwr) this.l).a();
                if (!TextUtils.isEmpty(a)) {
                    this.d = a;
                }
            }
        }
    }

    public void a(nvz nvz, IOException iOException) {
        if (this.g == nvz) {
            this.i++;
            this.j = SystemClock.elapsedRealtime();
            this.k = new nws(iOException);
        }
    }
}
