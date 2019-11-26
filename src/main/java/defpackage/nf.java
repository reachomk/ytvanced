package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* renamed from: nf */
public class nf implements af, ComponentCallbacks, OnCreateContextMenuListener, ben, bi {
    public static final Object d = new Object();
    public int A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H = true;
    public boolean I;
    public ViewGroup J;
    public View K;
    public View L;
    public boolean M;
    public boolean N = true;
    public ng O;
    public boolean P;
    public boolean Q;
    public float R;
    public LayoutInflater S;
    public boolean T;
    public z U = z.RESUMED;
    public ai V;
    public pg W;
    public final ap X = new ap();
    public beo Y;
    public Boolean c_ = null;
    public int e = 0;
    public Bundle f;
    public SparseArray g;
    public Boolean h;
    public String i = UUID.randomUUID().toString();
    public Bundle j;
    public nf k;
    public String l = null;
    public int m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public nv v;
    public nq w;
    public nv x;
    public nf y;
    public int z;

    public void C() {
    }

    public void D() {
    }

    public boolean E() {
        return false;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(int i, String[] strArr, int[] iArr) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public void a(View view, Bundle bundle) {
    }

    public void e(Bundle bundle) {
    }

    public void j_(boolean z) {
    }

    public final x y_() {
        return this.V;
    }

    public final bf R_() {
        nv nvVar = this.v;
        if (nvVar != null) {
            ok okVar = nvVar.n;
            bf bfVar = (bf) okVar.c.get(this.i);
            if (bfVar != null) {
                return bfVar;
            }
            bfVar = new bf();
            okVar.c.put(this.i, bfVar);
            return bfVar;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final bek S_() {
        return this.Y.a;
    }

    public nf() {
        aq_();
    }

    public final void aq_() {
        this.V = new ai(this);
        this.Y = beo.a((ben) this);
        this.V.a(new ne(this));
    }

    @Deprecated
    public static nf a(Context context, String str) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            return (nf) nr.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(str);
            stringBuilder.append(str2);
            throw new nj(stringBuilder.toString(), e);
        } catch (IllegalAccessException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(str);
            stringBuilder.append(str2);
            throw new nj(stringBuilder.toString(), e2);
        } catch (NoSuchMethodException e3) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str3);
            stringBuilder2.append(str);
            stringBuilder2.append(": could not find Fragment constructor");
            throw new nj(stringBuilder2.toString(), e3);
        } catch (InvocationTargetException e4) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str3);
            stringBuilder2.append(str);
            stringBuilder2.append(": calling Fragment constructor caused an exception");
            throw new nj(stringBuilder2.toString(), e4);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean T_() {
        return this.u > 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        zp.a(this, stringBuilder);
        stringBuilder.append(" (");
        stringBuilder.append(this.i);
        stringBuilder.append(")");
        if (this.z != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.z));
        }
        if (this.B != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.B);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void f(Bundle bundle) {
        nv nvVar = this.v;
        if (nvVar != null && nvVar.h()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.j = bundle;
    }

    public final void a(nl nlVar) {
        if (this.v == null) {
            Bundle bundle = null;
            if (nlVar != null) {
                Bundle bundle2 = nlVar.a;
                if (bundle2 != null) {
                    bundle = bundle2;
                }
            }
            this.f = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public final void a(nf nfVar) {
        nv nvVar = this.v;
        nv nvVar2 = nfVar != null ? nfVar.v : null;
        StringBuilder stringBuilder;
        if (nvVar == null || nvVar2 == null || nvVar == nvVar2) {
            nf nfVar2 = nfVar;
            while (nfVar2 != null) {
                if (nfVar2 != this) {
                    nfVar2 = nfVar2.U_();
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Setting ");
                    stringBuilder.append(nfVar);
                    stringBuilder.append(" as the target of ");
                    stringBuilder.append(this);
                    stringBuilder.append(" would create a target cycle");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            if (nfVar == null) {
                this.l = null;
                this.k = null;
            } else if (this.v == null || nfVar.v == null) {
                this.l = null;
                this.k = nfVar;
            } else {
                this.l = nfVar.i;
                this.k = null;
            }
            this.m = 0;
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(nfVar);
        stringBuilder.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final nf U_() {
        nf nfVar = this.k;
        if (nfVar == null) {
            nv nvVar = this.v;
            if (nvVar != null) {
                String str = this.l;
                if (str != null) {
                    return (nf) nvVar.d.get(str);
                }
            }
            nfVar = null;
        }
        return nfVar;
    }

    public final Context M_() {
        nq nqVar = this.w;
        return nqVar != null ? nqVar.b : null;
    }

    public final Context V_() {
        Context M_ = M_();
        if (M_ != null) {
            return M_;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to a context.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final nn p() {
        nq nqVar = this.w;
        if (nqVar == null) {
            return null;
        }
        return (nn) nqVar.a;
    }

    public final Resources q() {
        return V_().getResources();
    }

    public final String a(int i) {
        return q().getString(i);
    }

    public final String a(int i, Object... objArr) {
        return q().getString(i, objArr);
    }

    public final nt r() {
        nv nvVar = this.v;
        if (nvVar != null) {
            return nvVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not associated with a fragment manager.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final nt s() {
        if (this.x == null) {
            f();
            int i = this.e;
            if (i >= 4) {
                this.x.o();
            } else if (i >= 3) {
                this.x.n();
            } else if (i >= 2) {
                this.x.m();
            } else if (i > 0) {
                this.x.l();
            }
        }
        return this.x;
    }

    public final boolean F_() {
        return this.w != null && this.o;
    }

    public final boolean u() {
        return this.e >= 4;
    }

    public final boolean v() {
        if (F_() && !this.C) {
            View view = this.K;
            if (!(view == null || view.getWindowToken() == null || this.K.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    public final void w() {
        this.E = true;
        nv nvVar = this.v;
        if (nvVar != null) {
            nvVar.b(this);
        } else {
            this.F = true;
        }
    }

    public final void x() {
        if (!this.G) {
            this.G = true;
            if (F_() && !this.C) {
                this.w.g();
            }
        }
    }

    public final void f_(boolean z) {
        if (this.H != z) {
            this.H = z;
            if (this.G && F_() && !this.C) {
                this.w.g();
            }
        }
    }

    @Deprecated
    public final void k_(boolean z) {
        if (!this.N && z && this.e < 3 && this.v != null && F_() && this.T) {
            this.v.c(this);
        }
        this.N = z;
        boolean z2 = false;
        if (this.e < 3 && !z) {
            z2 = true;
        }
        this.M = z2;
        if (this.f != null) {
            this.h = Boolean.valueOf(z);
        }
    }

    public final void startActivityForResult(Intent intent, int i) {
        nq nqVar = this.w;
        if (nqVar != null) {
            nqVar.a(this, intent, i);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a(String[] strArr, int i) {
        nq nqVar = this.w;
        if (nqVar != null) {
            nqVar.a(this, strArr, i);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final boolean a_(String str) {
        nq nqVar = this.w;
        if (nqVar == null) {
            return false;
        }
        return nqVar.a(str);
    }

    public LayoutInflater c(Bundle bundle) {
        return h(bundle);
    }

    public final LayoutInflater g(Bundle bundle) {
        this.S = c(bundle);
        return this.S;
    }

    @Deprecated
    public LayoutInflater h(Bundle bundle) {
        nq nqVar = this.w;
        if (nqVar != null) {
            LayoutInflater f = nqVar.f();
            s();
            aaq.b(f, this.x);
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final void y() {
        this.I = true;
        nq nqVar = this.w;
        if ((nqVar != null ? nqVar.a : null) != null) {
            this.I = false;
            this.I = true;
        }
    }

    public void a(Context context) {
        this.I = true;
        nq nqVar = this.w;
        Activity activity = nqVar != null ? nqVar.a : null;
        if (activity != null) {
            this.I = false;
            a(activity);
        }
    }

    @Deprecated
    public void a(Activity activity) {
        this.I = true;
    }

    public void b(Bundle bundle) {
        this.I = true;
        i(bundle);
        nv nvVar = this.x;
        if (nvVar != null && nvVar.j <= 0) {
            nvVar.l();
        }
    }

    /* Access modifiers changed, original: final */
    public final void i(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.x == null) {
                    f();
                }
                this.x.a(parcelable);
                this.x.l();
            }
        }
    }

    public View z() {
        return this.K;
    }

    public final View A() {
        View z = z();
        if (z != null) {
            return z;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void d(Bundle bundle) {
        this.I = true;
    }

    public void W_() {
        this.I = true;
    }

    public void B() {
        this.I = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.I = true;
    }

    public void ad_() {
        this.I = true;
    }

    public void N_() {
        this.I = true;
    }

    public final void onLowMemory() {
        this.I = true;
    }

    public void i() {
        this.I = true;
    }

    public void X_() {
        this.I = true;
    }

    public void J_() {
        this.I = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        nn p = p();
        if (p != null) {
            p.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to an activity.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final Object F() {
        ng ngVar = this.O;
        return null;
    }

    public final Object G() {
        ng ngVar = this.O;
        if (ngVar == null || ngVar.g == d) {
            return null;
        }
        return this.O.g;
    }

    public final Object H() {
        ng ngVar = this.O;
        return null;
    }

    public final Object I() {
        ng ngVar = this.O;
        if (ngVar == null || ngVar.h == d) {
            return null;
        }
        return this.O.h;
    }

    public final Object J() {
        ng ngVar = this.O;
        return null;
    }

    public final Object K() {
        ng ngVar = this.O;
        if (ngVar == null || ngVar.i == d) {
            return null;
        }
        return this.O.i;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.e);
        printWriter.print(" mWho=");
        printWriter.print(this.i);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.o);
        printWriter.print(" mRemoving=");
        printWriter.print(this.p);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.q);
        printWriter.print(" mInLayout=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.v);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.w);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.y);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.j);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.g);
        }
        nf U_ = U_();
        if (U_ != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(U_);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.m);
        }
        if (M() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(M());
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.K);
        }
        if (R() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(R());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(T());
        }
        if (M_() != null) {
            pv.a((af) this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.x != null) {
            printWriter.print(str);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Child ");
            stringBuilder.append(this.x);
            stringBuilder.append(":");
            printWriter.println(stringBuilder.toString());
            nv nvVar = this.x;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            nvVar.a(stringBuilder2.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    private final void f() {
        if (this.w != null) {
            this.x = new nv();
            this.x.a(this.w, new nh(this), this);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" has not been attached yet.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nv nvVar = this.x;
        if (nvVar != null) {
            nvVar.noteStateNotSaved();
        }
        this.t = true;
        this.W = new pg();
        this.K = a(layoutInflater, viewGroup, bundle);
        if (this.K != null) {
            this.W.a();
            this.X.a(this.W);
        } else if (this.W.a == null) {
            this.W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ni niVar) {
        L();
        if (niVar != null) {
            oj ojVar = (oj) niVar;
            ojVar.c++;
        }
    }

    public final ng L() {
        if (this.O == null) {
            this.O = new ng();
        }
        return this.O;
    }

    /* Access modifiers changed, original: final */
    public final int M() {
        ng ngVar = this.O;
        if (ngVar == null) {
            return 0;
        }
        return ngVar.d;
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        if (this.O != null || i != 0) {
            L().d = i;
        }
    }

    /* Access modifiers changed, original: final */
    public final int N() {
        ng ngVar = this.O;
        if (ngVar == null) {
            return 0;
        }
        return ngVar.e;
    }

    /* Access modifiers changed, original: final */
    public final void b(int i, int i2) {
        if (this.O != null || i != 0 || i2 != 0) {
            L();
            ng ngVar = this.O;
            ngVar.e = i;
            ngVar.f = i2;
        }
    }

    /* Access modifiers changed, original: final */
    public final int O() {
        ng ngVar = this.O;
        if (ngVar == null) {
            return 0;
        }
        return ngVar.f;
    }

    /* Access modifiers changed, original: final */
    public final qs P() {
        ng ngVar = this.O;
        return null;
    }

    /* Access modifiers changed, original: final */
    public final qs Q() {
        ng ngVar = this.O;
        return null;
    }

    /* Access modifiers changed, original: final */
    public final View R() {
        ng ngVar = this.O;
        return ngVar != null ? ngVar.a : null;
    }

    /* Access modifiers changed, original: final */
    public final void a(View view) {
        L().a = view;
    }

    /* Access modifiers changed, original: final */
    public final void a(Animator animator) {
        L().b = animator;
    }

    /* Access modifiers changed, original: final */
    public final Animator S() {
        ng ngVar = this.O;
        return ngVar != null ? ngVar.b : null;
    }

    /* Access modifiers changed, original: final */
    public final int T() {
        ng ngVar = this.O;
        if (ngVar == null) {
            return 0;
        }
        return ngVar.c;
    }

    /* Access modifiers changed, original: final */
    public final void c(int i) {
        L().c = i;
    }

    /* Access modifiers changed, original: final */
    public final boolean U() {
        ng ngVar = this.O;
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean V() {
        ng ngVar = this.O;
        if (ngVar == null) {
            return false;
        }
        return ngVar.j;
    }

    /* Access modifiers changed, original: final */
    public final void e(boolean z) {
        L().j = z;
    }
}
