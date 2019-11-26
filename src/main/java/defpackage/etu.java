package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.ArrayList;
import java.util.List;

/* renamed from: etu */
public final class etu {
    public String a;
    public aygk b;
    public apxu c;
    public awlo d;
    public List e;
    private arml f;
    private arml g;
    private arml h;
    private arml i;
    private List j;
    private awlm k;

    public final awlq a() {
        awlq awlq;
        awlq awlq2;
        awlt awlt = (awlt) awlq.C.createBuilder();
        String str = this.a;
        if (str != null) {
            awlt.copyOnWrite();
            awlq = (awlq) awlt.instance;
            awlq.a |= 1;
            awlq.b = str;
        }
        aygk aygk = this.b;
        if (aygk != null) {
            awlt.copyOnWrite();
            awlq = (awlq) awlt.instance;
            awlq.c = aygk;
            awlq.a |= 2;
        }
        arml arml = this.f;
        if (arml != null) {
            awlt.copyOnWrite();
            awlq = (awlq) awlt.instance;
            awlq.d = arml;
            awlq.a |= 4;
        }
        arml = this.g;
        if (arml != null) {
            awlt.copyOnWrite();
            awlq = (awlq) awlt.instance;
            awlq.e = arml;
            awlq.a |= 8;
        }
        arml = this.h;
        if (arml != null) {
            awlt.copyOnWrite();
            awlq = (awlq) awlt.instance;
            awlq.f = arml;
            awlq.a |= 16;
        }
        arml = this.i;
        if (arml != null) {
            awlt.copyOnWrite();
            awlq = (awlq) awlt.instance;
            awlq.g = arml;
            awlq.a |= 32;
        }
        apxu apxu = this.c;
        if (apxu != null) {
            awlt.copyOnWrite();
            awlq = (awlq) awlt.instance;
            awlq.i = apxu;
            awlq.a |= 64;
        }
        awlo awlo = this.d;
        if (awlo != null) {
            awlt.copyOnWrite();
            awlq = (awlq) awlt.instance;
            awlq.p = awlo;
            awlq.a |= 131072;
        }
        awlm awlm = this.k;
        if (awlm != null) {
            awlt.copyOnWrite();
            awlq = (awlq) awlt.instance;
            awlq.x = awlm;
            awlq.a |= 67108864;
        }
        List list = this.j;
        if (!(list == null || list.isEmpty())) {
            auvu auvu = (auvu) auvr.c.createBuilder();
            List list2 = this.j;
            boolean z = false;
            if (!(list2 == null || list2.isEmpty())) {
                z = true;
            }
            amqw.b(z);
            auvq auvq = (auvq) auvn.l.createBuilder();
            auvq.a(this.j);
            auvu.a((auvn) ((anxl) auvq.build()));
            awlt.copyOnWrite();
            awlq2 = (awlq) awlt.instance;
            awlq2.o = (auvr) ((anxl) auvu.build());
            awlq2.a |= 65536;
        }
        list = this.e;
        if (!(list == null || list.isEmpty())) {
            list = this.e;
            awlt.copyOnWrite();
            awlq2 = (awlq) awlt.instance;
            if (!awlq2.v.a()) {
                awlq2.v = anxl.mutableCopy(awlq2.v);
            }
            anvf.addAll(list, awlq2.v);
        }
        return (awlq) ((anxl) awlt.build());
    }

    public final etu a(String str) {
        this.f = ajqy.a(str);
        return this;
    }

    public final etu a(int i) {
        this.g = ajqy.a((long) i);
        return this;
    }

    public final etu a(String str, String str2) {
        apgd apgd = (apgd) apge.j.createBuilder();
        apgd.a(str2);
        apge apge = (apge) ((anxl) apgd.build());
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(BrowseEndpointOuterClass.browseEndpoint, apge);
        apxu apxu = (apxu) ((anxl) apxx.build());
        armk armk = (armk) arml.f.createBuilder();
        armo armo = (armo) armp.m.createBuilder();
        armo.a(str);
        armo.a(apxu);
        armk.a(armo);
        this.h = (arml) ((anxl) armk.build());
        return this;
    }

    public final etu b(String str) {
        this.i = ajqy.a(str);
        return this;
    }

    public final etu a(auvp auvp) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        List list = this.j;
        auvm auvm = (auvm) auvj.j.createBuilder();
        auvm.a(auvp);
        list.add((auvj) ((anxl) auvm.build()));
        return this;
    }

    public final etu c(String str) {
        awlp awlp = (awlp) awlm.c.createBuilder();
        ayyl ayyl = (ayyl) ayym.c.createBuilder();
        ayyl.a(str);
        awlp.copyOnWrite();
        awlm awlm = (awlm) awlp.instance;
        awlm.b = (anxl) ayyl.build();
        awlm.a = 135739233;
        this.k = (awlm) ((anxl) awlp.build());
        return this;
    }

    public final etu a(ayfo ayfo) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        List list = this.e;
        ayft ayft = (ayft) ayfu.q.createBuilder();
        ayft.a(ayfo);
        list.add((ayfu) ((anxl) ayft.build()));
        return this;
    }
}
