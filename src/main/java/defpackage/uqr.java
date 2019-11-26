package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.os.RemoteException;

/* renamed from: uqr */
public final class uqr implements afqe, xcp {
    public final uys a;
    public final xci b;
    public boolean c;
    private final afpu d;
    private final uzn e;
    private final aanz f;

    public uqr(uys uys, afpu afpu, uzn uzn, aanz aanz, xci xci) {
        this.a = uys;
        this.d = afpu;
        this.e = uzn;
        this.f = aanz;
        this.b = xci;
        this.b.a((Object) this);
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final void a(Activity activity, byte[] bArr, @Deprecated afqd afqd) {
        a(activity, uqt.a(bArr), afqd);
    }

    public final void a(Activity activity, apxu apxu, @Deprecated afqd afqd) {
        apxu = uzj.b(apxu);
        String name;
        String name2;
        StringBuilder stringBuilder;
        if (afqd != null) {
            name = getClass().getName();
            name2 = uyw.class.getName();
            stringBuilder = new StringBuilder((name.length() + 46) + name2.length());
            stringBuilder.append(name);
            stringBuilder.append(" does not support SignInCallback. use ");
            stringBuilder.append(name2);
            stringBuilder.append(" instead");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (!(activity instanceof nn)) {
            name = getClass().getName();
            name2 = nn.class.getName();
            stringBuilder = new StringBuilder((name.length() + 15) + name2.length());
            stringBuilder.append(name);
            stringBuilder.append(" only supports ");
            stringBuilder.append(name2);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.d.a()) {
            this.b.d(new uyw(uyz.FINISHED, true));
        } else if (this.d.b()) {
            this.b.d(new uyw(uyz.CANCELLED, true));
        } else {
            try {
                Account[] a = this.e.a();
                if (a != null) {
                    if (a.length != 0) {
                        uyv.a(this.f, a[0].name, new uqu(this, activity, apxu));
                        return;
                    }
                }
                this.b.d(new uyw(uyz.CANCELLED, true));
            } catch (RemoteException | tei | tej unused) {
                this.b.d(new uyw(uyz.CANCELLED, true));
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{uyw.class};
        } else if (i == 0) {
            uyw uyw = (uyw) obj;
            int ordinal = uyw.a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2 && this.c && !uyw.b) {
                    this.b.d(new uyw(uyz.CANCELLED, true));
                }
                this.c = false;
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
