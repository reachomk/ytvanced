package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.pud;
import defpackage.puf;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    public final puf a;

    /* JADX WARNING: Missing block: B:7:0x0020, code skipped:
            if (r1 == null) goto L_0x0022;
     */
    /* JADX WARNING: Missing block: B:24:0x0076, code skipped:
            if (r0 == null) goto L_0x0078;
     */
    public static defpackage.puf a(defpackage.pud r3) {
        /*
        r0 = "LifecycleFragmentImpl";
        r1 = "SupportLifecycleFragmentImpl";
        r3 = r3.a;
        r2 = r3 instanceof defpackage.nn;
        if (r2 != 0) goto L_0x0064;
    L_0x000a:
        r1 = r3 instanceof android.app.Activity;
        if (r1 == 0) goto L_0x005c;
    L_0x000e:
        r3 = (android.app.Activity) r3;
        r1 = defpackage.pwg.a;
        r1 = r1.get(r3);
        r1 = (java.lang.ref.WeakReference) r1;
        if (r1 == 0) goto L_0x0022;
    L_0x001a:
        r1 = r1.get();
        r1 = (defpackage.pwg) r1;
        if (r1 != 0) goto L_0x0052;
    L_0x0022:
        r1 = r3.getFragmentManager();	 Catch:{ ClassCastException -> 0x0053 }
        r1 = r1.findFragmentByTag(r0);	 Catch:{ ClassCastException -> 0x0053 }
        r1 = (defpackage.pwg) r1;	 Catch:{ ClassCastException -> 0x0053 }
        if (r1 == 0) goto L_0x0034;
    L_0x002e:
        r2 = r1.isRemoving();
        if (r2 == 0) goto L_0x0048;
    L_0x0034:
        r1 = new pwg;
        r1.<init>();
        r2 = r3.getFragmentManager();
        r2 = r2.beginTransaction();
        r0 = r2.add(r1, r0);
        r0.commitAllowingStateLoss();
    L_0x0048:
        r0 = defpackage.pwg.a;
        r2 = new java.lang.ref.WeakReference;
        r2.<init>(r1);
        r0.put(r3, r2);
    L_0x0052:
        return r1;
    L_0x0053:
        r3 = move-exception;
        r0 = new java.lang.IllegalStateException;
        r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl";
        r0.<init>(r1, r3);
        throw r0;
    L_0x005c:
        r3 = new java.lang.IllegalArgumentException;
        r0 = "Can't get fragment for unexpected activity.";
        r3.<init>(r0);
        throw r3;
    L_0x0064:
        r3 = (defpackage.nn) r3;
        r0 = defpackage.pwr.a;
        r0 = r0.get(r3);
        r0 = (java.lang.ref.WeakReference) r0;
        if (r0 == 0) goto L_0x0078;
    L_0x0070:
        r0 = r0.get();
        r0 = (defpackage.pwr) r0;
        if (r0 != 0) goto L_0x00a8;
    L_0x0078:
        r0 = r3.f();	 Catch:{ ClassCastException -> 0x00a9 }
        r0 = r0.a(r1);	 Catch:{ ClassCastException -> 0x00a9 }
        r0 = (defpackage.pwr) r0;	 Catch:{ ClassCastException -> 0x00a9 }
        if (r0 != 0) goto L_0x0085;
    L_0x0084:
        goto L_0x008a;
    L_0x0085:
        r2 = r0.p;
        if (r2 != 0) goto L_0x008a;
    L_0x0089:
        goto L_0x009e;
    L_0x008a:
        r0 = new pwr;
        r0.<init>();
        r2 = r3.f();
        r2 = r2.a();
        r1 = r2.a(r0, r1);
        r1.b();
    L_0x009e:
        r1 = defpackage.pwr.a;
        r2 = new java.lang.ref.WeakReference;
        r2.<init>(r0);
        r1.put(r3, r2);
    L_0x00a8:
        return r0;
    L_0x00a9:
        r3 = move-exception;
        r0 = new java.lang.IllegalStateException;
        r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl";
        r0.<init>(r1, r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.a(pud):puf");
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
    }

    public void b(Bundle bundle) {
    }

    public void c() {
    }

    public void d() {
    }

    private static puf getChimeraLifecycleFragmentImpl(pud pud) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public LifecycleCallback(puf puf) {
        this.a = puf;
    }

    public final Activity a() {
        return this.a.a();
    }
}
