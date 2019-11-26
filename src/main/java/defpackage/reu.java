package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: reu */
public abstract class reu extends rcr {
    public static Map zzuht = new ConcurrentHashMap();
    public rhs zzuhr = rhs.a;
    public int zzuhs = -1;

    public abstract Object a(int i);

    public final String toString() {
        String obj = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(obj);
        rgm.a(this, stringBuilder, 0);
        return stringBuilder.toString();
    }

    public final int hashCode() {
        int i = this.zzucs;
        if (i != 0) {
            return i;
        }
        i = rgw.a.a((Object) this).a(this);
        this.zzucs = i;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((reu) a(6)).getClass().isInstance(obj)) {
            return rgw.a.a((Object) this).a((Object) this, (reu) obj);
        }
        return false;
    }

    public final boolean c() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) a(1)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        boolean d = rgw.a.a((Object) this).d(this);
        if (booleanValue) {
            a(2);
        }
        return d;
    }

    /* Access modifiers changed, original: final */
    public final int f() {
        return this.zzuhs;
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        this.zzuhs = i;
    }

    public final void a(rdt rdt) {
        rha a = rgw.a.a(getClass());
        rik rik = rdt.b;
        if (rik == null) {
            rik = new rdz(rdt);
        }
        a.a((Object) this, rik);
    }

    public final int h() {
        int i = this.zzuhs;
        if (i != -1) {
            return i;
        }
        i = rgw.a.a((Object) this).b(this);
        this.zzuhs = i;
        return i;
    }

    protected static void a(Class cls, reu reu) {
        zzuht.put(cls, reu);
    }

    protected static Object a(rgh rgh, String str, Object[] objArr) {
        return new rgy(rgh, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    static reu a(reu reu, rdp rdp, reg reg) {
        Object obj = (reu) reu.a(4);
        try {
            rha a = rgw.a.a(obj);
            rgx rgx = rdp.c;
            if (rgx == null) {
                rgx = new rdr(rdp);
            }
            a.a(obj, rgx, reg);
            rgw.a.a(obj).c(obj);
            return obj;
        } catch (IOException e) {
            if (e.getCause() instanceof rfk) {
                throw ((rfk) e.getCause());
            }
            throw new rfk(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof rfk) {
                throw ((rfk) e2.getCause());
            }
            throw e2;
        }
    }

    private static reu b(reu reu, byte[] bArr) {
        Object obj = (reu) reu.a(4);
        try {
            rgw.a.a(obj).a(obj, bArr, 0, bArr.length, new rcx());
            rgw.a.a(obj).c(obj);
            if (obj.zzucs == 0) {
                return obj;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof rfk) {
                throw ((rfk) e.getCause());
            }
            throw new rfk(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw rfk.a();
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0038, code skipped:
            if (r2 != false) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:24:0x006a, code skipped:
            if (r0 != false) goto L_0x0077;
     */
    protected static defpackage.reu a(defpackage.reu r3, defpackage.rdg r4) {
        /*
        r0 = defpackage.reg.a();
        r4 = r4.e();	 Catch:{ rfk -> 0x007a }
        r3 = defpackage.reu.a(r3, r4, r0);	 Catch:{ rfk -> 0x007a }
        r0 = 0;
        r4.a(r0);	 Catch:{ rfk -> 0x0078 }
        r4 = 2;
        r0 = 1;
        if (r3 != 0) goto L_0x0015;
    L_0x0014:
        goto L_0x0045;
    L_0x0015:
        r1 = java.lang.Boolean.TRUE;
        r1 = r1.booleanValue();
        r2 = r3.a(r0);
        r2 = (java.lang.Byte) r2;
        r2 = r2.byteValue();
        if (r2 == r0) goto L_0x0045;
    L_0x0027:
        if (r2 == 0) goto L_0x003b;
    L_0x0029:
        r2 = defpackage.rgw.a;
        r2 = r2.a(r3);
        r2 = r2.d(r3);
        if (r1 == 0) goto L_0x0038;
    L_0x0035:
        r3.a(r4);
    L_0x0038:
        if (r2 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x0045;
    L_0x003b:
        r3 = new rhq;
        r3.<init>();
        r3 = r3.a();
        throw r3;
    L_0x0045:
        if (r3 == 0) goto L_0x0077;
    L_0x0047:
        r1 = java.lang.Boolean.TRUE;
        r1 = r1.booleanValue();
        r2 = r3.a(r0);
        r2 = (java.lang.Byte) r2;
        r2 = r2.byteValue();
        if (r2 == r0) goto L_0x0077;
    L_0x0059:
        if (r2 == 0) goto L_0x006d;
    L_0x005b:
        r0 = defpackage.rgw.a;
        r0 = r0.a(r3);
        r0 = r0.d(r3);
        if (r1 == 0) goto L_0x006a;
    L_0x0067:
        r3.a(r4);
    L_0x006a:
        if (r0 == 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0077;
    L_0x006d:
        r3 = new rhq;
        r3.<init>();
        r3 = r3.a();
        throw r3;
    L_0x0077:
        return r3;
    L_0x0078:
        r3 = move-exception;
        throw r3;	 Catch:{ rfk -> 0x007a }
    L_0x007a:
        r3 = move-exception;
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reu.a(reu, rdg):reu");
    }

    /* JADX WARNING: Missing block: B:8:0x002b, code skipped:
            if (r0 != false) goto L_0x0038;
     */
    public static defpackage.reu a(defpackage.reu r2, byte[] r3) {
        /*
        r2 = defpackage.reu.b(r2, r3);
        if (r2 == 0) goto L_0x0038;
    L_0x0006:
        r3 = java.lang.Boolean.TRUE;
        r3 = r3.booleanValue();
        r0 = 1;
        r1 = r2.a(r0);
        r1 = (java.lang.Byte) r1;
        r1 = r1.byteValue();
        if (r1 == r0) goto L_0x0038;
    L_0x0019:
        if (r1 == 0) goto L_0x002e;
    L_0x001b:
        r0 = defpackage.rgw.a;
        r0 = r0.a(r2);
        r0 = r0.d(r2);
        if (r3 == 0) goto L_0x002b;
    L_0x0027:
        r3 = 2;
        r2.a(r3);
    L_0x002b:
        if (r0 == 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0038;
    L_0x002e:
        r2 = new rhq;
        r2.<init>();
        r2 = r2.a();
        throw r2;
    L_0x0038:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reu.a(reu, byte[]):reu");
    }

    public final /* synthetic */ rgk i() {
        ret ret = (ret) a(5);
        ret.a(this);
        return ret;
    }

    public final /* synthetic */ rgk j() {
        return (ret) a(5);
    }

    public final /* synthetic */ rgh g() {
        return (reu) a(6);
    }
}
