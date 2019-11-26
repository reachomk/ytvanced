package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: oo */
public abstract class oo extends bik {
    private final nt b;
    private or c = null;
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private nf f = null;

    @Deprecated
    public oo(nt ntVar) {
        this.b = ntVar;
    }

    public abstract nf a(int i);

    public final void a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewPager with adapter ");
            stringBuilder.append(this);
            stringBuilder.append(" requires a view id");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public Object a(ViewGroup viewGroup, int i) {
        nf nfVar;
        if (this.e.size() > i) {
            nfVar = (nf) this.e.get(i);
            if (nfVar != null) {
                return nfVar;
            }
        }
        if (this.c == null) {
            this.c = this.b.a();
        }
        nfVar = a(i);
        if (this.d.size() > i) {
            nl nlVar = (nl) this.d.get(i);
            if (nlVar != null) {
                nfVar.a(nlVar);
            }
        }
        while (this.e.size() <= i) {
            this.e.add(null);
        }
        nfVar.f_(false);
        nfVar.k_(false);
        this.e.set(i, nfVar);
        this.c.a(viewGroup.getId(), nfVar);
        return nfVar;
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        nf nfVar = (nf) obj;
        if (this.c == null) {
            this.c = this.b.a();
        }
        while (this.d.size() <= i) {
            this.d.add(null);
        }
        this.d.set(i, nfVar.F_() ? this.b.a(nfVar) : null);
        this.e.set(i, null);
        this.c.a(nfVar);
    }

    public final void a(Object obj) {
        nf nfVar = (nf) obj;
        nf nfVar2 = this.f;
        if (nfVar != nfVar2) {
            if (nfVar2 != null) {
                nfVar2.f_(false);
                this.f.k_(false);
            }
            nfVar.f_(true);
            nfVar.k_(true);
            this.f = nfVar;
        }
    }

    public final void a() {
        or orVar = this.c;
        if (orVar != null) {
            orVar.d();
            this.c = null;
        }
    }

    public final boolean a(View view, Object obj) {
        return ((nf) obj).z() == view;
    }

    public final Parcelable b() {
        Parcelable bundle;
        if (this.d.size() > 0) {
            bundle = new Bundle();
            nl[] nlVarArr = new nl[this.d.size()];
            this.d.toArray(nlVarArr);
            bundle.putParcelableArray("states", nlVarArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.e.size(); i++) {
            nf nfVar = (nf) this.e.get(i);
            if (nfVar != null && nfVar.F_()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("f");
                stringBuilder.append(i);
                this.b.a(bundle, stringBuilder.toString(), nfVar);
            }
        }
        return bundle;
    }

    public final void a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.d.clear();
            this.e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.d.add((nl) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    nf a = this.b.a(bundle, str);
                    if (a != null) {
                        while (this.e.size() <= parseInt) {
                            this.e.add(null);
                        }
                        a.f_(false);
                        this.e.set(parseInt, a);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Bad fragment at key ");
                        stringBuilder.append(str);
                        Log.w("FragmentStatePagerAdapt", stringBuilder.toString());
                    }
                }
            }
        }
    }
}
