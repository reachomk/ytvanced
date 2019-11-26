package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: barv */
public final class barv {
    public static final barv a = new barv();
    public basy b;
    public Executor c;
    public String d;
    public baru e;
    public String f;
    public List g = Collections.emptyList();
    public Boolean h;
    public Integer i;
    public Integer j;
    private Object[][] k = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));

    public final barv a(bash bash) {
        barv barv = new barv(this);
        ArrayList arrayList = new ArrayList(this.g.size() + 1);
        arrayList.addAll(this.g);
        arrayList.add(bash);
        barv.g = Collections.unmodifiableList(arrayList);
        return barv;
    }

    public final barv a(bary bary, Object obj) {
        Object[][] objArr;
        amqw.a((Object) bary, (Object) "key");
        amqw.a(obj, (Object) "value");
        barv barv = new barv(this);
        int i = 0;
        while (true) {
            objArr = this.k;
            if (i < objArr.length) {
                if (bary.equals(objArr[i][0])) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        barv.k = (Object[][]) Array.newInstance(Object.class, new int[]{this.k.length + (i == -1 ? 1 : 0), 2});
        objArr = this.k;
        System.arraycopy(objArr, 0, barv.k, 0, objArr.length);
        if (i == -1) {
            barv.k[this.k.length] = new Object[]{bary, obj};
        } else {
            barv.k[i] = new Object[]{bary, obj};
        }
        return barv;
    }

    public final Object a(bary bary) {
        amqw.a((Object) bary, (Object) "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.k;
            if (i >= objArr.length) {
                return null;
            }
            if (bary.equals(objArr[i][0])) {
                return this.k[i][1];
            }
            i++;
        }
    }

    private barv() {
    }

    public final boolean a() {
        return Boolean.TRUE.equals(this.h);
    }

    public final barv a(int i) {
        amqw.a(i >= 0, "invalid maxsize %s", i);
        barv barv = new barv(this);
        barv.i = Integer.valueOf(i);
        return barv;
    }

    public final barv b(int i) {
        amqw.a(i >= 0, "invalid maxsize %s", i);
        barv barv = new barv(this);
        barv.j = Integer.valueOf(i);
        return barv;
    }

    public barv(barv barv) {
        this.b = barv.b;
        this.d = barv.d;
        this.e = barv.e;
        this.c = barv.c;
        this.f = barv.f;
        this.k = barv.k;
        this.h = barv.h;
        this.i = barv.i;
        this.j = barv.j;
        this.g = barv.g;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("deadline", this.b);
        a.a("authority", this.d);
        a.a("callCredentials", this.e);
        Executor executor = this.c;
        a.a("executor", executor != null ? executor.getClass() : null);
        a.a("compressorName", this.f);
        a.a("customOptions", Arrays.deepToString(this.k));
        a.a("waitForReady", a());
        a.a("maxInboundMessageSize", this.i);
        a.a("maxOutboundMessageSize", this.j);
        a.a("streamTracerFactories", this.g);
        return a.toString();
    }
}
