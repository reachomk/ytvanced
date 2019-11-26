package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: wos */
public final class wos {
    public final wxd a;
    public final tns b;
    public final tno c;
    public final afpo d;
    public final afpu e;
    public final tnw f;
    public final tnq g;
    public final Set h = new HashSet();
    private final acum i;

    public wos(wxd wxd, tns tns, tno tno, afpo afpo, afpu afpu, tnw tnw, tnq tnq, acum acum) {
        this.a = wxd;
        this.b = tns;
        this.c = tno;
        this.d = afpo;
        this.e = afpu;
        this.f = tnw;
        this.g = tnq;
        this.i = acum;
    }

    public final void a(byte[] bArr, int i) {
        if (bArr != null) {
            azln azln = (azln) azlo.d.createBuilder();
            anvu a = anvu.a(bArr);
            azln.copyOnWrite();
            azlo azlo = (azlo) azln.instance;
            if (a != null) {
                azlo.a |= 2;
                azlo.c = a;
                azln.copyOnWrite();
                azlo azlo2 = (azlo) azln.instance;
                azlo2.a |= 1;
                azlo2.b = i - 1;
                azlo2 = (azlo) ((anxl) azln.build());
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw asmw = (asmw) asmz.instance;
                if (azlo2 != null) {
                    asmw.c = azlo2;
                    asmw.b = 159;
                    this.i.a((asmw) ((anxl) asmz.build()));
                    return;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
    }
}
