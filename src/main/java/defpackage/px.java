package defpackage;

import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: px */
final class px extends pv {
    private final af a;
    private final py b;

    px(af afVar, bf bfVar) {
        this.a = afVar;
        this.b = py.a(bfVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A:{Catch:{ all -> 0x00a6 }} */
    public final defpackage.rh a(defpackage.pu r5) {
        /*
        r4 = this;
        r0 = "pluginLicensePaths";
        r1 = r4.b;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00b5;
    L_0x0008:
        r1 = android.os.Looper.getMainLooper();
        r2 = android.os.Looper.myLooper();
        if (r1 != r2) goto L_0x00ad;
    L_0x0012:
        r1 = r4.b;
        r1 = r1.c();
        if (r1 == 0) goto L_0x0021;
    L_0x001a:
        r0 = r4.a;
        r5 = r1.a(r0, r5);
        return r5;
    L_0x0021:
        r1 = r4.b;	 Catch:{ all -> 0x00a6 }
        r2 = 1;
        r1.b = r2;	 Catch:{ all -> 0x00a6 }
        r1 = r5;
        r1 = (defpackage.nf) r1;	 Catch:{ all -> 0x00a6 }
        r1 = r1.j;	 Catch:{ all -> 0x00a6 }
        if (r1 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x004f;
    L_0x002e:
        r2 = r1.getStringArrayList(r0);	 Catch:{ all -> 0x00a6 }
        if (r2 == 0) goto L_0x004f;
    L_0x0034:
        r2 = r1.getStringArrayList(r0);	 Catch:{ all -> 0x00a6 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x00a6 }
        if (r2 != 0) goto L_0x004f;
    L_0x003e:
        r2 = new ugc;	 Catch:{ all -> 0x00a6 }
        r3 = r5;
        r3 = (defpackage.nf) r3;	 Catch:{ all -> 0x00a6 }
        r3 = r3.p();	 Catch:{ all -> 0x00a6 }
        r0 = r1.getStringArrayList(r0);	 Catch:{ all -> 0x00a6 }
        r2.<init>(r3, r0);	 Catch:{ all -> 0x00a6 }
        goto L_0x005b;
    L_0x004f:
        r2 = new ugc;	 Catch:{ all -> 0x00a6 }
        r0 = r5;
        r0 = (defpackage.nf) r0;	 Catch:{ all -> 0x00a6 }
        r0 = r0.p();	 Catch:{ all -> 0x00a6 }
        r2.<init>(r0);	 Catch:{ all -> 0x00a6 }
    L_0x005b:
        r0 = r2.getClass();	 Catch:{ all -> 0x00a6 }
        r0 = r0.isMemberClass();	 Catch:{ all -> 0x00a6 }
        if (r0 == 0) goto L_0x008b;
    L_0x0065:
        r0 = r2.getClass();	 Catch:{ all -> 0x00a6 }
        r0 = r0.getModifiers();	 Catch:{ all -> 0x00a6 }
        r0 = java.lang.reflect.Modifier.isStatic(r0);	 Catch:{ all -> 0x00a6 }
        if (r0 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x008b;
    L_0x0074:
        r5 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00a6 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a6 }
        r0.<init>();	 Catch:{ all -> 0x00a6 }
        r1 = "Object returned from onCreateLoader must not be a non-static inner member class: ";
        r0.append(r1);	 Catch:{ all -> 0x00a6 }
        r0.append(r2);	 Catch:{ all -> 0x00a6 }
        r0 = r0.toString();	 Catch:{ all -> 0x00a6 }
        r5.<init>(r0);	 Catch:{ all -> 0x00a6 }
        throw r5;	 Catch:{ all -> 0x00a6 }
    L_0x008b:
        r0 = new pw;	 Catch:{ all -> 0x00a6 }
        r0.<init>(r2);	 Catch:{ all -> 0x00a6 }
        r1 = r4.b;	 Catch:{ all -> 0x00a6 }
        r1 = r1.a;	 Catch:{ all -> 0x00a6 }
        r2 = 54321; // 0xd431 float:7.612E-41 double:2.6838E-319;
        r1.b(r2, r0);	 Catch:{ all -> 0x00a6 }
        r1 = r4.b;
        r1.b();
        r1 = r4.a;
        r5 = r0.a(r1, r5);
        return r5;
    L_0x00a6:
        r5 = move-exception;
        r0 = r4.b;
        r0.b();
        throw r5;
    L_0x00ad:
        r5 = new java.lang.IllegalStateException;
        r0 = "initLoader must be called on the main thread";
        r5.<init>(r0);
        throw r5;
    L_0x00b5:
        r5 = new java.lang.IllegalStateException;
        r0 = "Called while creating a loader";
        r5.<init>(r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.a(pu):rh");
    }

    public final void a() {
        if (this.b.b) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            pw c = this.b.c();
            if (c != null) {
                c.e();
                this.b.a.b(54321);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    public final void b() {
        py pyVar = this.b;
        int c = pyVar.a.c();
        for (int i = 0; i < c; i++) {
            ((pw) pyVar.a.e(i)).d();
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        Class cls = this.a.getClass();
        stringBuilder.append(cls.getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(cls)));
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        py pyVar = this.b;
        if (pyVar.a.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("    ");
            String stringBuilder2 = stringBuilder.toString();
            for (int i = 0; i < pyVar.a.c(); i++) {
                pw pwVar = (pw) pyVar.a.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(pyVar.a.d(i));
                printWriter.print(": ");
                printWriter.println(pwVar.toString());
                printWriter.print(stringBuilder2);
                printWriter.print("mId=");
                printWriter.print(pwVar.h);
                printWriter.print(" mArgs=");
                printWriter.println(pwVar.i);
                printWriter.print(stringBuilder2);
                printWriter.print("mLoader=");
                printWriter.println(pwVar.j);
                rh rhVar = pwVar.j;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                String str2 = "  ";
                stringBuilder3.append(str2);
                rhVar.a(stringBuilder3.toString(), fileDescriptor, printWriter, strArr);
                if (pwVar.k != null) {
                    printWriter.print(stringBuilder2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(pwVar.k);
                    pz pzVar = pwVar.k;
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append(str2);
                    printWriter.print(stringBuilder3.toString());
                    printWriter.print("mDeliveredData=");
                    printWriter.println(pzVar.b);
                }
                printWriter.print(stringBuilder2);
                printWriter.print("mData=");
                rhVar = pwVar.j;
                Object a = pwVar.a();
                stringBuilder3 = new StringBuilder(64);
                if (a == null) {
                    stringBuilder3.append("null");
                } else {
                    Class cls = a.getClass();
                    stringBuilder3.append(cls.getSimpleName());
                    stringBuilder3.append("{");
                    stringBuilder3.append(Integer.toHexString(System.identityHashCode(cls)));
                    stringBuilder3.append("}");
                }
                printWriter.println(stringBuilder3.toString());
                printWriter.print(stringBuilder2);
                printWriter.print("mStarted=");
                printWriter.println(pwVar.c > 0);
            }
        }
    }
}
