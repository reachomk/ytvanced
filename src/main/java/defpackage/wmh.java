package defpackage;

import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: wmh */
public final class wmh implements wxe {
    public final wxd a;
    public final afpu b;
    public final thc c;
    public final thd d;
    public final the e;
    public final acum f;
    public anvu g;
    public anvu h;
    private final Set i = new HashSet();
    private final Set j = new HashSet();

    public wmh(wxd wxd, afpu afpu, thc thc, thd thd, the the, acum acum) {
        this.a = wxd;
        this.b = afpu;
        this.c = thc;
        this.d = thd;
        this.e = the;
        this.f = acum;
    }

    public final void a(wmk wmk) {
        this.i.add(wmk);
    }

    public final void a(wmj wmj) {
        this.j.add(wmj);
    }

    public final void b(wmj wmj) {
        this.j.remove(wmj);
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = "familyChanged";
        acum acum;
        Iterator it;
        wmo wmo;
        asmz asmz;
        azlu a;
        asmw asmw;
        wmk wmk;
        if (i != 2000) {
            if (i == 2001) {
                if (this.h != null) {
                    acum = this.f;
                    wmn wmn = new wmn();
                    wmn.a = this.h;
                    asmz asmz2 = (asmz) asmw.f.createBuilder();
                    azlw a2 = wmn.a();
                    asmz2.copyOnWrite();
                    asmw asmw2 = (asmw) asmz2.instance;
                    if (a2 != null) {
                        asmw2.c = a2;
                        asmw2.b = 264;
                        acum.a((asmw) ((anxl) asmz2.build()));
                    } else {
                        throw new NullPointerException();
                    }
                }
                it = this.j.iterator();
                while (it.hasNext()) {
                    wmj wmj = (wmj) it.next();
                    wmj.a(intent != null ? intent.getBooleanExtra(str, false) : false);
                    if (wmj.e()) {
                        it.remove();
                    }
                }
            }
        } else if (intent == null || !intent.getBooleanExtra(str, false)) {
            if (this.g != null) {
                acum = this.f;
                wmo = new wmo();
                wmo.a = this.g;
                asmz = (asmz) asmw.f.createBuilder();
                a = wmo.a();
                asmz.copyOnWrite();
                asmw = (asmw) asmz.instance;
                if (a != null) {
                    asmw.c = a;
                    asmw.b = 259;
                    acum.a((asmw) ((anxl) asmz.build()));
                } else {
                    throw new NullPointerException();
                }
            }
            it = this.i.iterator();
            while (it.hasNext()) {
                wmk = (wmk) it.next();
                wmk.d();
                if (wmk.e()) {
                    it.remove();
                }
            }
        } else {
            if (this.g != null) {
                acum = this.f;
                wmo = new wmo();
                wmo.a = this.g;
                asmz = (asmz) asmw.f.createBuilder();
                a = wmo.a();
                asmz.copyOnWrite();
                asmw = (asmw) asmz.instance;
                if (a != null) {
                    asmw.c = a;
                    asmw.b = 260;
                    acum.a((asmw) ((anxl) asmz.build()));
                } else {
                    throw new NullPointerException();
                }
            }
            it = this.i.iterator();
            while (it.hasNext()) {
                wmk = (wmk) it.next();
                wmk.c();
                if (wmk.e()) {
                    it.remove();
                }
            }
        }
        return false;
    }
}
