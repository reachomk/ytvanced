package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.NavigationListRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: lhf */
public final class lhf {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Set c = new zl();
    public int d;
    public boolean e;

    public lhf() {
        a();
    }

    public final void a() {
        this.e = false;
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d = -1;
    }

    public final void a(avjl avjl) {
        amqw.a((Object) avjl);
        a();
        int i = avjl.d;
        if (i >= 0 && avjl.b.size() != 0 && xty.a(i, 0, avjl.b.size())) {
            axak axak = (axak) avjl.b.get(i);
            anxr access$000 = anxl.checkIsLite(NavigationListRendererOuterClass.navigationListEntryRenderer);
            axak.a(access$000);
            Object b = axak.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            avjj avjj = (avjj) b;
            if ((avjj.a & 1) != 0) {
                apxu apxu = avjj.b;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                String a = elq.a(apxu);
                if (!TextUtils.isEmpty(a)) {
                    a(this.a, avjl.b);
                    if (this.a.size() != avjl.b.size()) {
                        i = 0;
                        while (i < this.a.size()) {
                            apxu apxu2;
                            avjj avjj2 = (avjj) this.a.get(i);
                            if ((avjj2.a & 1) != 0) {
                                apxu2 = avjj2.b;
                                if (apxu2 == null) {
                                    apxu2 = apxu.d;
                                }
                            } else {
                                apxu2 = null;
                            }
                            if (TextUtils.equals(elq.a(apxu2), a)) {
                                break;
                            }
                            i++;
                        }
                        i = -1;
                    }
                    if (!this.a.isEmpty() && i >= 0) {
                        this.d = i;
                        a(this.b, avjl.c);
                        this.e = true;
                        return;
                    }
                    a();
                }
            }
        }
    }

    private final void a(List list, List list2) {
        if (list2 != null) {
            for (axak a : list2) {
                avjj avjj = (avjj) ajzv.a(ajzv.a(a), avjj.class);
                if (!(avjj == null || (avjj.a & 1) == 0)) {
                    apxu apxu;
                    list.add(avjj);
                    Set set = this.c;
                    if ((avjj.a & 1) != 0) {
                        apxu = avjj.b;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                    } else {
                        apxu = null;
                    }
                    set.add(elq.a(apxu));
                }
            }
        }
    }
}
