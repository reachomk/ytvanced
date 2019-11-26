package defpackage;

import java.util.List;

/* renamed from: ajiz */
public final class ajiz implements afqj {
    private final int a;
    private final ajjh b = new ajjh();
    private final ajjd c = new ajjd();

    public ajiz(int i) {
        this.a = i;
    }

    public final ajiz a(String str, int i, int i2) {
        this.b.a(str, (long) i, (long) i2);
        return this;
    }

    public final ajiz b(String str, int i, int i2) {
        String valueOf;
        long j;
        ajjh ajjh = this.b;
        long j2 = (long) i;
        long j3 = (long) i2;
        if (!ajjh.b.isEmpty()) {
            List list = ajjh.b;
            valueOf = String.valueOf((String) list.get(list.size() - 1));
            str = String.valueOf(str);
            if (str.length() == 0) {
                str = new String(valueOf);
            } else {
                str = valueOf.concat(str);
            }
        }
        valueOf = str;
        if (j3 != j2 || ajjh.a.isEmpty()) {
            j = j3;
        } else {
            List list2 = ajjh.a;
            j = ((Long) list2.get(list2.size() - 1)).longValue();
        }
        ajjh.a(valueOf, j2, j);
        return this;
    }

    public final ajiz a(int i, ajiy ajiy) {
        this.c.a((long) i, ajiy);
        return this;
    }

    /* renamed from: a */
    public final ajiw b() {
        return new ajiw(this.a, (ajje) this.b.b(), (ajja) this.c.b());
    }
}
