package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ajik */
public final class ajik implements afqj {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public ArrayList e = new ArrayList();
    public ajin f;
    public ajip g;
    private final HashMap h = new HashMap();

    public ajik() {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(0);
        hashMap.put(valueOf, new ajip());
        this.b.put(valueOf, new ajiq());
        this.c.put(valueOf, new ajir());
    }

    public final ajip a(int i) {
        return (ajip) this.a.get(Integer.valueOf(i));
    }

    public final ajiq b(int i) {
        return (ajiq) this.b.get(Integer.valueOf(i));
    }

    public final ajir c(int i) {
        return (ajir) this.c.get(Integer.valueOf(i));
    }

    public final ajio d(int i) {
        return (ajio) this.d.get(Integer.valueOf(i));
    }

    public final void a(ajin ajin) {
        int i = ajin.d.a;
        HashMap hashMap = this.h;
        Integer valueOf = Integer.valueOf(i);
        ajiz ajiz = (ajiz) hashMap.get(valueOf);
        if (ajiz == null) {
            ajiz = new ajiz(i);
            this.h.put(valueOf, ajiz);
        }
        int i2;
        if (ajin.c) {
            i2 = (int) ajin.a;
            ajiz.b(ajin.g, i2, ((int) ajin.b) + i2);
        } else {
            i2 = (int) ajin.a;
            ajiz.a(ajin.g, i2, ((int) ajin.b) + i2);
        }
        i = (int) ajin.a;
        ajir ajir = ajin.d;
        int i3 = 0;
        ajiz.a(i, new ajiy(ajir.b, ajir.d, ajir.c, true, ajin.e.b == 2));
        if (!ajin.f.isEmpty()) {
            ArrayList arrayList = ajin.f;
            int size = arrayList.size();
            ajim ajim = null;
            while (i3 < size) {
                ajim ajim2 = (ajim) arrayList.get(i3);
                if (ajim != null) {
                    String str = ajim.b;
                    long j = ajin.a;
                    ajiz.b(str, (int) (ajim.a + j), (int) (j + ajin.b));
                }
                i3++;
                ajim = ajim2;
            }
            String str2 = ajim.b;
            long j2 = ajin.a;
            ajiz.b(str2, (int) (ajim.a + j2), (int) (j2 + ajin.b));
        }
    }

    /* renamed from: a */
    public final ajjg b() {
        ArrayList arrayList = new ArrayList();
        for (ajiz b : this.h.values()) {
            arrayList.add((ajiw) b.b());
        }
        return new ajjg(arrayList);
    }
}
