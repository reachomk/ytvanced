package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bbb */
public final class bbb {
    public static bbf a;
    public final ArrayList b = new ArrayList();
    private final Context c;

    private bbb(Context context) {
        this.c = context;
    }

    public static bbb a(Context context) {
        if (context != null) {
            bbf bbf;
            bbb.e();
            if (a == null) {
                bbf = new bbf(context.getApplicationContext());
                a = bbf;
                bbf.a(bbf.g);
                bbf.i = new bcp(bbf.a, bbf);
                bcp bcp = bbf.i;
                if (!bcp.c) {
                    bcp.c = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    bcp.a.registerReceiver(bcp.d, intentFilter, null, bcp.b);
                    bcp.b.post(bcp.e);
                }
            }
            bbf = a;
            int size = bbf.b.size();
            while (true) {
                size--;
                bbb bbb;
                if (size >= 0) {
                    bbb = (bbb) ((WeakReference) bbf.b.get(size)).get();
                    if (bbb == null) {
                        bbf.b.remove(size);
                    } else if (bbb.c == context) {
                        return bbb;
                    }
                } else {
                    bbb = new bbb(context);
                    bbf.b.add(new WeakReference(bbb));
                    return bbb;
                }
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public static List a() {
        bbb.e();
        return a.c;
    }

    public static bbs b() {
        bbb.e();
        return a.a();
    }

    public static bbs c() {
        bbb.e();
        return a.b();
    }

    public static void a(bbs bbs) {
        if (bbs != null) {
            bbb.e();
            a.a(bbs);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    public static void a(int i) {
        bbb.e();
        bbs d = a.d();
        if (a.b() != d) {
            a.a(d, i);
            return;
        }
        bbf bbf = a;
        bbf.a(bbf.a(), i);
    }

    public static boolean a(baz baz, int i) {
        if (baz != null) {
            bbb.e();
            bbf bbf = a;
            if (baz.c()) {
                return false;
            }
            if (!((i & 2) == 0 && bbf.h)) {
                int size = bbf.c.size();
                int i2 = 0;
                while (i2 < size) {
                    bbs bbs = (bbs) bbf.c.get(i2);
                    if (((i & 1) != 0 && bbs.c()) || !bbs.a(baz)) {
                        i2++;
                    }
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a(baz baz, bbe bbe) {
        a(baz, bbe, 0);
    }

    public final void a(baz baz, bbe bbe, int i) {
        if (baz == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (bbe != null) {
            bbd bbd;
            Object obj;
            bbb.e();
            int b = b(bbe);
            if (b < 0) {
                bbd = new bbd(this, bbe);
                this.b.add(bbd);
            } else {
                bbd = (bbd) this.b.get(b);
            }
            int i2 = bbd.d;
            if (((i2 ^ -1) & i) != 0) {
                bbd.d = i2 | i;
                obj = 1;
            } else {
                obj = null;
            }
            baz baz2 = bbd.c;
            baz2.b();
            baz.b();
            if (!baz2.b.containsAll(baz.b)) {
                bbc bbc = new bbc(bbd.c);
                bbc.a(baz);
                bbd.c = bbc.a();
            } else if (obj == null) {
                return;
            }
            a.c();
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    public final void a(bbe bbe) {
        if (bbe != null) {
            bbb.e();
            int b = b(bbe);
            if (b >= 0) {
                this.b.remove(b);
                a.c();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    private final int b(bbe bbe) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((bbd) this.b.get(i)).b == bbe) {
                return i;
            }
        }
        return -1;
    }

    public static void a(wq wqVar) {
        bbf bbf = a;
        bbf.p = wqVar;
        if (VERSION.SDK_INT < 21) {
            wq wqVar2 = bbf.o;
            String str = "Listener may not be null";
            if (wqVar2 != null) {
                bbf.b(wqVar2.f());
                wqVar2 = bbf.o;
                xl xlVar = bbf.q;
                if (xlVar != null) {
                    wqVar2.c.remove(xlVar);
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
            bbf.o = wqVar;
            if (wqVar != null) {
                xl xlVar2 = bbf.q;
                if (xlVar2 != null) {
                    wqVar.c.add(xlVar2);
                    if (wqVar.b()) {
                        bbf.a(wqVar.f());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(str);
            }
            return;
        }
        bbj bbj = wqVar != null ? new bbj(bbf, wqVar) : null;
        bbj bbj2 = bbf.n;
        if (bbj2 != null) {
            bbj2.a();
        }
        bbf.n = bbj;
        if (bbj != null) {
            bbf.e();
        }
    }

    public static xo d() {
        bbf bbf = a;
        bbj bbj = bbf.n;
        wq wqVar;
        if (bbj == null) {
            wqVar = bbf.p;
            if (wqVar != null) {
                return wqVar.d();
            }
        }
        wqVar = bbj.a;
        if (wqVar != null) {
            return wqVar.d();
        }
        return null;
    }

    public static void e() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }
}
