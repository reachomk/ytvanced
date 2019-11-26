package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: dic */
public final class dic implements did {
    public final dig a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final BlockingQueue c;
    public final String d;
    public final int e;
    public int f = 1;
    public final int g;
    public final int h;
    private final ExecutorService i;
    private final String j;
    private final String k;

    public dic(String str, String str2, String str3, dig dig, int i, int i2, int i3) {
        this.d = str;
        this.j = str2;
        this.k = str3;
        this.a = dig;
        this.e = i;
        this.g = i2;
        this.h = i3;
        a("v", this.k);
        a("s", this.j);
        this.c = new ArrayBlockingQueue(this.e);
        this.i = Executors.newSingleThreadExecutor(new die("CsiReporter"));
        this.i.execute(new dif(this));
    }

    public final boolean a(dik dik) {
        return this.c.offer(dik);
    }

    public final void a(String str, String str2) {
        this.b.put(str, str2);
    }
}
