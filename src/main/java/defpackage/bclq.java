package defpackage;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: bclq */
public abstract class bclq extends bcjr {
    public final Context a;
    public final List b = new LinkedList();
    public final List c = new LinkedList();
    public final boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public final boolean i;
    public boolean j;
    public int k;
    public long l;
    public String m;
    public long n;
    public final boolean o;
    private final int p = 20;

    public bclq(Context context) {
        this.a = context.getApplicationContext();
        this.g = false;
        this.h = true;
        this.i = false;
        a(0, 0);
        this.o = false;
        this.d = true;
    }

    /* renamed from: b */
    public bclq a(bcje bcje) {
        return this;
    }

    public bcos c() {
        return null;
    }

    public final String b() {
        return bcoq.a(this.a);
    }

    public final int a(int i) {
        int i2 = this.p;
        return i2 != 20 ? i2 : i;
    }

    public final /* bridge */ /* synthetic */ bcjr c(String str) {
        this.e = str;
        return this;
    }

    public final /* synthetic */ bcjr a(int i, long j) {
        if (i == 3 || i == 2) {
            if (this.f == null) {
                throw new IllegalArgumentException("Storage path must be set");
            }
        } else if (this.f != null) {
            throw new IllegalArgumentException("Storage path must not be set");
        }
        boolean z = i == 0 || i == 2;
        this.j = z;
        this.l = j;
        if (i == 0) {
            this.k = 0;
        } else if (i != 1) {
            this.k = 1;
        } else {
            this.k = 2;
        }
        return this;
    }

    public final /* synthetic */ bcjr a(String str, int i, int i2) {
        if (str.contains("/")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal QUIC Hint Host: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.b.add(new bcls(str, i, i2));
        return this;
    }

    static {
        Pattern.compile("^[0-9\\.]*$");
    }
}
