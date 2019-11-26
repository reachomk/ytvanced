package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cwh */
public class cwh extends cwm implements cof, cor, Cloneable {
    private static final AtomicInteger k = new AtomicInteger(0);
    public cwh a;
    public boolean b;
    public cwj c;
    public Map d;
    public final String e;
    public final int f = k.getAndIncrement();
    public int g;
    public List h;
    public String i;
    public String j;

    protected cwh(String str) {
        this.e = str;
        this.j = this.e;
    }

    static void a() {
    }

    public boolean b(cwh cwh) {
        throw null;
    }

    public final coh m() {
        return this;
    }

    public static void a(cwh cwh) {
        cwh.b = true;
        cwh = cwh.a;
        if (cwh != null) {
            cwh.a(cwh);
        }
    }

    public cwh a(boolean z) {
        try {
            cwh cwh = (cwh) super.clone();
            if (!z) {
                if (cwh.h != null) {
                    cwh.h = new ArrayList();
                }
                cwh.g = 0;
                cwh.b = false;
            }
            return cwh;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    static Map c(cwh cwh) {
        HashMap hashMap = new HashMap();
        if (cwh == null) {
            return hashMap;
        }
        List list = cwh.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cwh cwh2 = (cwh) list.get(i);
                hashMap.put(cwh2.i, new zz(cwh2, Integer.valueOf(i)));
            }
            return hashMap;
        }
        String valueOf = String.valueOf(cwh);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 37);
        stringBuilder.append("Children of current section ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" is null!");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
