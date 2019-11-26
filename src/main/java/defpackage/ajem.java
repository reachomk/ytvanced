package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: ajem */
public final class ajem implements ajev {
    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final /* synthetic */ ajee c;

    public final synchronized int a() {
        return !this.a.isEmpty() ? d().length() + 5 : 0;
    }

    public final synchronized void a(ajeu ajeu) {
        if (!this.a.isEmpty()) {
            ajeu.a("e2el", d());
            c();
        }
    }

    public final synchronized void a(long j) {
        this.a.add(Long.valueOf(j));
        this.b.add(Long.valueOf(this.c.g()));
    }

    public final synchronized long b() {
        long j;
        if (this.b.isEmpty()) {
            j = Long.MAX_VALUE;
        } else {
            j = this.c.g();
            List list = this.b;
            j -= ((Long) list.get(list.size() - 1)).longValue();
        }
        return j;
    }

    private final synchronized void c() {
        this.a.clear();
        this.b.clear();
    }

    private final synchronized String d() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(String.format(Locale.US, "%.3f:%.3f", new Object[]{Float.valueOf(((float) ((Long) this.b.get(i)).longValue()) / 1000.0f), Float.valueOf(((float) ((Long) this.a.get(i)).longValue()) / 1000.0f)}));
        }
        return stringBuilder.toString();
    }

    /* synthetic */ ajem(ajee ajee) {
        this.c = ajee;
    }
}
