package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;

/* renamed from: abcn */
public final class abcn extends aaml {
    public static final SparseIntArray a = new abcm();
    public String b;
    public String c;
    public int d = 10003;
    public int e = 0;

    public abcn(aamd aamd, afpt afpt) {
        super("live/create_ingestion", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        asjv asjv;
        asju asju = (asju) asjv.e.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            asju.copyOnWrite();
            asjv = (asjv) asju.instance;
            if (str != null) {
                asjv.a |= 4;
                asjv.d = str;
            } else {
                throw new NullPointerException();
            }
        }
        asjy asjy = (asjy) asjz.e.createBuilder();
        if (this.e == 1) {
            asjy.a(5);
        } else {
            asjy.a(2);
        }
        int i = this.d;
        asjy.copyOnWrite();
        asjz asjz = (asjz) asjy.instance;
        asjz.a = 1 | asjz.a;
        asjz.b = i;
        if (!TextUtils.isEmpty(this.c)) {
            String str2 = this.c;
            asjy.copyOnWrite();
            asjz asjz2 = (asjz) asjy.instance;
            if (str2 != null) {
                asjz2.a |= 64;
                asjz2.d = str2;
            } else {
                throw new NullPointerException();
            }
        }
        if (TextUtils.isEmpty(null)) {
            asjz asjz3 = (asjz) ((anxl) asjy.build());
            asju.copyOnWrite();
            asjv = (asjv) asju.instance;
            if (asjz3 != null) {
                asjv.c = asjz3;
                asjv.a |= 2;
                return asju;
            }
            throw new NullPointerException();
        }
        asjy.copyOnWrite();
        throw new NullPointerException();
    }
}
