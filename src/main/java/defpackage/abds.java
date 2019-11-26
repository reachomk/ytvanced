package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: abds */
public final class abds extends aaml {
    public String a;
    public String[] b = new String[0];
    public boolean c;
    public int d = 1;

    public abds(aamd aamd, afpt afpt) {
        super("notification/modify_channel_preference", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        aszt aszt = (aszt) aszu.g.createBuilder();
        String str = this.a;
        aszt.copyOnWrite();
        aszu aszu = (aszu) aszt.instance;
        if (str != null) {
            aszu.a |= 2;
            aszu.c = str;
            List asList = Arrays.asList(this.b);
            aszt.copyOnWrite();
            aszu = (aszu) aszt.instance;
            if (!aszu.d.a()) {
                aszu.d = anxl.mutableCopy(aszu.d);
            }
            anvf.addAll(asList, aszu.d);
            boolean z = this.c;
            aszt.copyOnWrite();
            aszu = (aszu) aszt.instance;
            aszu.a |= 4;
            aszu.e = z;
            int i = this.d;
            aszt.copyOnWrite();
            aszu = (aszu) aszt.instance;
            if (i != 0) {
                aszu.a |= 8;
                aszu.f = i - 1;
                return aszt;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
