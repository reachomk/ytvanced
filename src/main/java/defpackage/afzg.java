package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: afzg */
public final class afzg implements afzi, agph, agvr {
    public final agvs a;
    private final afzk b;
    private final agpi c;
    private final xmc d;
    private volatile agpv e;
    private volatile agpv f;
    private volatile List g;
    private final bapu h;
    private final Object i = new Object();
    private final Object j = new Object();
    private File k;
    private final boolean l;

    public afzg(afzk afzk, agpi agpi, agvs agvs, xmc xmc, zyw zyw, bapu bapu) {
        this.b = afzk;
        this.c = agpi;
        this.a = agvs;
        this.d = xmc;
        this.h = bapu;
        agpi.d = this;
        this.l = ahda.e(zyw);
    }

    public final agpv b() {
        if (this.f == null || !this.c.a()) {
            return this.e;
        }
        return this.f;
    }

    public final File c() {
        File file;
        synchronized (this.j) {
            if (this.k == null) {
                this.k = this.c.a(2);
            }
            file = this.k;
        }
        return file;
    }

    private final void j() {
        synchronized (this.j) {
            this.k = null;
        }
    }

    public final agpv d() {
        return this.e;
    }

    public final agpv e() {
        return this.f;
    }

    public final void f() {
        synchronized (this.i) {
            String str;
            this.b.a();
            j();
            this.e = null;
            this.f = null;
            ArrayList arrayList = new ArrayList();
            agpi agpi = this.c;
            File a = agpi.a(agpi.a, agpi.b);
            File file = a != null ? new File(a, "streams") : null;
            if (file != null) {
                str = "offline primary cache dir: ";
                String valueOf = String.valueOf(file.getAbsolutePath());
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                afhs.a(file);
                this.e = a(file, this.d.g());
                if (!this.l) {
                    arrayList.add(this.e);
                } else if (this.e.a()) {
                    arrayList.add(this.e);
                } else {
                    this.e = null;
                }
            }
            str = this.a.a(this.d);
            Map b = this.d.b();
            for (String str2 : b.keySet()) {
                if (((Boolean) b.get(str2)).booleanValue()) {
                    agpi agpi2 = this.c;
                    File a2 = agpi.a(agpi2.c, str2, agpi2.b);
                    File file2 = a2 != null ? new File(a2, "streams") : null;
                    if (file2 != null) {
                        String str3 = "offline sd card cache dir: ";
                        String valueOf2 = String.valueOf(file2.getAbsolutePath());
                        if (valueOf2.length() == 0) {
                            valueOf2 = new String(str3);
                        } else {
                            str3.concat(valueOf2);
                        }
                        afhs.a(file2);
                        agpv a3 = a(file2, (String) this.d.f().get(str2));
                        if (!this.l) {
                            arrayList.add(a3);
                            if (str2.equals(str)) {
                                this.f = a3;
                            }
                        } else if (a3.a()) {
                            arrayList.add(a3);
                            if (str2.equals(str)) {
                                this.f = a3;
                            }
                        }
                    }
                }
            }
            arrayList.addAll((Collection) this.h.get());
            this.g = Collections.unmodifiableList(arrayList);
        }
    }

    public final List a() {
        amul a;
        synchronized (this.i) {
            a = amul.a(this.g);
        }
        return a;
    }

    public final void g() {
        f();
    }

    public final void h() {
        j();
    }

    private final agpv a(File file, String str) {
        return new agpv(this.b.a(file), str);
    }

    public final boolean i() {
        return (b() == null && c() == null) ? false : true;
    }

    public final /* synthetic */ Object get() {
        amul a;
        synchronized (this.i) {
            a = amul.a(this.g);
        }
        return a;
    }
}
