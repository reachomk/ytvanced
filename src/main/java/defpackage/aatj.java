package defpackage;

import android.text.TextUtils;

/* renamed from: aatj */
public final class aatj extends aaml {
    public String a;
    public boolean b;
    public long c;
    public String d;
    public Boolean e;
    public int p;

    public aatj(aamd aamd, afpt afpt) {
        super("conversation/edit", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = false;
        if (!(TextUtils.isEmpty(this.a) && (TextUtils.isEmpty(this.d) || this.p == 0))) {
            z = true;
        }
        amqw.a(z);
    }

    public final /* synthetic */ anzd c() {
        asdt asdt = (asdt) asdq.i.createBuilder();
        boolean z = this.b;
        asdt.copyOnWrite();
        asdq asdq = (asdq) asdt.instance;
        asdq.a |= 4;
        asdq.d = z;
        long j = this.c;
        asdt.copyOnWrite();
        asdq asdq2 = (asdq) asdt.instance;
        asdq2.a |= 8;
        asdq2.e = j;
        String str = this.a;
        int i = 2;
        if (str != null) {
            asdt.copyOnWrite();
            asdq2 = (asdq) asdt.instance;
            asdq2.a |= 2;
            asdq2.c = str;
        }
        str = this.d;
        if (str != null) {
            asdt.copyOnWrite();
            asdq2 = (asdq) asdt.instance;
            asdq2.a |= 16;
            asdq2.f = str;
        }
        int i2 = this.p;
        if (i2 != 0) {
            asdt.copyOnWrite();
            asdq2 = (asdq) asdt.instance;
            asdq2.a |= 32;
            asdq2.g = i2 - 1;
        }
        Boolean bool = this.e;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 3;
            }
            asdt.copyOnWrite();
            asdq asdq3 = (asdq) asdt.instance;
            asdq3.a |= 64;
            asdq3.h = i - 1;
        }
        return asdt;
    }
}
