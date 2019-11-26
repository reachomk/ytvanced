package defpackage;

import android.content.SharedPreferences;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alak */
public final class alak {
    private final alan a;
    private final acvx b;
    private final ArrayList c;
    private final int d;
    private final int e;
    private final Runnable f;
    private final SharedPreferences g;

    public alak(alan alan, acvx acvx, List list, int i, int i2, Runnable runnable) {
        this.a = (alan) amqw.a((Object) alan);
        this.b = (acvx) amqw.a((Object) acvx);
        this.c = new ArrayList(list);
        this.d = i;
        this.e = i2;
        this.f = runnable;
        this.g = xly.a(alan.a());
    }

    public final boolean a(int i, String[] strArr, int[] iArr) {
        if (this.c.isEmpty()) {
            return false;
        }
        if (strArr.length == 0) {
            return true;
        }
        alad alad = (alad) this.c.remove(0);
        acwc acwc;
        if (alad.a != i) {
            throw new IllegalStateException(amrl.a("Expected %s, got %s", Integer.valueOf(alad.a), Integer.valueOf(i)));
        } else if (alai.a(iArr)) {
            acwc = alad.b;
            if (acwc != null) {
                this.b.a(3, new acvs(acwc), null);
            }
            b();
            return true;
        } else {
            acwc = alad.c;
            if (acwc != null) {
                this.b.a(3, new acvs(acwc), null);
            }
            xpr.a(this.a.a(), this.e, 1);
            return true;
        }
    }

    public final void a() {
        int i = 0;
        ArrayList arrayList;
        int size;
        alad alad;
        if (VERSION.SDK_INT >= 23) {
            arrayList = this.c;
            size = arrayList.size();
            while (i < size) {
                alad = (alad) arrayList.get(i);
                i++;
                if (alai.a(this.a.a(), this.g, alai.a(alad.a))) {
                    akzy.d(this.d).a(this.a.b(), "openSettingsDialog");
                    return;
                }
            }
            b();
            return;
        }
        arrayList = this.c;
        size = arrayList.size();
        while (i < size) {
            alad = (alad) arrayList.get(i);
            i++;
            if (!alai.a(this.a.a(), alad.a)) {
                return;
            }
        }
        this.f.run();
    }

    private final void b() {
        while (!this.c.isEmpty() && alai.a(this.a.a(), ((alad) this.c.get(0)).a)) {
            this.c.remove(0);
        }
        if (this.c.isEmpty()) {
            this.f.run();
            return;
        }
        alad alad = (alad) this.c.get(0);
        acwc acwc = alad.b;
        if (acwc != null) {
            this.b.a(new acvs(acwc));
        }
        acwc = alad.c;
        if (acwc != null) {
            this.b.a(new acvs(acwc));
        }
        String[] a = alai.a(alad.a);
        alai.a(this.g, a);
        this.a.a(a, alad.a);
    }
}
