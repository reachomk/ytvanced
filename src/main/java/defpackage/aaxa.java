package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: aaxa */
public final class aaxa extends aaml {
    public String a;
    public Boolean b;
    public Boolean c;
    private final ArrayList d = new ArrayList();

    public aaxa(aamd aamd, afpt afpt) {
        super("feedback", aamd, afpt);
    }

    public final aaxa c(String str) {
        this.d.add(str);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.d.size() > 0);
    }

    public final /* synthetic */ anzd c() {
        boolean booleanValue;
        asny asny = (asny) asnz.g.createBuilder();
        ArrayList arrayList = this.d;
        asny.copyOnWrite();
        asnz asnz = (asnz) asny.instance;
        if (!asnz.c.a()) {
            asnz.c = anxl.mutableCopy(asnz.c);
        }
        anvf.addAll(arrayList, asnz.c);
        Boolean bool = this.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
            asny.copyOnWrite();
            asnz = (asnz) asny.instance;
            asnz.a |= 8;
            asnz.f = booleanValue;
        }
        bool = this.c;
        if (bool != null) {
            booleanValue = bool.booleanValue();
            asny.copyOnWrite();
            asnz = (asnz) asny.instance;
            asnz.a |= 2;
            asnz.d = booleanValue;
        }
        asns asns = (asns) asnt.c.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            asns.copyOnWrite();
            asnt asnt = (asnt) asns.instance;
            if (str != null) {
                asnt.a |= 1;
                asnt.b = str;
            } else {
                throw new NullPointerException();
            }
        }
        asny.copyOnWrite();
        asnz = (asnz) asny.instance;
        asnz.e = (asnt) ((anxl) asns.build());
        asnz.a |= 4;
        return asny;
    }
}
