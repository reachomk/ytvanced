package defpackage;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: bcop */
public final class bcop extends bcjl {
    private static final String a = bcop.class.getSimpleName();
    private final bclr b;
    private final String c;
    private final bckz d;
    private final Executor e;
    private String f;
    private final ArrayList g = new ArrayList();
    private boolean h;
    private int i = 3;
    private Collection j;
    private bcks k;
    private Executor l;
    private boolean m;
    private bckr n;

    bcop(String str, bckz bckz, Executor executor, bclr bclr) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (bckz == null) {
            throw new NullPointerException("Callback is required.");
        } else if (executor != null) {
            this.c = str;
            this.d = bckz;
            this.e = executor;
            this.b = bclr;
        } else {
            throw new NullPointerException("Executor is required.");
        }
    }

    public final bcjl a(String str) {
        if (str != null) {
            this.f = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    private final bcop c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        } else if ("Accept-Encoding".equalsIgnoreCase(str)) {
            Log.w(a, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
            return this;
        } else {
            this.g.add(Pair.create(str, str2));
            return this;
        }
    }

    private final bcop g() {
        this.h = true;
        return this;
    }

    private final bcop c(bcks bcks, Executor executor) {
        if (bcks == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (executor != null) {
            if (this.f == null) {
                this.f = "POST";
            }
            this.k = bcks;
            this.l = executor;
            return this;
        } else {
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
    }

    private final bcop h() {
        this.m = true;
        return this;
    }

    private final bcom i() {
        bcom a = this.b.a(this.c, this.d, this.e, this.i, this.j, this.h, this.m, false, 0, false, 0, this.n);
        String str = this.f;
        if (str != null) {
            a.a(str);
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            a.a((String) pair.first, (String) pair.second);
        }
        bcks bcks = this.k;
        if (bcks != null) {
            a.a(bcks, this.l);
        }
        return a;
    }

    public final /* synthetic */ bcjj c() {
        return i();
    }

    public final /* synthetic */ bcjl b() {
        h();
        return this;
    }

    public final /* synthetic */ bcjl a() {
        g();
        return this;
    }

    public final /* synthetic */ bckx d() {
        return i();
    }

    public final /* synthetic */ bckw e() {
        h();
        return this;
    }

    public final /* synthetic */ bckw f() {
        g();
        return this;
    }
}
