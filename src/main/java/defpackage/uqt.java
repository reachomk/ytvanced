package defpackage;

import android.app.Activity;

/* renamed from: uqt */
public class uqt implements afqe, xcp {
    public afqd a;
    private final uys b;
    private final afpu c;

    public uqt(uys uys, xci xci, afpu afpu) {
        this.b = uys;
        this.c = afpu;
        xci.a((Object) this);
    }

    public Class[] a(Class cls, Object obj, int i) {
        return uqo.a(this, obj, i);
    }

    public final void a(String str) {
        this.b.a(str);
    }

    public final void a(Activity activity, byte[] bArr, @Deprecated afqd afqd) {
        a(activity, uqt.a(bArr), afqd);
    }

    public final void a(Activity activity, apxu apxu, @Deprecated afqd afqd) {
        apxu = uzj.b(apxu);
        String str;
        if (activity instanceof nn) {
            afqd afqd2 = this.a;
            if (afqd2 != null) {
                afqd2.b();
            }
            if (afqd == null) {
                afqd = afqd.a;
            }
            this.a = afqd;
            if (this.c.g()) {
                nt f = ((nn) activity).f();
                str = "INCOGNITO_BOTTOM_SHEET_FRAGMENT";
                nd ndVar = (uqq) f.a(str);
                if (ndVar != null) {
                    ndVar.ab = apxu;
                } else {
                    ndVar = uqq.a(new uqw(this), apxu);
                }
                ndVar.a(f, str);
                return;
            }
            a(activity, apxu);
            return;
        }
        String name = getClass().getName();
        str = nn.class.getName();
        StringBuilder stringBuilder = new StringBuilder((name.length() + 15) + str.length());
        stringBuilder.append(name);
        stringBuilder.append(" only supports ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public void a(Activity activity, apxu apxu) {
        nt f = ((nn) activity).f();
        String str = "new-default-sign-in-flow-fragment";
        uqv uqv = (uqv) f.a(str);
        or a = f.a();
        if (uqv == null) {
            a.a(uqv.a(apxu), str);
        } else {
            uqv.ak = apxu;
            if (!uqv.v()) {
                a.c(uqv);
            }
        }
        a.a();
    }

    static apxu a(byte[] bArr) {
        apxx apxx = (apxx) apxu.d.createBuilder();
        if (bArr != null) {
            apxx.a(anvu.a(bArr));
        }
        return (apxu) ((anxl) apxx.build());
    }

    public final void a() {
        afqd afqd = this.a;
        if (afqd != null) {
            afqd.a();
            this.a = null;
        }
    }

    public final void a(uyx uyx) {
        afqd afqd = this.a;
        if (afqd != null) {
            afqd.a(uyx.a);
            this.a = null;
        }
    }

    public final void a(uyw uyw) {
        if (uyw.a == uyz.CANCELLED) {
            afqd afqd = this.a;
            if (afqd != null) {
                afqd.b();
                this.a = null;
            }
        }
    }
}
