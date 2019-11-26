package defpackage;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.FileObserver;
import java.util.concurrent.Executor;

/* renamed from: dos */
public final class dos implements xcp {
    public bcaa A;
    public bcaa B;
    public bcaa C;
    public bcaa D;
    public bcaa E;
    public bcaa F;
    public bcaa G;
    public bcaa H;
    public bapu I;
    public bapu J;
    public aedl K;
    public dnh L;
    public actr M;
    public alvc N;
    public bcaa O;
    public bcaa P;
    public bcaa Q;
    public bcaa R;
    public bcaa S;
    public bcaa T;
    public bcaa U;
    public bcaa V;
    public bcaa W;
    public bcaa X;
    public bcaa Y;
    public bapu Z;
    public wzd a;
    public bcaa aA;
    public bcaa aB;
    public bcaa aC;
    public final Context aD;
    public bcaa aa;
    public bcaa ab;
    public bcaa ac;
    public bcaa ad;
    public bcaa ae;
    public bcaa af;
    public bcaa ag;
    public bcaa ah;
    public bcaa ai;
    public bcaa aj;
    public bcaa ak;
    public bcaa al;
    public bcaa am;
    public bcaa an;
    public bcaa ao;
    public bcaa ap;
    public bcaa aq;
    public bcaa ar;
    public bcaa as;
    public bcaa at;
    public bcaa au;
    public bcaa av;
    public bcaa aw;
    public bapu ax;
    public bcaa ay;
    public bcaa az;
    public OnSharedPreferenceChangeListener b;
    public FileObserver c;
    public bcaa d;
    public bcaa e;
    public bapu f;
    public bapu g;
    public bcaa h;
    public bcaa i;
    public bcaa j;
    public bapu k;
    public bapu l;
    public bcaa m;
    public bcaa n;
    public bcaa o;
    public bcaa p;
    public bapu q;
    public bapu r;
    public bcaa s;
    public bcaa t;
    public bcaa u;
    public bcaa v;
    public bcaa w;
    public bapu x;
    public bapu y;
    public bapu z;

    dos(Context context) {
        this.aD = context;
    }

    public final void a() {
        wzd wzd = this.a;
        if (wzd != null) {
            wzd.a();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqf.class, afqh.class};
        } else if (i == 0) {
            ((bqa) this.Z.get()).b();
            ((afxq) this.n.get()).b();
            ((abno) this.o.get()).a();
            ((abns) this.p.get()).a();
            ((Executor) this.aa.get()).execute(new dqf(this));
            return null;
        } else if (i == 1) {
            ((bqa) this.Z.get()).b();
            ((afxq) this.n.get()).b();
            ((abno) this.o.get()).a();
            ((abns) this.p.get()).a();
            afxv.a(this.aD);
            ((Executor) this.aa.get()).execute(new dqe(this));
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
