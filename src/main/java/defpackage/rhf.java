package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: rhf */
public abstract class rhf implements Callable {
    public final qui a;
    public final qpa b;
    public Method c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;

    public rhf(qui qui, String str, String str2, qpa qpa, int i, int i2) {
        getClass().getSimpleName();
        this.a = qui;
        this.d = str;
        this.e = str2;
        this.b = qpa;
        this.f = i;
        this.g = i2;
    }

    public abstract void a();

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    public java.lang.Void call() {
        /*
        r8 = this;
        r0 = 0;
        r1 = java.lang.System.nanoTime();	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r3 = r8.a;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r4 = r8.d;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r5 = r8.e;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r3 = r3.a(r4, r5);	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r8.c = r3;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r3 = r8.c;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        if (r3 == 0) goto L_0x0068;
    L_0x0015:
        r8.a();	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r3 = r8.a;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r3 = r3.l;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        if (r3 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0068;
    L_0x001f:
        r4 = r8.f;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r4 == r5) goto L_0x0068;
    L_0x0025:
        r5 = r8.g;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r6 = java.lang.System.nanoTime();	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0068, IllegalAccessException | InvocationTargetException -> 0x0068 }
        r6 = r6 - r1;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r1;
        r1 = defpackage.qsn.b;	 Catch:{  }
        r1.block();	 Catch:{  }
        r1 = r3.d;	 Catch:{  }
        r1 = r1.booleanValue();	 Catch:{  }
        if (r1 == 0) goto L_0x0068;
    L_0x003c:
        r1 = defpackage.qsn.c;	 Catch:{  }
        if (r1 == 0) goto L_0x0068;
    L_0x0040:
        r1 = new qns;	 Catch:{  }
        r1.<init>();	 Catch:{  }
        r2 = r3.a;	 Catch:{  }
        r2 = r2.a;	 Catch:{  }
        r2 = r2.getPackageName();	 Catch:{  }
        r1.a = r2;	 Catch:{  }
        r2 = java.lang.Long.valueOf(r6);	 Catch:{  }
        r1.b = r2;	 Catch:{  }
        r2 = defpackage.qsn.c;	 Catch:{  }
        r1 = defpackage.riu.a(r1);	 Catch:{  }
        r3 = new rkp;	 Catch:{  }
        r3.<init>(r2, r1);	 Catch:{  }
        r3.a = r4;	 Catch:{  }
        r3.b = r5;	 Catch:{  }
        r3.a();	 Catch:{  }
    L_0x0068:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhf.call():java.lang.Void");
    }
}
