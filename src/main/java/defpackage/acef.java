package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: acef */
public final class acef {
    private static acef l;
    public ScheduledExecutorService a;
    public acum b;
    public boolean c;
    public xsc d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final Map i = new HashMap();
    public int j = 1;
    public int k = 1;

    private acef() {
    }

    public static acef a() {
        if (l == null) {
            l = new acef();
        }
        return l;
    }

    public final void a(Class cls) {
        if (this.c) {
            aceg c = c(cls);
            if (c.e) {
                Object a = acef.a(cls, a(c));
                synchronized (this.i) {
                    for (Entry value : c.b.entrySet()) {
                        aceh aceh = (aceh) value.getValue();
                        if (aceh != null) {
                            aceh.a(a);
                        }
                    }
                }
                String valueOf = String.valueOf(a.toString());
                String str = "LiveCreationMetricsLogger:: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                this.b.a(acef.b(a));
            }
        }
    }

    private final void a(Object obj) {
        if (this.c) {
            asmw b = acef.b(obj);
            if (b != null) {
                String valueOf = String.valueOf(obj.toString());
                String str = "LiveCreationMetricsLogger:: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                this.b.a(b);
            }
        }
    }

    public final void a(Class cls, long j) {
        aceg c = c(cls);
        c.e = true;
        c.c = j;
        a(cls, c);
    }

    public final void b(Class cls) {
        aceg c = c(cls);
        c.e = false;
        Future future = c.a;
        if (future != null) {
            future.cancel(false);
            c.a = null;
        }
    }

    public final void a(Class cls, Class cls2, aceh aceh) {
        aceg c = c(cls);
        synchronized (this.i) {
            c.b.put(cls2, aceh);
        }
    }

    public final void b() {
        this.e = null;
        this.k = 1;
        this.j = 1;
        this.f = false;
        this.g = false;
        this.h = false;
    }

    private static Object a(Class cls, auhj auhj) {
        if (cls.equals(auhh.class)) {
            auhg auhg = (auhg) auhh.c.createBuilder();
            auhg.copyOnWrite();
            auhh auhh = (auhh) auhg.instance;
            if (auhj != null) {
                auhh.b = auhj;
                auhh.a |= 1;
                return auhg;
            }
            throw new NullPointerException();
        } else if (cls.equals(auhl.class)) {
            auhk auhk = (auhk) auhl.p.createBuilder();
            auhk.copyOnWrite();
            auhl auhl = (auhl) auhk.instance;
            if (auhj != null) {
                auhl.b = auhj;
                auhl.a |= 1;
                return auhk;
            }
            throw new NullPointerException();
        } else if (cls.equals(auhn.class)) {
            auhm auhm = (auhm) auhn.f.createBuilder();
            auhm.copyOnWrite();
            auhn auhn = (auhn) auhm.instance;
            if (auhj != null) {
                auhn.b = auhj;
                auhn.a |= 1;
                return auhm;
            }
            throw new NullPointerException();
        } else if (cls.equals(auhp.class)) {
            auho auho = (auho) auhp.g.createBuilder();
            auho.copyOnWrite();
            auhp auhp = (auhp) auho.instance;
            if (auhj != null) {
                auhp.b = auhj;
                auhp.a |= 1;
                return auho;
            }
            throw new NullPointerException();
        } else if (cls.equals(auht.class)) {
            auhs auhs = (auhs) auht.d.createBuilder();
            auhs.copyOnWrite();
            auht auht = (auht) auhs.instance;
            if (auhj != null) {
                auht.b = auhj;
                auht.a |= 1;
                return auhs;
            }
            throw new NullPointerException();
        } else if (!cls.equals(auhr.class)) {
            return null;
        } else {
            auhq auhq = (auhq) auhr.d.createBuilder();
            auhq.copyOnWrite();
            auhr auhr = (auhr) auhq.instance;
            if (auhj != null) {
                auhr.b = auhj;
                auhr.a |= 1;
                return auhq;
            }
            throw new NullPointerException();
        }
    }

    private static asmw b(Object obj) {
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmw asmw;
        if (obj instanceof auhg) {
            auhg auhg = (auhg) obj;
            asmz.copyOnWrite();
            asmw = (asmw) asmz.instance;
            asmw.c = (anxl) auhg.build();
            asmw.b = 64;
            return (asmw) ((anxl) asmz.build());
        } else if (obj instanceof auhk) {
            auhk auhk = (auhk) obj;
            asmz.copyOnWrite();
            asmw = (asmw) asmz.instance;
            asmw.c = (anxl) auhk.build();
            asmw.b = 65;
            return (asmw) ((anxl) asmz.build());
        } else if (obj instanceof auhm) {
            auhm auhm = (auhm) obj;
            asmz.copyOnWrite();
            asmw = (asmw) asmz.instance;
            asmw.c = (anxl) auhm.build();
            asmw.b = 66;
            return (asmw) ((anxl) asmz.build());
        } else if (obj instanceof auho) {
            auho auho = (auho) obj;
            asmz.copyOnWrite();
            asmw = (asmw) asmz.instance;
            asmw.c = (anxl) auho.build();
            asmw.b = 67;
            return (asmw) ((anxl) asmz.build());
        } else if (obj instanceof auhs) {
            auhs auhs = (auhs) obj;
            asmz.copyOnWrite();
            asmw = (asmw) asmz.instance;
            asmw.c = (anxl) auhs.build();
            asmw.b = 68;
            return (asmw) ((anxl) asmz.build());
        } else if (!(obj instanceof auhq)) {
            return null;
        } else {
            auhq auhq = (auhq) obj;
            asmz.copyOnWrite();
            asmw = (asmw) asmz.instance;
            asmw.c = (anxl) auhq.build();
            asmw.b = 75;
            return (asmw) ((anxl) asmz.build());
        }
    }

    private final aceg c(Class cls) {
        aceg aceg;
        synchronized (this.i) {
            if (!this.i.containsKey(cls)) {
                this.i.put(cls, new aceg());
            }
            aceg = (aceg) this.i.get(cls);
        }
        return aceg;
    }

    private final auhj a(aceg aceg) {
        auhj auhj;
        amqw.a((Object) aceg);
        long a = this.d.a();
        auhi auhi = (auhi) auhj.k.createBuilder();
        if (!TextUtils.isEmpty(this.e)) {
            String str = this.e;
            auhi.copyOnWrite();
            auhj = (auhj) auhi.instance;
            if (str != null) {
                auhj.a |= 1;
                auhj.b = str;
            } else {
                throw new NullPointerException();
            }
        }
        int i = this.j;
        auhi.copyOnWrite();
        auhj = (auhj) auhi.instance;
        if (i != 0) {
            auhj.a |= 128;
            auhj.h = i - 1;
            auhi.copyOnWrite();
            auhj auhj2 = (auhj) auhi.instance;
            auhj2.a |= 64;
            auhj2.g = true;
            boolean z = this.f;
            auhi.copyOnWrite();
            auhj auhj3 = (auhj) auhi.instance;
            auhj3.a |= 16;
            auhj3.e = z;
            z = this.g;
            auhi.copyOnWrite();
            auhj3 = (auhj) auhi.instance;
            auhj3.a |= 32;
            auhj3.f = z;
            i = this.k;
            auhi.copyOnWrite();
            auhj3 = (auhj) auhi.instance;
            if (i != 0) {
                auhj3.a |= 1024;
                auhj3.i = i - 1;
                long j = aceg.d;
                auhi.copyOnWrite();
                auhj = (auhj) auhi.instance;
                auhj.a |= 4;
                auhj.c = j;
                auhi.copyOnWrite();
                auhj2 = (auhj) auhi.instance;
                auhj2.a |= 8;
                auhj2.d = a;
                z = this.h;
                auhi.copyOnWrite();
                auhj3 = (auhj) auhi.instance;
                auhj3.a |= 2048;
                auhj3.j = z;
                aceg.d = a;
                return (auhj) ((anxl) auhi.build());
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(Class cls, aceg aceg) {
        if (this.c) {
            if (aceg.c > 0 && aceg.e && aceg.a == null) {
                ScheduledExecutorService scheduledExecutorService = this.a;
                acee acee = new acee(this, cls);
                long j = aceg.c;
                aceg.a = scheduledExecutorService.scheduleWithFixedDelay(acee, j, j, TimeUnit.MILLISECONDS);
            }
            if (aceg.c <= 0) {
                Future future = aceg.a;
                if (future != null) {
                    future.cancel(false);
                    aceg.a = null;
                }
            }
        }
    }

    public final void a(int i, int i2, bqn bqn) {
        aceg c = c(auhn.class);
        if (c.e && this.c) {
            Object obj = (auhm) acef.a(auhn.class, a(c));
            obj.copyOnWrite();
            auhn auhn = (auhn) obj.instance;
            auhn.a |= 2;
            auhn.c = i - 1;
            obj.copyOnWrite();
            auhn auhn2 = (auhn) obj.instance;
            if (i2 != 0) {
                auhn2.a |= 4;
                auhn2.d = i2 - 1;
                if (bqn != null) {
                    bqd bqd = bqn.b;
                    if (bqd != null) {
                        i = bqd.a;
                        obj.copyOnWrite();
                        auhn auhn3 = (auhn) obj.instance;
                        auhn3.a |= 8;
                        auhn3.e = i;
                    }
                }
                a(obj);
                return;
            }
            throw new NullPointerException();
        }
    }

    public final void a(int i) {
        aceg c = c(auhr.class);
        if (c.e && this.c) {
            Object obj = (auhq) acef.a(auhr.class, a(c));
            if (obj == null) {
                xtl.c("Could not create stage metric");
                return;
            }
            obj.copyOnWrite();
            auhr auhr = (auhr) obj.instance;
            auhr.a |= 2;
            auhr.c = i - 1;
            a(obj);
        }
    }
}
