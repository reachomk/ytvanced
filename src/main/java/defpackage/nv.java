package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: nv */
final class nv extends nt implements Factory2 {
    private static final Interpolator G = new DecelerateInterpolator(2.5f);
    private static final Interpolator H = new DecelerateInterpolator(1.5f);
    private ArrayList A;
    private ArrayList B;
    private Bundle C = null;
    private SparseArray D = null;
    private ArrayList E;
    private final Runnable F = new nx(this);
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public ArrayList e;
    public atv f;
    public final atw g = new nu(this);
    public ArrayList h;
    public ArrayList i;
    public int j = 0;
    public nq k;
    public np l;
    public nf m;
    public ok n;
    private ArrayList o;
    private boolean p;
    private int q = 0;
    private ArrayList r;
    private final CopyOnWriteArrayList s = new CopyOnWriteArrayList();
    private nf t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ArrayList z;

    nv() {
    }

    public static int c(int i) {
        return i != 4097 ? i != 4099 ? i != 8194 ? 0 : 4097 : 4099 : 8194;
    }

    private final void a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new zo());
        nq nqVar = this.k;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (nqVar != null) {
            try {
                nqVar.a(str3, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(str, str2, e);
            }
        } else {
            try {
                a(str3, null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(str, str2, e2);
            }
        }
        throw runtimeException;
    }

    public final or a() {
        return new my(this);
    }

    public final boolean b() {
        boolean j = j();
        x();
        return j;
    }

    private final void t() {
        ArrayList arrayList = this.o;
        if (arrayList == null || arrayList.isEmpty()) {
            atw atw = this.g;
            boolean z = false;
            if (e() > 0 && l(this.t)) {
                z = true;
            }
            atw.a = z;
            return;
        }
        this.g.a = true;
    }

    private final boolean l(nf nfVar) {
        if (nfVar == null) {
            return true;
        }
        nv nvVar = nfVar.v;
        if (nfVar == nvVar.m && l(nvVar.t)) {
            return true;
        }
        return false;
    }

    public final void c() {
        a(new og(this, -1, 0), false);
    }

    public final boolean d() {
        v();
        j();
        c(true);
        nf nfVar = this.m;
        if (nfVar != null) {
            nv nvVar = nfVar.x;
            if (nvVar != null && nvVar.d()) {
                return true;
            }
        }
        boolean a = a(this.z, this.A, -1, 0);
        if (a) {
            this.p = true;
            try {
                b(this.z, this.A);
            } finally {
                w();
            }
        }
        t();
        y();
        z();
        return a;
    }

    public final void b(int i) {
        if (i >= 0) {
            a(new og(this, i, 1), false);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad id: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final int e() {
        ArrayList arrayList = this.e;
        return arrayList != null ? arrayList.size() : 0;
    }

    public final void a(Bundle bundle, String str, nf nfVar) {
        if (nfVar.v != this) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(nfVar);
            stringBuilder.append(" is not currently in the FragmentManager");
            a(new IllegalStateException(stringBuilder.toString()));
        }
        bundle.putString(str, nfVar.i);
    }

    public final nf a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        nf nfVar = (nf) this.d.get(string);
        if (nfVar == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment no longer exists for key ");
            stringBuilder.append(str);
            stringBuilder.append(": unique id ");
            stringBuilder.append(string);
            a(new IllegalStateException(stringBuilder.toString()));
        }
        return nfVar;
    }

    public final List f() {
        if (this.c.isEmpty()) {
            return Collections.emptyList();
        }
        List list;
        synchronized (this.c) {
            list = (List) this.c.clone();
        }
        return list;
    }

    /* Access modifiers changed, original: final */
    public final void b(nf nfVar) {
        if (!h()) {
            this.n.a.add(nfVar);
        }
    }

    private final void m(nf nfVar) {
        if (!h()) {
            this.n.a.remove(nfVar);
        }
    }

    public final nl a(nf nfVar) {
        if (nfVar.v != this) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(nfVar);
            stringBuilder.append(" is not currently in the FragmentManager");
            a(new IllegalStateException(stringBuilder.toString()));
        }
        if (nfVar.e > 0) {
            Bundle p = p(nfVar);
            if (p != null) {
                return new nl(p);
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        nf nfVar = this.t;
        if (nfVar != null) {
            zp.a(nfVar, stringBuilder);
        } else {
            zp.a(this.k, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        nf nfVar;
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("    ");
        String stringBuilder2 = stringBuilder.toString();
        if (!this.d.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (nf nfVar2 : this.d.values()) {
                printWriter.print(str);
                printWriter.println(nfVar2);
                if (nfVar2 != null) {
                    nfVar2.a(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size = this.c.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (i = 0; i < size; i++) {
                nfVar2 = (nf) this.c.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(nfVar2.toString());
            }
        }
        ArrayList arrayList = this.r;
        if (arrayList != null) {
            size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    nfVar2 = (nf) this.r.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(nfVar2.toString());
                }
            }
        }
        arrayList = this.e;
        if (arrayList != null) {
            size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    my myVar = (my) this.e.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(myVar.toString());
                    printWriter.print(stringBuilder2);
                    printWriter.print("mName=");
                    printWriter.print(myVar.l);
                    printWriter.print(" mIndex=");
                    printWriter.print(myVar.c);
                    printWriter.print(" mCommitted=");
                    printWriter.println(myVar.b);
                    if (myVar.i != 0) {
                        printWriter.print(stringBuilder2);
                        printWriter.print("mTransition=#");
                        printWriter.print(Integer.toHexString(myVar.i));
                        printWriter.print(" mTransitionStyle=#");
                        printWriter.println(Integer.toHexString(myVar.j));
                    }
                    if (!(myVar.e == 0 && myVar.f == 0)) {
                        printWriter.print(stringBuilder2);
                        printWriter.print("mEnterAnim=#");
                        printWriter.print(Integer.toHexString(myVar.e));
                        printWriter.print(" mExitAnim=#");
                        printWriter.println(Integer.toHexString(myVar.f));
                    }
                    if (!(myVar.g == 0 && myVar.h == 0)) {
                        printWriter.print(stringBuilder2);
                        printWriter.print("mPopEnterAnim=#");
                        printWriter.print(Integer.toHexString(myVar.g));
                        printWriter.print(" mPopExitAnim=#");
                        printWriter.println(Integer.toHexString(myVar.h));
                    }
                    if (!(myVar.m == 0 && myVar.n == null)) {
                        printWriter.print(stringBuilder2);
                        printWriter.print("mBreadCrumbTitleRes=#");
                        printWriter.print(Integer.toHexString(myVar.m));
                        printWriter.print(" mBreadCrumbTitleText=");
                        printWriter.println(myVar.n);
                    }
                    if (!(myVar.o == 0 && myVar.p == null)) {
                        printWriter.print(stringBuilder2);
                        printWriter.print("mBreadCrumbShortTitleRes=#");
                        printWriter.print(Integer.toHexString(myVar.o));
                        printWriter.print(" mBreadCrumbShortTitleText=");
                        printWriter.println(myVar.p);
                    }
                    if (!myVar.d.isEmpty()) {
                        printWriter.print(stringBuilder2);
                        printWriter.println("Operations:");
                        int size2 = myVar.d.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            String str2;
                            oq oqVar = (oq) myVar.d.get(i2);
                            switch (oqVar.a) {
                                case 0:
                                    str2 = "NULL";
                                    break;
                                case 1:
                                    str2 = "ADD";
                                    break;
                                case 2:
                                    str2 = "REPLACE";
                                    break;
                                case 3:
                                    str2 = "REMOVE";
                                    break;
                                case 4:
                                    str2 = "HIDE";
                                    break;
                                case 5:
                                    str2 = "SHOW";
                                    break;
                                case 6:
                                    str2 = "DETACH";
                                    break;
                                case 7:
                                    str2 = "ATTACH";
                                    break;
                                case 8:
                                    str2 = "SET_PRIMARY_NAV";
                                    break;
                                case 9:
                                    str2 = "UNSET_PRIMARY_NAV";
                                    break;
                                case 10:
                                    str2 = "OP_SET_MAX_LIFECYCLE";
                                    break;
                                default:
                                    StringBuilder stringBuilder3 = new StringBuilder();
                                    stringBuilder3.append("cmd=");
                                    stringBuilder3.append(oqVar.a);
                                    str2 = stringBuilder3.toString();
                                    break;
                            }
                            printWriter.print(stringBuilder2);
                            printWriter.print("  Op #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                            printWriter.print(str2);
                            printWriter.print(" ");
                            printWriter.println(oqVar.b);
                            if (!(oqVar.c == 0 && oqVar.d == 0)) {
                                printWriter.print(stringBuilder2);
                                printWriter.print("enterAnim=#");
                                printWriter.print(Integer.toHexString(oqVar.c));
                                printWriter.print(" exitAnim=#");
                                printWriter.println(Integer.toHexString(oqVar.d));
                            }
                            if (oqVar.e != 0 || oqVar.f != 0) {
                                printWriter.print(stringBuilder2);
                                printWriter.print("popEnterAnim=#");
                                printWriter.print(Integer.toHexString(oqVar.e));
                                printWriter.print(" popExitAnim=#");
                                printWriter.println(Integer.toHexString(oqVar.f));
                            }
                        }
                    }
                }
            }
        }
        synchronized (this) {
            arrayList = this.h;
            if (arrayList != null) {
                size = arrayList.size();
                if (size > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i3 = 0; i3 < size; i3++) {
                        my myVar2 = (my) this.h.get(i3);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i3);
                        printWriter.print(": ");
                        printWriter.println(myVar2);
                    }
                }
            }
            arrayList = this.i;
            if (arrayList != null && arrayList.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.i.toArray()));
            }
        }
        arrayList = this.o;
        if (arrayList != null) {
            size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size; i4++) {
                    oh ohVar = (oh) this.o.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(ohVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.k);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.l);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.j);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    private static od a(float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(G);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(H);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new od(animationSet);
    }

    private static od a(float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(H);
        alphaAnimation.setDuration(220);
        return new od(alphaAnimation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A:{SYNTHETIC, Splitter:B:11:0x002c} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002c */
    private final defpackage.od a(defpackage.nf r4, int r5, boolean r6, int r7) {
        /*
        r3 = this;
        r4 = r4.M();
        if (r4 == 0) goto L_0x0050;
    L_0x0006:
        r0 = r3.k;
        r0 = r0.b;
        r0 = r0.getResources();
        r0 = r0.getResourceTypeName(r4);
        r1 = "anim";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x002c;
    L_0x001a:
        r1 = r3.k;	 Catch:{ NotFoundException -> 0x002a, RuntimeException -> 0x002c }
        r1 = r1.b;	 Catch:{ NotFoundException -> 0x002a, RuntimeException -> 0x002c }
        r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r4);	 Catch:{ NotFoundException -> 0x002a, RuntimeException -> 0x002c }
        if (r1 == 0) goto L_0x0050;
    L_0x0024:
        r2 = new od;	 Catch:{ NotFoundException -> 0x002a, RuntimeException -> 0x002c }
        r2.<init>(r1);	 Catch:{ NotFoundException -> 0x002a, RuntimeException -> 0x002c }
        return r2;
    L_0x002a:
        r4 = move-exception;
        throw r4;
    L_0x002c:
        r1 = r3.k;	 Catch:{ RuntimeException -> 0x003c }
        r1 = r1.b;	 Catch:{ RuntimeException -> 0x003c }
        r1 = android.animation.AnimatorInflater.loadAnimator(r1, r4);	 Catch:{ RuntimeException -> 0x003c }
        if (r1 == 0) goto L_0x0050;
    L_0x0036:
        r2 = new od;	 Catch:{ RuntimeException -> 0x003c }
        r2.<init>(r1);	 Catch:{ RuntimeException -> 0x003c }
        return r2;
    L_0x003c:
        r1 = move-exception;
        if (r0 != 0) goto L_0x004f;
    L_0x003f:
        r0 = r3.k;
        r0 = r0.b;
        r4 = android.view.animation.AnimationUtils.loadAnimation(r0, r4);
        if (r4 == 0) goto L_0x0050;
    L_0x0049:
        r5 = new od;
        r5.<init>(r4);
        return r5;
    L_0x004f:
        throw r1;
    L_0x0050:
        r4 = 0;
        if (r5 == 0) goto L_0x00b3;
    L_0x0053:
        r0 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        if (r5 == r0) goto L_0x006d;
    L_0x0057:
        r0 = 4099; // 0x1003 float:5.744E-42 double:2.025E-320;
        if (r5 == r0) goto L_0x0067;
    L_0x005b:
        r0 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        if (r5 == r0) goto L_0x0061;
    L_0x005f:
        r5 = -1;
        goto L_0x0072;
    L_0x0061:
        if (r6 != 0) goto L_0x0065;
    L_0x0063:
        r5 = 4;
        goto L_0x0072;
    L_0x0065:
        r5 = 3;
        goto L_0x0072;
    L_0x0067:
        if (r6 != 0) goto L_0x006b;
    L_0x0069:
        r5 = 6;
        goto L_0x0072;
    L_0x006b:
        r5 = 5;
        goto L_0x0072;
    L_0x006d:
        if (r6 != 0) goto L_0x0071;
    L_0x006f:
        r5 = 2;
        goto L_0x0072;
    L_0x0071:
        r5 = 1;
    L_0x0072:
        if (r5 < 0) goto L_0x00b3;
    L_0x0074:
        r6 = 1064933786; // 0x3f79999a float:0.975 double:5.26147199E-315;
        r0 = 0;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        switch(r5) {
            case 1: goto L_0x00aa;
            case 2: goto L_0x00a5;
            case 3: goto L_0x00a0;
            case 4: goto L_0x0098;
            case 5: goto L_0x0093;
            case 6: goto L_0x008e;
            default: goto L_0x007d;
        };
    L_0x007d:
        if (r7 != 0) goto L_0x00b1;
    L_0x007f:
        r5 = r3.k;
        r5 = r5.h();
        if (r5 == 0) goto L_0x00b3;
    L_0x0087:
        r5 = r3.k;
        r7 = r5.i();
        goto L_0x00b1;
    L_0x008e:
        r4 = defpackage.nv.a(r1, r0);
        return r4;
    L_0x0093:
        r4 = defpackage.nv.a(r0, r1);
        return r4;
    L_0x0098:
        r4 = 1065982362; // 0x3f89999a float:1.075 double:5.26665264E-315;
        r4 = defpackage.nv.a(r1, r4, r1, r0);
        return r4;
    L_0x00a0:
        r4 = defpackage.nv.a(r6, r1, r0, r1);
        return r4;
    L_0x00a5:
        r4 = defpackage.nv.a(r1, r6, r1, r0);
        return r4;
    L_0x00aa:
        r4 = 1066401792; // 0x3f900000 float:1.125 double:5.2687249E-315;
        r4 = defpackage.nv.a(r4, r1, r0, r1);
        return r4;
    L_0x00b1:
        if (r7 == 0) goto L_0x00b3;
    L_0x00b3:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv.a(nf, int, boolean, int):od");
    }

    public final void c(nf nfVar) {
        if (nfVar.M) {
            if (this.p) {
                this.y = true;
                return;
            }
            nfVar.M = false;
            a(nfVar, this.j, 0, 0, false);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0750  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0750  */
    /* JADX WARNING: Missing block: B:43:0x008b, code skipped:
            if (r0 != 3) goto L_0x074b;
     */
    public final void a(defpackage.nf r19, int r20, int r21, int r22, boolean r23) {
        /*
        r18 = this;
        r6 = r18;
        r7 = r19;
        r0 = r7.o;
        r8 = 1;
        if (r0 == 0) goto L_0x0010;
    L_0x0009:
        r0 = r7.D;
        if (r0 != 0) goto L_0x0010;
    L_0x000d:
        r0 = r20;
        goto L_0x0016;
    L_0x0010:
        r0 = r20;
        if (r0 > r8) goto L_0x0015;
    L_0x0014:
        goto L_0x0016;
    L_0x0015:
        r0 = 1;
    L_0x0016:
        r1 = r7.p;
        if (r1 == 0) goto L_0x002c;
    L_0x001a:
        r1 = r7.e;
        if (r0 > r1) goto L_0x001f;
    L_0x001e:
        goto L_0x002c;
    L_0x001f:
        if (r1 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x002a;
    L_0x0022:
        r0 = r19.T_();
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r0 = 1;
        goto L_0x002c;
    L_0x002a:
        r0 = r7.e;
    L_0x002c:
        r1 = r7.M;
        r9 = 3;
        r10 = 2;
        if (r1 == 0) goto L_0x003b;
    L_0x0032:
        r1 = r7.e;
        if (r1 < r9) goto L_0x0037;
    L_0x0036:
        goto L_0x003b;
    L_0x0037:
        if (r0 > r10) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 2;
    L_0x003b:
        r1 = r7.U;
        r2 = defpackage.z.CREATED;
        if (r1 != r2) goto L_0x0046;
    L_0x0041:
        r0 = java.lang.Math.min(r0, r8);
        goto L_0x0050;
    L_0x0046:
        r1 = r7.U;
        r1 = r1.ordinal();
        r0 = java.lang.Math.min(r0, r1);
    L_0x0050:
        r11 = r0;
        r0 = r7.e;
        r13 = "Fragment ";
        r14 = 0;
        r15 = 0;
        if (r0 > r11) goto L_0x0428;
    L_0x0059:
        r0 = r7.q;
        if (r0 == 0) goto L_0x0063;
    L_0x005d:
        r0 = r7.r;
        if (r0 == 0) goto L_0x0062;
    L_0x0061:
        goto L_0x0063;
    L_0x0062:
        return;
    L_0x0063:
        r0 = r19.R();
        if (r0 != 0) goto L_0x006f;
    L_0x0069:
        r0 = r19.S();
        if (r0 == 0) goto L_0x0083;
    L_0x006f:
        r7.a(r15);
        r7.a(r15);
        r2 = r19.T();
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r18;
        r1 = r19;
        r0.a(r1, r2, r3, r4, r5);
    L_0x0083:
        r0 = r7.e;
        if (r0 == 0) goto L_0x0093;
    L_0x0087:
        if (r0 == r8) goto L_0x0203;
    L_0x0089:
        if (r0 == r10) goto L_0x0343;
    L_0x008b:
        if (r0 == r9) goto L_0x008f;
    L_0x008d:
        goto L_0x074b;
    L_0x008f:
        r8 = r11;
        r0 = 3;
        goto L_0x037d;
    L_0x0093:
        if (r11 > 0) goto L_0x0097;
    L_0x0095:
        goto L_0x0203;
    L_0x0097:
        r0 = r7.f;
        if (r0 == 0) goto L_0x00ed;
    L_0x009b:
        r1 = r6.k;
        r1 = r1.b;
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r7.f;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r7.g = r0;
        r0 = r7.f;
        r1 = "android:target_state";
        r0 = r6.a(r0, r1);
        if (r0 == 0) goto L_0x00bd;
    L_0x00ba:
        r0 = r0.i;
        goto L_0x00be;
    L_0x00bd:
        r0 = r15;
    L_0x00be:
        r7.l = r0;
        r0 = r7.l;
        if (r0 == 0) goto L_0x00ce;
    L_0x00c4:
        r0 = r7.f;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r14);
        r7.m = r0;
    L_0x00ce:
        r0 = r7.h;
        if (r0 == 0) goto L_0x00db;
    L_0x00d2:
        r0 = r0.booleanValue();
        r7.N = r0;
        r7.h = r15;
        goto L_0x00e5;
    L_0x00db:
        r0 = r7.f;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r8);
        r7.N = r0;
    L_0x00e5:
        if (r0 != 0) goto L_0x00ed;
    L_0x00e7:
        r7.M = r8;
        if (r11 > r10) goto L_0x00ec;
    L_0x00eb:
        goto L_0x00ed;
    L_0x00ec:
        r11 = 2;
    L_0x00ed:
        r0 = r6.k;
        r7.w = r0;
        r1 = r6.t;
        r7.y = r1;
        if (r1 != 0) goto L_0x00fa;
    L_0x00f7:
        r0 = r0.d;
        goto L_0x00fc;
    L_0x00fa:
        r0 = r1.x;
    L_0x00fc:
        r7.v = r0;
        r0 = r7.k;
        r5 = " that does not belong to this FragmentManager!";
        r4 = " declared target fragment ";
        if (r0 == 0) goto L_0x0155;
    L_0x0106:
        r1 = r6.d;
        r0 = r0.i;
        r0 = r1.get(r0);
        r1 = r7.k;
        if (r0 != r1) goto L_0x0133;
    L_0x0112:
        r0 = r1.e;
        if (r0 > 0) goto L_0x0128;
    L_0x0116:
        r2 = 1;
        r3 = 0;
        r16 = 0;
        r17 = 1;
        r0 = r18;
        r12 = r4;
        r4 = r16;
        r9 = r5;
        r5 = r17;
        r0.a(r1, r2, r3, r4, r5);
        goto L_0x012a;
    L_0x0128:
        r12 = r4;
        r9 = r5;
    L_0x012a:
        r0 = r7.k;
        r0 = r0.i;
        r7.l = r0;
        r7.k = r15;
        goto L_0x0157;
    L_0x0133:
        r12 = r4;
        r9 = r5;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r1.append(r12);
        r2 = r7.k;
        r1.append(r2);
        r1.append(r9);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0155:
        r12 = r4;
        r9 = r5;
    L_0x0157:
        r0 = r7.l;
        if (r0 == 0) goto L_0x0194;
    L_0x015b:
        r1 = r6.d;
        r0 = r1.get(r0);
        r1 = r0;
        r1 = (defpackage.nf) r1;
        if (r1 == 0) goto L_0x0174;
    L_0x0166:
        r0 = r1.e;
        if (r0 > 0) goto L_0x0194;
    L_0x016a:
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r18;
        r0.a(r1, r2, r3, r4, r5);
        goto L_0x0194;
    L_0x0174:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r1.append(r12);
        r2 = r7.l;
        r1.append(r2);
        r1.append(r9);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0194:
        r0 = r6.k;
        r0 = r0.b;
        r6.a(r7, r0);
        r7.I = r14;
        r0 = r7.w;
        r0 = r0.b;
        r7.a(r0);
        r0 = r7.I;
        if (r0 == 0) goto L_0x040e;
    L_0x01a8:
        r0 = r7.y;
        r0 = r6.k;
        r0 = r0.b;
        r6.b(r7, r0);
        r0 = r7.T;
        if (r0 != 0) goto L_0x01fc;
    L_0x01b5:
        r0 = r7.f;
        r6.a(r7, r0);
        r0 = r7.f;
        r1 = r7.x;
        if (r1 == 0) goto L_0x01c3;
    L_0x01c0:
        r1.noteStateNotSaved();
    L_0x01c3:
        r7.e = r8;
        r7.I = r14;
        r1 = r7.Y;
        r1.a(r0);
        r7.b(r0);
        r7.T = r8;
        r0 = r7.I;
        if (r0 == 0) goto L_0x01e2;
    L_0x01d5:
        r0 = r7.V;
        r1 = defpackage.aa.ON_CREATE;
        r0.a(r1);
        r0 = r7.f;
        r6.b(r7, r0);
        goto L_0x0203;
    L_0x01e2:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onCreate()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x01fc:
        r0 = r7.f;
        r7.i(r0);
        r7.e = r8;
    L_0x0203:
        r0 = 8;
        if (r11 <= 0) goto L_0x023d;
    L_0x0207:
        r1 = r7.q;
        if (r1 == 0) goto L_0x023d;
    L_0x020b:
        r1 = r7.t;
        if (r1 != 0) goto L_0x023d;
    L_0x020f:
        r1 = r7.f;
        r1 = r7.g(r1);
        r2 = r7.f;
        r7.b(r1, r15, r2);
        r1 = r7.K;
        if (r1 == 0) goto L_0x023b;
    L_0x021e:
        r7.L = r1;
        r1.setSaveFromParentEnabled(r14);
        r1 = r7.C;
        if (r1 == 0) goto L_0x022c;
    L_0x0227:
        r1 = r7.K;
        r1.setVisibility(r0);
    L_0x022c:
        r1 = r7.K;
        r2 = r7.f;
        r7.a(r1, r2);
        r1 = r7.K;
        r2 = r7.f;
        r6.a(r7, r1, r2);
        goto L_0x023d;
    L_0x023b:
        r7.L = r15;
    L_0x023d:
        if (r11 > r8) goto L_0x0241;
    L_0x023f:
        goto L_0x0343;
    L_0x0241:
        r1 = r7.q;
        if (r1 != 0) goto L_0x0301;
    L_0x0245:
        r1 = r7.A;
        if (r1 == 0) goto L_0x02b7;
    L_0x0249:
        r2 = -1;
        if (r1 != r2) goto L_0x026a;
    L_0x024c:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Cannot create fragment ";
        r2.append(r3);
        r2.append(r7);
        r3 = " for a container view with no id";
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        r6.a(r1);
    L_0x026a:
        r1 = r6.l;
        r2 = r7.A;
        r1 = r1.a(r2);
        r1 = (android.view.ViewGroup) r1;
        if (r1 != 0) goto L_0x02b8;
    L_0x0276:
        r2 = r7.s;
        if (r2 != 0) goto L_0x02b8;
    L_0x027a:
        r2 = r19.q();	 Catch:{ NotFoundException -> 0x0285 }
        r3 = r7.A;	 Catch:{ NotFoundException -> 0x0285 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x0285 }
        goto L_0x0287;
    L_0x0285:
        r2 = "unknown";
    L_0x0287:
        r3 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "No view found for id 0x";
        r4.append(r5);
        r5 = r7.A;
        r5 = java.lang.Integer.toHexString(r5);
        r4.append(r5);
        r5 = " (";
        r4.append(r5);
        r4.append(r2);
        r2 = ") for fragment ";
        r4.append(r2);
        r4.append(r7);
        r2 = r4.toString();
        r3.<init>(r2);
        r6.a(r3);
        goto L_0x02b8;
    L_0x02b7:
        r1 = r15;
    L_0x02b8:
        r7.J = r1;
        r2 = r7.f;
        r2 = r7.g(r2);
        r3 = r7.f;
        r7.b(r2, r1, r3);
        r2 = r7.K;
        if (r2 == 0) goto L_0x02ff;
    L_0x02c9:
        r7.L = r2;
        r2.setSaveFromParentEnabled(r14);
        if (r1 == 0) goto L_0x02d5;
    L_0x02d0:
        r2 = r7.K;
        r1.addView(r2);
    L_0x02d5:
        r1 = r7.C;
        if (r1 == 0) goto L_0x02de;
    L_0x02d9:
        r1 = r7.K;
        r1.setVisibility(r0);
    L_0x02de:
        r0 = r7.K;
        r1 = r7.f;
        r7.a(r0, r1);
        r0 = r7.K;
        r1 = r7.f;
        r6.a(r7, r0, r1);
        r0 = r7.K;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x02fb;
    L_0x02f4:
        r0 = r7.J;
        if (r0 != 0) goto L_0x02f9;
    L_0x02f8:
        goto L_0x02fb;
    L_0x02f9:
        r0 = 1;
        goto L_0x02fc;
    L_0x02fb:
        r0 = 0;
    L_0x02fc:
        r7.P = r0;
        goto L_0x0301;
    L_0x02ff:
        r7.L = r15;
    L_0x0301:
        r0 = r7.f;
        r1 = r7.x;
        if (r1 == 0) goto L_0x030a;
    L_0x0307:
        r1.noteStateNotSaved();
    L_0x030a:
        r7.e = r10;
        r7.I = r14;
        r7.d(r0);
        r0 = r7.I;
        if (r0 == 0) goto L_0x03f4;
    L_0x0315:
        r0 = r7.x;
        if (r0 == 0) goto L_0x031c;
    L_0x0319:
        r0.m();
    L_0x031c:
        r0 = r7.f;
        r6.c(r7, r0);
        r0 = r7.K;
        if (r0 == 0) goto L_0x0341;
    L_0x0325:
        r0 = r7.f;
        r0 = r7.g;
        if (r0 == 0) goto L_0x0332;
    L_0x032b:
        r1 = r7.L;
        r1.restoreHierarchyState(r0);
        r7.g = r15;
    L_0x0332:
        r7.I = r14;
        r7.I = r8;
        r0 = r7.K;
        if (r0 == 0) goto L_0x0341;
    L_0x033a:
        r0 = r7.W;
        r1 = defpackage.aa.ON_CREATE;
        r0.a(r1);
    L_0x0341:
        r7.f = r15;
    L_0x0343:
        if (r11 > r10) goto L_0x0347;
    L_0x0345:
        goto L_0x008f;
    L_0x0347:
        r0 = r7.x;
        if (r0 == 0) goto L_0x0353;
    L_0x034b:
        r0.noteStateNotSaved();
        r0 = r7.x;
        r0.j();
    L_0x0353:
        r0 = 3;
        r7.e = r0;
        r7.I = r14;
        r19.W_();
        r0 = r7.I;
        if (r0 == 0) goto L_0x03da;
    L_0x035f:
        r0 = r7.x;
        if (r0 == 0) goto L_0x0366;
    L_0x0363:
        r0.n();
    L_0x0366:
        r0 = r7.V;
        r1 = defpackage.aa.ON_START;
        r0.a(r1);
        r0 = r7.K;
        if (r0 == 0) goto L_0x0378;
    L_0x0371:
        r0 = r7.W;
        r1 = defpackage.aa.ON_START;
        r0.a(r1);
    L_0x0378:
        r18.r(r19);
        goto L_0x008f;
    L_0x037d:
        if (r8 > r0) goto L_0x0381;
    L_0x037f:
        goto L_0x074c;
    L_0x0381:
        r0 = r7.x;
        if (r0 == 0) goto L_0x038d;
    L_0x0385:
        r0.noteStateNotSaved();
        r0 = r7.x;
        r0.j();
    L_0x038d:
        r0 = 4;
        r7.e = r0;
        r7.I = r14;
        r19.B();
        r0 = r7.I;
        if (r0 == 0) goto L_0x03c0;
    L_0x0399:
        r0 = r7.x;
        if (r0 == 0) goto L_0x03a5;
    L_0x039d:
        r0.o();
        r0 = r7.x;
        r0.j();
    L_0x03a5:
        r0 = r7.V;
        r1 = defpackage.aa.ON_RESUME;
        r0.a(r1);
        r0 = r7.K;
        if (r0 == 0) goto L_0x03b7;
    L_0x03b0:
        r0 = r7.W;
        r1 = defpackage.aa.ON_RESUME;
        r0.a(r1);
    L_0x03b7:
        r18.s(r19);
        r7.f = r15;
        r7.g = r15;
        goto L_0x074c;
    L_0x03c0:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onResume()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x03da:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onStart()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x03f4:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onActivityCreated()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x040e:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onAttach()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0428:
        if (r0 <= r11) goto L_0x074b;
    L_0x042a:
        if (r0 == r8) goto L_0x05a3;
    L_0x042c:
        if (r0 == r10) goto L_0x04c2;
    L_0x042e:
        r1 = 3;
        if (r0 == r1) goto L_0x047c;
    L_0x0431:
        r1 = 4;
        if (r0 == r1) goto L_0x0436;
    L_0x0434:
        goto L_0x074b;
    L_0x0436:
        if (r11 < r1) goto L_0x0439;
    L_0x0438:
        goto L_0x047c;
    L_0x0439:
        r0 = r7.K;
        if (r0 == 0) goto L_0x0444;
    L_0x043d:
        r0 = r7.W;
        r1 = defpackage.aa.ON_PAUSE;
        r0.a(r1);
    L_0x0444:
        r0 = r7.V;
        r1 = defpackage.aa.ON_PAUSE;
        r0.a(r1);
        r0 = r7.x;
        if (r0 == 0) goto L_0x0452;
    L_0x044f:
        r0.p();
    L_0x0452:
        r0 = 3;
        r7.e = r0;
        r7.I = r14;
        r19.ad_();
        r0 = r7.I;
        if (r0 == 0) goto L_0x0462;
    L_0x045e:
        r18.t(r19);
        goto L_0x047c;
    L_0x0462:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onPause()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x047c:
        r0 = 3;
        if (r11 < r0) goto L_0x0480;
    L_0x047f:
        goto L_0x04c2;
    L_0x0480:
        r0 = r7.K;
        if (r0 == 0) goto L_0x048b;
    L_0x0484:
        r0 = r7.W;
        r1 = defpackage.aa.ON_STOP;
        r0.a(r1);
    L_0x048b:
        r0 = r7.V;
        r1 = defpackage.aa.ON_STOP;
        r0.a(r1);
        r0 = r7.x;
        if (r0 == 0) goto L_0x0499;
    L_0x0496:
        r0.q();
    L_0x0499:
        r7.e = r10;
        r7.I = r14;
        r19.N_();
        r0 = r7.I;
        if (r0 == 0) goto L_0x04a8;
    L_0x04a4:
        r18.u(r19);
        goto L_0x04c2;
    L_0x04a8:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onStop()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x04c2:
        if (r11 >= r10) goto L_0x05a3;
    L_0x04c4:
        r0 = r7.K;
        if (r0 == 0) goto L_0x04d7;
    L_0x04c8:
        r0 = r6.k;
        r0 = r0.c();
        if (r0 == 0) goto L_0x04d7;
    L_0x04d0:
        r0 = r7.g;
        if (r0 != 0) goto L_0x04d7;
    L_0x04d4:
        r18.o(r19);
    L_0x04d7:
        r0 = r7.K;
        if (r0 == 0) goto L_0x04e2;
    L_0x04db:
        r0 = r7.W;
        r1 = defpackage.aa.ON_DESTROY;
        r0.a(r1);
    L_0x04e2:
        r0 = r7.x;
        if (r0 != 0) goto L_0x04e7;
    L_0x04e6:
        goto L_0x04ea;
    L_0x04e7:
        r0.d(r8);
    L_0x04ea:
        r7.e = r8;
        r7.I = r14;
        r19.i();
        r0 = r7.I;
        if (r0 == 0) goto L_0x0589;
    L_0x04f5:
        r0 = defpackage.pv.a(r19);
        r0.b();
        r7.t = r14;
        r18.v(r19);
        r0 = r7.K;
        if (r0 == 0) goto L_0x0579;
    L_0x0505:
        r1 = r7.J;
        if (r1 == 0) goto L_0x0579;
    L_0x0509:
        r1.endViewTransition(r0);
        r0 = r7.K;
        r0.clearAnimation();
        r0 = r6.j;
        r1 = 0;
        if (r0 <= 0) goto L_0x0531;
    L_0x0516:
        r0 = r6.x;
        if (r0 != 0) goto L_0x0531;
    L_0x051a:
        r0 = r7.K;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0531;
    L_0x0522:
        r0 = r7.R;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x0531;
    L_0x0528:
        r0 = r21;
        r2 = r22;
        r0 = r6.a(r7, r0, r14, r2);
        goto L_0x0532;
    L_0x0531:
        r0 = r15;
    L_0x0532:
        r7.R = r1;
        if (r0 != 0) goto L_0x0537;
    L_0x0536:
        goto L_0x0572;
    L_0x0537:
        r1 = r7.K;
        r2 = r7.J;
        r2.startViewTransition(r1);
        r7.c(r11);
        r3 = r0.a;
        if (r3 == 0) goto L_0x055d;
    L_0x0545:
        r0 = new oc;
        r0.<init>(r3, r2, r1);
        r1 = r7.K;
        r7.a(r1);
        r1 = new nw;
        r1.<init>(r6, r2, r7);
        r0.setAnimationListener(r1);
        r1 = r7.K;
        r1.startAnimation(r0);
        goto L_0x0572;
    L_0x055d:
        r0 = r0.b;
        r7.a(r0);
        r3 = new ny;
        r3.<init>(r6, r2, r1, r7);
        r0.addListener(r3);
        r1 = r7.K;
        r0.setTarget(r1);
        r0.start();
    L_0x0572:
        r0 = r7.J;
        r1 = r7.K;
        r0.removeView(r1);
    L_0x0579:
        r7.J = r15;
        r7.K = r15;
        r7.W = r15;
        r0 = r7.X;
        r0.a(r15);
        r7.L = r15;
        r7.r = r14;
        goto L_0x05a3;
    L_0x0589:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onDestroyView()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x05a3:
        if (r11 <= 0) goto L_0x05a7;
    L_0x05a5:
        goto L_0x074b;
    L_0x05a7:
        r0 = r6.x;
        if (r0 == 0) goto L_0x05cc;
    L_0x05ab:
        r0 = r19.R();
        if (r0 == 0) goto L_0x05bc;
    L_0x05b1:
        r0 = r19.R();
        r7.a(r15);
        r0.clearAnimation();
        goto L_0x05cc;
    L_0x05bc:
        r0 = r19.S();
        if (r0 == 0) goto L_0x05cc;
    L_0x05c2:
        r0 = r19.S();
        r7.a(r15);
        r0.cancel();
    L_0x05cc:
        r0 = r19.R();
        if (r0 != 0) goto L_0x0747;
    L_0x05d2:
        r0 = r19.S();
        if (r0 == 0) goto L_0x05da;
    L_0x05d8:
        goto L_0x0747;
    L_0x05da:
        r0 = r7.p;
        if (r0 == 0) goto L_0x05e7;
    L_0x05de:
        r0 = r19.T_();
        if (r0 == 0) goto L_0x05e5;
    L_0x05e4:
        goto L_0x05e7;
    L_0x05e5:
        r0 = 1;
        goto L_0x05e8;
    L_0x05e7:
        r0 = 0;
    L_0x05e8:
        if (r0 != 0) goto L_0x05f6;
    L_0x05ea:
        r1 = r6.n;
        r1 = r1.a(r7);
        if (r1 == 0) goto L_0x05f3;
    L_0x05f2:
        goto L_0x05f6;
    L_0x05f3:
        r7.e = r14;
        goto L_0x0661;
    L_0x05f6:
        r1 = r6.k;
        r2 = r1 instanceof defpackage.bi;
        if (r2 == 0) goto L_0x0601;
    L_0x05fc:
        r1 = r6.n;
        r8 = r1.e;
        goto L_0x060e;
    L_0x0601:
        r1 = r1.b;
        r2 = r1 instanceof android.app.Activity;
        if (r2 == 0) goto L_0x060e;
    L_0x0607:
        r1 = (android.app.Activity) r1;
        r1 = r1.isChangingConfigurations();
        r8 = r8 ^ r1;
    L_0x060e:
        if (r0 == 0) goto L_0x0611;
    L_0x0610:
        goto L_0x0613;
    L_0x0611:
        if (r8 == 0) goto L_0x0641;
    L_0x0613:
        r1 = r6.n;
        r2 = r1.b;
        r3 = r7.i;
        r2 = r2.get(r3);
        r2 = (defpackage.ok) r2;
        if (r2 == 0) goto L_0x062b;
    L_0x0621:
        r2.a();
        r2 = r1.b;
        r3 = r7.i;
        r2.remove(r3);
    L_0x062b:
        r2 = r1.c;
        r3 = r7.i;
        r2 = r2.get(r3);
        r2 = (defpackage.bf) r2;
        if (r2 == 0) goto L_0x0641;
    L_0x0637:
        r2.a();
        r1 = r1.c;
        r2 = r7.i;
        r1.remove(r2);
    L_0x0641:
        r1 = r7.V;
        r2 = defpackage.aa.ON_DESTROY;
        r1.a(r2);
        r1 = r7.x;
        if (r1 == 0) goto L_0x064f;
    L_0x064c:
        r1.r();
    L_0x064f:
        r7.e = r14;
        r7.I = r14;
        r7.T = r14;
        r19.X_();
        r1 = r7.I;
        if (r1 == 0) goto L_0x072d;
    L_0x065c:
        r7.x = r15;
        r18.w(r19);
    L_0x0661:
        r7.I = r14;
        r19.J_();
        r7.S = r15;
        r1 = r7.I;
        if (r1 == 0) goto L_0x0713;
    L_0x066c:
        r1 = r7.x;
        if (r1 == 0) goto L_0x0675;
    L_0x0670:
        r1.r();
        r7.x = r15;
    L_0x0675:
        r18.x(r19);
        if (r23 != 0) goto L_0x074b;
    L_0x067a:
        if (r0 != 0) goto L_0x06a0;
    L_0x067c:
        r0 = r6.n;
        r0 = r0.a(r7);
        if (r0 != 0) goto L_0x06a0;
    L_0x0684:
        r7.w = r15;
        r7.y = r15;
        r7.v = r15;
        r0 = r7.l;
        if (r0 == 0) goto L_0x074b;
    L_0x068e:
        r1 = r6.d;
        r0 = r1.get(r0);
        r0 = (defpackage.nf) r0;
        if (r0 == 0) goto L_0x074b;
    L_0x0698:
        r1 = r0.E;
        if (r1 == 0) goto L_0x074b;
    L_0x069c:
        r7.k = r0;
        goto L_0x074b;
    L_0x06a0:
        r0 = r6.d;
        r1 = r7.i;
        r0 = r0.get(r1);
        if (r0 == 0) goto L_0x074b;
    L_0x06aa:
        r0 = r6.d;
        r0 = r0.values();
        r0 = r0.iterator();
    L_0x06b4:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x06d1;
    L_0x06ba:
        r1 = r0.next();
        r1 = (defpackage.nf) r1;
        if (r1 == 0) goto L_0x06b4;
    L_0x06c2:
        r2 = r7.i;
        r3 = r1.l;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x06b4;
    L_0x06cc:
        r1.k = r7;
        r1.l = r15;
        goto L_0x06b4;
    L_0x06d1:
        r0 = r6.d;
        r1 = r7.i;
        r0.put(r1, r15);
        r18.m(r19);
        r0 = r7.l;
        if (r0 == 0) goto L_0x06e9;
    L_0x06df:
        r1 = r6.d;
        r0 = r1.get(r0);
        r0 = (defpackage.nf) r0;
        r7.k = r0;
    L_0x06e9:
        r19.aq_();
        r0 = java.util.UUID.randomUUID();
        r0 = r0.toString();
        r7.i = r0;
        r7.o = r14;
        r7.p = r14;
        r7.q = r14;
        r7.r = r14;
        r7.s = r14;
        r7.u = r14;
        r7.v = r15;
        r7.x = r15;
        r7.w = r15;
        r7.z = r14;
        r7.A = r14;
        r7.B = r15;
        r7.C = r14;
        r7.D = r14;
        goto L_0x074b;
    L_0x0713:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onDetach()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x072d:
        r0 = new qv;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r1.append(r7);
        r2 = " did not call through to super.onDestroy()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0747:
        r7.c(r11);
        goto L_0x074c;
    L_0x074b:
        r8 = r11;
    L_0x074c:
        r0 = r7.e;
        if (r0 == r8) goto L_0x077a;
    L_0x0750:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "moveToState: Fragment state for ";
        r0.append(r1);
        r0.append(r7);
        r1 = " not updated inline; expected state ";
        r0.append(r1);
        r0.append(r8);
        r1 = " found ";
        r0.append(r1);
        r1 = r7.e;
        r0.append(r1);
        r0 = r0.toString();
        r1 = "FragmentManager";
        android.util.Log.w(r1, r0);
        r7.e = r8;
    L_0x077a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv.a(nf, int, int, int, boolean):void");
    }

    private final void n(nf nfVar) {
        a(nfVar, this.j, 0, 0, false);
    }

    /* Access modifiers changed, original: final */
    public final void d(nf nfVar) {
        if (nfVar != null && this.d.containsKey(nfVar.i)) {
            ViewGroup viewGroup;
            od a;
            int i = this.j;
            if (nfVar.p) {
                if (nfVar.T_()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            a(nfVar, i, nfVar.N(), nfVar.O(), false);
            if (nfVar.K != null) {
                int indexOf;
                ViewGroup viewGroup2 = nfVar.J;
                nf nfVar2 = null;
                if (viewGroup2 != null) {
                    indexOf = this.c.indexOf(nfVar);
                    while (true) {
                        indexOf--;
                        if (indexOf < 0) {
                            break;
                        }
                        nf nfVar3 = (nf) this.c.get(indexOf);
                        if (nfVar3.J == viewGroup2) {
                            if (nfVar3.K != null) {
                                nfVar2 = nfVar3;
                                break;
                            }
                        }
                    }
                }
                if (nfVar2 != null) {
                    View view = nfVar2.K;
                    viewGroup = nfVar.J;
                    i = viewGroup.indexOfChild(view);
                    indexOf = viewGroup.indexOfChild(nfVar.K);
                    if (indexOf < i) {
                        viewGroup.removeViewAt(indexOf);
                        viewGroup.addView(nfVar.K, i);
                    }
                }
                if (nfVar.P && nfVar.J != null) {
                    float f = nfVar.R;
                    if (f > 0.0f) {
                        nfVar.K.setAlpha(f);
                    }
                    nfVar.R = 0.0f;
                    nfVar.P = false;
                    a = a(nfVar, nfVar.N(), true, nfVar.O());
                    if (a != null) {
                        Animation animation = a.a;
                        if (animation != null) {
                            nfVar.K.startAnimation(animation);
                        } else {
                            a.b.setTarget(nfVar.K);
                            a.b.start();
                        }
                    }
                }
            }
            if (nfVar.Q) {
                if (nfVar.K != null) {
                    a = a(nfVar, nfVar.N(), nfVar.C ^ 1, nfVar.O());
                    if (a != null) {
                        Animator animator = a.b;
                        if (animator != null) {
                            animator.setTarget(nfVar.K);
                            if (!nfVar.C) {
                                nfVar.K.setVisibility(0);
                            } else if (nfVar.V()) {
                                nfVar.e(false);
                            } else {
                                viewGroup = nfVar.J;
                                View view2 = nfVar.K;
                                viewGroup.startViewTransition(view2);
                                a.b.addListener(new ob(viewGroup, view2, nfVar));
                            }
                            a.b.start();
                        }
                    }
                    if (a != null) {
                        nfVar.K.startAnimation(a.a);
                        a.a.start();
                    }
                    i = (!nfVar.C || nfVar.V()) ? 0 : 8;
                    nfVar.K.setVisibility(i);
                    if (nfVar.V()) {
                        nfVar.e(false);
                    }
                }
                if (nfVar.o && nv.y(nfVar)) {
                    this.u = true;
                }
                nfVar.Q = false;
                nfVar.j_(nfVar.C);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, boolean z) {
        if (this.k == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.j) {
            this.j = i;
            i = this.c.size();
            for (int i2 = 0; i2 < i; i2++) {
                d((nf) this.c.get(i2));
            }
            for (nf nfVar : this.d.values()) {
                if (nfVar != null && ((nfVar.p || nfVar.D) && !nfVar.P)) {
                    d(nfVar);
                }
            }
            u();
            if (this.u) {
                nq nqVar = this.k;
                if (nqVar != null && this.j == 4) {
                    nqVar.g();
                    this.u = false;
                }
            }
        }
    }

    private final void u() {
        for (nf nfVar : this.d.values()) {
            if (nfVar != null) {
                c(nfVar);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void e(nf nfVar) {
        if (this.d.get(nfVar.i) == null) {
            this.d.put(nfVar.i, nfVar);
            if (nfVar.F) {
                if (nfVar.E) {
                    b(nfVar);
                } else {
                    m(nfVar);
                }
                nfVar.F = false;
            }
        }
    }

    public final void a(nf nfVar, boolean z) {
        e(nfVar);
        if (!nfVar.D) {
            if (this.c.contains(nfVar)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Fragment already added: ");
                stringBuilder.append(nfVar);
                throw new IllegalStateException(stringBuilder.toString());
            }
            synchronized (this.c) {
                this.c.add(nfVar);
            }
            nfVar.o = true;
            nfVar.p = false;
            if (nfVar.K == null) {
                nfVar.Q = false;
            }
            if (nv.y(nfVar)) {
                this.u = true;
            }
            if (z) {
                n(nfVar);
            }
        }
    }

    public final void f(nf nfVar) {
        int T_ = nfVar.T_() ^ 1;
        if (!nfVar.D || T_ != 0) {
            synchronized (this.c) {
                this.c.remove(nfVar);
            }
            if (nv.y(nfVar)) {
                this.u = true;
            }
            nfVar.o = false;
            nfVar.p = true;
        }
    }

    public static void g(nf nfVar) {
        if (!nfVar.C) {
            nfVar.C = true;
            nfVar.Q = 1 ^ nfVar.Q;
        }
    }

    public static void h(nf nfVar) {
        if (nfVar.C) {
            nfVar.C = false;
            nfVar.Q ^= 1;
        }
    }

    public final void i(nf nfVar) {
        if (!nfVar.D) {
            nfVar.D = true;
            if (nfVar.o) {
                synchronized (this.c) {
                    this.c.remove(nfVar);
                }
                if (nv.y(nfVar)) {
                    this.u = true;
                }
                nfVar.o = false;
            }
        }
    }

    public final void j(nf nfVar) {
        if (nfVar.D) {
            nfVar.D = false;
            if (!nfVar.o) {
                if (this.c.contains(nfVar)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Fragment already added: ");
                    stringBuilder.append(nfVar);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                synchronized (this.c) {
                    this.c.add(nfVar);
                }
                nfVar.o = true;
                if (nv.y(nfVar)) {
                    this.u = true;
                }
            }
        }
    }

    public final nf a(int i) {
        int size = this.c.size();
        while (true) {
            size--;
            nf nfVar;
            if (size >= 0) {
                nfVar = (nf) this.c.get(size);
                if (nfVar != null) {
                    if (nfVar.z == i) {
                        return nfVar;
                    }
                }
            } else {
                for (nf nfVar2 : this.d.values()) {
                    if (nfVar2 != null && nfVar2.z == i) {
                        return nfVar2;
                    }
                }
                return null;
            }
        }
    }

    public final nf a(String str) {
        nf nfVar;
        if (str != null) {
            int size = this.c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                nfVar = (nf) this.c.get(size);
                if (nfVar != null) {
                    if (str.equals(nfVar.B)) {
                        return nfVar;
                    }
                }
            }
        }
        if (str != null) {
            for (nf nfVar2 : this.d.values()) {
                if (nfVar2 != null && str.equals(nfVar2.B)) {
                    return nfVar2;
                }
            }
        }
        return null;
    }

    public final nf b(String str) {
        nf nfVar;
        Iterator it = this.d.values().iterator();
        while (true) {
            nfVar = null;
            if (!it.hasNext()) {
                break;
            }
            nf nfVar2 = (nf) it.next();
            if (nfVar2 != null) {
                if (str.equals(nfVar2.i)) {
                    nfVar = nfVar2;
                } else {
                    nv nvVar = nfVar2.x;
                    if (nvVar != null) {
                        nfVar = nvVar.b(str);
                    }
                }
                if (nfVar != null) {
                    break;
                }
            }
        }
        return nfVar;
    }

    private final void v() {
        if (h()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final boolean h() {
        return this.v || this.w;
    }

    public final void a(oh ohVar, boolean z) {
        if (!z) {
            v();
        }
        synchronized (this) {
            if (!this.x && this.k != null) {
                if (this.o == null) {
                    this.o = new ArrayList();
                }
                this.o.add(ohVar);
                i();
            } else if (z) {
            } else {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x001f  */
    /* JADX WARNING: Missing block: B:17:0x0020, code skipped:
            if (r2 != null) goto L_0x0022;
     */
    public final void i() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.E;	 Catch:{ all -> 0x0039 }
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0010;
    L_0x0007:
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0010;
    L_0x000e:
        r0 = 1;
        goto L_0x0011;
    L_0x0010:
        r0 = 0;
    L_0x0011:
        r3 = r4.o;	 Catch:{ all -> 0x0039 }
        if (r3 == 0) goto L_0x001d;
    L_0x0015:
        r3 = r3.size();	 Catch:{ all -> 0x0039 }
        if (r3 == r1) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r2 = 1;
    L_0x001d:
        if (r0 == 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0022;
    L_0x0020:
        if (r2 == 0) goto L_0x0037;
    L_0x0022:
        r0 = r4.k;	 Catch:{ all -> 0x0039 }
        r0 = r0.c;	 Catch:{ all -> 0x0039 }
        r1 = r4.F;	 Catch:{ all -> 0x0039 }
        r0.removeCallbacks(r1);	 Catch:{ all -> 0x0039 }
        r0 = r4.k;	 Catch:{ all -> 0x0039 }
        r0 = r0.c;	 Catch:{ all -> 0x0039 }
        r1 = r4.F;	 Catch:{ all -> 0x0039 }
        r0.post(r1);	 Catch:{ all -> 0x0039 }
        r4.t();	 Catch:{ all -> 0x0039 }
    L_0x0037:
        monitor-exit(r4);	 Catch:{ all -> 0x0039 }
        return;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0039 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv.i():void");
    }

    private final void c(boolean z) {
        if (this.p) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.k == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.k.c.getLooper()) {
            if (!z) {
                v();
            }
            if (this.z == null) {
                this.z = new ArrayList();
                this.A = new ArrayList();
            }
            this.p = true;
            try {
                a(null, null);
            } finally {
                this.p = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public final void b(oh ohVar, boolean z) {
        if (!z || (this.k != null && !this.x)) {
            c(z);
            if (ohVar.a(this.z, this.A)) {
                this.p = true;
                try {
                    b(this.z, this.A);
                } finally {
                    w();
                }
            }
            t();
            y();
            z();
        }
    }

    private final void w() {
        this.p = false;
        this.A.clear();
        this.z.clear();
    }

    public final boolean j() {
        c(true);
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.z;
            ArrayList arrayList2 = this.A;
            synchronized (this) {
                try {
                    ArrayList arrayList3 = this.o;
                    if (arrayList3 != null) {
                        if (arrayList3.size() != 0) {
                            int i = 0;
                            for (int i2 = 0; i2 < this.o.size(); i2++) {
                                i |= ((oh) this.o.get(i2)).a(arrayList, arrayList2);
                            }
                            this.o.clear();
                            this.k.c.removeCallbacks(this.F);
                            if (i == 0) {
                                break;
                            }
                            this.p = true;
                            try {
                                b(this.z, this.A);
                                w();
                                z = true;
                            } catch (Throwable th) {
                                w();
                                throw th;
                            }
                        }
                        break;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
        t();
        y();
        z();
        return z;
    }

    private final void a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.E;
        int size = arrayList3 != null ? arrayList3.size() : 0;
        int i = 0;
        while (i < size) {
            int indexOf;
            oj ojVar = (oj) this.E.get(i);
            if (!(arrayList == null || ojVar.a)) {
                indexOf = arrayList.indexOf(ojVar.b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    ojVar.b();
                    i++;
                }
            }
            if (ojVar.c == 0 || (arrayList != null && ojVar.b.a(arrayList, 0, arrayList.size()))) {
                this.E.remove(i);
                i--;
                size--;
                if (!(arrayList == null || ojVar.a)) {
                    indexOf = arrayList.indexOf(ojVar.b);
                    if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        ojVar.b();
                    }
                }
                ojVar.a();
            }
            i++;
        }
    }

    private final void b(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((my) arrayList.get(i)).s) {
                    if (i2 != i) {
                        b(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((my) arrayList.get(i2)).s) {
                            i2++;
                        }
                    }
                    b(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                b(arrayList, arrayList2, i2, size);
            }
        }
    }

    private final void b(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        int i3 = i;
        int i4 = i2;
        boolean z = ((my) arrayList3.get(i3)).s;
        ArrayList arrayList5 = this.B;
        if (arrayList5 == null) {
            this.B = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.B.addAll(this.c);
        int i5 = 0;
        nf nfVar = this.m;
        int i6 = i3;
        Object obj = null;
        while (true) {
            int i7 = 1;
            int i8;
            nf nfVar2;
            if (i6 >= i4) {
                int i9;
                int i10;
                this.B.clear();
                if (!z) {
                    ot.a(this, arrayList, arrayList2, i, i2, false);
                }
                i6 = i3;
                while (i6 < i4) {
                    my myVar = (my) arrayList3.get(i6);
                    if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                        myVar.a(-1);
                        myVar.a(i6 == i4 + -1);
                    } else {
                        myVar.a(1);
                        myVar.e();
                    }
                    i6++;
                }
                if (z) {
                    zl zlVar = new zl();
                    a(zlVar);
                    i8 = i4;
                    for (i9 = i4 - 1; i9 >= i3; i9--) {
                        my myVar2 = (my) arrayList3.get(i9);
                        boolean booleanValue = ((Boolean) arrayList4.get(i9)).booleanValue();
                        int i11 = 0;
                        while (i11 < myVar2.d.size()) {
                            if (my.a((oq) myVar2.d.get(i11))) {
                                if (!myVar2.a(arrayList3, i9 + 1, i4)) {
                                    if (this.E == null) {
                                        this.E = new ArrayList();
                                    }
                                    ni ojVar = new oj(myVar2, booleanValue);
                                    this.E.add(ojVar);
                                    for (int i12 = 0; i12 < myVar2.d.size(); i12++) {
                                        oq oqVar = (oq) myVar2.d.get(i12);
                                        if (my.a(oqVar)) {
                                            oqVar.b.a(ojVar);
                                        }
                                    }
                                    if (booleanValue) {
                                        myVar2.e();
                                    } else {
                                        myVar2.a((boolean) i5);
                                    }
                                    i8--;
                                    if (i9 != i8) {
                                        arrayList3.remove(i9);
                                        arrayList3.add(i8, myVar2);
                                    }
                                    a(zlVar);
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    i9 = zlVar.b;
                    while (i5 < i9) {
                        nfVar2 = (nf) zlVar.a(i5);
                        if (!nfVar2.o) {
                            View A = nfVar2.A();
                            nfVar2.R = A.getAlpha();
                            A.setAlpha(0.0f);
                        }
                        i5++;
                    }
                    i10 = i8;
                } else {
                    i10 = i4;
                }
                if (i10 != i3 && z) {
                    ot.a(this, arrayList, arrayList2, i, i10, true);
                    a(this.j, true);
                }
                while (i3 < i4) {
                    my myVar3 = (my) arrayList3.get(i3);
                    if (((Boolean) arrayList4.get(i3)).booleanValue()) {
                        i9 = myVar3.c;
                        if (i9 >= 0) {
                            synchronized (this) {
                                this.h.set(i9, null);
                                if (this.i == null) {
                                    this.i = new ArrayList();
                                }
                                this.i.add(Integer.valueOf(i9));
                            }
                            myVar3.c = -1;
                            i3++;
                        }
                    }
                    i3++;
                }
                return;
            }
            my myVar4 = (my) arrayList3.get(i6);
            int i13 = 3;
            int i14;
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                arrayList3 = this.B;
                for (int size = myVar4.d.size() - 1; size >= 0; size--) {
                    oq oqVar2 = (oq) myVar4.d.get(size);
                    i14 = oqVar2.a;
                    if (i14 != 1) {
                        if (i14 != 3) {
                            switch (i14) {
                                case 6:
                                    break;
                                case 7:
                                    break;
                                case 8:
                                    nfVar = null;
                                    break;
                                case 9:
                                    nfVar = oqVar2.b;
                                    break;
                                case 10:
                                    oqVar2.h = oqVar2.g;
                                    break;
                                default:
                                    break;
                            }
                        }
                        arrayList3.add(oqVar2.b);
                    }
                    arrayList3.remove(oqVar2.b);
                }
            } else {
                ArrayList arrayList6 = this.B;
                nf nfVar3 = nfVar;
                i8 = 0;
                while (i8 < myVar4.d.size()) {
                    oq oqVar3 = (oq) myVar4.d.get(i8);
                    i5 = oqVar3.a;
                    if (i5 != i7) {
                        if (i5 != 2) {
                            if (i5 == i13 || i5 == 6) {
                                arrayList6.remove(oqVar3.b);
                                nfVar2 = oqVar3.b;
                                if (nfVar2 == nfVar3) {
                                    myVar4.d.add(i8, new oq(9, nfVar2));
                                    i8++;
                                    i14 = 1;
                                    nfVar3 = null;
                                }
                            } else if (i5 != 7) {
                                if (i5 == 8) {
                                    myVar4.d.add(i8, new oq(9, nfVar3));
                                    i8++;
                                    nfVar3 = oqVar3.b;
                                }
                            }
                            i14 = 1;
                        } else {
                            nf nfVar4 = oqVar3.b;
                            i7 = nfVar4.A;
                            i13 = i8;
                            nf nfVar5 = nfVar3;
                            i8 = arrayList6.size() - 1;
                            Object obj2 = null;
                            while (i8 >= 0) {
                                nf nfVar6 = (nf) arrayList6.get(i8);
                                if (nfVar6.A == i7) {
                                    if (nfVar6 == nfVar4) {
                                        obj2 = 1;
                                    } else {
                                        if (nfVar6 == nfVar5) {
                                            myVar4.d.add(i13, new oq(9, nfVar6));
                                            i13++;
                                            nfVar5 = null;
                                        }
                                        oq oqVar4 = new oq(3, nfVar6);
                                        oqVar4.c = oqVar3.c;
                                        oqVar4.e = oqVar3.e;
                                        oqVar4.d = oqVar3.d;
                                        oqVar4.f = oqVar3.f;
                                        myVar4.d.add(i13, oqVar4);
                                        arrayList6.remove(nfVar6);
                                        i13++;
                                    }
                                }
                                i8--;
                                arrayList4 = arrayList2;
                                i3 = i;
                                i4 = i2;
                            }
                            i14 = 1;
                            if (obj2 != null) {
                                myVar4.d.remove(i13);
                                i8 = i13 - 1;
                                nfVar3 = nfVar5;
                            } else {
                                oqVar3.a = 1;
                                arrayList6.add(nfVar4);
                                nfVar3 = nfVar5;
                                i8 = i13;
                            }
                        }
                        i8 += i14;
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                        i3 = i;
                        i4 = i2;
                        i13 = 3;
                        i7 = 1;
                    }
                    i14 = 1;
                    arrayList6.add(oqVar3.b);
                    i8 += i14;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    i3 = i;
                    i4 = i2;
                    i13 = 3;
                    i7 = 1;
                }
                nfVar = nfVar3;
            }
            obj = (obj != null || myVar4.k) ? 1 : null;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            i3 = i;
            i4 = i2;
            i5 = 0;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(my myVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            myVar.a(z3);
        } else {
            myVar.e();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(myVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            ot.a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            a(this.j, true);
        }
        for (nf nfVar : this.d.values()) {
            if (nfVar != null && nfVar.K != null && nfVar.P && myVar.b(nfVar.A)) {
                float f = nfVar.R;
                if (f > 0.0f) {
                    nfVar.K.setAlpha(f);
                }
                if (z3) {
                    nfVar.R = 0.0f;
                } else {
                    nfVar.R = -1.0f;
                    nfVar.P = false;
                }
            }
        }
    }

    private final void a(zl zlVar) {
        int i = this.j;
        if (i > 0) {
            i = Math.min(i, 3);
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                nf nfVar = (nf) this.c.get(i2);
                if (nfVar.e < i) {
                    a(nfVar, i, nfVar.M(), nfVar.N(), false);
                    if (!(nfVar.K == null || nfVar.C || !nfVar.P)) {
                        zlVar.add(nfVar);
                    }
                }
            }
        }
    }

    private final void x() {
        if (this.E != null) {
            while (!this.E.isEmpty()) {
                ((oj) this.E.remove(0)).a();
            }
        }
    }

    private final void y() {
        if (this.y) {
            this.y = false;
            u();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3 = this.e;
        if (arrayList3 != null) {
            if (i >= 0 || (i2 & 1) != 0) {
                int size;
                if (i >= 0) {
                    size = arrayList3.size() - 1;
                    while (size >= 0 && i != ((my) this.e.get(size)).c) {
                        size--;
                    }
                    if (size < 0) {
                        return false;
                    }
                    if ((i2 & 1) != 0) {
                        while (true) {
                            size--;
                            if (size < 0 || i != ((my) this.e.get(size)).c) {
                                break;
                            }
                        }
                    }
                } else {
                    size = -1;
                }
                if (size != this.e.size() - 1) {
                    for (i = this.e.size() - 1; i > size; i--) {
                        arrayList.add(this.e.remove(i));
                        arrayList2.add(Boolean.valueOf(true));
                    }
                }
            } else {
                i = arrayList3.size() - 1;
                if (i < 0) {
                    return false;
                }
                arrayList.add(this.e.remove(i));
                arrayList2.add(Boolean.valueOf(true));
            }
            return true;
        }
        return false;
    }

    private final void o(nf nfVar) {
        if (nfVar.L != null) {
            SparseArray sparseArray = this.D;
            if (sparseArray == null) {
                this.D = new SparseArray();
            } else {
                sparseArray.clear();
            }
            nfVar.L.saveHierarchyState(this.D);
            if (this.D.size() > 0) {
                nfVar.g = this.D;
                this.D = null;
            }
        }
    }

    private final Bundle p(nf nfVar) {
        if (this.C == null) {
            this.C = new Bundle();
        }
        Bundle bundle = this.C;
        nfVar.e(bundle);
        nfVar.Y.b(bundle);
        nv nvVar = nfVar.x;
        if (nvVar != null) {
            Parcelable k = nvVar.k();
            if (k != null) {
                bundle.putParcelable("android:support:fragments", k);
            }
        }
        d(nfVar, this.C);
        if (this.C.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.C;
            this.C = null;
        }
        if (nfVar.K != null) {
            o(nfVar);
        }
        if (nfVar.g != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", nfVar.g);
        }
        if (!nfVar.N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", nfVar.N);
        }
        return bundle;
    }

    /* Access modifiers changed, original: final */
    public final Parcelable k() {
        nb[] nbVarArr;
        int T;
        x();
        Iterator it = this.d.values().iterator();
        while (true) {
            nbVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            nf nfVar = (nf) it.next();
            if (nfVar != null) {
                if (nfVar.R() != null) {
                    T = nfVar.T();
                    View R = nfVar.R();
                    Animation animation = R.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        R.clearAnimation();
                    }
                    nfVar.a(null);
                    a(nfVar, T, 0, 0, false);
                } else if (nfVar.S() != null) {
                    nfVar.S().end();
                }
            }
        }
        j();
        this.v = true;
        if (!this.d.isEmpty()) {
            String str;
            String str2;
            int i;
            ArrayList arrayList = new ArrayList(this.d.size());
            Iterator it2 = this.d.values().iterator();
            Object obj = null;
            while (true) {
                str = " was removed from the FragmentManager";
                str2 = "Failure saving state: active ";
                if (!it2.hasNext()) {
                    break;
                }
                nf nfVar2 = (nf) it2.next();
                if (nfVar2 != null) {
                    StringBuilder stringBuilder;
                    if (nfVar2.v != this) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str2);
                        stringBuilder.append(nfVar2);
                        stringBuilder.append(str);
                        a(new IllegalStateException(stringBuilder.toString()));
                    }
                    om omVar = new om(nfVar2);
                    arrayList.add(omVar);
                    if (nfVar2.e <= 0 || omVar.m != null) {
                        omVar.m = nfVar2.f;
                    } else {
                        omVar.m = p(nfVar2);
                        str = nfVar2.l;
                        if (str != null) {
                            nf nfVar3 = (nf) this.d.get(str);
                            if (nfVar3 == null) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Failure saving state: ");
                                stringBuilder.append(nfVar2);
                                stringBuilder.append(" has target not in fragment manager: ");
                                stringBuilder.append(nfVar2.l);
                                a(new IllegalStateException(stringBuilder.toString()));
                            }
                            if (omVar.m == null) {
                                omVar.m = new Bundle();
                            }
                            a(omVar.m, "android:target_state", nfVar3);
                            i = nfVar2.m;
                            if (i != 0) {
                                omVar.m.putInt("android:target_req_state", i);
                            }
                        }
                    }
                    obj = 1;
                }
            }
            if (obj != null) {
                ArrayList arrayList2;
                ArrayList arrayList3;
                int size = this.c.size();
                if (size > 0) {
                    arrayList2 = new ArrayList(size);
                    arrayList3 = this.c;
                    T = arrayList3.size();
                    for (i = 0; i < T; i++) {
                        nf nfVar4 = (nf) arrayList3.get(i);
                        arrayList2.add(nfVar4.i);
                        if (nfVar4.v != this) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(str2);
                            stringBuilder2.append(nfVar4);
                            stringBuilder2.append(str);
                            a(new IllegalStateException(stringBuilder2.toString()));
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                arrayList3 = this.e;
                if (arrayList3 != null) {
                    size = arrayList3.size();
                    if (size > 0) {
                        nbVarArr = new nb[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            nbVarArr[i2] = new nb((my) this.e.get(i2));
                        }
                    }
                }
                oi oiVar = new oi();
                oiVar.a = arrayList;
                oiVar.b = arrayList2;
                oiVar.c = nbVarArr;
                nf nfVar5 = this.m;
                if (nfVar5 != null) {
                    oiVar.d = nfVar5.i;
                }
                oiVar.e = this.q;
                return oiVar;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void a(Parcelable parcelable) {
        if (parcelable != null) {
            oi oiVar = (oi) parcelable;
            if (oiVar.a != null) {
                int size;
                int i;
                int i2;
                nf nfVar;
                String str;
                for (nf nfVar2 : this.n.a) {
                    om omVar;
                    ArrayList arrayList = oiVar.a;
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        omVar = (om) arrayList.get(i);
                        i++;
                        if (omVar.b.equals(nfVar2.i)) {
                            break;
                        }
                    }
                    omVar = null;
                    if (omVar == null) {
                        nf nfVar3 = nfVar2;
                        a(nfVar3, 1, 0, 0, false);
                        nfVar2.p = true;
                        a(nfVar3, 0, 0, 0, false);
                    } else {
                        omVar.n = nfVar2;
                        nfVar2.g = null;
                        nfVar2.u = 0;
                        nfVar2.r = false;
                        nfVar2.o = false;
                        nf nfVar4 = nfVar2.k;
                        nfVar2.l = nfVar4 != null ? nfVar4.i : null;
                        nfVar2.k = null;
                        Bundle bundle = omVar.m;
                        if (bundle != null) {
                            bundle.setClassLoader(this.k.b.getClassLoader());
                            nfVar2.g = omVar.m.getSparseParcelableArray("android:view_state");
                            nfVar2.f = omVar.m;
                        }
                    }
                }
                this.d.clear();
                ArrayList arrayList2 = oiVar.a;
                int size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    om omVar2 = (om) arrayList2.get(i2);
                    if (omVar2 != null) {
                        ClassLoader classLoader = this.k.b.getClassLoader();
                        nr g = g();
                        if (omVar2.n == null) {
                            Bundle bundle2 = omVar2.j;
                            if (bundle2 != null) {
                                bundle2.setClassLoader(classLoader);
                            }
                            omVar2.n = g.c(classLoader, omVar2.a);
                            omVar2.n.f(omVar2.j);
                            Bundle bundle3 = omVar2.m;
                            if (bundle3 != null) {
                                bundle3.setClassLoader(classLoader);
                                omVar2.n.f = omVar2.m;
                            } else {
                                omVar2.n.f = new Bundle();
                            }
                            nfVar = omVar2.n;
                            nfVar.i = omVar2.b;
                            nfVar.q = omVar2.c;
                            nfVar.s = true;
                            nfVar.z = omVar2.d;
                            nfVar.A = omVar2.e;
                            nfVar.B = omVar2.f;
                            nfVar.E = omVar2.g;
                            nfVar.p = omVar2.h;
                            nfVar.D = omVar2.i;
                            nfVar.C = omVar2.k;
                            nfVar.U = z.values()[omVar2.l];
                        }
                        nfVar = omVar2.n;
                        nfVar.v = this;
                        this.d.put(nfVar.i, nfVar);
                        omVar2.n = null;
                    }
                }
                this.c.clear();
                arrayList2 = oiVar.b;
                if (arrayList2 != null) {
                    size2 = arrayList2.size();
                    for (i2 = 0; i2 < size2; i2++) {
                        str = (String) arrayList2.get(i2);
                        nfVar = (nf) this.d.get(str);
                        if (nfVar == null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("No instantiated fragment for (");
                            stringBuilder.append(str);
                            stringBuilder.append(")");
                            a(new IllegalStateException(stringBuilder.toString()));
                        }
                        nfVar.o = true;
                        if (this.c.contains(nfVar)) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Already added ");
                            stringBuilder2.append(nfVar);
                            throw new IllegalStateException(stringBuilder2.toString());
                        }
                        synchronized (this.c) {
                            this.c.add(nfVar);
                        }
                    }
                }
                nb[] nbVarArr = oiVar.c;
                if (nbVarArr != null) {
                    this.e = new ArrayList(nbVarArr.length);
                    int i3 = 0;
                    while (true) {
                        nb[] nbVarArr2 = oiVar.c;
                        if (i3 >= nbVarArr2.length) {
                            break;
                        }
                        nb nbVar = nbVarArr2[i3];
                        my myVar = new my(this);
                        size = 0;
                        i = 0;
                        while (size < nbVar.a.length) {
                            oq oqVar = new oq();
                            int i4 = size + 1;
                            oqVar.a = nbVar.a[size];
                            str = (String) nbVar.b.get(i);
                            if (str != null) {
                                oqVar.b = (nf) this.d.get(str);
                            } else {
                                oqVar.b = null;
                            }
                            oqVar.g = z.values()[nbVar.c[i]];
                            oqVar.h = z.values()[nbVar.d[i]];
                            int[] iArr = nbVar.a;
                            int i5 = i4 + 1;
                            i4 = iArr[i4];
                            oqVar.c = i4;
                            int i6 = i5 + 1;
                            i5 = iArr[i5];
                            oqVar.d = i5;
                            int i7 = i6 + 1;
                            i6 = iArr[i6];
                            oqVar.e = i6;
                            int i8 = i7 + 1;
                            size = iArr[i7];
                            oqVar.f = size;
                            myVar.e = i4;
                            myVar.f = i5;
                            myVar.g = i6;
                            myVar.h = size;
                            myVar.b(oqVar);
                            i++;
                            size = i8;
                        }
                        myVar.i = nbVar.e;
                        myVar.j = nbVar.f;
                        myVar.l = nbVar.g;
                        myVar.c = nbVar.h;
                        myVar.k = true;
                        myVar.m = nbVar.i;
                        myVar.n = nbVar.j;
                        myVar.o = nbVar.k;
                        myVar.p = nbVar.l;
                        myVar.q = nbVar.m;
                        myVar.r = nbVar.n;
                        myVar.s = nbVar.o;
                        myVar.a(1);
                        this.e.add(myVar);
                        size2 = myVar.c;
                        if (size2 >= 0) {
                            synchronized (this) {
                                if (this.h == null) {
                                    this.h = new ArrayList();
                                }
                                size = this.h.size();
                                if (size2 < size) {
                                    this.h.set(size2, myVar);
                                } else {
                                    while (size < size2) {
                                        this.h.add(null);
                                        if (this.i == null) {
                                            this.i = new ArrayList();
                                        }
                                        this.i.add(Integer.valueOf(size));
                                        size++;
                                    }
                                    this.h.add(myVar);
                                }
                            }
                        }
                        i3++;
                    }
                } else {
                    this.e = null;
                }
                String str2 = oiVar.d;
                if (str2 != null) {
                    this.m = (nf) this.d.get(str2);
                    nv.q(this.m);
                }
                this.q = oiVar.e;
            }
        }
    }

    private final void z() {
        this.d.values().removeAll(Collections.singleton(null));
    }

    public final void a(nq nqVar, np npVar, nf nfVar) {
        if (this.k == null) {
            this.k = nqVar;
            this.l = npVar;
            this.t = nfVar;
            if (this.t != null) {
                t();
            }
            if (nqVar instanceof atz) {
                af afVar = (atz) nqVar;
                this.f = afVar.z_();
                if (nfVar != null) {
                    afVar = nfVar;
                }
                atv atv = this.f;
                atw atw = this.g;
                x y_ = afVar.y_();
                if (y_.a() != z.DESTROYED) {
                    atw.a(new aty(atv, y_, atw));
                }
            }
            if (nfVar != null) {
                ok okVar = nfVar.v.n;
                ok okVar2 = (ok) okVar.b.get(nfVar.i);
                if (okVar2 == null) {
                    okVar2 = new ok(okVar.d);
                    okVar.b.put(nfVar.i, okVar2);
                }
                this.n = okVar2;
                return;
            } else if (nqVar instanceof bi) {
                this.n = ok.a(((bi) nqVar).R_());
                return;
            } else {
                this.n = new ok(false);
                return;
            }
        }
        throw new IllegalStateException("Already attached");
    }

    public final void noteStateNotSaved() {
        int i = 0;
        this.v = false;
        this.w = false;
        int size = this.c.size();
        while (i < size) {
            nf nfVar = (nf) this.c.get(i);
            if (nfVar != null) {
                nv nvVar = nfVar.x;
                if (nvVar != null) {
                    nvVar.noteStateNotSaved();
                }
            }
            i++;
        }
    }

    public final void l() {
        this.v = false;
        this.w = false;
        d(1);
    }

    public final void m() {
        this.v = false;
        this.w = false;
        d(2);
    }

    public final void n() {
        this.v = false;
        this.w = false;
        d(3);
    }

    public final void o() {
        this.v = false;
        this.w = false;
        d(4);
    }

    public final void p() {
        d(3);
    }

    public final void q() {
        this.w = true;
        d(2);
    }

    public final void r() {
        this.x = true;
        j();
        d(0);
        this.k = null;
        this.l = null;
        this.t = null;
        if (this.f != null) {
            Iterator it = this.g.b.iterator();
            while (it.hasNext()) {
                ((atn) it.next()).a();
            }
            this.f = null;
        }
    }

    private final void d(int i) {
        try {
            this.p = true;
            a(i, false);
            j();
        } finally {
            this.p = false;
        }
    }

    public final void a(boolean z) {
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                nf nfVar = (nf) this.c.get(size);
                if (nfVar != null) {
                    nv nvVar = nfVar.x;
                    if (nvVar != null) {
                        nvVar.a(z);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void b(boolean z) {
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                nf nfVar = (nf) this.c.get(size);
                if (nfVar != null) {
                    nfVar.C();
                    nv nvVar = nfVar.x;
                    if (nvVar != null) {
                        nvVar.b(z);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void a(Configuration configuration) {
        for (int i = 0; i < this.c.size(); i++) {
            nf nfVar = (nf) this.c.get(i);
            if (nfVar != null) {
                nfVar.onConfigurationChanged(configuration);
                nv nvVar = nfVar.x;
                if (nvVar != null) {
                    nvVar.a(configuration);
                }
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.c.size(); i++) {
            nf nfVar = (nf) this.c.get(i);
            if (nfVar != null) {
                nfVar.onLowMemory();
                nv nvVar = nfVar.x;
                if (nvVar != null) {
                    nvVar.s();
                }
            }
        }
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.j <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            nf nfVar = (nf) this.c.get(i2);
            if (!(nfVar == null || nfVar.C)) {
                int i3;
                if (nfVar.G && nfVar.H) {
                    nfVar.a(menu, menuInflater);
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                nv nvVar = nfVar.x;
                if (nvVar != null) {
                    i3 |= nvVar.a(menu, menuInflater);
                }
                if (i3 != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(nfVar);
                    z = true;
                }
            }
        }
        if (this.r != null) {
            while (i < this.r.size()) {
                nf nfVar2 = (nf) this.r.get(i);
                if (arrayList != null) {
                    arrayList.contains(nfVar2);
                }
                i++;
            }
        }
        this.r = arrayList;
        return z;
    }

    public final boolean a(Menu menu) {
        if (this.j <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.c.size(); i++) {
            nf nfVar = (nf) this.c.get(i);
            if (!(nfVar == null || nfVar.C)) {
                int i2;
                if (nfVar.G && nfVar.H) {
                    nfVar.D();
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                nv nvVar = nfVar.x;
                if (nvVar != null) {
                    i2 |= nvVar.a(menu);
                }
                if (i2 != 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean a(MenuItem menuItem) {
        if (this.j > 0) {
            for (int i = 0; i < this.c.size(); i++) {
                nf nfVar = (nf) this.c.get(i);
                if (!(nfVar == null || nfVar.C)) {
                    if (nfVar.G && nfVar.H) {
                        nfVar.E();
                    }
                    nv nvVar = nfVar.x;
                    if (nvVar != null && nvVar.a(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        if (this.j > 0) {
            for (int i = 0; i < this.c.size(); i++) {
                nf nfVar = (nf) this.c.get(i);
                if (!(nfVar == null || nfVar.C)) {
                    nv nvVar = nfVar.x;
                    if (nvVar != null && nvVar.b(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        if (this.j > 0) {
            for (int i = 0; i < this.c.size(); i++) {
                nf nfVar = (nf) this.c.get(i);
                if (!(nfVar == null || nfVar.C)) {
                    if (nfVar.G) {
                        boolean z = nfVar.H;
                    }
                    nv nvVar = nfVar.x;
                    if (nvVar != null) {
                        nvVar.b(menu);
                    }
                }
            }
        }
    }

    public final void k(nf nfVar) {
        if (nfVar == null || (this.d.get(nfVar.i) == nfVar && (nfVar.w == null || nfVar.v == this))) {
            nf nfVar2 = this.m;
            this.m = nfVar;
            nv.q(nfVar2);
            nv.q(this.m);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(nfVar);
        stringBuilder.append(" is not an active fragment of FragmentManager ");
        stringBuilder.append(this);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static void q(nf nfVar) {
        if (nfVar != null) {
            boolean l = nfVar.v.l(nfVar);
            Boolean bool = nfVar.c_;
            if (bool == null || bool.booleanValue() != l) {
                nfVar.c_ = Boolean.valueOf(l);
                nv nvVar = nfVar.x;
                if (nvVar != null) {
                    nvVar.t();
                    nv.q(nvVar.m);
                }
            }
        }
    }

    public final void a(nf nfVar, z zVar) {
        if (this.d.get(nfVar.i) == nfVar && (nfVar.w == null || nfVar.v == this)) {
            nfVar.U = zVar;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(nfVar);
        stringBuilder.append(" is not an active fragment of FragmentManager ");
        stringBuilder.append(this);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final nr g() {
        if (super.g() == a) {
            nf nfVar = this.t;
            if (nfVar != null) {
                return nfVar.v.g();
            }
            this.b = new oa(this);
        }
        return super.g();
    }

    public final void a(ns nsVar) {
        this.s.add(new of(nsVar));
    }

    public final void b(ns nsVar) {
        synchronized (this.s) {
            int size = this.s.size();
            for (int i = 0; i < size; i++) {
                if (((of) this.s.get(i)).a == nsVar) {
                    this.s.remove(i);
                    break;
                }
            }
        }
    }

    private final void a(nf nfVar, Context context) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.a(nfVar, context);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void b(nf nfVar, Context context) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.b(nfVar, context);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void a(nf nfVar, Bundle bundle) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.a(nfVar, bundle);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void b(nf nfVar, Bundle bundle) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.b(nfVar, bundle);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((of) it.next()).a.a(nfVar);
        }
    }

    private final void c(nf nfVar, Bundle bundle) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.c(nfVar, bundle);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void a(nf nfVar, View view, Bundle bundle) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.a(nfVar, view, bundle);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void r(nf nfVar) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.r(nfVar);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((of) it.next()).a.b(nfVar);
        }
    }

    private final void s(nf nfVar) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.s(nfVar);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((of) it.next()).a.c(nfVar);
        }
    }

    private final void t(nf nfVar) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.t(nfVar);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void u(nf nfVar) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.u(nfVar);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void d(nf nfVar, Bundle bundle) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.d(nfVar, bundle);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((of) it.next()).a.a(nfVar, bundle);
        }
    }

    private final void v(nf nfVar) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.v(nfVar);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void w(nf nfVar) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.w(nfVar);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void x(nf nfVar) {
        nf nfVar2 = this.t;
        if (nfVar2 != null) {
            nv nvVar = nfVar2.v;
            if (nvVar instanceof nv) {
                nvVar.x(nfVar);
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private static boolean y(nf nfVar) {
        boolean z = true;
        if (!(nfVar.G && nfVar.H)) {
            nv nvVar = nfVar.x;
            if (nvVar == null) {
                z = false;
            } else {
                boolean z2 = false;
                for (nf nfVar2 : nvVar.d.values()) {
                    if (nfVar2 != null) {
                        z2 = nv.y(nfVar2);
                        continue;
                    }
                    if (z2) {
                    }
                }
                return false;
            }
        }
        return z;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        nf nfVar = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oe.a);
            int i = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            String str2 = attributeValue;
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (str2 != null && nr.a(context.getClassLoader(), str2)) {
                if (view != null) {
                    i = view.getId();
                }
                StringBuilder stringBuilder;
                if (i == -1 && resourceId == -1 && string == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(attributeSet.getPositionDescription());
                    stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                    stringBuilder.append(str2);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                nf nfVar2;
                if (resourceId != -1) {
                    nfVar = a(resourceId);
                }
                if (nfVar == null && string != null) {
                    nfVar = a(string);
                }
                if (nfVar == null && i != -1) {
                    nfVar = a(i);
                }
                if (nfVar == null) {
                    nf c = g().c(context.getClassLoader(), str2);
                    c.q = true;
                    c.z = resourceId != 0 ? resourceId : i;
                    c.A = i;
                    c.B = string;
                    c.r = true;
                    c.v = this;
                    c.w = this.k;
                    Bundle bundle = c.f;
                    c.y();
                    a(c, true);
                    nfVar2 = c;
                } else if (nfVar.r) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(attributeSet.getPositionDescription());
                    stringBuilder.append(": Duplicate id 0x");
                    stringBuilder.append(Integer.toHexString(resourceId));
                    stringBuilder.append(", tag ");
                    stringBuilder.append(string);
                    stringBuilder.append(", or parent id 0x");
                    stringBuilder.append(Integer.toHexString(i));
                    stringBuilder.append(" with another fragment for ");
                    stringBuilder.append(str2);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else {
                    nfVar.r = true;
                    nfVar.w = this.k;
                    Bundle bundle2 = nfVar.f;
                    nfVar.y();
                    nfVar2 = nfVar;
                }
                if (this.j > 0 || !nfVar2.q) {
                    n(nfVar2);
                } else {
                    a(nfVar2, 1, 0, 0, false);
                }
                View view2 = nfVar2.K;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (nfVar2.K.getTag() == null) {
                        nfVar2.K.setTag(string);
                    }
                    return nfVar2.K;
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Fragment ");
                stringBuilder2.append(str2);
                stringBuilder2.append(" did not create a view.");
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        return null;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
